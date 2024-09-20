package com.neoteric.practise.model;

public class DogService {

    public static void main(String[]arg){
        Dog dog=new Dog();
        dog.age=7;
        dog.bread="beard";
        dog.colour="red";
        dog.size="short";

        System.out.println(dog.bread);
        System.out.println("size of dog: "+dog.size);
        System.out.println("age of dog:"+dog.age);
        System.out.println("colour of dog:"+dog.colour);


    }

}
