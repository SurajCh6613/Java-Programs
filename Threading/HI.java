package Threading;
public class HI extends Thread{
    @Override
    public void run() {
        for (int j = 1; j <=5; j++) {
            System.out.println("Hi...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
