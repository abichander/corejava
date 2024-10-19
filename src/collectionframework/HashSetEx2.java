package collectionframework;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
        hs.add("Shakshi");
        hs.add("Harini");
        hs.add("Kalai");
        hs.add(null);
        hs.add("Abi");
        hs.add("Sandy");
        hs.add("Rahul");
        hs.add("Kaviya");
        hs.add("abi");
        hs.add(null);
        //Hashset follow random order-no duplication-only single null value allowed
        System.out.println("Hashset: "+hs);
        hs.remove("Harini");
        System.out.println("Hashset: "+hs);
        System.out.println(hs.isEmpty());

	}

}
