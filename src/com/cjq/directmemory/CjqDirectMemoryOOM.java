/*
 * @projectName CjqOutOfMemoryForJ6
 * @package com.cjq.directmemory
 * @className com.cjq.directmemory.CjqDirectMemoryOOM
 * @copyright Copyright 2022 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.directmemory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * CjqDirectMemoryOOM
 * @description 测试本机直接内存OOM
 * @author chenjunqi
 * @date 2022年03月31日 20:53
 * @version 1.2.0
 */
public class CjqDirectMemoryOOM {

    private static final int _1M = 1024 * 1024;

    /**
     * CjqDirectMemoryOOM
     * @description -XX:MaxDirectMemory=5M -Xmx10M
     * @param args args
     * @author chenjunqi
     * @date 2022/3/31 21:00
     * @version 1.0.0
     */
    public static void main(String[] args) throws Exception{
        Field field = Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe)field.get(null);
        while (true){
            unsafe.allocateMemory(_1M);
        }

    }
}
