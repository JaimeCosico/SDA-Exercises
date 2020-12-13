package Exercise1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SortListTest {
    @Test


    public void testSortNameListReversed(){
        SortList testSortList = new SortList();
        List<String> myList =new ArrayList<>();
        List<String> expectedMyList =new ArrayList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        expectedMyList.add("c");
        expectedMyList.add("b");
        expectedMyList.add("a");

       testSortList.sortNameList(myList);

        Assert.assertEquals(expectedMyList,myList);
    }
    @Test
    public void testSortNameListNatural(){
        SortList testSortList = new SortList();
        List<String> myList =new ArrayList<>();
        List<String> expectedMyList =new ArrayList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        expectedMyList.add("a");
        expectedMyList.add("b");
        expectedMyList.add("c");

        testSortList.sortNameList(myList);

        Assert.assertNotEquals(expectedMyList,myList);
    }
}