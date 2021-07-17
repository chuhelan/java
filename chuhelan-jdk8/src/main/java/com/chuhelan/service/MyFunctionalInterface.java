package com.chuhelan.service;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/14/2021 3:12 PM
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    void get();

    default void defaultAdd(){
        System.out.println("我是默认的方法");
    }

    String toString();
}
