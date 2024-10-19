package array;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charArr1[] = { 'a', 'c', 'e', 'g', 'h' };
        
        char key = 'e';
        
        int foundItemIndex = Arrays.binarySearch(charArr1, key);
        
        System.out.println("The given character is at index: " + foundItemIndex);
	}

}
