package com.codegnan.app.javaapp15.operation;

//public enum TrafficSignal {
//    RED, YELLOW, GREEN
//}

public enum TrafficSignal {
    RED(60), YELLOW(3), GREEN(45);

    int duration;

    TrafficSignal(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }

}