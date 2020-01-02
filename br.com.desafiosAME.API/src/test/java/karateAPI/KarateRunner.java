package karateAPI;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@KarateOptions(features = "src/test/java/karateAPI/features", tags = "@ready")
public class KarateRunner {

}
