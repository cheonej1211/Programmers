package Lv1;

import java.util.ArrayList;
import java.util.List;

public class NumberPartner {
	public static void main(String[] args) {
	
		String X ="5525";
		String Y ="1255";
		String[] YArr  = Y.split("");
		List<String> numArr = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		
		int index = 0;
			
		for(String yIn: YArr) {
			if(X.contains(yIn)){
				numArr.add(YArr[index]);
			}
			index++;
		}
		
		if(numArr.isEmpty()) {
			sb.append(-1);
		}
		
		int temp;

		for(int i = 0; i < numArr.size(); i++) {
			for(int j = 0; j < numArr.size(); j++) {
				if(Integer.parseInt(numArr.get(j)) < Integer.parseInt(numArr.get(i))) {
					temp = Integer.parseInt(numArr.get(i));
					numArr.set(i, numArr.get(j));
					numArr.set(j,  Integer.toString(temp));
				}
			}
		}
		

      
        for (String item : numArr) {
        	if(numArr.get(0).equals("0")) {
        		sb.append(0);
        		break;
        	}
        	sb.append(item);
        }
        
        
		System.out.println(sb);
		
		
		// 100점 짜리 답 

		 StringBuilder answer = new StringBuilder();
	        int[] x = {0,0,0,0,0,0,0,0,0,0};
	        int[] y = {0,0,0,0,0,0,0,0,0,0};
	        for(int i=0; i<X.length();i++){
	           x[X.charAt(i)-48] += 1;
	        }
	        for(int i=0; i<Y.length();i++){
	           y[Y.charAt(i)-48] += 1;
	        }

	        for(int i=9; i >= 0; i--){
	            for(int j=0; j<Math.min(x[i],y[i]); j++){
	                answer.append(i);
	            }
	        }
	        if("".equals(answer.toString())){
				/* return "-1"; */
	        	System.out.println("-1");
	        }else if(answer.toString().charAt(0)==48){
				/* return "0"; */
	        	System.out.println("0");
	        }else {
				/* return answer.toString(); */
	        	System.out.println(answer.toString());
	        }
		
		
	}
}
