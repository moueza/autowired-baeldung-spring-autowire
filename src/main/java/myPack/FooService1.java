package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/** 3.1 properties */
@Component
@Scope(value = "singleton")/**https://stackoverflow.com/questions/5010219/singleton-and-autowired-returning-null*/
public class FooService1 {
	/**
	 * In the above example, Spring looks for and injects fooFormatter when
	 * FooService1 is created.
	 * 
	 */
	@Autowired
	private FooFormatter fooFormatter;

	public static void main(String[] args) {
		FooService1 fooService1 = new FooService1();
		/** Autowired singleton */
		System.out.println(fooService1.fooFormatter.format());

	}
}
