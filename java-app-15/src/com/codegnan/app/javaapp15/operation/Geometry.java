package com.codegnan.app.javaapp15.operation;

import static java.lang.System.out;

public interface Geometry {
    int ALPHA = 1;   // if it is final --> the variable name should be in upper case

    void hey();       // abstract method

   default void hi(){
        out.println("Hi from geometry...");
   }

    static  void hello(){
       out.println("Hello from geometry..");
    }
}


//     ----------- Naming Conventions ------------

// class & Interface    --> Single -- Addition   --> Multi -- DoubleAdd
// Method & Variable  ---> Single -- add         --> Multi -- doubleAdd
// Final varable / Constatnt --> ADD      --> DOUBLEADD         (CAPITAL)