package collectionframework;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> hs=new TreeSet<>();
        hs.add(10);
        hs.add(23);
        hs.add(30);
        //hs.add(null);
        hs.add(23);
        hs.add(5);
        hs.add(12);
        hs.add(67);
        hs.add(23);
       //TreeSet cannot allow null value but even we can pass string values
        System.out.println("Hashset: "+hs);
        hs.remove(23);
        System.out.println("Hashset: "+hs);
        System.out.println(hs.isEmpty());
        
	}

}
