/* use Die class 
1. create 5 die objects 
2. roll the 5 dice 10 times
3. display all 5 face values in  a row 
4. print 
   a. 3 dice has the same number - three of a kind 
   b. 3 dice has the same number, other 2 has same number - full house 
   c. 4 dice has the same number - 4 of a kind 
   d. 5 dice has the smae number - flush 
   */
   import java.util.*; 
   
   public class PlayCardWithDie { 
	public static void main(String[] args) {
		Die d1 = new Die();   //declares an array of 2 die 
		Die d2 = new Die(); 
		
		int fv1;
		int fv2;
		int sum;
		int numTimes; 
		int count = 0;
		
		Scanner scan = new Scanner(System.in); 
	    System.out.println("Enter amount of rolls: ");
		
		numTimes = scan.nextInt();  
		 
			
		//roll numTimes
		for(int i = 0; i < numTimes; i++) {  //roll numTimes
			 fv1 = d1.roll(); 
			 System.out.print(fv1 + "\t"); //print the face value 
			 fv2 = d2.roll(); 
			 System.out.print(fv2 + "\t");
			  sum = fv1 + fv2; 
			  
			 if(sum == 7) {
			   count++; 
			 }
			
			 
		}
		
		System.out.println(); 
		System.out.println("This is the content of count for each outcomes: " + count);
		
		
		
		
		
		
		}
	
	}
   