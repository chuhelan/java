package com.chuhelan.service;

import com.chuhelan.jdk8.JDK8InterfaceImpl;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/13/2021 4:53 PM
 */
public class Test02 {
    public static void main(String[] args) {
        OrderService orderService = new OrderService() {
            @Override
            public void get() {
                System.out.println("get");
            }
        };
        orderService.get();

        ((OrderService) () -> System.out.println("get No2")).get();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ",run");
            }
        }).start();

    }
}
