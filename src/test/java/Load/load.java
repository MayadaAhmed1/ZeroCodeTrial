package Load;


import API.userEndpointTest;
import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.core.runner.parallel.ZeroCodeLoadRunner;
import org.junit.runner.RunWith;

@RunWith(ZeroCodeLoadRunner.class)
@LoadWith("load.properties")
@TestMapping(testClass= userEndpointTest.class,testMethod="user_creation_test")
public class load {


}
