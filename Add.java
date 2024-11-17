import java.util.Scanner;
//Defining the class of java with public access modifier
public class Add {
    //Defining the main function of java 
    public static void main(String[]args){
        //Calling the Scanner class here
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the positive integer :");
        //Taking the input in java
        int a = sc.nextInt();

        System.out.print("Please enter the positive integer :");
        //Taking the input in java
        int b = sc.nextInt();

        int sum =  a+b;
        //Using concatenation to display the input and output in single line
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    } 


}

