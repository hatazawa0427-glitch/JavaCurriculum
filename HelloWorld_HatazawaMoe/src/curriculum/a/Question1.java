package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q1
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum =0L;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		char charletter = '\u0000';
		String stringletters = "null";
		boolean isBoolean = false;
		
		//Q2
		byteNum = 10;
	    shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		charletter = 'a';
		stringletters = "ハロー";
		isBoolean = true;
		
		System.out.println(byteNum);
		System.out.println(shortNum);
		System.out.println(intNum);
		System.out.println(longNum);
		System.out.println(floatNum);
		System.out.println(doubleNum);
		System.out.println(charletter);
		System.out.println(stringletters);
		System.out.println(isBoolean);
		
	
		//Q3
		System.out.println(byteNum+shortNum+intNum+longNum);
		System.out.println(byteNum*2);
		System.out.println(charletter+stringletters+isBoolean);
		System.out.println(byteNum+shortNum+intNum+longNum+floatNum+doubleNum);
		System.out.println(byteNum*shortNum*intNum*longNum);
		System.out.println(doubleNum/shortNum);
		System.out.println(byteNum-shortNum);
		
		//Q4
		String name = "山田太郎";
		System.out.println("こんにちは、"+name+"さん！");
		
		//Q5
		int age = 25;
		System.out.println("年齢:"+age+"歳");
		
		//Q6
		int num1 = 10;
		int num2 = 5;
		int sum = num1+num2;
		System.out.println(sum);
		
		//Q7
		int score = 80;
		score=score+20;
		System.out.println("最終スコア："+score);
		
		//Q8
		double price=99.99;
		int douPrice=(int)price;
		System.out.println("整数価格："+douPrice);
		
		
		//Q9
		String numStr="123";
		int str =Integer.parseInt(numStr);
		System.out.println("返還後の値："+(str+10));
		
		//Q10
		int num=50;
		String numStr1=String.valueOf(num);
		System.out.println("得点："+numStr1+"点");
		
		//Q11
		int a=10;
		int b=20;
		boolean result=a<b;
		System.out.println(result);
		
		//Q12
		int x=15;
		String X=(x>=10) ? "OK":"NG";
		System.out.println(X);
		
		//Q13
		String text=("私はJavaが好きです。Javaは楽しい！");
		String result2=text.replace("Java","Python");
		System.out.println(result2);
		
		
		
		

	}

}
