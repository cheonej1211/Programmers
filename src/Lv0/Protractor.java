package Lv0;

public class Protractor {
	public static void main(String[] args) {
	      int answer = 0;
	      int angle = 90;
	        
	        if(angle > 0 && angle < 90){
	            answer = 1;
	        }else if(angle == 90){
	            answer = 2;
	        }else if(angle < 180){
	            answer = 3;
	        }else if(angle == 180){
	            answer = 4;
	        }
	        
	        System.out.println(angle);
	    }

}
