package com.erpproject.androidapp.webservicesappjson;

/**
 * Created by Eslam on 5/6/2017.
 */

public class Contact {

    public Contact(String name){
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
