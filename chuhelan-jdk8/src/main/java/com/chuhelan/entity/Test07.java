package com.chuhelan.entity;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/17/2021 2:13 PM
 */
public class Test07 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userLists = new ArrayList<>();
        userLists.add(new UserEntity("小明", 12));
        userLists.add(new UserEntity("小黄", 6));
        userLists.add(new UserEntity("小朱", 23));
//        userLists.sort(new Comparator<UserEntity>() {
//            @Override
//            public int compare(UserEntity o1, UserEntity o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        userLists.sort((o1, o2) -> o1.getAge() - o2.getAge());
        userLists.forEach((t) -> {
            System.out.println(t.toString());
        });

    }
}
