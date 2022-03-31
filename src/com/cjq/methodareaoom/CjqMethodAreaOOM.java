/*
 * @projectName CjqOutOfMemoryForJ6
 * @package com.cjq
 * @className com.cjq.methodareaoom.c
 * @copyright Copyright 2022 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.methodareaoom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CjqMethodAreaOOM
 * @description 方法区OOM，-XX:MaxPermSize=3M -XX:PermSize=3M
 * @author chenjunqi
 * @date 2022年03月30日 21:29
 * @version 1.2.0
 */
public class CjqMethodAreaOOM {

    public static void main(String[] args) {
        try{
            while(true){
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(CjqCool.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return methodProxy.invoke(o,objects);
                    }
                });
                enhancer.create();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    static class CjqCool{}
}
