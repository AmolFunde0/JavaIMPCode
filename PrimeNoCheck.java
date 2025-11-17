public class PrimeNoCheck {

    public static void main(String args[]) {
        int n = 10;

        if (isPrime(n)) {
            System.out.println(n+ " : no is prime...");
        } else {
            System.out.println(n+" : no is not prime...");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {   
                return false;
            }
        }

        return true;
    }
}
