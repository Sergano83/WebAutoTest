package org.example.DZ4;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("a= ");
        int a = scan.nextInt();
        System.out.print("b= ");
        int b = scan.nextInt();
        System.out.print("c= ");
        int c = scan.nextInt();



            if(a <=0||b <=0||c <=0) throw new Exception();
            {
                System.out.println("Не является треугольником");
            }
            if(a +b<c ||a +c<b ||b +c<a)throw new Exception();
            {
                System.out.println("Не является треугольником");
            }
            System.out.println("Perimeter:" + (a + b + c));
            double P = (a + b + c) / 2.0;
            System.out.println("Area:" + Math.sqrt(P * (P - a) * (P - b) * (P - c)));



    }



}


