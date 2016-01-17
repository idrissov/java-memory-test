package com.aggredi;

import javassist.ClassPool;
import javassist.CtClass;

/**
 * Created by Serik Idrissov
 * 1/17/16
 */
public class OutOfMemoryPermGenMain {
    public static void main(String[] args) {
        ClassPool pool = ClassPool.getDefault();

        for (int i = 0; ; i++) {

            CtClass cc = pool.makeClass("Point" + i);
            System.out.println(cc.getName());
        }
    }
}
