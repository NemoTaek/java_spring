package org.example;

public class StateThread implements Runnable{
    Thread thread;

    public StateThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("thread State: " + thread.getState());
            if(thread.getState() == Thread.State.NEW) {
                thread.start();
            }
            if(thread.getState() == Thread.State.TERMINATED) {
                break;
            }
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
