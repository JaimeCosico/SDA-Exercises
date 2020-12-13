package Exercise4;

public class TestStorage {

    public static void main(String[] args){
        Storage myStorage = Storage.getInstance();

        myStorage.addToStorage("1","Wizard");
        myStorage.addToStorage("2","Bulls");
        myStorage.addToStorage("2","Jazz");
        myStorage.addToStorage("3","Wizard");
        myStorage.addToStorage("4","Wizard");

        myStorage.printValues("2");
        myStorage.findValues("Jazz");

    }
}
