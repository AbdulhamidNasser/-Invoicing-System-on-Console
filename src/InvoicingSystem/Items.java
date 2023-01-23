package InvoicingSystem;

public class Items {
	
	String itemName;
	int itemID;
	int quantity;
	double unitPrice;
	double qtyAmountPrice;
	
	
	public String getItemName() {
	    return itemName;
	  }
	  public void setItemName(String newItemName) {
	    this.itemName = newItemName;
	  }
	  
	  
	  public int getItemID() {
		    return itemID;
		  }
		  public void setItemID(int newItemID) {
		    this.itemID = newItemID;
		  }
		  
		  
		  public int getQuantity() {
			    return quantity;
			  }
			  public void setQuantity(int newQuantity) {
			    this.quantity = newQuantity;
			  }
			  
			  
			  public double getUnitPrice() {
				    return unitPrice;
				  }
				  public void setUnitPrice(double newUnitPrice) {
				    this.unitPrice = newUnitPrice;
				  }
				  
				  
				  public double getQtyAmountPrice() {
					    return qtyAmountPrice;
					  }
					  public void setQtyAmountPrice(double newQtyAmountPrice) {
					    this.qtyAmountPrice = newQtyAmountPrice;
					  }

}
