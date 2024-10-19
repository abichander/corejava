package collectionframework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
            // Create a Vector 
        Vector<String> vector = new Vector<String>();
     
        // Add elements into Vector
        vector.add("Pooja");
        vector.add("Jiya");
        vector.add("Arpita");
        vector.add("Jilin");
        vector.add("Jack");
        System.out.println("List of elements in vector: "+vector);
     
        // Get Enumeration of Vector elements 
        Enumeration<String> en = vector.elements();
     
        /* Display Vector elements using hashMoreElements()
         * and nextElement() methods. 
         */
        System.out.println("Vector elements are: ");
        while(en.hasMoreElements())
           System.out.println(en.nextElement());
      }
    }
