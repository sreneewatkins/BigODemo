import java.util.Collection;

import com.tts.FileNameConstants;
import com.tts.QuadraticTimeAlgorithm;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class QuadraticTimeAlgorithmTest extends TestBase {

    @Parameterized.Parameters
    public static Collection input() {
        return TEST_SIZE_PARAMETER;
    }

    private int[] integerArray;

    private QuadraticTimeAlgorithm testClass;

    public QuadraticTimeAlgorithmTest(int nSize) {
        super();
        this.nSize = nSize;
    }

    @Test
    public void insertion_sort() {
        testClass.insertion_sort(integerArray);
    }

    @Before
    public void setup() {
        testClass = new QuadraticTimeAlgorithm();
        integerArray = setArray(this.nSize);
        this.filename = FileNameConstants.QUADRATIC_TIME;
        super.setup();
    }

}//end QuadraticTimeAlgorithmTest
