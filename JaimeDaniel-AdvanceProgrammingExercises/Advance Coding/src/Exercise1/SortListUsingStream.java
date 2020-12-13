package Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListUsingStream {
    public List<String> sortStreamList(List<String> nameList){
        //  Stream -Java 8
        //  ::method reference operator
        //  classname::methodname
        List<String> reversedNameList = nameList.stream().sorted(Comparator.comparing(String::toString).reversed()).collect(Collectors.toList());
        return reversedNameList;
    }

    public static void main(String[] args){
        SortListUsingStream mySortListUsingStream = new SortListUsingStream();
        List<String> sortedList = new ArrayList<>();
        List<String> myList = Arrays.asList("a","b","c");
        sortedList=mySortListUsingStream.sortStreamList(myList);

        System.out.println(sortedList);

    }
}
