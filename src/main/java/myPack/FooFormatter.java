package myPack;

import org.springframework.stereotype.Component;

/** 3.1 properties */
@Component("fooFormatter")
public class FooFormatter {

	public String format() {
		return "foo";
	}
}