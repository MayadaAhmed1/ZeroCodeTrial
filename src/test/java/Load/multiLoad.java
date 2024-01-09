package Load;


import API.userEndpointTest;
import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.core.domain.TestMappings;
import org.jsmart.zerocode.core.runner.parallel.ZeroCodeLoadRunner;
import org.jsmart.zerocode.core.runner.parallel.ZeroCodeMultiLoadRunner;
import org.junit.runner.RunWith;

@RunWith(ZeroCodeMultiLoadRunner.class)
@LoadWith("load.properties")
@TestMappings ({
        @TestMapping(testClass= userEndpointTest.class,testMethod="user_creation_test")  ,
        @TestMapping(testClass= userEndpointTest.class,testMethod="user_retrieve_test")
} )

public class multiLoad {
}
