package com.ruoyi.system.utils;

import java.util.UUID;

/**
 * id生成工具
 */
public class IdentifiedGenerator {
    public static String generate(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
