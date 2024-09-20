package com.neoteric.practise.model.progress;

public class JavaTest {
    public static void main(String[] args) {


       JavaModel javaModel = new JavaModel();
        javaModel.studentName="arun";
        javaModel.rollNumber="23";
        javaModel.standard="10";
        javaModel.fatherName="fathername";
        javaModel.telugu="50";
        javaModel.english="60";
        javaModel.hindi=70;
        javaModel.maths="80";
        javaModel.physics="90";
        javaModel.social=20;
        JavaService javaService=new JavaService();
        String result= javaService.marks(javaModel);

        System.out.println(result);


    }


}
