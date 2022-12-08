package interfaces;

import java.lang.*;
import classes.*;


public interface FoodItemOperation
{
 void insertFoodItem(FoodItem f);
 void removeFoodItem(FoodItem f);
 FoodItem getFoodItem(String fid); 
 void showAllFoodItems();
} 