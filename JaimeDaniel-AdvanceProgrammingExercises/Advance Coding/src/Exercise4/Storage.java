package Exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    //singleton pattern -lazy
    //1. condition to create  an instance

    //?get instance()

    // ACCESS Modifiers
    //private within the class
    //public within the project
    //protected within the class and subclasses
    //default within the package

    private static Storage instance;

    public static Storage getInstance(){
        if(instance==null){
            instance= new Storage();
        }
        return instance;
    }

    //map should be able to handle multiple values
    private final Map<String, List<String>> storageMap;

    private Storage(){
        storageMap=new HashMap<>();
    }
    //addToStorage (String key, String value)
    public void addToStorage(String key, String value){
        //key is not yet present inside map
        if(!storageMap.containsKey(key)){
            List<String> valueList = new ArrayList<>();
            valueList.add(value);
            storageMap.put(key,valueList);
        }else{//key is present in the map
            List<String> valueList=storageMap.get(key);
            valueList.add(value);
        }
    }

    public void printValues(String key){
        List<String > valueList =storageMap.get(key);
        for(String value: valueList){
            System.out.println(value);
        }
        //other Syntax for Each
        //valueList.forEach(System.out::println);
    }

    public void findValues(String value){
        List<String> keys =new ArrayList<>(); //placeholder for keys

        //go through each entry inside the map to look for the value
        for(Map.Entry<String,List<String>> entry:storageMap.entrySet()){
            String key =entry.getKey();

            List<String> valueList=storageMap.get(key);

            if(valueList.contains(value)){
                keys.add(key);
            }
        }
        System.out.println(keys);
    }
}
