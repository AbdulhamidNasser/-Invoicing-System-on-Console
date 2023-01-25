package InvoicingSystem;

import java.util.ArrayList;
import java.util.Scanner;



public class Shop {
	
	 String shopName;
	 int tel;
	 int fax;
	 String email;
	 String website;
	 
	 Scanner sc = new Scanner(System.in);
	
	public String getShopName() {
	    return shopName;
	  }
	  public void setShopName(String newShopName) {
	    this.shopName = newShopName;
	  }
	  
	  public int getTel() {
		    return tel;
		  }
		  public void setTel(int newTel) {
		    this.tel = newTel;
		  }
		  
		  public int getFax() {
			    return fax;
			  }
			  public void setFax(int newFax) {
			    this.fax = newFax;
			  }
			  
			  public String getEmail() {
				    return email;
				  }
				  public void setEmail(String newEmail) {
				    this.email = newEmail;
				  }
				  
				  public String getWebsite() {
					    return website;
					  }
					  public void setWebsite(String newWebsite) {
					    this.website = newWebsite;
					  }

	  
	  ArrayList<Items> itemList = new ArrayList<Items>();
	  
	  public void remove(String itemNameRemove) {
		  System.out.println("Enter the ID of Item Need Delete");
		  if (itemList.size() > 0)
		  {
			  for (Items i : itemList)
			  {
				  if(itemNameRemove.equalsIgnoreCase(i.itemName))
				  {
					  itemList.remove(i);
				  }
				  
			  }
		  }
		 // int idItemRemove = sc.nextInt();
		  
		//itemList.remove(idItemRemove);
		  
	  }
	  
	  public void changeItemPrice(String iName, double newUnitPrice) {
		 // System.out.println("Enter the Item Price");
		  for(Items i : itemList)
		  {
			  if(iName.equalsIgnoreCase(i.itemName))
			  {
				  i.unitPrice = newUnitPrice;
			  }
		  }
		  //double newUnitPrice = sc.nextInt();
		  //Items.set(unitPrice, newPrice);
	  }

}
