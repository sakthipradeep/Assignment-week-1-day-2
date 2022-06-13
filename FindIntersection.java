package week1.day2.Assignment;

public class FindIntersection {

	public static void main(String[] args) {
		int[]arr=new int[] {3,2,11,4,6,7};
		int[]arr1=new int [] {1,2,8,9,7};
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr1.length;j++) {
    		if(arr[i]==arr1[j]) {
    			System.out.println("Intersection of Two Arrays is : "+arr[i]);
    			
    		}
    	}
    }
	}

}
