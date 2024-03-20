import java.util.*;
public class Averagemarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your total subjects : ");
        int subjects = in.nextInt();
        int sum =0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter your " + i + " subject marks : ");
            int marks = in.nextInt();
            sum = sum + marks;
        }
        double average = (double) sum / subjects;

        System.out.println("Your Average marks are " + average);
    }
}
