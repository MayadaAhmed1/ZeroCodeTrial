package API;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ZeroCodeUnitRunner.class)
@TargetEnv("api.properties")
public class userEndpointTest {
    @Test
    @Scenario("API/user_creation_test.json")

    public void user_creation_test()throws Exception  {
    }

    @Test
    @Scenario("API/user_retrieve_test.json")
    public void user_retrieve_test()throws Exception  {
    }


}
