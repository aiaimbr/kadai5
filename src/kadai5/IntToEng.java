package kadai5;

import java.util.ArrayList;
import java.util.Scanner;

public class IntToEng {

	static ArrayList<Integer> numbers = new ArrayList<Integer>(); //数字を一の位から順に入れるリスト

	// メインメソッド
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if(input>10 && input<20) {
			System.out.println(Ten(input));
		}
		else System.out.println(translateEng(input));
	}

	// 数値を英訳する変換するメソッド
	public static String translateEng(int n) {
		String num = "";

		if (n / 1000000 > 0 && n / 1000000 < 1000) {
			num += Hundred(n / 100000) + " million ";
		}

		if (n / 1000 > 0 && n / 1000 < 1000) {
			num += Hundred(n / 1000) + " thousand ";
		}

		if (n % 1000 >= 0 && n % 1000 < 1000) {
			num += Hundred(n % 1000);
		}
		
		return num;
	}

	
	//11~19を英訳するメソッド
	public static String Ten(int n) {
		
		String num = "";
		if (n/10 == 1) {
			num = TeensPlace(n%10);
		}
		
		return num;
		
	}
	
	
	// 1~10,20~100の位を英訳するメソッド
	public static String Hundred(int n) {

		String num = "";

		int H = n / 100;
		int T = n % 100 / 10;
		int O = n % 10;

		if (H > 0 && H < 10) {
			num += OnesPlace(H) + " hundred ";
					}
		
		if (T > 1 && T < 10) {
			num += TensPlace(T) + " ";
				}
		
		
		num += OnesPlace(O);
		

		

		return num;
	}

	//１の位を調べるメソッド
	public static String OnesPlace(int a) {
		String OP = "";

		switch (a) {
		case 0:
			break;
		case 1:
			OP = "one";
			break;
		case 2:
			OP = "two";
			break;
		case 3:
			OP = "three";
			break;
		case 4:
			OP = "four";
			break;
		case 5:
			OP = "five";
			break;
		case 6:
			OP = "six";
			break;
		case 7:
			OP = "seven";
			break;
		case 8:
			OP = "eight";
			break;
		case 9:
			OP = "nine";
			break;
		}

		return OP;
	}

	//十の位を調べるメソッド
	public static String TensPlace(int a) {
		String TP = "";

		switch (a) {
		case 0:
			break;
		case 2:
			TP = "twenty";
			break;
		case 3:
			TP = "thirty";
			break;
		case 4:
			TP = "forty";
			break;
		case 5:
			TP = "fifty";
			break;
		case 6:
			TP = "sixty";
			break;
		case 7:
			TP = "seventy";
			break;
		case 8:
			TP = "eighty";
			break;
		case 9:
			TP = "ninety";
			break;
		}

		return TP;
	}

	//11~19を調べるメソッド
	public static String TeensPlace(int a) {
		String TeP = "";

		switch (a) {
		case 1:
			TeP = "eleven";
			break;
		case 2:
			TeP = "twelve";
			break;
		case 3:
			TeP = "thirteen";
			break;
		case 4:
			TeP = "forteen";
			break;
		case 5:
			TeP = "fifteen";
			break;
		case 6:
			TeP = "sixteen";
			break;
		case 7:
			TeP = "seventeen";
			break;
		case 8:
			TeP = "eighteen";
			break;
		case 9:
			TeP = "nineteen";
			break;
		}

		return TeP;
	}
}
