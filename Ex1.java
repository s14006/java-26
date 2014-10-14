abstract class Ex {
	abstract void execute();
}

class Ex1_0 extends Ex {
	void execute(){
		System.out.println("Hello World!");
	}
}

class Ex1_2 extends Ex {
	void execute(){
		System.out.println("島\n袋\n清\n乃");
	}
}

class Ex1_1 extends Ex {
	void execute(){
		String[]lastname={"島","袋"};
		String[]firstname={"清","乃"};
		for(int i=0;i<lastname.length;i++)
			System.out.println(lastname[i]);
		System.out.println();
		for(int i=0;i<firstname.length;i++)
			System.out.println(firstname[i]);
	}
}

public class Ex1 {
	public static void main(String[] args){
		Ex a;
		a = new Ex1_0();
  	a.execute();
		a = new Ex1_2();
		a.execute();
		a = new Ex1_1();
		a.execute();
	}
}
