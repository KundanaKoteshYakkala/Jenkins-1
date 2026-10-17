interface Add{
	public int add(int a, int b);
}

class App{
	public static void main(String[] args){
		System.out.println("Hello Kotesh.");
		System.out.println("Hello World");
		Add addition = (a, b) -> a+b;

		System.out.println(addition(10, 20));
	}
}
