/*
 * @projectName CjqOutOfMemoryForJ6
 * @package com.cjq.outofmemory
 * @className com.cjq.outofmemory.RuntimeConstantPoolOOM
 * @copyright Copyright 2022 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.outofmemory;

import java.util.HashSet;
import java.util.Set;

/**
 * RuntimeConstantPoolOOM
 * @description 测试运行时常量池OOM
 * @author chenjunqi
 * @date 2022年03月29日 21:00
 * @version 1.2.0
 */
public class RuntimeConstantPoolOOM {

    /**
     * RuntimeConstantPoolOOM
     * @description -XX:PermSize=6M -XX:MaxPermSize=6M
     * @param args args
     * @author chenjunqi
     * @date 2022/3/29 21:15
     * @version 1.0.0
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        int i = 0;
        while(true){
            set.add(String.valueOf(i++).intern());
        }
    }
}
