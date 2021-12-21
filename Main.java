package com.homework.daniel;

import com.homework.daniel.Threads.CountDownThread;

public class Main {

    public static void main(String[] args) {
        CountDownThread countDownThread0 = new CountDownThread(5000,10);
        CountDownThread countDownThread1 = new CountDownThread(2000, 30);
        countDownThread0.start();
        countDownThread1.start();
    }
}
