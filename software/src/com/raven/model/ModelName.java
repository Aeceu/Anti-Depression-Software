
package com.raven.model;


public class ModelName {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ModelName(String name) {
        this.name = name;
    }
    
    
    private String name;



    @Override
    public String toString() {
        return name;
        
    }
    
    
}
