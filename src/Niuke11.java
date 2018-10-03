public class Niuke11 {

    public static void main(String[] args) {
        System.out.println(NumberOf1(-2147483647));
    }
    public static int NumberOf1(int n) {
        if(n == 0) {
            return 0;
        }else if(n > 0) {
            int sum = 0;
            while(n > 0) {
                if(n % 2 == 1) {
                    sum++;
                }
                n /= 2;
            }
            return sum;
        }else {
            int sum = 0;
            int length = 0;
            n = -n;
            while(n > 0) {
                length++;
                if(n % 2 == 1) {
                    n /= 2;
                    sum++;
                    break;
                }
                n /= 2;
            }
            while(n > 0) {
                length++;
                if(n % 2 == 0) {
                    sum++;
                }
                n /= 2;
            }
            if(length == 0) return 1;
            return sum + 32 - length;
        }
    }
}
