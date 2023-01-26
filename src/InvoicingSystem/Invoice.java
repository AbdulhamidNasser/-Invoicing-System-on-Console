package InvoicingSystem;



public class Invoice {
	
	 String invoiceDate;
	 int invoiceNo;
	 int numberOfItems;
	 double totalAmount;
	 double paidAmount;
	 double balance;
	 
	 public String getInvoiceDate() {
		    return invoiceDate;
		  }
		  public void setInvoiceDate(String newInvoiceDate) {
		    this.invoiceDate = newInvoiceDate;
		  }
		  
		  public int getinvoiceNo() {
			    return invoiceNo;
			  }
			  public void setInvoiceNo(int newInvoiceNo) {
			    this.invoiceNo = newInvoiceNo;
			  }
			  
		  
		  public int getNumberOfItems() {
			    return numberOfItems;
			  }
			  public void setNumberOfItems(int newNumberOfItems) {
			    this.numberOfItems = newNumberOfItems;
			  }
			  
			  
			  public double getTotalAmount() {
				    return totalAmount;
				  }
				  public void setTotalAmount(double newTotalAmount) {
				    this.totalAmount = newTotalAmount;
				  }
				  
				  
				  public double getPaidAmount() {
					    return paidAmount;
					  }
					  public void setPaidAmount(double newPaidAmount) {
					    this.paidAmount = newPaidAmount;
					  }

					  
					  
					  public double getBalance() {
						    return balance;
						  }
						  public void setBalance(double newBalance) {
						    this.balance = newBalance;
						  }
						  
						  Shop shopObj = new Shop();

		  
		  
}
