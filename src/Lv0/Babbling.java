package Lv0;


public class Babbling {
	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

		int answer = 0;

        for(int i=0; i< babbling.length ;i++){
           babbling[i] = babbling[i].replaceAll("aya"," ");
           babbling[i] = babbling[i].replaceAll("ye"," ");
           babbling[i] = babbling[i].replaceAll("woo"," ");
           babbling[i] = babbling[i].replaceAll("ma"," ");
           babbling[i] = babbling[i].replaceAll(" ","");

            if(babbling[i].length() == 0){
                answer++;
            }
        }   
     System.out.println(answer);
	}
}