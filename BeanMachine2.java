import java.util.Scanner;

public class BeanMachine2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //set up the scanner
		
		System.out.println("Enter the number of balls (maximum of 10) to drop: "); //prompt the user to enter the number of balls needed
		int numberofballs = input.nextInt(); //get the number of balls
		
		System.out.println("Enter the number of slots (0 to your number) in the bean machine: "); //prompt the user to enter the number of slots in the bean machine
		int numberofslots = input.nextInt(); //get the number of slots
		
		int r = 0;
		int[] slots=new int[10];
		
		for (int p = 0; p < numberofballs; p++){

			for (int i = 1; i < numberofslots+1; i++){ 

				int move = (int)(Math.random() * 10); //get the moves the ball will take			
				if (move <= 5){
					System.out.print("R ");
					r++;
				}//end for slot loop
				else {
					System.out.print("L ");
			}	
				slots[r]++;
		} //end for ball loop
			System.out.print("This ball fell in hole " + r);
		System.out.println("");	
		r = 0;
		}	
		input.close();
	}//end of main
	
	
}//end of class
