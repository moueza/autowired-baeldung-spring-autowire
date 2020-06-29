package myPack;

import org.springframework.beans.factory.annotation.Autowired;

public class FooService2 {

	private FooFormatter fooFormatter;

	/** 3.2 on setters */
	@Autowired
	public void setFooFormatter(FooFormatter fooFormatter) {
		this.fooFormatter = fooFormatter;
	}
}
