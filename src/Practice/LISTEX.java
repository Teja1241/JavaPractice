
import java.util.ArrayList;

class LISTEX
{
    public static void main (String[] args)
    {
        
        ArrayList<String> l = new ArrayList<String>(5);
 
        l.add("Teja");
        l.add("ABD");
        l.add("SAI");
        l.add("PRAVEEN");
        l.add("SIDHU");
 
        ArrayList<String> range = new ArrayList<String>();
 
        // return List between 2nd(including)
        // and 4th element(excluding)
        range = (ArrayList<String>) l.subList(2, 4);
 
        System.out.println(range);  // [GeeksQuiz, IDE]
    }
}
