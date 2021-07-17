package com.chuhelan.stream;

import com.chuhelan.entity.UserEntity;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/17/2021 2:30 PM
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("Norris", 23));
        userEntities.add(new UserEntity("Stroll", 24));
        userEntities.add(new UserEntity("Russel", 24));
        userEntities.add(new UserEntity("Leclerc", 25));
        userEntities.add(new UserEntity("Verstappen", 25));
        /*
         * 创建stream方式两种
         * 1.串行流stream() 单线程
         * 2.并行流parallelStream() 多线程
         * 并行流parallelStream 比串行效率更高
         * */
        Stream<UserEntity> stream = userEntities.stream();
        Set<UserEntity> setUserList = stream.collect(Collectors.toSet());
    }
}
