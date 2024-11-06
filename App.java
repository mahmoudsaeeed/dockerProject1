import java.util.ArrayList;

public class App {

    static int getSizeOfArray(ArrayList<Integer> list){
        
        return list.size();
    }
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(5);
        myArray.add(6);

        int arraySize = getSizeOfArray(myArray);
        System.out.println("size = " + arraySize);
    }
}
