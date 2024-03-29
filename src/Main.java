public class Main {
    public static void main(String[] args) {
        System.out.println(sum(2));
        System.out.println(tailSum(2,2));
        System.out.println(iterativeSum(2));
        System.out.println(powerOf10(3));
        System.out.println(fibonacci(15));
        System.out.println(toBinary(10));
    }
    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static int tailSum(int currentSum, int n) {
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }

    public static int iterativeSum(int n) {
        int sum = 0;
        if(n < 0) {
            return -1;
        }
        for(int i=0; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int powerOf10(int n) {
        if (n == 0) {
            return 1;
        }
        System.out.println(10 * n);
        return powerOf10(n-1) * 10;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static String toBinary(int n) {
        if (n<=1) {
            return String.valueOf(n);
        }
        return toBinary(n/2) + String.valueOf(n%2);
    }
}