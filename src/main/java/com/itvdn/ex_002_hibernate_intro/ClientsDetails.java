package com.itvdn.ex_002_hibernate_intro;

import javax.persistence.*;


@Entity
public class ClientsDetails {

    @Id
    private int id;

//    @Column (name = "name_person")
    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String phone;

//    @Transient
//    private String info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
