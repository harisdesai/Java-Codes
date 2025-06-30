/*Q2. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/



package com.assignment2;

import java.util.Scanner;

public class Invoice {
	
	private String partnumber;
	private String partdesc;
	private int quantity;
	private double price;
	
	//constructor
	public Invoice() {
		this("123ABC","motor",3,6400);
	}
	
	//parameterized constructor
	public Invoice(String partnumber, String partdesc, int quantity, double price) {
		this.partnumber = partnumber;
		this.partdesc = partdesc;
		this.quantity = quantity;
		this.price = price;
	}

	
	public String getPartnumber() {
		return partnumber;
	}


	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}

	public String getPartdesc() {
		return partdesc;
	}

	public void setPartdesc(String partdesc) {
		this.partdesc = partdesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		if(this.quantity<0) {
			this.quantity=0;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		if(this.price<0) {
			this.price=0;
		}
	}
	
	public double invoiceAmount() {
		return quantity*price;
	}
	
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Part Number: ");
		this.partnumber=sc.nextLine();
		System.out.print("Enter Part Description: ");
		this.partdesc=sc.nextLine();
		System.out.print("Enter Quantity: ");
		this.quantity=sc.nextInt();
		System.out.print("Enter Price: ");
		this.price=sc.nextDouble();
		sc.close();
	}
	
	public void getData() {
		System.out.printf("\nPart Number: %s\nPart Description: %s\nQuantity: %d\nPrice: %.2f\nInvoice Amount: %.2f\n",this.getPartnumber(),this.getPartdesc(),this.getQuantity(),this.getPrice(),this.invoiceAmount());
	}
}
