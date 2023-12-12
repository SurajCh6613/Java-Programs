package Threading;
public class ThreadStudy {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            try{
                System.out.println(j);
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        HI ObjHi = new HI();
        HELLO ObjHello =new HELLO();

        ObjHi.start();
        ObjHello.start();
    }
}
