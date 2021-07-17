package com.chuhelan.entity;

/**
 * @author chuhelan
 * @version 1.0
 * @date 7/17/2021 2:12 PM
 */
public class UserEntity {
    private String userName;

    public UserEntity(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
