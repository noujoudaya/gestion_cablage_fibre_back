package ma.zs.koscy.integration.core.commun.reason-ko;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class ReasonKoIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("ReasonKoHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
