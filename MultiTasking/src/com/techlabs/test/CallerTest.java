package com.techlabs.test;
import com.techlabs.model.Caller;
import com.techlabs.model.callme;
public class CallerTest {
public static void main(String[] args) {
callme target=new callme();
Caller caller1=new Caller ("Hello", target);
Caller caller2=new Caller ("Swabhav", target); 
Caller caller3=new Caller ("Techlabs", target);
try {
caller1.thread.join();
caller2.thread.join();
caller3.thread.join();
} catch (InterruptedException e) {
System.out.println("Thread Interrupted");
}
}

}
