package com.aggredi;

import java.util.ArrayList;

/**
 * Created by Serik Idrissov
 * 1/17/16
 */
public class OutOfMemoryHeapSize {

    public static void main(String[] args) {
        String s = new String("123");
        ArrayList<Object> objects = new ArrayList<Object>();
        for (int i = 0; ; i++) {
            s = new String(s + i);
            System.out.println(s);
            objects.add(s);
        }
    }
}
