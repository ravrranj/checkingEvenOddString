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
