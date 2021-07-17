package com.chuhelan.service;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/14/2021 3:27 PM
 */
public class Test04 {
    public static void main(String[] args) {
//        使用匿名内部类调用
        YoushenInterface youshenInterface = new YoushenInterface() {
            @Override
            public String get(int i, int j) {
                return i + "--" + j;
            }
        };
        System.out.println(youshenInterface.get(1, 2));

//        lambda表达式
        YoushenInterface youshenInterface1 = (i, j) -> {
            return i + "--" + j;
        };
        System.out.println(youshenInterface1.get(3, 4));
    }
}
