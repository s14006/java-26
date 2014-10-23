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

public class Ex2 {
	public static void main(String[] args){
		Ex a;{
		a = new Ex2_0();
		a.execute();
		a = new Ex2_1();
		a.execute();
		a = new Ex2_2();
		a.execute();
		a = new Ex2_00();
		a.execute();
		a = new Ex2_3();
		a.execute();
		a = new Ex2_4();
		a.execute();
		a = new Ex2_5();
		a.execute();
		a = new Ex2_6();
		a.execute();
		}
	}
}
