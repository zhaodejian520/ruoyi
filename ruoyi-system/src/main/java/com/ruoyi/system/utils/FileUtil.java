package com.ruoyi.system.utils;


import com.ruoyi.common.utils.spring.SpringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.activation.MimetypesFileTypeMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 文件工具类。提供文件的上传下载功能
 * @author wych
 * @version 1.0.0
 */

public class FileUtil {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
    /**
     *
     * @param response
     * @param filePath   要下载的文件的保存路径
     * @param fileName   下载后文件的保存名称
     */
    public static void download(HttpServletResponse response, String filePath, String fileName){
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            File file = new File(filePath);
            FileInputStream inputStream = new FileInputStream(file);

//            if(StringUtils.isBlank(fileName)){
//                fileName = filePath.substring(filePath.lastIndexOf(File.separator) + 1, filePath.lastIndexOf("."));
//            }
            String suffix = filePath.substring(filePath.lastIndexOf(".") + 1);
            in = new BufferedInputStream(inputStream);
            out = new BufferedOutputStream(response.getOutputStream());
            response.setContentType(new MimetypesFileTypeMap().getContentType(file));// 设置response内容的类型
            response.setHeader("Content-disposition", "attachment;filename=" + new String(fileName.getBytes("GBK"), "ISO8859-1") + "." + suffix);// 设置头部信息
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (out != null){
                    out.close();
                }
                if(in != null){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 上传文件
     * @param request
     * @throws Exception
     * @return Map
     */
    public static List<Map<String, Object>> upload(HttpServletRequest request) throws IOException {
        List<Map<String, Object>> resultList = new ArrayList<>();

        // 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        // 检查form中是否有enctype="multipart/form-data"
        if (resolver.isMultipart(request)) {
            // 将request变成多部分request
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            // 获取multiRequest 中所有的文件名
            Iterator<String> iterator = multipartRequest.getFileNames();
            while (iterator.hasNext()) {
                // 一次遍历所有文件
                MultipartFile multipartFile = multipartRequest.getFile(iterator.next());
                if (multipartFile != null) {
                    String fileName = multipartFile.getOriginalFilename();
                    if (StringUtils.isBlank(fileName)){
                        continue;
                    }
//                    获取文件大小
                    long fileSize = multipartFile.getSize();
                    // 获取文件保存目录
                    String rootPath = request.getServletContext().getRealPath("/");
                    String dateDir = DATE_FORMAT.format(Calendar.getInstance().getTime());
//                    String saveDir = PropertiesUtil.getValue(null, "file.savePath");
                    Biz biz = SpringUtils.getBean("biz");
                    String saveDir = biz.getFileUploadPath();

//                    String fullPath = rootPath + saveDir + File.separator + dateDir + File.separator + saveDir;
                    String fullPath = saveDir;
                    File dir = new File(fullPath);
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }
                    String saveName = UUID.randomUUID().toString().replaceAll("-", "") + fileName.substring(fileName.lastIndexOf("."));
                    String savePath = fullPath + File.separator + saveName;
                    System.out.println("=======文件保存路径是=========" + savePath);
                    // 上传文件
                    multipartFile.transferTo(new File(savePath));
                    Map<String, Object> resultMap = new HashMap<>();
                    resultMap.put("showName", fileName);
                    resultMap.put("saveName", saveName);
                    resultMap.put("savePath", savePath);
                    resultMap.put("fileSize", fileSize);
                    resultList.add(resultMap);
                }
            }
        }
        return resultList;
    }
}
