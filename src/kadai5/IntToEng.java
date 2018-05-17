		package kadai5;
		
		import java.util.ArrayList;
		import java.util.Scanner;
		
		public class IntToEng {
		
			static //int[] a = new int[10];
			ArrayList<Integer> a = new ArrayList<Integer>();;
			
		    // メインメソッド
		    public static void main(String[] args) {
		
		    	
		        Scanner sc = new Scanner(System.in);
		        int input = sc.nextInt();
		
		        number(input);
		        
		        System.out.println(translateEng(input));
		
		    }
	
		    //数値を各桁にわける
		    public static void number(int n){
		    	int x=0;
		    	while(n>0){
		    		x = n%10;
		    		n = n/10;
		    		a.add(x);
		    	  	}
		    	}
		    
		    //１の位を調べるメソッド
		    
		    	
		    
		
		    // 数値を英訳する変換するメソッド
		    static String translateEng(int n) {
		        return "";
		    }
		}
