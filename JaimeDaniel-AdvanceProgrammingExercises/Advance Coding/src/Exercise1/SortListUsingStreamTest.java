package Exercise1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SortListUsingStreamTest {
   @Test
   public void testStreamReverseOrder(){
        SortListUsingStream mySortListUsingStream = new SortListUsingStream();
        List<String> myList = Arrays.asList("a","b","c");;
        List<String> myExpectedList = Arrays.asList("c","b","a");;
        List<String> mySortedList=mySortListUsingStream.sortStreamList(myList);
        Assert.assertEquals(myExpectedList, mySortedList);
   }
    @Test
    public void testStreamNaturalOrder(){
        SortListUsingStream mySortListUsingStream = new SortListUsingStream();
        List<String> myList = Arrays.asList("a","b","c");;
        List<String> myExpectedList = Arrays.asList("a","b","c");;
        List <String> mySortedList=mySortListUsingStream.sortStreamList(myList);
        Assert.assertNotEquals(myExpectedList, mySortedList);
    }
}