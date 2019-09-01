package join;

import java.math.BigInteger;

public class ComplexCalculation {

    public static void main(String[] args) throws InterruptedException {
        ComplexCalculation complexCalculation = new ComplexCalculation();
        BigInteger result = complexCalculation.calculateResult(new BigInteger("2"), new BigInteger("3"), new BigInteger("3"), new BigInteger("2"));
        System.out.println(result);
    }

    public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) throws InterruptedException {
        BigInteger result;
        Thread thread1 = new PowerCalculatingThread(base1, power1);
        Thread thread2 = new PowerCalculatingThread(base2, power2);
        thread1.start();
        thread2.start();
        thread1.join(2000);
        thread2.join(2000);
        result = ((PowerCalculatingThread)thread1).getResult().add(((PowerCalculatingThread)thread2).getResult());

        /*
            Calculate result = ( base1 ^ power1 ) + (base2 ^ power2).
            Where each calculation in (..) is calculated on a different thread
        */
        return result;
    }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
           /*
           Implement the calculation of result = base ^ power
           */
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
                result = result.multiply(base);
            }
        }

        public BigInteger getResult() { return result; }
    }
}
