package prime;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    private List<Integer> primes;
    private int count = 0;
    private int sumOfPrimes = 0;
    private int firstNumber, lastNumber;



    public Prime(int firstNumber, int lastNumber) {
        if(!isValidInitiationValues(firstNumber, lastNumber)) {
            printError();
            return;
        }
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
        primes = new ArrayList<>();
        calculatePrimes(firstNumber, lastNumber);
    }

    private boolean isValidInitiationValues(int firstNumber, int lastNumber) {
        return firstNumber >= 0 && firstNumber <= lastNumber && lastNumber <= 1000;
    }

    private boolean numIsPrime(int current, int depth) {
        if(current > 1) {
            for (int i = 2; i <= (current)/2; i++) {
                if (current % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private void calculatePrimes(int current, int stop) {
        if (current <= stop) {
            /*primes.add(count);
            primes.add(sumOfPrimes);*/
            if (numIsPrime(current, 0)) {
                primes.add(current);
                count++;
                sumOfPrimes += current;
                /*calculatePrimes(++current, stop);
            } else {*/
            }
            calculatePrimes(++current, stop);
        }
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public String printCount() {
        return "Hej, det finns " + count + " primtal mellan " + firstNumber + " och " + lastNumber + "!";
    }

    public String printSum() {
        return "Och den totala summan av dessa primtal är " + sumOfPrimes;
    }

    private void printError() {
        System.out.println("Hoppsan, fel intervall angivet!");
    }
}
