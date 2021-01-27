import com.tts.LineGraphChart;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConstantTimeAlgorithmTest.class, LinearTimeAlgorithmTest.class,
                LogarithmicTimeAlgorithmTest.class, QuadraticTimeAlgorithmTest.class})
public class BigOTestSuite {

    @AfterClass
    public static void tearDown() {
        LineGraphChart xyChart = new LineGraphChart("Big O Notations");
        xyChart.setVisible(true);
        xyChart.pack();
        System.out.println("DONE");
    }

}//end BigOTestSuite class
