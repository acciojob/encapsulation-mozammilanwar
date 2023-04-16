package com.driver;

/*
 *
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems:
        The field RWOnly.name is not visible
        The field RWOnly.name is not visible
        at com.driver.Main.main(Main.java:6)
 *
*/
public class RWOnly {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}