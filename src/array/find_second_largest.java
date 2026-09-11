package array;

public class find_second_largest {
     public static void main(String[] args) {
    	 
    	 int a[] = {13,40,12,56,103,98,103};
    	 

 		int largest = a[0];
        int second = 0;
 		for(int i = 1; i < a.length; i++) {

 			if(a[i] > largest) {
 				largest = second;
 				second = a[i];
 	          
 			}
 			
 		}
 		
 		System.out.println("second Largest number = " + largest);
 		System.out.println("second Largest number = " + second);
   	 
    	 
    	 }
}