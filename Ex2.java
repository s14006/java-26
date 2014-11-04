import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y ) + "です。");
		System.out.println("平均は" + (x + y ) / 2 + "です。");
		System.out.println(" ");
	}
}

class Ex2_1 extends Ex{
	void execute(){
		double x;
		double y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) /2 + "です。");
		System.out.println(" ");
	}
}

class Ex2_2 extends Ex{
	void execute(){
		int x;
		int y;
		int z;

		x = 63;
		y = 18;
		z = 45;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("zの値は" + z + "です。");
		System.out.println("合計は" +(x + y + z) + "です。");
		System.out.println("平均は" +(x + y + z) / 3 + "です。");
		System.out.println("");
	}
}

class Ex2_00 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("xの値");
		int x = stdIn.nextInt();

		System.out.print("yの値");
		int y = stdIn.nextInt();

		System.out.println("x + y " + (x + y));
		System.out.println("x - y " + (x - y));
		System.out.println("x * y " + (x * y));
		System.out.println("x / y " + (x / y));
		System.out.println("x % y " + (x % y));
		System.out.println("");
	}
}

class Ex2_3 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("値を入れてくれ。");
		int x = stdIn.nextInt();

		System.out.println("値は" + x + "です。");
		System.out.println("");
	}
}

class Ex2_4 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("値をおくれ…");
		int x = stdIn.nextInt();

		System.out.println("+10して " + (x + 10));
		System.out.println("-10して " + (x - 10));
		System.out.println("");
	}
}

class Ex2_5 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("ｘの値をください(・・;)");
		double x = stdIn.nextDouble();

		System.out.print("yの値もくれるといいな(*´∀｀)");
		double y = stdIn.nextDouble();

		System.out.println("ふたつの和は" + (x + y) + "だそうで");
		System.out.println("ついでにいうと平均は" + (x + y)/2 + "って言ってました。");
		System.out.println("");
	}
}

class Ex2_6 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);
	 	System.out.print("底辺の値は?"); 
		double width = stdIn.nextDouble();
	 	System.out.print("高さの値は?");
		double height = stdIn.nextDouble();

		System.out.println("あなたが作ろうとしているCFの面積は" + width * height /2 + "ですねｗ");
		System.out.println("");
	}
}

class Ex2_000 extends Ex{
	void execute(){
		Random rand = new Random();
		
		int lucky = rand.nextInt(10);

		System.out.println("今日のラッキーナンバーは" + lucky + "です。");
	}

}

class Ex2_7 extends Ex{
	void execute(){
		Random rand = new Random();

		int num = rand.nextInt(10);
		int numbars = rand.nextInt(90);

		System.out.println("正の整数値は" + num + "です。");
		System.out.println("負の整数値は" + (num - 11) + "です。");
		System.out.println("2桁の整数値は" + (num + 10) + "です。");
	}
}

class Ex2_8 extends Ex{
	void execute(){
		Random rand = new Random();	
		Scanner stdIn = new Scanner(System.in);

		int ran = rand.nextInt(11) - 6;

		System.out.println("テキトーに数字をくださいな");
		int num = stdIn.nextInt();

		System.out.println(num + ran);
	}
}

class Ex2_9 extends Ex{
	void execute(){
		Random rand = new Random();

		int ran = rand.nextInt(10);	
		double num = rand.nextDouble();		

		System.out.println(num);
		System.out.println(num * 10);
		if(ran > 5){
			System.out.println(num);
		}else{
			System.out.println(-num);
		}
	}
}

class Ex2_10 extends Ex{
	void execute(){
		Scanner std = new Scanner(System.in);

		System.out.print("姓:");
		String lastname = std.next();

		System.out.print("名:");
		String firstname = std.next();

		System.out.println("こんにちは" + lastname + firstname + "さん");
	
	}

}


public class Ex2{
	public static void main(String[] args){
		Ex a;{
//		a = new Ex2_0();
//		a.execute();
//		a = new Ex2_1();
//		a.execute();
//		a = new Ex2_2();
//		a.execute();
//		a = new Ex2_00();
//		a.execute();
//		a = new Ex2_3();
//		a.execute();
//		a = new Ex2_4();
//		a.execute();
//		a = new Ex2_5();
//		a.execute();
//		a = new Ex2_6();
//		a.execute();
		a = new Ex2_000();
		a.execute();
		a = new Ex2_7();
		a.execute();
		a = new Ex2_8();
		a.execute();
		a = new Ex2_9();
		a.execute();
		a = new Ex2_10();
		
		a.execute();
		}
	}
}
