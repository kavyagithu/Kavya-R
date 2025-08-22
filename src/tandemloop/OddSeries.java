package tandemloop;

import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();
        

        int ans;
        if (n % 2 == 0) {
            ans = n - 1; 
        } else {
            ans = n;    
        }

        for (int i = 1; i <= ans; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd);
            if (i < ans) {
                System.out.print(", ");
            }
        }
    }
}
