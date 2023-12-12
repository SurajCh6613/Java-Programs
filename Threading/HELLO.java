package Threading;
public class HELLO extends Thread{
    @Override
    public void run() {
        for (int j = 1; j <=5; j++) {
            System.out.println("Hello...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
