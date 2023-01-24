package InvoicingSystem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	Invoice invoiceobj = new Invoice();
	//System.out.println("Please Enter Your Shop Name : ");
	//invoiceobj.shopObj.setShopName(sc.nextLine());
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
	    
	    switch (sc.nextInt()) {
	    case 1:
	    	System.out.println("1. Load Data");
	    	break;
	    case 2:
	    	System.out.println("Please Enter Your Shop Name : ");
	    	invoiceobj.shopObj.setShopName(sc.nextLine());
	    	
	    	break;
	    	
	    case 3:
	    	System.out.println("3. Set Invoice Header ");
	    	break;

	    case 4:
	    	
	    	System.out.println("4. Go Back");
	    	break;
	    	
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
		    		         
		    	Items itemN = new Items();
		    	FileOutputStream fout=new FileOutputStream("item.txt");    
	    		  ObjectOutputStream out=new ObjectOutputStream(fout); 
		    	System.out.println("Enter Items Name");
		    	itemN.setItemName(sc.nextLine());
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
		    case 2:
		    	
		    	System.out.println("2. Delete Item");
		    	break;
		    	
		    case 3:
		    	System.out.println("3. Change Item Price");
		    	break;

		    case 4:
		    	System.out.println("4. Report All Items");
		    	break;
		    	
		    case 5:
		    	System.out.println("4. Go Back");
		    	break;
		    }
		    
	  case 3:
		    System.out.println("");
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
			    System.out.println("");
			    break;
		}
		

		
	
	
	

}

}