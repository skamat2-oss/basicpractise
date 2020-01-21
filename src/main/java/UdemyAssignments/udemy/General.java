package UdemyAssignments.udemy;

import java.util.Scanner;

public class General {
    int f = 12;
    
    
    public void getData(int a) {
    	
    	int c = a+f;
    	System.out.println(c);
    	
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter: ");
	    int a = sc.nextInt();
	    System.out.println("entered value is :" + a );
        General gn = new General();
        gn.getData(a);
		
	}

}
