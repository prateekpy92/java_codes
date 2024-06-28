package com.techlabs.interfce.test;
import com.techlabs.interfce.model.IWorkable;
import com.techlabs.interfce.model.IWorker;
import com.techlabs.interfce.model.Loader;
import com.techlabs.interfce.model.Robot;

public class WorkerTest {
    public static void main(String[] args) {
        IWorker loader = new Loader();
        loader.start();
        loader.stop();
        loader.eat();
        loader.rest();

        IWorkable robot = new Robot();
        robot.start();
        robot.stop();
    }
}
