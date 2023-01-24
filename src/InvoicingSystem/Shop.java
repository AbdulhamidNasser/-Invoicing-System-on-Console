package InvoicingSystem;

import java.util.ArrayList;



public class Shop {
	
	 String shopName;
	 int tel;
	 int fax;
	 String email;
	 String website;
	
	public String getShopName() {
	    return shopName;
	  }
	  public void setShopName(String newShopName) {
	    this.shopName = newShopName;
	  }
	  
	  public int getTel() {
		    return tel;
		  }
		  public void setShopName(int newTel) {
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

}
