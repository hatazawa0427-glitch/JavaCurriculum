package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1
		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		}

		//Q2
		int age = 25;
		if (20 <= age && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}

		//Q3
		int age1 = 18;
		if (age1 >= 20) {
			System.out.println("成人です");
		} else if (13 <= age1 && age1 <= 19) {
			System.out.println("ティーンエイジャーです");
		} else {
			System.out.println("子供です");
		}

		//Q4
		int x = 30;
		int y = 15;
		int z = 50;
		if (x > y && x > z) {
			System.out.println("最大値は" + x);
		} else if (y > x && y > z) {
			System.out.println("最大値は" + y);
		} else {
			System.out.println("最大値は" + z);
		}

		//Q5
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("正の数です");
		} else if (num == 0) {
			System.out.println("0です");
		} else {
			System.out.println("負の数です");
		}

		//Q6
		int value = sc.nextInt();
		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}

		//Q7
		int score2 = sc.nextInt();
		if (score2 >= 90) {
			System.out.println("優");
		} else if (score2 >= 70) {
			System.out.println("良");
		} else if (score2 >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}

		//Q8
		String A = sc.nextLine();
		if (A == "") {
			System.out.println("入力が無効です");
		}

		//Q9
		int day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な入力です");
			break;

		}

		//Q10
		int month = sc.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		default:
			System.out.println("無効な月です");
			break;
		}

	}
}
