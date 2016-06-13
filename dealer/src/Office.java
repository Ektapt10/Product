package dealer;

import java.util.Scanner;

import amazon.Modifiedproduct;

public class Office {
	 public static void main(String[]args){
         
         Product headphones= new Product();
         
         headphones.setName("beats");
	   
	     headphones.setPrice(300);
	 
	     headphones.setProp("voice control");
	     headphones.printNameprice();
	     
	     Product mouse = new Product("logitech",150,"inout Device");
	     mouse.printNameprice();
	     
	     
	     Product pendrive = new Product("scandisk",100,"usb");
	     pendrive.printNameprice();
	     
	     Product laptop =new Product("Apple",1000,"Computer");
	     laptop.printNameprice();
	     laptop.printNameprice("silly");
	    
//	     System.out.println("Enter new Product name:");
//	     Scanner scan = new Scanner(System.in);
//	     String s = scan.next();
//	     System.out.println("Enter the Price:");
//	     int price= scan.nextInt();
//	     System.out.println("Enter the prop:");
//	     String prop =scan.next();
//	     Product scannedProduct = new Product(s,price,prop);
//	     scannedProduct.printNameprice();
	     
	     Modifiedproduct monster = new Modifiedproduct();
	     monster.setName("Indeed");
	     monster.setPrice(1500);
	     monster.setProp("jobrecruiter");
	     monster.setVariety("variety");
	     monster.printNameprice();
	     
	     monster.setPrice(50);
	     
	     Count number = new Count();
	     number.count(80);

}
}