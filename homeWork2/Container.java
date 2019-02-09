package homeWork2;

	import java.util.Scanner;
	public class Container {
	public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 int[]  numbers = new int[10];
	 
	 System.out.println("Enter some numbers: ");
	 
	 for(int i = 0 ;i<5; i++) {
	  
	  numbers[i] = sc.nextInt();
	 }
	    
	  System.out.println(numbers[2]);
	 
	 sc.close();
	 
	 
		}
	}
