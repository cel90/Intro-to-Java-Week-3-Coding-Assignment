import java.util.Arrays;

public class Coding_Assignment {

	 public static String wordConc(String str,int n)
	   {
		return 	str.repeat(n);
		} 
	  public static String fullName(String firstName, String lastName)
	  { 
		  return firstName+" "+ lastName ; 
	  }
	  public static boolean sumCheck(int[] arr1) {
			int sum = 0;
			for ( int num : arr1) {
			sum += num ;	
			}
			if (sum > 100 )  {
				return true ;
			}
			else { 
				return false;
			}
		}
	  
		public static double avgElem (double[] arr) {
			int count = 0;
		
			for (double num : arr)  {
				count += num ;
			}
			double avg = (count / arr.length) ;
			return avg ; 
			
		}
		
		
		public static boolean avgElemCheck (double[] arr1, double[] arr2) {
			int count1 = 0;
		
			for (double numarr1 : arr1)  {
				count1 += numarr1 ;
			}
			double avg1 = (count1 / arr1.length) ;
			
			int count2 = 0;
			
			for (double numarr2 : arr2)  {
				count2 += numarr2 ;
			}
			double avg2 = (count2 / arr2.length) ;
			if (avg1 > avg2)  {
				return true;
			}
			else {   
				return false ;
			}
			
		}
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket)
		{
			
			if (isHotOutside && moneyInPocket > 10.50) {
				return true ;
			}
			else {   
				return false ;
			}
		}
		public static int [] multiplication (int[] arrNum, int n)
		{
		
			int[] newArr = new int [arrNum.length] ;
          for (int i = 0 ; i < arrNum.length ; i++) {
        	newArr[i]  = (arrNum[i] * n ) ;
        	
        	 
          }
        	return newArr;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
   int [] ages = new int[] {3,9,23,64,2,8,28,93};
    // a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
  
    System.out.println(ages[ages.length-1] - ages[0] );
    // b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
    int [] new_ages = new int[] {3,9,23,64,2,8,28,93,100};	 
    System.out.println(new_ages[new_ages.length-1] - new_ages[0] );
    // c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
    int ageSum = 0;
    for (int num : new_ages ) {
    	ageSum += num ; 
    }
    int avgAge = ageSum / (new_ages.length) ; 
    
    System.out.println(avgAge) ; 
	
	// 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	String[] names = new String[] {"Sam","Ty","Tim","Sally","Buck","Bob"};
	
	System.out.println(Arrays.toString(names));
	
	// a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	
	int count = 0 ;
	int avgNum = 0;
	for (String name : names) {
		count += name.length();	
	}
	
	avgNum = count / (names.length) ; 
	System.out.println(avgNum) ; 
	
	// b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	
	String concName = "";
	for (String name : names) {
		concName += (name +" ") ; 

	}
	
	System.out.println(concName) ;
		
 // Access laST ELEMENT OF AN ARRAY:
	System.out.println((names[names.length-1]));
	
	// How do you access the first element of any array?
	System.out.println((names[0]));
	
	// 5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	
	int[] nameLengths = new int[names.length] ;
	for (int i=0 ; i < names.length ; i++) {
		nameLengths[i]	= names[i].length() ; 	
	}
	System.out.println(Arrays.toString(nameLengths));
	
	// 6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	
	int count2 = 0;
	for (int nameL : nameLengths) {
	count2 += nameL;	
	}
	System.out.println(count2);
	
	// 7Write a method that takes a String, word,and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	
	
	System.out.println(wordConc("Hello",4));
	
	// 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

	System.out.println(fullName("steve","james"));
	// 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	int[] arr2 = new int [4] ;
      arr2[0] = 200;
      arr2[1] = 12;
      arr2[2] = 4;
      arr2[3] = 5;
		System.out.println(sumCheck(arr2));
		
		// 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	
		double [] arr3 = new double [3] ;
	      arr3[0] = 9.45;
	      arr3[1] = 25.25;
	      arr3[2] = 3.12;
	    
			System.out.println(avgElem(arr3));
		//  11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			double [] arrCheck1 = new double [3] ;
			arrCheck1[0] = 9.12;
			arrCheck1[1] = 2.20;
			arrCheck1[2] = 6.75;
		      double [] arrCheck2 = new double [4] ;
		      arrCheck2[0] = 10.10;
		      arrCheck2[1] = 32.10;
		      arrCheck2[2] = 4.20;
		      arrCheck2[3] = 3.30;
		    
				System.out.println(avgElemCheck(arrCheck1,arrCheck2));
	
			// 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				boolean isItHot = true ;
				System.out.println(willBuyDrink(isItHot,30));
			      isItHot = false ;
				System.out.println(willBuyDrink(isItHot,30));
	
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			// i'm creating this method to multiply each int in the array to a number entered from our choice and return a new array .
				int [] array1 = new int [4] ;
				array1[0] = 5;
				array1[1] = 10;
				array1[2] = 3;
				array1[3] = 2;
				int n = 4 ; 
				System.out.println(Arrays.toString(multiplication(array1,n)));
				
             
	}
}
