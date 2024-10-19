package collectionframework;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(23);
        hs.add(30);
        hs.add(null);
        hs.add(23);
        hs.add(5);
        hs.add(12);
        hs.add(67);
        hs.add(23);
        hs.add(null);
        //Hashset follow random order-no duplication-only single null value allowed
        System.out.println("Hashset: "+hs);
        hs.remove(23);
        System.out.println("Hashset: "+hs);
        System.out.println(hs.isEmpty());

	}

}
