package Lv1;

import java.util.Arrays;

public class Budget {	
	public static void main(String[] args) {	
	    	
	    	int[] d = {2, 5, 1, 3};
	    	int budget = 10;
	    	Arrays.sort(d);
	    	
	        int answer = 0;
	        
	    for(int i=0; i<d.length;i++){
	        if(budget >= d[i]){
	            budget -= d[i]; 
	            System.out.println("budget"+budget);
	            System.out.println("i"+i);
	       
	            answer = i+1;
	            
	        }
	            
	        
	    }    
	    System.out.println(answer);
	        
		}
	}