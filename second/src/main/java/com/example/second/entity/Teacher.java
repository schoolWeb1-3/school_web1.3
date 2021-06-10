package com.example.second.entity;

import java.util.Date;

public class Teacher {
    private Long uid;

    private String id;

    private String name;

    private Integer age;

    private String sex;

    private String school;

    private String education;

    private String phone;

    private String location;

    private boolean working;

    private Date birth;

    private String major;

    private String e_mail;

    private String nation;

    private String native_place;

    private String technical_post;

    private String English_level;

    private String computer_level;

    private String hobby;

    private String motto;

    public void setSchool(String school) {
        this.school = school;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setNative_place(String native_place) {
        this.native_place = native_place;
    }

    public String getSchool() {
        return school;
    }

    public String getEducation() {
        return education;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocation() {
        return location;
    }

    public boolean isWorking() {
        return working;
    }

    public Date getBirth() {
        return birth;
    }

    public String getMajor() {
        return major;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getNation() {
        return nation;
    }

    public String getNative_place() {
        return native_place;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTechnical_post() {
        return technical_post;
    }

    public void setTechnical_post(String technical_post) {
        this.technical_post = technical_post;
    }

    public String getEnglish_level() {
        return English_level;
    }

    public void setEnglish_level(String english_level) {
        English_level = english_level;
    }

    public String getComputer_level() {
        return computer_level;
    }

    public void setComputer_level(String computer_level) {
        this.computer_level = computer_level;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}
