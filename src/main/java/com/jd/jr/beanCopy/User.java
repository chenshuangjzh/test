package com.jd.jr.beanCopy;

import net.sf.cglib.beans.BeanCopier;

/**
 * created by jiangzhenghui on 2017/12/27
 */
public class User {

    private String username;

    private String email;

    private String phoneNumber;

    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        /*User user1 = new User();
        user1.setAddress("address");
        user1.setEmail("qq@qq.com");*/
        User2 user1 = new User2();
        user1.setAddress("address");
        user1.setEmail("qq@qq.com");
        user1.setMoney("234");

        User user2 = new User();
        user2.setPhoneNumber("1234567");
        user2.setUsername("jiangzhenghui");

        BeanCopier beanCopier = BeanCopier.create(User2.class, User.class, false);
        beanCopier.copy(user1, user2, null);

        System.out.println();
    }
}
