package Lv0;

public class LambKebab {
	public static void main(String[] args) {
		  int answer = 0;
	      int free = 0;
	      int n = 34; 
	      int k = 5;
	        
	      if(n>9){
	    	free =  n/10 ;
            k -= free;
	      }
	        
	     answer = (n * 12000) + (k * 2000);
	 
	     System.out.println(answer);
	}  

}
