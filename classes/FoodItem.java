package classes;

import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity
{
	protected String fid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public void setFid(String fid){this.fid=fid;}
	public void setName(String name){this.name=name;}
	public void setAvailableQuantity(int availableQuantity){this.availableQuantity=availableQuantity;}
	public void setPrice(double price){this.price=price;}
	
	
	
	public String getFid( ){return fid;}
	public String getName( ){return name;} 
	public int getAvailableQuantity( ){return availableQuantity;}
	public double getPrice( ){return price;}
	public abstract void showInfo( );
	
	public void addQuantity(int amount)
	{
		if (amount>0)
		{
			
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Added Quantity: "+ amount);
			availableQuantity += amount;
			System.out.println("Current availableQuantity: "+ availableQuantity);
		    
		}
		
		else
		{
			System.out.println("Item does not added");
		}
		
	}
	public void sellQuantity(int amount)
	{
		if (availableQuantity>=amount && amount>0)
		{
			
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("sell Quantity: "+ amount);
			availableQuantity -= amount;
			System.out.println("Current availableQuantity: "+ availableQuantity);
		    
		}
		
		else
		{
			System.out.println("Item is sold out");
		}
	}
	
	
}