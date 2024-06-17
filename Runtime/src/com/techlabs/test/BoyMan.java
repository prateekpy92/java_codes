package com.techlabs.test;
import com.techlabs.model.Man;
import com.techlabs.model.Boy;
public class BoyMan {

    public static void main(String[] args) {

        Man man = new Man();
        man.eat();
        man.play();
        man.work();

        Boy boy = new Boy();
        boy.eat();
        boy.play();
        boy.work();
        boy.sleep();

        Man bigMan = new Boy();
        bigMan.eat();
        bigMan.play();
        bigMan.work();
       
    }
}





