import java.awt.List;
import java.util.ArrayList;

public class LisExes
{
    public static void main(String[] args)
    {
        // type safe array list, stores only string
        ArrayList<String> l = new ArrayList<String>(5);
        l.add("ABD");
        l.add("ABDharani");
        l.add("Kumar");
 
        // Using indexOf() and lastIndexOf()
        System.out.println("ABD Index is" +
                                  l.indexOf("ABD"));
        System.out.println("ABDharani index is:" +
                               l.lastIndexOf("ABDharani"));
        System.out.println("Last Index is : " +
                                l.indexOf("Kumar"));
    }
}
