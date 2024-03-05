import java.util.ArrayList;
import java.util.List;

public class Array_List
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

//        list.add("Hello");
        list.add("This");
        list.add("is");
        list.add("Vishwajeet");
        list.add("Singh");

        if (list.contains("Hello"))
            System.out.println("exists in the Array_List");

        else
            System.out.println("does not exist in the Array_List");

    }
}
