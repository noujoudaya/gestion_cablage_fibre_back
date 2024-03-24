package ma.zs.koscy.integration.core.order.order-kosc;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class OrderKoscIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("OrderKoscHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
