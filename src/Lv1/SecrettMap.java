package Lv1;

public class SecrettMap {

	public static void main(String[] args) {   
	    	
	    	int n = 5;

	    	int[] arr1 = {9, 20, 28, 18, 11};
	    	int[] arr2 = {30, 1, 21, 17, 28};
	    	
	    	String num1Str;
	    	String num2Str;

	    	String[] num1StrArr;
	    	String[] num2StrArr;
	    	
	    	String[] answer = new String[n];  
	    	
	    	for (int i = 0; i < arr1.length; i++) {
	    		num1Str = String.format("%"+n+"s", Integer.toBinaryString(arr1[i])).replaceAll(" ", "0");

	    	
    				num2Str = String.format("%"+n+"s", Integer.toBinaryString(arr2[i])).replaceAll(" ", "0");
    								
    				num1StrArr = num1Str.split("");
    				num2StrArr = num2Str.split("");
                
                		StringBuilder sb = new StringBuilder(); 
    				
    					for (int j = 0; j < num1StrArr.length; j++) {			
								if(num1StrArr[j].equals("1") || num2StrArr[j].equals("1")) {
									sb.append("#");
								}else {
									sb.append(" ");
								}
							
						}
    									
    							answer[i] = sb.toString();
						}
    				   				
	    			System.out.println(answer);
	    	
			}
	
}
