package threads;

public class ExempleMultithread {

    public static int counter = 0;
    public static void main(String[] args) {

        /**
         * Les deux threads commencent à s'exécuter en parallèle. L'ordonnancement des threads est géré
         * par le système d'exploitation et l'ordonnanceur de threads de la JVM (Java Virtual Machine).
         * Il est important de noter que l'ordre d'exécution des threads n'est pas garanti et peut varier à chaque exécution du programme.
         */
        // Crée deux objets de type Thread
        Thread thread1 = new Thread(new BonjourRunnable());
        Thread thread2 = new AuRevoirThread();

        // Démarre les threads
        thread1.start();
        thread2.start();

    }
}
