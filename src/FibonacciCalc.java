import java.math.BigInteger;

public class FibonacciCalc {
    static int Count = 2;

    public static void main(String[] args) {
        System.out.println("Count 0 = 0");
        System.out.println("Count 1 = 1");
        BigInteger n1 = BigInteger.valueOf(0);
        Fibonacci(BigInteger.valueOf(0),BigInteger.valueOf(1));
    }

    public static void Fibonacci(BigInteger num1, BigInteger num2)
    {
        while (Count <= 100)
        {
            BigInteger nextNum = num1;
            nextNum = nextNum.add(num2);
            System.out.println("Count " + Count + " = " + nextNum);
            Count ++;
            Fibonacci(num2, nextNum);
        }

    }
}
