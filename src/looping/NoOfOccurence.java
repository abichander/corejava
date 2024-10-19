package looping;

public class NoOfOccurence {
	int countAm(String str) {
        int count=0;
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++) {
            //Systemut.println(i+" : "+arr[i]);
        }
        String str1="Am";
        for(int i=0;i<arr.length;i++){
        if(str1.equalsIgnoreCase(arr[i])){
         count++;
        
         }
    }
        return count;
	}
	public static void main(String[] args) {
	int count=0;
	String str="I AM fine am I FINE AM I GUD";
	NoOfOccurence n=new NoOfOccurence();
	System.out.println(n.countAm(str));

	}

}
