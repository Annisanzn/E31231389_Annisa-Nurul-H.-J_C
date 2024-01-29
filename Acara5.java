/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acara5;
import java.util.Scanner;
/**
 *
 * @author user
 */
class No1 {
 public static void main(String[] args) {
 System.out.println("1. println ");
 System.out.println("2. println ");
 System.out.print("1. print ");
 System.out.print("2. print");
 }
}


class No2 {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 
 System.out.print("Inputkan integer: ");
 int number = input.nextInt();
 System.out.println("Kamu meng-inputkan: " + number);
 
 // closing the scanner object
 input.close();
 }
}

class No3{
 public static void main(String[] Strings) {
 double minutesInYear = 60 * 24 * 365;
 Scanner input = new Scanner(System.in);
 System.out.print("Input the number of minutes: ");
 double min = input.nextDouble();
 long years = (long) (min / minutesInYear);
 int days = (int) (min / 60 / 24) % 365;
 System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
 }
}

class No4 {
    public static void main (String [] args ) {
        System.out.println ("Hello,");
        System.out.print ("Ms. Annisa Nurul");
    }
}

class No5 {
    public static void main (String [] args ) {
   Scanner scanner = new Scanner(System.in);
   System.out.print ("Masukkan nama anda :");
   String inputText = scanner.nextLine();
   System.out.print ("Nama Anda Adalah :" + inputText);
    }
}

class No6 {
  public static void main (String [] args ) {
   Scanner scanner = new Scanner(System.in);
   
   System.out.println ("Masukkan nama depan anda :");
   String inputText1 = scanner.nextLine();
   System.out.println ("Masukkan nama belakang anda :");
   String inputText2 = scanner.nextLine();
   System.out.println ("Hello,  ");
   System.out.println (""+ inputText1 + inputText2);
   
  }  
}

class No7 {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris (gunakan angka yang sesuai dengan pola yang Anda inginkan)

        for (int i = 1; i <= n; i++) {
            // Spasi sebelum huruf 'J'
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Menampilkan karakter 'J'
            System.out.print("J");

            // Spasi antara huruf 'J' dan 'A'
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Menampilkan karakter 'A'
            System.out.print("A");

            // Spasi antara huruf 'A' dan 'V'
            for (int j = 1; j < (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Menampilkan karakter 'V'
            System.out.print("V");

            // Spasi antara huruf 'V' dan 'A'
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Menampilkan karakter 'A'
            System.out.print("A");

            // Spasi setelah huruf 'A'
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}




class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Please select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Result: " + result);
    }
}

