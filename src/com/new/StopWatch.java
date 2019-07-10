package com;

import java.util.Date;

public class StopWatch {

    Date startTime;
    Date endTime;

    public StopWatch() {
    }

    public void startTime() {
        this.startTime = new Date();

    }
    public void start() {
        this.startTime = new Date();
    }
    public void stop(){
        this.endTime = new Date();
    }
    public long getElapsedTime(){

        return this.endTime.getTime() - this.startTime.getTime();
    }

}
