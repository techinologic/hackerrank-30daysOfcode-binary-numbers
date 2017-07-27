import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);

        System.out.println(countBin(s));
    }

    static int countBin(String s) {
        int count = 0;
        int high = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                count = 0;
            }
            if (count > high) {
                high = count;
            }
        }
        return high;
    }
}