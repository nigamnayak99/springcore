package com.perk.springcore.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }


    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Employee() {
        super();
    }

    public Employee(Set<String> address, Map<String, String> courses, String name, List<String> phones) {
        super();
        this.address = address;
        this.courses = courses;
        this.name = name;
        this.phones = phones;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", employeeName='" + name + '\'' +
                ", phones=" + phones +
                ", courses=" + courses +
                '}';
    }
}
