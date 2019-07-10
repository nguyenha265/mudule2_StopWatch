package com;
public class main {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        double[] array = new double[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.floor(Math.random() * 100000);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    double temp =array[i];
                    array[i] = array[j];
                    array[i] = temp;
                }
            }
        }

        stopWatch.stop();

        System.out.println("thuc thi het " + stopWatch.getElapsedTime() + " milisecond");
    }
}
