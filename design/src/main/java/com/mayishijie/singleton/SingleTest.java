package com.mayishijie.singleton;

/**
 * @author tty
 * @version 1.0 2021-01-08 11:42
 */
public class SingleTest {
    public static void main(String[] args) {
        FullSingle instance = FullSingle.getInstance();
        instance.eat();
    }
}
