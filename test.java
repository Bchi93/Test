public class HelloWorld {
	
    public static void main(String[] args) {
		
		Test test = new Test();
		
		test.test("Hello World");
    }
	
	public void test(String msg){
		System.out.println(msg);
	}
}