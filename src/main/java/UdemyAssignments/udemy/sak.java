package UdemyAssignments.udemy;

public class sak {

	public static void main(String[] args) {
		 int n = 5; 
	        printNums(n); 
	    }

	private static void printNums(int n) {
		int i, j, num=1; 
        
        // outer loop to handle number of rows 
        // n in this case 
        for(i=0; i<n; i++) 
        { 
   
            for(j=0; j<=i; j++) 
            { 
                
                System.out.print(num+ " "); 
                  
                // incrementing num at each column 
                num = num + 1; 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
		
	} 
	

	}


