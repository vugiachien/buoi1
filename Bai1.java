package bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap do dai canh n=");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

}
