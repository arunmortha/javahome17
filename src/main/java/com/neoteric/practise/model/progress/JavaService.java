package com.neoteric.practise.model.progress;

public class JavaService {
    public String marks(JavaModel javaModel1){

        if (javaModel1.social >=35){
            return "pass";

        }
        if (javaModel1.hindi >=27){
            return "pass";

        } else {
            return  "fail";
        }
    }

    }

