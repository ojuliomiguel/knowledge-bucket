package Threads.NumerosPrimos.src;

public class PrimeNumberThread extends Thread {
    private int limitInterval;
    private int startInterval;
    private String primeNumbers;

    PrimeNumberThread(int startInterval, int limitInterval) {
      this.startInterval = startInterval;
      this.limitInterval = limitInterval;
      this.primeNumbers = " , ";
    } 

    @Override
    public void run() {
      boolean flag;
      for(int i = this.startInterval; i < this.limitInterval; i++){
        flag = false;
        for (int j = 2; (j*j <= i); j++)
          if (i%j == 0){
            flag = true;
            break;
          }
          if(!flag)
            this.primeNumbers += Integer.toString(i) + ", ";    
      }

    }

    public String showPrimeNumbers() {
      return this.primeNumbers;
    }
}