package com.chuhelan.jdk8;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/13/2021 4:37 PM
 */
public class Test01 {
    public static void main(String[] args) {
        JDK8InterfaceImpl jdk8Interface = new JDK8InterfaceImpl();
        jdk8Interface.add();
        jdk8Interface.defaultGet();
        JDK8Interface.staticDel();
    }
}
