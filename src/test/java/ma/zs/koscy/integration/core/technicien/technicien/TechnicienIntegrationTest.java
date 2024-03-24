package ma.zs.koscy.integration.core.technicien.technicien;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class TechnicienIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("TechnicienHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
