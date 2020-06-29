package myPack;

import org.springframework.beans.factory.annotation.Autowired;

/** 3.3 constructor */
public class FooService3 {

	private FooFormatter fooFormatter;

	@Autowired
	public FooService3(FooFormatter fooFormatter) {
		this.fooFormatter = fooFormatter;
	}
}
