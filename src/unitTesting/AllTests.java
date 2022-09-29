package unitTesting;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ addition.class, subtraction.class, divide.class, Multiply.class })
public class AllTests {

}
