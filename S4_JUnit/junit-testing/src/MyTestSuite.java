import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Demo1.class,Demo2.class,Employee.class})
public class MyTestSuite {
    public static void main(String[] args) {
        Result res = JUnitCore.runClasses(MyTestSuite.class);

        System.out.println(res.getRunCount());
    }
}
