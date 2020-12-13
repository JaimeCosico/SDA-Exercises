package Exercise22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QubeTest {
    @Test
    public void calculateVolume(){
        Qube myQube = new Qube(10);
        double myQubeVolume =myQube.calculateVolume();
        double myQubeVolumeExpected = 1000;
        Assertions.assertEquals(myQubeVolumeExpected,myQubeVolume);
    }

    @Test
    void fillExact(){
        Qube myQube = new Qube(10);
        myQube.fill(100);
        String fillStatus = myQube.fill(1000);
        String fillStatusExpected="Exact";
        Assertions.assertEquals(fillStatusExpected,fillStatus);
    }

    @Test
    void fillInsufficient(){
        Qube myQube = new Qube(10);
        myQube.fill(100);
        String fillStatus = myQube.fill(100);
        String fillStatusExpected="Insufficient";
        Assertions.assertEquals(fillStatusExpected,fillStatus);
    }
    @Test
    void fillOverflow(){
        Qube myQube = new Qube(10);
        myQube.fill(100);
        String fillStatus = myQube.fill(10000);
        String fillStatusExpected="Overflow";
        Assertions.assertEquals(fillStatusExpected,fillStatus);
    }
}