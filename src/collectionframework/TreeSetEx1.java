package collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {

	

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<>();

		TreeSet<String> str1des = (TreeSet<String>) ts.descendingSet();
		
        System.out.println("Descending Order : "+str1des); 
        str1des.add("Sam");
        str1des.add("Zoya");
        str1des.add("Queeny");
        str1des.add("Malini");
        str1des.add("Franklin");
        
        
        System.out.println("Descending Order using Iterator :");
        Iterator<String> i1 = ts.descendingIterator();
        while(i1.hasNext()) 
            System.out.println(i1.next());
	}

}
