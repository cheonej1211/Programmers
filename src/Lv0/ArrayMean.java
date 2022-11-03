package Lv0;

public class ArrayMean {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = 0;
		double sum = 0;
	        
        for(int i=0;i<numbers.length;i++){
        	sum += numbers[i];
        }
        
         answer = sum/numbers.length ;
         
         
         System.out.println(answer);
	}

}
