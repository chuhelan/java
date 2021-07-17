package com.chuhelan.service;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/14/2021 3:33 PM
 */
public class Test05 {
    public static void main(String[] args) {
        AcanthopanaxInterface acanthopanaxInterface = () -> {
            System.out.println("我是方法");
        };
        acanthopanaxInterface.get();

//        精简的代码
        ((AcanthopanaxInterface) () -> {
            System.out.println("我也是方法");
        }).get();
//        使用Lambda 方法体中只有一条语句的情况下，在这时候我们不需要写{}
        AcanthopanaxInterface acanthopanaxInterface1 = () -> System.out.println("我是方法3");
    }
}
