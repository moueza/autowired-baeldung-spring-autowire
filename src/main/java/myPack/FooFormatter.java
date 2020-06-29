package myPack;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/** 3.1 properties */
//@Service
@Component("fooFormatter")
public class FooFormatter {

	public String format() {
		return "foo";
	}
}