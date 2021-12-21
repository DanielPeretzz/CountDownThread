package com.homework.daniel.Threads;

public class CountDownThread extends Thread {
    private final int rate;
    private int counter;

    public CountDownThread(int rate, int counter) {
        this.rate = rate;
        this.counter = counter;
    }

    public int getRate() {
        return rate;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("-- Running a new count down thread (name: " +Thread.currentThread().getName()+ ", rate: "+ (getRate() / 1000) +" seconds, counterStartingPoint: " + getCounter() +" --");
        for (int i = getCounter(); i > 0 ; i--) {
            System.out.println(Thread.currentThread().getName() +" : " + i);
            try {
                Thread.sleep(getRate());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
