/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
import java.util.Scanner;
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static int getfirstInteger(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the number being raised? ");
        int a = keyboard.nextInt();
        return a;
    }
    public static int getsecondInteger(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the Exponent? ");
        int b = keyboard.nextInt();
        return b;
    }
    public static long exp(int numA, int numB){
        if (numB == 1) return numA;
        else return numA * exp(numA,numB-1);
    }
    public static void displayOutput (int numA, int numB, long exp){
        System.out.println("The esponent is equal to: " + exp);
    }
    public static void main(String args[]) {
        // TODO code application logic here
        int numA = getfirstInteger();
        int numB = getsecondInteger();
        long exp = exp(numA, numB);
        displayOutput(numA, numB, exp);
    }
}
