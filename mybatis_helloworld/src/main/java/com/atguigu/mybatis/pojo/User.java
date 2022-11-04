package com.atguigu.mybatis.pojo;

import org.omg.CORBA.PRIVATE_MEMBER;

public class User {
    private Integer id;
    private String username;
        private String password;
    private Integer age;
        private String danger;
    private String email;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String danger, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.danger = danger;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDanger() {
        return danger;
    }

    public void setDanger(String danger) {
        this.danger = danger;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", danger='" + danger + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
