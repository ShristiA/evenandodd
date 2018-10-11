package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	if(findMethod()){
        System.out.println("it is even");
    }else{
        System.out.println("It is odd");
    }
    }
    public static boolean findMethod(){
        boolean number = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num%2==0){
            number = true;
        }
       return number;
    }
}
