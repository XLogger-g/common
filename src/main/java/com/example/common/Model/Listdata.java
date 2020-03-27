package com.example.common.Model;

public class Listdata {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

/*
    public String getGrade() { return grade; }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() { return subject; }

    public void setSubject(String subject) {
        this.subject = subject;
    }
*/

    public String getId() {
        return id;
    }

    public void setId(String id) { this.id = id; }
    public String id;
    public String title;
    public String desc;

    public String grade;
    public String subject;

    public Listdata() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Listdata(String id,String title, String desc, String grade, String subject) {
        this.id=id;
        this.title = title;
        this.desc = desc;

        this.grade = grade;
        this.subject = subject;

    }

}