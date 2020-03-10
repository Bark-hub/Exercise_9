package com.company;

/**
 * Created by 102693 on 3/10/2020.
 */
public class Person extends Contact{

    private String email;

    public Person(String email, String name) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void contact(){
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
    }

}
