import java.util.ArrayList;
import java.util.List;

public class TaskMain {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList);
        myList.remove(3);
        System.out.println(myList);
    }
}
