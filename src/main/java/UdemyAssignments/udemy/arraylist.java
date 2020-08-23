package UdemyAssignments.udemy;

import java.util.ArrayList;
//unique number in a list
public class arraylist {

	public static void main(String[] args) {
    int a[]= {1,4,4,5,6,1};
    ArrayList<Integer> ab = new ArrayList<Integer>();
    for(int i=0;i<a.length;i++) {
    	int k = 0;
    	if(!ab.contains(a[i]))
    	{
    	   ab.add(a[i]);
    	   k++;
       
        for(int j=i+1;j<a.length;j++) {
        	if(a[i]==a[j]) {
        		k++;
        	}
         }
        System.out.println(k);
        System.out.println(a[i]);
        }
        
		

	}
    System.out.println(ab);
   
	}}
