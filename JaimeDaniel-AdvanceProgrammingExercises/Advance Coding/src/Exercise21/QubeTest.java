package Exercise21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QubeTest {
    @Test
    public void calculateVolume(){
        Qube myQube = new Qube(10);
        double myQubeVolume =myQube.calculateVolume();
        double myQubeVolumeExpected = 1000;
        Assertions.assertEquals(myQubeVolumeExpected,myQubeVolume);
    }
}