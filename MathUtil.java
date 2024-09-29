public class MathUtil {
    // Статические методы

    // Проверка, является ли число простым
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Нахождение наибольшего общего делителя (НОД)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Нахождение наименьшего общего кратного (НОК)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Получение n-го числа Фибоначчи
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    // Вычисление факториала числа
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Нестатические методы

    // Проверка, является ли число совершенным
    public boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    // Сумма цифр числа
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Переворот числа
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    // Проверка, является ли число числом Армстронга
    public boolean isArmstrongNumber(int n) {
        int original = n, sum = 0, digits = (int) Math.log10(n) + 1;
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    // Нахождение следующего простого числа
    public int nextPrime(int n) {
        n++;
        while (!isPrime(n)) n++;
        return n;
    }

    public static void main(String[] args) {
        // Тестирование статических методов
        System.out.println(MathUtil.isPrime(5));        // true
        System.out.println(MathUtil.gcd(54, 24));      // 6
        System.out.println(MathUtil.lcm(4, 6));        // 12
        System.out.println(MathUtil.fibonacci(7));     // 13
        System.out.println(MathUtil.factorial(5));     // 120

        // Тестирование нестатических методов
        MathUtil util = new MathUtil();
        System.out.println(util.isPerfectNumber(28));  // true
        System.out.println(util.sumOfDigits(1234));    // 10
        System.out.println(util.reverseNumber(12345)); // 54321
        System.out.println(util.isArmstrongNumber(153)); // true
        System.out.println(util.nextPrime(10));        // 11
    }
}

