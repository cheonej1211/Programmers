package Lv0;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		int answer = 0;
		int n = 9;
        
        for(int i=0;i<n+1;i++){
            if(i%2 == 0){
               answer += i;
            }
          
        }
   
        System.out.println(answer);
	}
}
