package classes;

import java.lang.*;


public class MainDish extends FoodItem
{
private String category; 
public void setCategory(String category){this.category=category;} 
public String getCategory(){return category;} 	
public void showInfo( )
   {
	
	System.out.println("Food Id: "+getFid( ));
    System.out.println("Food Name: "+getName( ));
	System.out.println("Available Quantity: "+getAvailableQuantity( ));
	System.out.println("Price: "+getPrice( ));
	System.out.println("Category: "+category);
	System.out.println("........................................");
	
   }
	
	
	
}