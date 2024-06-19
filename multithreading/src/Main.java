import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {

//        System.out.println("main is starting");
//        Stack stack = new Stack(5);
//
//        new Thread(() -> {
//            int counter = 0;
//            while(++counter < 10){
//                System.out.println("Pushed: " + stack.push(100));
//            }
//        }, "Pusher").start();
//
//        new Thread(() -> {
//            int counter = 0;
//            while(++counter < 10){
//                System.out.println("Popped: " + stack.pop());
//            }
//        }, "Popped").start();
//
//        System.out.println("main is exiting");

//        Thread thread1 = new Thread1("viswa");
//        thread1.start();

//        Thread thread = new Thread(() -> {
//            for(int i=0;i<5;i++){
//                System.out.println("inside runnable "+Thread.currentThread().getName() + ", " + i);
//            }
//        }, "runnable");
//        thread.start();

//        Thread thread2 = new Thread(new Thread2());
//        thread2.start();

//        new Thread().run();

//        Thread thread3 = new Thread(() -> {
//            try{
//                Thread.sleep(1);
//                for(int i=1000;i>0;i--);
//            } catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }, "states");
//
//        thread3.start();
//
//        while (true){
//            Thread.State state = thread3.getState();
//            System.out.println(state);
//            if (state == Thread.State.TERMINATED) break;
//        }

        // deadlock situation
        String lock1 = "viswa";
        String lock2 = "mohan";

        System.out.println("main is starting");

        Thread thread1 = new Thread( () -> {
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("lock acquired");
                }
            }
        }, "thread 1");

        Thread thread2 = new Thread( () -> {
            synchronized (lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("lock acquired");
                }
            }
        }, "thread 2");

        thread1.start();
        thread2.start();

        System.out.println("main is exiting");
    }
}