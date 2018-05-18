package kadai5;

import java.util.ArrayList;
import java.util.Scanner;

public class IntToEng {

	static ArrayList<Integer> numbers = new ArrayList<Integer>(); //数字を一の位から順に入れるリスト

	// メインメソッド
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(translateEng(input));
	}

	// 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		separateNumbers(n);
		return "";
	}

	//数値を各桁にわける
	public static void separateNumbers(int n) {
		int x = 0;
		while (n > 0) {
			x = n % 10;
			n = n / 10;
			numbers.add(x);
		}
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
}
