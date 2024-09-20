package com.neoteric.practise.model.progress;

public class JavaModel {
    public String studentName;
    public String standard;
    public String rollNumber;
    public String fatherName;
    public String telugu;
    public int hindi;
    public String english;
    public String maths;
    public String physics;
    public int social;

    @Override
    public String toString() {
        return "JavaModel{" +
                "studentName='" + studentName + '\'' +
                ", standard='" + standard + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", telugu='" + telugu + '\'' +
                ", hindi=" + hindi +
                ", english='" + english + '\'' +
                ", maths='" + maths + '\'' +
                ", physics='" + physics + '\'' +
                ", social=" + social +
                '}';
    }
}
