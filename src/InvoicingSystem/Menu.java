package InvoicingSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	Invoice invoiceobj = new Invoice();
	Items itemN = new Items();
	//System.out.println("Please Enter Your Shop Name : ");
	//invoiceobj.shopObj.setShopName(sc.nextLine());
	Boolean as = true;
	while(as)
	{
	System.out.println("Application Main Menu : ");
	System.out.println("1-Shop Settings");
	System.out.println("2- Manage Shop Items");
	System.out.println("3- Create New Invoice");
	System.out.println("4- Report: Statistics");
	System.out.println("5- Report: All Invoices");
	System.out.println("6- Search (1) Invoice");
	System.out.println("7- Program Statistics");
	System.out.println("8- Exit");
	
	int menuCase = sc.nextInt();
	
	switch (menuCase) {
	  case 1:
		 
	    System.out.println("1. Load Data");
	    System.out.println("2. Set Shop Name");
	    System.out.println("3. Set Invoice Header ");
	    System.out.println("4. Go Back");
	    
	    Boolean dd = true;
		while(dd) {
	    switch (sc.nextInt()) {
	    case 1:
	    	System.out.println("1. Load Data");
	    	System.out.println("Your Shop Name : "+invoiceobj.shopObj.getShopName());
	    	System.out.println("Your Shop Phone Number : "+invoiceobj.shopObj.getTel());
	    	System.out.println("Your Shop Fax Number : "+invoiceobj.shopObj.getFax());
	    	System.out.println("Your Shop Email : "+invoiceobj.shopObj.getEmail());
	    	System.out.println("Your Shop Website : "+invoiceobj.shopObj.getWebsite());
	    	System.out.println("Your Item Name : "+itemN.getItemName());
	    	System.out.println("Your Item ID : "+itemN.getItemID());
	    	System.out.println("Your Item Quantity : "+itemN.getQuantity());
	    	System.out.println("Your Item Unit Price : "+itemN.getUnitPrice());
	    	System.out.println("Your Item Quantity Amount/Price : "+itemN.getQtyAmountPrice());
	    	System.out.println("Your Invoice Date : "+invoiceobj.getInvoiceDate());
	    	System.out.println("Number Of Items : "+invoiceobj.getNumberOfItems());
	    	System.out.println("Total Amount : "+invoiceobj.getTotalAmount());
	    	System.out.println("Paid Amount : "+invoiceobj.getPaidAmount());
	    	System.out.println("Balance : "+invoiceobj.getBalance());
	    	
	    	
	    	
	    	
	    	break;
	    case 2:
	    	System.out.println("Please Enter Your Shop Name : ");
	    	invoiceobj.shopObj.setShopName(sc.next());
	    	
	    	break;
	    	
	    case 3:
	    	try{    
		         
		    	
	    	System.out.println(" Set Invoice Header ");
	    	System.out.println("Enter Shop Phone Number");
	    	invoiceobj.shopObj.setTel(sc.nextInt());
	    	System.out.println("Enter Shop Fax Number");
	    	invoiceobj.shopObj.setFax(sc.nextInt());
	    	System.out.println("Enter Shop Email ");
	    	invoiceobj.shopObj.setEmail(sc.next());
	    	System.out.println("Enter Shop Website");
	    	invoiceobj.shopObj.setWebsite(sc.next());
	    	
	    	
	    	
	    	}catch(Exception e){System.out.println(e);} 
	    	break;

	    case 4:
	    	as = true;
	    	break;
	    	
	    
	    
	}
	    }
	    
	  case 2:
		  System.out.println("1. Add Items");
		    System.out.println("2. Delete Item");
		    System.out.println("3. Change Item Price");
		    System.out.println("4. Report All Items");
		    System.out.println("5. Go Back");
		    
		    switch (sc.nextInt()) {
		    case 1:
		    	try{    
		    		         
		    	//Items itemN = new Items();
		    	FileOutputStream fout=new FileOutputStream("item.txt");    
	    		  ObjectOutputStream out=new ObjectOutputStream(fout); 
		    	System.out.println("Enter Items Name");
		    	itemN.setItemName(sc.next());
		    	System.out.println("Enter Items ID");
		    	itemN.setItemID(sc.nextInt());
		    	System.out.println("Enter Number of Quantity");
		    	itemN.setQuantity(sc.nextInt());
		    	System.out.println("Enter Unit Price");
		    	itemN.setUnitPrice(sc.nextDouble());
		    	System.out.println("Enter Quantity Amount");
		    	itemN.setQtyAmountPrice(sc.nextDouble());
		    	invoiceobj.shopObj.itemList.add(itemN);
		    	 out.writeObject(itemN);    
		    	  out.flush();    
		    	      
		    	  out.close();    
		    	  System.out.println("success");    
		    	  }catch(Exception e){System.out.println(e);}
		    	break;
		    	/* try{    
		    		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("item.txt"));    
		    		  Items i=(Items)in.readObject();    
		    		  System.out.println(i.itemList+"Out Put ");       
		    		  in.close();    
		    		  }catch(Exception e){System.out.println(e);}    */
		    	
		    case 2:
		    	System.out.println("Enter Name of Item Need to Deleted");
		    	String itemNameRemove = sc.next();
		    	invoiceobj.shopObj.remove(itemNameRemove);
		    	
		    	break;
		    	
		    case 3:
		    	System.out.println("Enter Item Name Need to Change Price");
		    	String iName = sc.next();
		    	System.out.println("Enter Neew Price ");
		    	double newUnitPrice = sc.nextDouble();
		    	invoiceobj.shopObj.changeItemPrice(iName,  newUnitPrice);
		    	System.out.println("3. Change Item Price");
		    	break;

		    case 4:
		    	System.out.println("4. Report All Items");
		    	break;
		    	
		    case 5:
		    	as=true;
		    	
		    	break;
		    }
		    
	  case 3:
		    System.out.println("");
		    System.out.println("Enter Invoice Date");
	    	invoiceobj.setInvoiceDate(sc.next());
	    	System.out.println("Enter Number Of Items");
	    	invoiceobj.setNumberOfItems(sc.nextInt());
	    	System.out.println("Enter Total Amount");
	    	invoiceobj.setTotalAmount(sc.nextDouble());
	    	System.out.println("Enter Paid Amount");
	    	invoiceobj.setPaidAmount(sc.nextDouble());
	    	System.out.println("Enter Balance");
	    	invoiceobj.setBalance(sc.nextDouble());
		    break;
		    
		  case 4:
		    System.out.println("");
		    break;
		    
		  case 5:
		    System.out.println("");
		    break;
		    
		  case 6:
		    System.out.println("");
		    break;
		    
		  case 7:
		    System.out.println("");
		    break;
		    
		  case 8:
			    System.out.println("Are you sure you want to exit?  Yes Or No");
			    String exit =sc.next();
			    if(exit.equals("yes")) 
			    {
			    	return;
			    }
			    else
			    {
			    	as=true;
			    	
			    }
	
			   break;
		}
		

	}
	
	
	

}

}