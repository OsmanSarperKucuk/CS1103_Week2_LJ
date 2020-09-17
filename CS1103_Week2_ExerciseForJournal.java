/**
 * @author OSMAN SARPER KUCUK
 *
 */
public class CS1103_Week2_ExerciseForJournal {

	static int factorial(int x) {
		
		//precondition
		if (x<0) {
			
			System.out.print("Argument cannot be less than ");
			
			return 0;
		}
		
		//Base Case
		else if (x == 0) {
			return 1;
		}
		
		//Recursive Case
			return x * factorial(x-1);
		
	}
	
	static int fibonacci (int x) {
		
		//NOTE: Despite the fact that exercise notes mentions fibonacci(0) = 1, 
		//i think it was supposed to be fibonacci(0)=0
	    
		if (x<0) {
			
			System.out.print("Argument cannot be less than ");
			return 0;
			
		}
		
		else if (x==0) {
			
			return 0;
			
		}
		
		else if (x==1) {
			
			return 1;
			
		}
		
		return fibonacci(x-1) + fibonacci(x-2);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("factorial(5):");
		System.out.println(factorial(5));
		
		System.out.print("factorial(3):");
		System.out.println(factorial(3));
		
		System.out.print("\n");
		
		System.out.print("fibonacci(2):");
		System.out.println(fibonacci(2));
		
		System.out.print("fibonacci(4):");
		System.out.println(fibonacci(4));
		
		System.out.print("fibonacci(8):");
		System.out.println(fibonacci(8));

	}

}
