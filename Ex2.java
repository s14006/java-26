import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
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
		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 2 + "です。");
	}
}

public class Ex2 {
	public static void main(String[] args){
		Ex a;
		a = new Ex2_0();
		a.execute();
	}
}
