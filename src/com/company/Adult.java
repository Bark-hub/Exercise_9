package com.company;

/**
 * Created by 102693 on 3/10/2020.
 */
public class Adult extends Contact{

private String phone;

    public Adult(String name, String phone) {
        super(name);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void contact(){
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
    }

}