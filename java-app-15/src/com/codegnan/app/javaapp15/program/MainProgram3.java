package com.codegnan.app.javaapp15.program;

import com.codegnan.app.javaapp15.operation.Geometry;
import com.codegnan.app.javaapp15.operation.TrafficSignal;

import static java.lang.System.out;

public class MainProgram3 {
    public static void main(String[] args) {

        TrafficSignal[] signals= TrafficSignal.values();

        for (TrafficSignal trafficSignal: signals){
            out.println(trafficSignal);
        }


       // TrafficSignal trafficSignal= TrafficSignal.RED;
       /*TrafficSignal trafficSignal = TrafficSignal.GREEN;

        if(trafficSignal == TrafficSignal.RED ){
            out.println("STOP !, it's a RED light");
            out.println("wait for "+TrafficSignal.RED.getDuration()+" seconds...");
        }else if(trafficSignal == TrafficSignal.YELLOW){
            out.println("STOP !, it's a RED light");
            out.println("wait for "+TrafficSignal.RED.getDuration()+" seconds...");
        }else if(trafficSignal == TrafficSignal.GREEN){
            out.println("LET'S GO !, it's a green light");
            out.println("You have got "+TrafficSignal.GREEN.getDuration()+" seconds...");
        }*/

       /* switch (trafficSignal){
            case TrafficSignal.RED :
                out.println("STOP !, it's a RED light");
                out.println("wait for "+TrafficSignal.RED.getDuration()+" seconds...");
                break;
            case TrafficSignal.YELLOW :
                out.println("GET READY !, it's a orange light");
                out.println("You have got "+TrafficSignal.YELLOW.getDuration()+" seconds...");
                break;
            case TrafficSignal.GREEN :
                out.println("LET'S GO !, it's a green light");
                out.println("You have got "+TrafficSignal.GREEN.getDuration()+" seconds...");

        }*/

      /*  switch (trafficSignal){
            case TrafficSignal.RED -> out.println("STOP !, it's a RED light");
            case TrafficSignal.YELLOW -> out.println("GET READY !, it's a orange light");
            case TrafficSignal.GREEN -> out.println("LET'S GO !, it's a green light");
        }*/

       /* int alphaValue = Geometry.ALPHA;
        out.println(alphaValue);
        Geometry.hello();

        Geometry geometry = ()-> out.println("hey from Geometry");
        geometry.hey();
        geometry.hi();*/
    }
}
