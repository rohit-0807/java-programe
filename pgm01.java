package java1;

import java.util.Scanner;
class oparation {
    int a,b;
    Scanner sc=new Scanner(System.in);

    void Op(){
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        System.out.println("addtion :"+(a+b));
    }

}

public class pgm01{
    public static void main(String[] args) {
        oparation o=new oparation();
        o.Op();
    }
}