public class Main {

    public static void main(String[] args) throws InterruptedException {

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("We are now in thread: " + Thread.currentThread().getName());
//                System.out.println("priority of the thread is: " + Thread.currentThread().getPriority());
//                throw new RuntimeException("Internal Exception");
//            }
//        });

        Thread thread = new NewThread();

        thread.setName("new worker thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Critical error occured in the thread:" + t.getName() + "the error is:" + e.getMessage());
            }
        });

        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread");

        Thread.sleep(1000);

    }

    private static class NewThread extends Thread {

        @Override
        public void run() {

            System.out.println("new thread: " + Thread.currentThread().getName());

        }
    }

}
