package btvn;

import java.util.Scanner;

public class bai2 {

    void cau_a(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1 / (1.0 * i);
        }
        System.out.println(s);
    }

    int Giai_Thua(int n) {
        int A = 1;
        for (int i = 1; i <= n; i++) {
            A = A * i;

        }
        return A;

    }

    void Cau_b(int n) {
        int P = 0;
        for (int i = 1; i <= n; i++) {
            P += Giai_Thua(i);
        }
        System.out.println(P);

    }

    public static void main(String[] args) {
        bai2 obj = new bai2();
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.println("Nhap so nguyen duong n=");
            n = input.nextInt();

        } while (n < 0);
        obj.cau_a(n);
        obj.Cau_b(n);
        input.close();

    }
}
