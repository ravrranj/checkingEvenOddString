import java.util.Scanner;

public class checkingEvenOddString {
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

  //requesting user to enter the set of numbers
  System.out.print("Enter the set of numbers : ");
  String input = sc.nextLine();

  // Convert the input into an integer array
  String[] inputArr = input.split("\\s+"); //Splitting by one or more spaces
  int arr[] = new int[inputArr.length];

  for (int i = 0; i < inputArr.length ; i++) {
      arr[i] = Integer.parseInt(inputArr[i]);  //convert to int

  }

  //check if all number is odd/ even

  boolean allEven = true;
  boolean allOdd = true;

  for (int num : arr) {
    if ( (num & 1) == 0){ // check if the number is even
        allOdd = false ;
    } else {              // check if odd
         allEven = false;        
    }
  }

  // Output result
  if(allEven){
    System.out.println("All number is Even. ");
  } else if (allOdd) {
    System.out.println("All number is Odd. "); 
  }  else {
    System.out.println("The set contains Even as well as Odd nummbers");
  }
   sc.close();
  } 
}