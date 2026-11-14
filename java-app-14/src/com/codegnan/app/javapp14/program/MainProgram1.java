package com.codegnan.app.javapp14.program;

import com.codegnan.app.javapp14.thread.User1Thread;
import com.codegnan.app.javapp14.thread.User2Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import static java.lang.System.out;

public class MainProgram1 {
    public static void main(String[] args) {
       // List<Integer> tokenNumbersList = new ArrayList<>();
        //  List<Integer> tokenNumbersList = new Vector<>();   // use for thread safe

       /* var user1Thread = new User1Thread(tokenNumbersList);
        var user2Thread = new User2Thread(tokenNumbersList);*/

        List<Integer> tokenNumbersList = new ArrayList<>();
         List<Integer> synchronizedNumbersList = Collections.synchronizedList(tokenNumbersList);  // use for thread safe

        var user1Thread = new User1Thread(synchronizedNumbersList);
        var user2Thread = new User2Thread(synchronizedNumbersList);

        user1Thread.start();
        user2Thread.start();

        try {
            user1Thread.join();
            user2Thread.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

//        out.println("No of Tokens Generated: "+tokenNumbersList.size());
//        out.println("Token Numbers:"+tokenNumbersList);

        Collections.sort(synchronizedNumbersList);

        out.println("No of Tokens Generated: "+synchronizedNumbersList.size());
        out.println("Token Numbers:"+synchronizedNumbersList);

        Collections.shuffle(synchronizedNumbersList);
        out.println("Token Numbers:"+synchronizedNumbersList);
        Collections.shuffle(synchronizedNumbersList);
        out.println("Token Numbers:"+synchronizedNumbersList);

    }
}
