package collectionframework;


 
import java.util.ArrayList;
import java.util.Iterator;


class Departmentt{
private int did;
private String dname;
private String dlocation;
public Departmentt(int did, String dname, String dlocation) {
super();
this.did = did;
this.dname = dname;
this.dlocation = dlocation;
}
public Departmentt() {
super();
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Department [did=" + did + ", dname=" + dname + ", dlocation=" + dlocation + "]";
}


}
public class DepartmentCRUD {
public static void main(String[] args) {
ArrayList<Departmentt> alist=new ArrayList<>();
alist.add(new Departmentt(101, "IT","Mumbai") );
alist.add(new Departmentt(102, "sales","Pune") );
alist.add(new Departmentt(103, "Marketing","chennai") );
alist.add(new Departmentt(104, "Development","Banglore") );
System.out.println("My Departments: "+alist);
alist.remove(1);
System.out.println("After remove Departments:");
Iterator<Departmentt> dt=alist.iterator();
while(dt.hasNext()) {
System.out.println(dt.next());
}
Departmentt d=new Departmentt(102,"AI","Hydrabad");
alist.set(1,d);
System.out.println("After update Departments:");
Iterator<Departmentt> dt1=alist.iterator();
while(dt1.hasNext()) {
System.out.println(dt1.next());
}


}


}



