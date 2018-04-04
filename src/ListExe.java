import java.awt.List;
import java.util.ArrayList;

class ListExe
{
    public static void main (String[] args)
    {
        
    	java.util.List<String> l = new ArrayList<String>(5);
 
        l.add("Teja");
        l.add("ABD");
        l.add("SAI");
        l.add("PRAVEEN");
        l.add("SIDHU");
 
        java.util.List<String> range = new ArrayList<String>();
 
        // return List between 2nd(including)
        // and 4th element(excluding)
        range = (ArrayList<String>) l.subList(2, 4);
 
        System.out.println(range);  // [GeeksQuiz, IDE]
    }
}
