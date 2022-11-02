package Lv1;

public class Hamberger {


	public static void main(String[] args) {
		  int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		  int[] stack = new int[ingredient.length];
	        int sp = 0;
	        int answer = 0;
	        for (int i : ingredient) {
				// sp는 0부터 사용후 증가시킨다.
	            stack[sp++] = i;
				// 높이가 4이상이면 4개의 순서가 1234인지 보고 맞으면 다시 원래대로 간다.
	            if (sp >= 4 && stack[sp - 1] == 1
	                && stack[sp - 2] == 3
	                && stack[sp - 3] == 2
	                && stack[sp - 4] == 1) {
	                sp -= 4;
	                answer++;
	            }
	        }
	        System.out.println(answer);

	}
}
