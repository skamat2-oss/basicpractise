package UdemyAssignments.udemy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class BasicArray {

	public static void main(String[] args) {
	/*String[] names = {"Mahesh","rupre","ganjn"};
	int[] numbers = {1,2,4,5,6,7};
	List namesList = Arrays.asList(names);
	namesList.add("add");
	System.out.println(namesList);
	for(Object name:namesList) {
		System.out.println(name);
	}
	List<int[]> numbersList = Arrays.asList(numbers);
	//namesList.add("rah");
	for(int i:numbers) {
		System.out.println(i);
	}*/
		
	String name = "Mahesh";
	System.out.println(name.substring(0,2));
	for(int i =0;i<=name.length();i++) {
		
	 System.out.println(name.substring(0,i));
	}
    //System.out.println(name.substring(1,2));
	
		
	//int i=1;
	int i,j,num=1;
	for(i=1;i<=6;i++) 
		{
		
		for(j=1;j<=i;j++) 
		   {	
		    System.out.println(num+"");
		    num=num+1;
		   }
		
	}
		/*String str = "";
		for (int i = 1; i <= 5; i++) {
		str += ","+ Integer.toString(i);
		System.out.println(str.substring(1,str.length()));
		}
	*/
	
	
	}

}
