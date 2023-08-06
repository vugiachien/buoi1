package btvn;

import java.util.Scanner;

public class bai3 {

    boolean check(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        bai3 obj = new bai3();
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap s nguyen duong n=");
            n = input.nextInt();

        } while (n < 0);

        if (obj.check(n)) {
            System.out.print(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }

        input.close();
    }

}
