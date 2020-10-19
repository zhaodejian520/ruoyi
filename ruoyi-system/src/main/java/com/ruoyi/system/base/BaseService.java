package com.ruoyi.system.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Map;

public class BaseService<T> {

    public IPage<T> iPage(Map<String,Object> map){
        Integer page=Integer.parseInt(map.get("page").toString());
        Integer size=Integer.parseInt(map.get("size").toString());
        IPage<T> iPage=new Page<>(page,size);
        return iPage;

    }
}
