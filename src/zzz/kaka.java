package zzz;

public class kaka {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int result=0;

		 for (int i = 1; i <= 1000; i++) {
		        if (i % 3 == 0 || Integer.toString(i).contains("3")) {
		        	result = result + i;

		        }
		 }
		 System.out.println(result);
	}
}
