package com.test;

/**
 * Created by U6042192 on 25-Apr-17.
 */
public class RunnableTest {
    public static void main(String[] args) {
        /*Runnable runnable=new Runnable() {
            @Override
            public void run() {

            }
        };*/
        Runnable runnable1=()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName()+ +i);
            }
        };
        new Thread(runnable1).start();
    }
}
