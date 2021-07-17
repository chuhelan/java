package com.chuhelan.jdk8;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/13/2021 12:50 PM
 */
public interface JDK8Interface {

//    默认的时候就是为public、abstract

    void add();

    default void defaultGet() {
        System.out.println("Hallo, this is defaultGet");
    }

    static void staticDel() {
        System.out.println("Delete confirm, this is staticDel");
    }

}
