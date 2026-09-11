package array;

public class count_dublicate_number {
	public static void main(String[] args) {
		int a[]= {10,20,30,10,50};
		for(int i=0;i<a.length;i++) {
//			int a=0;
			int count=0;
			for(int j=0;j<a.length;j++) {
				
			if (a[i]==a[j]) {
				count++;
			}
		}if(count>1) {
			System.out.println("the reapeated numbers are:"+a[i]);
		 }
		}
	}
}
