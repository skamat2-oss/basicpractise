package UdemyAssignments.udemy;

public class pattern {

	public static void main(String[] args) {
		{ 
	        int n = 5; 
	        printNums(n); 
	    } 
		
		
		
		
	}

	private static void printNums(int n) {
		int i,j,num=1;
		for(i=1;i<n;i++)
		
		{
		
			for(j=1;j<=i;j++) {
			
				System.out.println(num+" ");
				num=num+1;
			}
			System.out.println();
		}
		
	}

}
