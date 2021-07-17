package com.chuhelan.service;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/17/2021 2:03 PM
 */
public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hallo");
        strings.add("Ferrari");
        strings.add("Mercedes");
        strings.add("Alpine");
        strings.add("Williams");
//        strings.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        strings.forEach(s -> {
            System.out.println(s);
        });

    }
}
