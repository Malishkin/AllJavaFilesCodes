package threadslesson;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class SomeThread extends Thread {
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println("Number - "+i);
        }

    }
}

public class ThreadsExample {
    public static void main(String[] args) {
        SomeThread test = new SomeThread();
        test.start();
        SomeThread test1 = new SomeThread();
        test1.start();


    }
}
