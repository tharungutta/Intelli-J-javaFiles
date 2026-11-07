package com.codegnan.app.javaapp11.program;

import com.codegnan.app.javaapp11.mathematics.Addition;
import com.codegnan.app.javaapp11.mathematics.Addition2;
import com.codegnan.app.javaapp11.thread.UserThread;
import com.codegnan.app.javaapp11.thread.UserThread2;

public class MainProgram {
    public static void main(String[] args) {
        Addition2 addition = new Addition2();

        UserThread2 user1 = new UserThread2("Tharun", 10,2, addition);
        user1.start();
        UserThread2 user2 = new UserThread2("Jyothi", 20,4, addition);
        user2.start();
        UserThread2 user3 = new UserThread2("Mrunal", 30,6, addition);
        user3.start();


        /*Addition addition = new Addition();

        UserThread user1 = new UserThread("Tharun", 10,2, addition);
        user1.start();
        UserThread user2 = new UserThread("Jyothi", 20,4, addition);
        user2.start();
        UserThread user3 = new UserThread("Mrunal", 30,6, addition);
        user3.start();*/
    }
}
