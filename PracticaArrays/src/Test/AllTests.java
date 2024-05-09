package Test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ test2.class, test3.class, test4.class, test5.class })
public class AllTests {

}
