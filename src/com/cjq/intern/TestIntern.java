/*
 * @projectName CjqOutOfMemoryForJ6
 * @package com.cjq.intern
 * @className com.cjq.intern.TestIntern
 * @copyright Copyright 2022 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.intern;

/**
 * TestIntern
 * @description test string.intern for java6
 * @author chenjunqi
 * @date 2022年03月30日 20:55
 * @version 1.2.0
 */
public class TestIntern {

    /**
     * TestIntern
     * @description 两个返回值都是false
     * java6的运行时常量池还是在永久代实现，
     * intern会把字符串实例复制一份放入常量池，返回的是放入常量池的引用，所以都是false
     * @param args args
     * @author chenjunqi
     * @date 2022/3/30 20:59
     * @version 1.0.0
     */
    public static void main(String[] args) {
        String s1 = new StringBuilder("计算机").append("科学").toString();
        System.out.println(s1 == s1.intern());

        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2 == s2.intern());
    }
}
