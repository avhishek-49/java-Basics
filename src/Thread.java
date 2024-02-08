//class c MyThread extends Thread {
//    public void run() {
//        // Code that will run in a separate thread
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Thread: " + i);
//            try {
//                Thread.sleep(1000); // Sleep for 1 second
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyThread thread1 = new MyThread();
//        MyThread thread2 = new MyThread();
//
//        thread1.start(); // Start the first thread
//        thread2.start(); // Start the second thread
//
//        // Code in the main thread
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Main Thread: " + i);
//            try {
//                Thread.sleep(1000); // Sleep for 1 second
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
