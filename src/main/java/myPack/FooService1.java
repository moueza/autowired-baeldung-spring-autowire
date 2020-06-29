package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/** 3.1 properties 
 * https://stackoverflow.com/questions/5010219/singleton-and-autowired-returning-null
 */
//@Scope(value = "singleton") 
@Component
public class FooService1 {
	/**
	 * In the above example, Spring looks for and injects fooFormatter when
	 * FooService1 is created.
	 * 
	 */
	@Autowired
	private static FooFormatter fooFormatter;

	public static void main(String[] args) {
		/** See Autowired nullPointerException #10 */
		//FooService1 fooService1 = new FooService1();
		/** Autowired singleton */
		//System.out.println(fooService1.fooFormatter.format());
		System.out.println(FooService1.fooFormatter.format());

	}
}
