package com.aggredi;

/**
 * Created by Serik Idrissov
 * 1/17/16
 */
public class OutOfMemoryWithoutCollections {
    public static void main(String[] args) {
        DummyObj dummyObj = new DummyObj(null, "tsts");
        while (true)
            dummyObj = new DummyObj(dummyObj, "tssa" + Math.random());
    }
}
