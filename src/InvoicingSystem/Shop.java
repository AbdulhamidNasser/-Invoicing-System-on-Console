package InvoicingSystem;

import java.util.ArrayList;



public class Shop {
	
	String shopName;
	
	public String getShopName() {
	    return shopName;
	  }
	  public void setShopName(String newShopName) {
	    this.shopName = newShopName;
	  }
	  
	  ArrayList<Items> itemList = new ArrayList<Items>();

}
