/*
 * @projectName CjqOutOfMemoryForJ6
 * @package com.cjq
 * @className com.cjq.cc
 * @copyright Copyright 2022 Thuisoft, Inc. All rights reserved.
 */
package com.cjq;

/**
 * cc
 * @description 测试对象的age，对象经历过n次MinorGC后进入老年代
 * @author chenjunqi
 * @date 2022年05月18日 21:41
 * @version 1.2.0
 */
public class TestObjectAge {

    /**
     * 1M = 1024kb = 1024字节
     */
    private static final int _1MB = 1024 * 1024;

    /**
     * ObjectAge
     * @description MaxTenuringThreshold=15
     * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:+UseSerialGC -XX:MaxTenuringThreshold=15 -XX:+PrintTenuringDistribution
     * @param args args
     * @author chenjunqi
     * @date 2022/5/18 下午8:58
     * @version 3.0.0
     */
    public static void main(String[] args) {
        byte[] allocation0 = new byte[_1MB / 4];
        byte[] allocation2 = new byte[_1MB * 4];
        byte[] allocation3 = new byte[_1MB * 4];
        allocation3 = null;
        allocation3 = new byte[_1MB * 4];

    }
}
