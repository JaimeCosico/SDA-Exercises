package Exercise21;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConeTest {
    @Test
    void calculateVolume(){
        Cone myCone = new Cone(10,10);
        double myConeVolume= myCone.calculateVolume();
        double myConeExpectedVolume=1047.1975511965977;
        Assertions.assertEquals(myConeExpectedVolume,myConeVolume);

    }

}