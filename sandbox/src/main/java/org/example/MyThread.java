package org.example;

// extends Thread 사용해도 무방. 클래스는 다중상속이 불가능하기 때문에, 이미 무언가를 상속했다면 인터페이스 상속이 강제..
// 쓰레드 클래스의 기능 확장이 필요한 경우에는 Thread 클래스를 상속하고
// 단순히 run 메소드만 구현하는 경우에는 Runnable 인터페이스를 상속하는 것이 좋습니다.
public class MyThread implements Runnable {
    int num;

    public MyThread() {
        this.num = 0;
    }

    public MyThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(this.num + " thread start");
//        System.out.println(this.num + " thread State: " + thread.getState());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.num +" thread end");
    }
}
