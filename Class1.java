import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int a=sc.nextInt();
		
		int b=2;
		int c=a+b;
		System.out.println(c);
		System.out.println("raja");
		Class2.method1();
		Loop.ifelse();

	}

}
class Class2{
	public static void method1() {
		System.out.println("RAJA");
		
		int w =Class3.method2();
		System.out.println(w);
		
		
	}
}
class Class3{
	public static int method2(){
		Scanner aa=new Scanner(System.in);
		System.out.println("enter a");
		int a=aa.nextInt();
		int b=2;
		int c=a+b;
		System.out.println("value"+c);
		return c;
	}
}
class Loop{
	public static void ifelse() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int a= input.nextInt();
		if(a>18) {
			System.out.println("they elligible");
		}
		else{
			System.out.println("not elligile");
			
		}
		
	}
}