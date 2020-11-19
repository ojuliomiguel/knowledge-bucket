package Threads.NumerosPrimos.src;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    int startInterval = 2;
    int limitInterval = 0;
    ArrayList<PrimeNumberThread> primeNumberThreads = new ArrayList<PrimeNumberThread>();
    final int INTERVAL = 100000; 

    // adicionando as threads em um arraylist e executando-as
    long  startTime = System.currentTimeMillis();
    for (int i = 0; i < 10; i++) {
      limitInterval += INTERVAL;
      primeNumberThreads.add(new PrimeNumberThread(startInterval, limitInterval)); 
      startInterval = limitInterval;
      primeNumberThreads.get(i).start();
    }
    
    for (PrimeNumberThread thread : primeNumberThreads) {
      thread.join();
    }
    long totalTime = System.currentTimeMillis() - startTime; 
    

    // forEach somente para exibir as mensagens
    for (PrimeNumberThread thread : primeNumberThreads) {
      System.out.println(thread.showPrimeNumbers());
    }

    System.out.println("\n Tempo total: " + totalTime + " ms");
    
  }
}
