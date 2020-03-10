package com.company;

/**
 * Created by 102693 on 3/10/2020.
 */
abstract public class Contact {

    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void contact();

}




