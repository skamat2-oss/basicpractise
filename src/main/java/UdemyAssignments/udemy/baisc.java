package UdemyAssignments.udemy;

import java.util.Scanner;

public class baisc {
	
	
public static int startTheCar(String t)
{
	int y = 0 ;
	if((t.equalsIgnoreCase("start"))&&(y==0))
	{
		System.out.println("start the car");
		y=1;
	
	}
	else
	{
		System.out.println("car has started already");
		y =0;
	}
	return y;
}

	
	
	
	


	public static void main(String[] args) {
	 
    String in = "";
    int y =0;
	for( y =1;y<4;y++)
	 {
		 
	  Scanner scanner = new Scanner(System.in);
      System.out.println("Enter \"START\" OR \"STOP\" :  ");
      in = scanner.next();
      
      String t = in;
      
     if (t.equalsIgnoreCase("START")){
    	 
    	// int s = 1;
    	 y = startTheCar(t);
     }}
	}
    /* else if (t.equalsIgnoreCase("Stop"))
      {
    	  //int st = 1;
    	  stopTheCar(t);
      }
     else
    	 System.out.println("invalid input");
*/
}
	
	

