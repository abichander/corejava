package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueEx {

	public static void main(String[] args) {

		Deque<String> dq = new ArrayDeque<String>();
        //Deque<String> dq = (Deque<String>) new ArrayList<String>();
            dq.add("zsa");
           dq.offer("ABC");
           dq.offer("PQR");
           dq.offer("MNO");
           dq.offer("IJK");
           dq.offer("GHI");
           System.out.println(dq);
            
           System.out.println("dq.getFirst(): " +dq.getFirst()); 
           System.out.println(dq);
           System.out.println("dq.removeFirst(): " +dq.removeFirst());
           System.out.println(dq);
        
           dq.addFirst("ZBC");
           System.out.println(dq);
           
           System.out.println("dq.getLast(): " +dq.getLast());
           System.out.println(dq);
           System.out.println("dq.removeLast(): " +dq.removeLast());
           System.out.println(dq);
           dq.addLast("JHI");
           System.out.println(dq);

	}

}
