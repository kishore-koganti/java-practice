public class Palindrome {

    public static boolean isPalindrome(int n) {
        int rev = 0, b, i;
        i = n;

        while (n != 0) {
            b = n % 10;
            rev = (rev * 10) + b;
            n = n / 10;
        }

        return i == rev;
    }

    public static void main(String[] args) {
        int n = 121;

        System.out.println("Is Palindrome: " + isPalindrome(n));
    }
}
