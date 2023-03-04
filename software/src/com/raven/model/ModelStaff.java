
package com.raven.model;

import com.raven.table.model.TableRowData;


public class ModelStaff extends TableRowData{

    public ModelName getName() {
        return name;
    }

    public void setName(ModelName name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ModelStaff(ModelName name, String age, String gender, int total) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.total = total;
    }

    public ModelStaff() {
    }
    
    
    
    private ModelName name;
    private String  age;
    private String gender;
    private int total;
    
    
    
    @Override
    public Object[] toTableRow() {
        return new Object[] {name,age,gender,total};
    }
    
}
