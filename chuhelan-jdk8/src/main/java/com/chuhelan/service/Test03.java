package com.chuhelan.service;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/14/2021 3:23 PM
 */
public class Test03 {
    public static void main(String[] args) {
//        使用匿名内部类调用
        ((AcanthopanaxInterface) () -> System.out.println("get")).get();
    }
}
