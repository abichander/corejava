package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class SuperMarket{
	private String productname;
	private int price;
	private int productid;
	private int quantity;
	SuperMarket(int productid,String productname,int price,int quantity){
		this.productid=productid;
		this.productname=productname;
		this.price=price;
		this.quantity=quantity;
		
	}
	public String getProductName() {
		return productname;
	}
	public int getPrice() {
		return price;
	}
	public int getProductId() {
		return productid;
	}
	public int getQuantity() {
		return quantity;
		
	}
	 public String toString() {
	        return productid + " " + productname + " " + price + " " + quantity ;
	    }
}

public class CRUDoperation {

	public static void main(String[] args) {
		List <SuperMarket> c = new ArrayList <SuperMarket> ();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int ch;
		do {
		System.out.println("1.INSERT");
		System.out.println("2.DISPLAY");
		System.out.println("3.SEARCH");
		System.out.println("4.DELETE");
		System.out.println("5.UPDATE");
		System.out.println("6.Count");

		System.out.println("7.Exit");
		System.out.print("Enter your choice : ");
		ch = s.nextInt();
		switch (ch) {
		//Insert Operation
		case 1:
			System.out.print("Enter ProductId : ");
			int productid = s.nextInt();
		System.out.print("Enter ProductName : ");
			String productname = s1.nextLine();
			
		System.out.print("Enter Price : ");
		int price = s.nextInt();
		
		
		System.out.print("Enter Quantity : ");
		int quantity = s.nextInt();
		SuperMarket e1=new SuperMarket(productid,productname,price,quantity);

		c.add(e1);//Constructor
		System.out.println("---------------------");
		System.out.println("Record Inserted Sucessfully");
		System.out.println("---------------------");
		break;
		//Display Operation
		case 2:
		System.out.println("---------------------");
		Iterator < SuperMarket > i = c.iterator();
		while (i.hasNext()) {
		SuperMarket e = i.next();
		System.out.println(e);//toString method
		}
		System.out.println("---------------------");
		break;
		//Search Opeartion
		case 3:
		boolean found = false;
		System.out.print("Enter ProductId to Search : ");
		int id = s.nextInt();
		System.out.println("---------------------");
		i = c.iterator();
		while (i.hasNext()) {
		SuperMarket e = i.next();
		if (e.getProductId() == id) {
		System.out.println(e);
		found = true;
		}
		}
		if (!found) {
		System.out.println("Record Not Found");
		}
		System.out.println("---------------------");
		break;
		//Delete Operation
		case 4:
		found = false;
		System.out.print("Enter ProductId to Delete : ");
		int prodid = s.nextInt();
		System.out.println("---------------------");
		i = c.iterator();
		while (i.hasNext()) {
		SuperMarket e = i.next();
		if (e.getProductId() == prodid) {
		i.remove();
		found = true;
		}
		}
		if (!found) {
		System.out.println("Record Not Found");
		} else {
		System.out.println("Record is Deleted Sucessfully");
		}
		System.out.println("---------------------");
		break;
		//Update Opeartion
		case 5:
		found = false;
		System.out.print("Enter ProductId to Update : ");
		int id1 = s.nextInt();
		ListIterator < SuperMarket > li = c.listIterator();
		while (li.hasNext()) {
		SuperMarket e = li.next();
		if (e.getProductId() == id1) {
		System.out.print("Enter new Product Name : ");
		String ename = s1.nextLine();
		System.out.print("Enter new Price : ");
		int pr = s.nextInt();
		System.out.print("Enter new Quantity : ");
		int q = s.nextInt();
		li.set(new SuperMarket(id1,ename,pr,q));//update
		found = true;
		}
		}
		System.out.println("---------------------");
		if (!found) {
		System.out.println("Record Not Found");
		} 
		else {
		System.out.println("Record is Updated Sucessfully");
		}
		System.out.println("---------------------");
		break;
		case 6:
			System.out.println("Total no of Product:"+c.size());
			break;
			case 7:
			System.exit(0);
			break;
			}
			}
			while (ch != 0);

	

	}

}
