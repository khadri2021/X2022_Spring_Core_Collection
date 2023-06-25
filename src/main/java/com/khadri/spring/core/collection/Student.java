package com.khadri.spring.core.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private List<Address> addressList;
    private Set<Subject> subjectSet;
    private Map<Subject, Faculty> subjectFacultyMap;

    private Properties grade;

    public Properties getGrade() {
        return grade;
    }

    public void setGrade(Properties grade) {
        this.grade = grade;
    }

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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Set<Subject> getSubjectSet() {
        return subjectSet;
    }

    public void setSubjectSet(Set<Subject> subjectSet) {
        this.subjectSet = subjectSet;
    }

    public Map<Subject, Faculty> getSubjectFacultyMap() {
        return subjectFacultyMap;
    }

    public void setSubjectFacultyMap(Map<Subject, Faculty> subjectFacultyMap) {
        this.subjectFacultyMap = subjectFacultyMap;
    }
}
