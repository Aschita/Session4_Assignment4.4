package assignment_4d;

public class AliquotSequence {
	private static int divisors;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(aliquotCheckOne(74));
		    System.out.println(aliquotCheckTwo(AliquotSequence.divisors));
		    System.out.println(aliquotCheckThree(AliquotSequence.divisors));
		    System.out.println(finalCheck(AliquotSequence.divisors));
	}
	
	public static int aliquotCheckOne(int n1) {
			System.out.println("Divisors for number 74 are: ");
		    for (int i = 1; i < n1; i++) {
		        if (n1 % i == 0) {
		            divisors += i;
		            System.out.println(i);
		        }
		    }
		    System.out.println("Sum of divisors of number 74 is: " +       AliquotSequence.divisors);
		    return n1;
	}

	public static int aliquotCheckTwo(int n2) {
		  AliquotSequence.divisors = 0;
		  System.out.println("Divisors for number 40 are: ");
		  for (int i = 1; i < n2; i++) {
		        if (n2 % i == 0) {
		            divisors += i;
		            System.out.println(i);
		        }
		    }
		    System.out.println("Sum of divisors of number 40 is: " + AliquotSequence.divisors);
		    return n2;
	}

	public static int aliquotCheckThree(int n3) {
		    AliquotSequence.divisors = 0;
		    System.out.println("Divisors for number 50 are: ");
		    for (int i = 1; i < n3; i++) {
		        if (n3 % i == 0) {
		            divisors += i;
		            System.out.println(i);
		        }
		    }
		    System.out.println("Sum of divisors of number 50 is: " +   AliquotSequence.divisors);
		    return n3;
	}

	public static int finalCheck(int n4) {
	    AliquotSequence.divisors = 0;
	    System.out.println("Divisors for number 43 are: ");
		    for (int i = 1; i < n4; i++) {
		        if (n4 % i == 0) {
		            divisors += i;
		            System.out.println(i);
		        }

		    }
		    if (AliquotSequence.divisors == 1) {
		        System.out.println("End of Aliquot Sequence");
		    }
		    return n4;
		}
}

