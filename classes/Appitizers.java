package classes;

import java.lang.*;


public class Appitizers extends FoodItem
{
 private String size; 
 public void setSize(String size){this.size=size;}
 public String getSize( ){return size;}

 
 public void showInfo( )
   {
	
	System.out.println("Food Id: "+getFid( ));
    System.out.println("Food Name: "+getName( ));
	System.out.println("Available Quantity: "+getAvailableQuantity( ));
	System.out.println("Price: "+getPrice( ));
	System.out.println("Size: "+size);
	System.out.println("........................................");
	
   }
	
	
	
}