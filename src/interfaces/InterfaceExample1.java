package interfaces;
/*
 *  Simple implementation of interface with default method and executing that method
 */
public class InterfaceExample1 implements A {

	@Override
	public void sayHi() {
		System.out.println("Implemented method from Interface A");
	}


	public static void main(String[] args) {
		InterfaceExample1 example1 = new InterfaceExample1();
		example1.sayHi();
		example1.sayHello();
		
	}
}

interface A {
	default void sayHello() {
		System.out.println("Say Hello From Interface A");
	}
	void sayHi();
}

