package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(10);
		alist.add(1);
		alist.add(20);
		alist.add(13);
		alist.add(null);
		alist.add(9);
		alist.add(null);
		System.out.println("My arrayList:"+alist);
		System.out.println("My arraylist Size :"+alist.size());
		System.out.println("My arraylist get:"+alist.get(3));
		alist.add(5,22);
		System.out.println("My arraylist:"+alist);
		alist.remove(4);
		System.out.println("My arraylist:"+alist);
		alist.set(4, 100);
		System.out.println("My updated ArrayList is :"+alist);
		ArrayList<Integer> alist1=new ArrayList<Integer>();
		alist1.add(90);
		System.out.println("My arrayList :"+alist1);
		alist1.addAll(alist);
		System.out.println("MY updated arrayList:"+alist1);
		ArrayList al=new ArrayList();
	    al.add(10);
	    al.add(9.0);
	    al.add('a');
	    al.add("fmkrkrl");
	    System.out.println("My Generic arraylist:"+al);
	    System.out.println("contains:"+al.contains(101));
	    System.out.println("Enhanced for loop");
	    for(Integer all:alist ) {
	        System.out.print(all+"--->");
	        
	        
	        
	        System.out.println("Using List Iterator");
	        ListIterator<Integer> lt= alist.listIterator();
	        while (lt.hasNext()) {
	            System.out.print(lt.next()+" ");
	        }
	        System.out.println("Using Iterator");
	        Iterator<Integer> lt1= alist.iterator();
	        while (lt1.hasNext()) {
	            System.out.print(lt1.next()+" ");
	        }
	        ListIterator<Integer> li=alist.listIterator();
	        while(li.hasNext()) {
	        	System.out.println(li.next()+"----");
	        }
	    }
		
		

	}

}
