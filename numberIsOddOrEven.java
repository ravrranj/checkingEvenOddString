import java.util.Scanner;

public class numberIsOddOrEven {
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

  //ask for number from user

  System.out.print("Please enter the value of the number: ");
  int num = sc.nextInt();

  //checking if number is odd or even

  String result = (num & 1) == 0 ? "Even" : "Odd" ;

  
  //print result

 System.out.println("The number " + num + " is " + result + "." );
 sc.close();

  }


}