package Exercise22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConeTest {
    @Test
    void calculateVolume(){
        Cone myCone = new Cone(10,10);
        double myConeVolume= myCone.calculateVolume();
        double myConeExpectedVolume=1047.1975511965977;
        Assertions.assertEquals(myConeExpectedVolume,myConeVolume);

    }

    @Test
    void fillExact(){
        Cone myCone = new Cone(10,10);
        myCone.fill(100);
        String fillStatus = myCone.fill(1047.1975511965977);
        String fillStatusExpected="Exact";
        Assertions.assertEquals(fillStatusExpected,fillStatus);
    }

    @Test
    void fillInsufficient(){
        Cone myCone = new Cone(10,10);
        myCone.fill(100);
        String fillStatus = myCone.fill(100);
        String fillStatusExpected="Insufficient";
        Assertions.assertEquals(fillStatusExpected,fillStatus);
    }
    @Test
    void fillOverflow(){
        Cone myCone = new Cone(10,10);
        myCone.fill(100);
        String fillStatus = myCone.fill(10000);
        String fillStatusExpected="Overflow";
        Assertions.assertEquals(fillStatusExpected,fillStatus);
    }
}