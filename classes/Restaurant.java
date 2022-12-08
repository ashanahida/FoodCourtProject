package classes;

import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperation
{

 private String rid;
 private String name;
 private FoodItem fooditems[ ];
 
 public void setName(String name){this.name=name;}
 public void setRid(String rid){this.rid=rid;}
 public String getName( ){return name;}
 public String getRid( ){return rid;}
 
 public void insertFoodItem(FoodItem f)
  {
	 int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == null)
			{
				fooditems[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("FoodItem Inserted");
		}
		else
		{
			System.out.println("FoodItem Not Insert");
		} 
	  
  }
  
   public void removeFoodItem(FoodItem f)
   {
	   int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == f)
			{
				fooditems[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("FoodItem Removed");
		}
		else
		{
			System.out.println("FoodItem Not Removed");
		} 
	   
   }
   public FoodItem getFoodItem(String fid)
   {
	  FoodItem fir=null;
	  int flag=0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i].fid == fid)
			{  fir=fooditems[i];
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			return null;
		}
		else
		{
			return fir;
		}
		 
	   
   }
  public void showAllFoodItems( )
   {
	   for(FoodItem f : fooditems)
		{
			if(f != null)
			{
				f.showInfo();
			}
		}
   }
   
}