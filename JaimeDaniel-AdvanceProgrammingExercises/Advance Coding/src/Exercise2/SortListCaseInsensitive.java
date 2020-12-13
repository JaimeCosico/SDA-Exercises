package Exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListCaseInsensitive {

    public static List<String> sortListCaseInsensitive(List<String> toSortList){
        Collections.sort(toSortList,Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        return toSortList;
    }

    public static List<String> sortListCaseInsensitiveNewComparator(List<String> toSortList){
        Collections.sort(toSortList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        }.reversed());
        return toSortList;
    }

    public static void main(String[] args){
        SortListCaseInsensitive mySorter = new SortListCaseInsensitive();
        List<String> myList = Arrays.asList("Abra","Ka","dabra");

        List<String> mySortedListCaseInsensitive= sortListCaseInsensitive(myList);
        List<String> mySortedListCaseInsensitiveNewComparator= sortListCaseInsensitiveNewComparator(myList);

        System.out.println(mySortedListCaseInsensitive);
        System.out.println(mySortedListCaseInsensitiveNewComparator);
    }

}



