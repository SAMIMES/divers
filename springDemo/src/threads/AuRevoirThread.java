package threads;

public class AuRevoirThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Au revoir");
            try {
                ExempleMultithread.counter ++ ;
                // Fait une pause de 500 ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
