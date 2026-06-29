//package single-and-multi-level-inheritance;

import java.util.Scanner;
public class SingelInheritance {

    public static void main(String[] args){
        System.out.print("program of Single Inheritance ");
        new Prime();
    }
}

class Calculation {
    Calculation(){

        System.out.println(" enter two numbers:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Enter a operation in + - * / ");
        char c = s.next().charAt(0);
        switch (c) {
            case '+':
                System.out.print(a+b+ " sum of two numbers");
                break;
            case '-':
                System.out.print(a-b+" sub of two numbers");
                break;
            case '*':
                System.out.println(a*b+ " multipe of two numbers");
                break;
            case '/':
                System.out.println(a/b+ " division of two numbers");
                break;
            default:
                System.out.print(" enter an opertion in + - * /");
                break;
        }
        System.out.println();
        s.close();
    }
}

class Grade extends Calculation {

    Grade() {
        System.out.println("Enter the 6 subject marks of student ");
        Scanner s = new Scanner(System.in);
        int s1= s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();
        int s4 = s.nextInt();
        int s5 = s.nextInt();
        int s6 = s.nextInt();
        double avg = (s1+s2+ s3 + s4+ s5+ s6)/6;
        if((s1< 40)|| (s2< 40) || ( s3 < 40) || (s4 < 40) || (s5 < 40) || (s6 < 40)){
            System.out.println("Student is fail......");

        }
        else{
            if (avg >= 90) {
                System.out.println(" student grade is : O. ");
            }
            else if (avg >= 80) {
                System.out.println(" Student garde is : A");
            }
            else if (avg >=70) {
                System.out.print("Student grade is : B");                
            }
            else if(avg >= 60){
                System.out.print("Student grade is : C");
            }
            else if ( avg >= 50){
                System.out.print("Student is PASS");

            }
            else
                System.out.print("Student is FAIL");
        }
        System.out.println();
        s.close();
    }
}

class Prime extends Grade{
    Prime() {
        System.out.println("Enter the range for printing prime numbers:");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter minimum range number:");
        int min = s.nextInt();
        System.out.println("enter maximum range number : ");
        int max = s.nextInt();
        for(; min <= max;){
            int count=0;
            for(int i = 2; i < min/2; i++){
                if(min%i==0)
                    count++;
            }
            if(count==0)
                System.out.print(min+", ");
            min++;
        }
        s.close();
    }
}