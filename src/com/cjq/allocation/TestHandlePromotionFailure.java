/*
 * @projectName CjqOutOfMemoryForJ6
 * @package com.cjq.allocation
 * @className com.cjq.allocation.TestHandlePromotionFailure
 * @copyright Copyright 2022 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.allocation;

/**
 * TestHandlePromotionFailure
 * @description 测试空间担保策略
 * @author chenjunqi
 * @date 2022年05月22日 11:31
 * @version 1.2.0
 */
public class TestHandlePromotionFailure {
    /**
     * 1M = 1024kb = 1024字节
     */
    private static final int _1MB = 1024 * 1024;

    /**
     * ObjectAge
     * @description TestHandlePromotionFailure=15
     * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:+UseSerialGC -XX:-HandlePromotionFail=true
     * @param args args
     * @author chenjunqi
     * @date 2022/5/18 下午8:58
     * @version 3.0.0
     */
    public static void main(String[] args) {
        byte[] allocation1 = new byte[_1MB * 2];
        byte[] allocation2 = new byte[_1MB * 2];
        byte[] allocation3 = new byte[_1MB * 2];
        allocation1 = null;
        byte[] allocation4 = new byte[_1MB * 2];
        byte[] allocation5 = new byte[_1MB * 2];
        byte[] allocation6 = new byte[_1MB * 2];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        byte[] allocation7 = new byte[_1MB * 2];

    }
}
