import java.util.*;

public class Duplicates_In_Array {

    public static void main(String args[])
    {
        List<Integer> elements=new ArrayList<>();
            elements.add(1);
            elements.add(2);
            elements.add(1);
            elements.add(5);
            elements.add(7);
            elements.add(3);
            elements.add(15);

//            System.out.println("Element:"+elements);

            Set<String> Duplicates = new HashSet<>();

            Collections.sort(elements);
            for (int i=1;i<elements.size();i++)
            {
                if(elements.get(i-1).equals(elements.get(i)))
                {
                    Duplicates.add(String.valueOf(elements.get(i)));
                }
            }
            System.out.println("Duplicate Elements:"+Duplicates);
    }
}
