package Exercise1;

import java.util.Collections;
import java.util.List;

public class SortList {
    //1. create a method
    //2. accepts a string list parameter
    //3. return a string list sorted from z-a

    // access modifier returnType method name(parameter)

    //arraylist vs arrays
        public List<String> sortNameList(List<String> nameList){
            //natural order a-z;z-a;
            Collections.sort(nameList); // sorts in a natural order a-z
            Collections.sort(nameList,Collections.reverseOrder());// sorts in reverse order z-a
            return nameList;
        }
}
