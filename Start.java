import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;
import interfaces.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		FoodCourt b = new FoodCourt();
		
		boolean choice = true;
		
		    System.out.println(" Wellcome to Food Court Management Application ");
	        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println();
			
		
		while(choice)
		{   System.out.println("--------------------HOME SCREEN------------------------");
	        System.out.println("********************************************************");
			System.out.println();
			
			
			System.out.println("Choose Your Option ");
			System.out.println("Press (1) For Employee Management");
			System.out.println("Press (2) For Restaurant Management");
			System.out.println("Press (3) For Restaurant FoodItem Management");
			System.out.println("Press (4) For FoodItem Quantity Add-Sell");
			System.out.println("Press (5) For Exit");
			
			System.out.print("Your Option: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Employee Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("What do you want to do?");
					System.out.println("Press (1) For Insert New Employee");
					System.out.println("Press (2) For Remove Existing Employee");
					System.out.println("Press (3) For Show All Employees");
					System.out.println("Press (4) For Search an Employee");
					System.out.println("Press (5) For Go Back");
					
					System.out.print("Your Option: ");
					int c1 = sc.nextInt();
					
					switch(c1)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Employee");
							
							Employee e = new Employee();
							
							//e.setEmpId(sc.next());
							//e.setName(sc.next());			
							//e.setSalary(sc.nextDouble());			
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							e.setEmpId(empId1);
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							e.setName(name1);
							
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							e.setSalary(salary1);
							
							
							b.insertEmployee(e);
							
							System.out.println("-----------------------------------------");
							break;
							
						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							b.removeEmployee(b.getEmployee(empId2));

							System.out.println("-----------------------------------------");
							break;
						
						
						case 3:
						    System.out.println("-----------------------------------------");
							System.out.println("Show All Employees");
							
							b.showAllEmployees();
							
							System.out.println("-----------------------------------------");
							break;
							
							
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Search an Employe");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							System.out.println();
							Employee e3 = b.getEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee ID is: "+e3.getEmpId());
								System.out.println("Employee Name is: "+e3.getName());
								System.out.println("Employee Salary is: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does NOT Exists");
							}
							
							System.out.println("-----------------------------------------");
							break;
						
						case 5:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}
					
					break;
				
				case 2:
				
					
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen Restaurant Management");
					System.out.println("-----------------------------------------");
					
					System.out.println("What do you want to do?");
					System.out.println("Press (1) For Insert New Restaurant");
					System.out.println("Press (2) For Remove Existing Restaurant");
					System.out.println("Press (3) For Show All Restaurant");
					System.out.println("Press (4) For Search a Restaurant");
					System.out.println("Press (5) For Go Back");
					
					System.out.print("Your Option: ");
					int c2 = sc.nextInt();
					
					switch(c2)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New Restaurant");
							
							Restaurant resta1 = new Restaurant();
									
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							resta1.setRid(rid1);
							String name1;
							System.out.print("Enter Restaurant Name: ");
							try
							{
								name1 = bfr.readLine();
							}
							catch(IOException ioe)
							{
								name1 = "defaultName";
							}
							resta1.setName(name1);
							
							b.insertRestaurant(resta1);
							
							System.out.println("-----------------------------------------");
							break;
							
						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Remove Existing Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							
							b.removeRestaurant(b.getRestaurant(rid2));
							
							

							System.out.println("-----------------------------------------");
							break;
						
						
						case 3:
						    System.out.println("-----------------------------------------");
							System.out.println("Show All Restaurant");
							
							b.showAllRestaurants();
							
							System.out.println("-----------------------------------------");
							
						
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Get a Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid4 = sc.next();
							
							Restaurant resta4 = b.getRestaurant(rid4);
							
							if(resta4 != null)
							{
								System.out.println("Restaurant ID: "+resta4.getRid());
								System.out.println("Restaurant Name: "+resta4.getName());
								resta4.showAllFoodItems();
							}
							else
							{
								System.out.println("Restaurant Does NOT Exists");
							}
							
							System.out.println("-----------------------------------------");
							break;
							
						
						case 5:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}

					
					break;
					
				case 3:
				
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen  Restaurant FoodItem Management:");
					System.out.println("-----------------------------------------");
					
					System.out.println("What do you want to do?");
					System.out.println("Press (1) For Insert New FoodItem ");
					System.out.println("Press (2) For Remove Existing FooItem ");
					System.out.println("Press (3) For Show All FoodItems ");
					System.out.println("Press (4) For Search a FoodItem");
					System.out.println("Press (5) For Go Back");
					
					System.out.print("Your Option: ");
					int c3 = sc.nextInt();
					
					switch(c3)
					{
						case 1:
							System.out.println("-----------------------------------------");
							System.out.println("Insert New FoodItem\n");
							System.out.println("Which Type of FoodItem do you want to add?");
							System.out.println("Press (1) For MainDish ");
							System.out.println("Press (2) For Appitizers");
							System.out.println("Press (3) For Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							FoodItem fi = null;
							
							if(type == 1)
							{
								System.out.print("Enter FooItem Id : ");
								String fid1 = sc.next();
								System.out.print("Enter FooItem Name : ");
								String name1 = sc.next();
								System.out.print("Enter AvailableQuantity : ");
								int aq1 = sc.nextInt();
								System.out.print("Enter price: ");
								double pr1 = sc.nextDouble();
								System.out.print("Enter Category: ");
								String ct1 = sc.next();
								
								
								MainDish md1 = new MainDish();
								md1.setFid(fid1);
								md1.setName(name1);
								md1.setAvailableQuantity(aq1);
								md1.setPrice(pr1);
								md1.setCategory(ct1);
								
								fi = md1;
								
							}
							else if(type == 2)
							{
								System.out.print("Enter FooItem Id : ");
								String fid2 = sc.next();
								System.out.print("Enter FooItem Name : ");
								String name2 = sc.next();
								System.out.print("Enter AvailableQuantity : ");
								int aq2 = sc.nextInt();
								System.out.print("Enter price:");
								double pr2 = sc.nextDouble();
								System.out.print("Enter Size:");
								String si2 = sc.next();
								
								
								Appitizers ap1 = new Appitizers();
								ap1.setFid(fid2);
								ap1.setName(name2);
								ap1.setAvailableQuantity(aq2);
								ap1.setPrice(pr2);
								ap1.setSize(si2);
								
								fi = ap1;
							}
							else if(type == 3)
							{
								System.out.println("Going Back ...");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(fi!=null)
							{
								System.out.print("Enter Restaurant ID: ");
								String rid1 = sc.next();
								
								b.getRestaurant(rid1).insertFoodItem(fi);
							}
						
							System.out.println("-----------------------------------------");
							break;
							
						case 2:
							System.out.println("-----------------------------------------");
							System.out.println("Remove Existing FooItem ");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							System.out.print("Enter FooItem ID: ");
							String fid2 = sc.next();
							
							b.getRestaurant(rid2).removeFoodItem(b.getRestaurant(rid2).getFoodItem(fid2));
							
							
							System.out.println("-----------------------------------------");
							break;
						
						
						case 3:
						    System.out.println("-----------------------------------------");
							System.out.println("Show All FooItems");
							
							System.out.print("Enter Restaurant ID: ");
							String rid4 = sc.next();
						
							b.getRestaurant(rid4).showAllFoodItems();
							
							System.out.println("-----------------------------------------");
							break;
							
						
						case 4:
							System.out.println("-----------------------------------------");
							System.out.println("Search a FoodItem");
							
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							System.out.print("Enter FooItem Id: ");
							String fid3 = sc.next();
							
							FoodItem fi3 = b.getRestaurant(rid3).getFoodItem(fid3);
							
							if(fi3 != null)
							{
								fi3.showInfo();
							}
							
							System.out.println("-----------------------------------------");
							break;
						
						case 5:
							System.out.println("-----------------------------------------");
							System.out.println("Going Back");
							System.out.println("-----------------------------------------");
							break;
						
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}

					
					break;
					
				case 4:
				
					System.out.println("-----------------------------------------");
					System.out.println("You have choosen  FoodItem Quantity Add-Sell");
					System.out.println("-----------------------------------------");
					
					System.out.println("What do you want to do?\n");
					System.out.println("Press (1) For Add FooItem");
					System.out.println("Press (2) For Sell FooItem");
					System.out.println("Press (3) For Show Add Sell History ");
					System.out.println("Press (4) For Go Back");
					
					
					System.out.print("Your Option: ");
					int c4 = sc.nextInt();
					
					switch(c4)
					{
						case 1:
						
							System.out.println("-----------------------------------------");
							System.out.println("Add FooItem");
							
							System.out.print("Enter Restaurant Id: ");
							String rid1 = sc.next();
							System.out.print("Enter FooItem Id: ");
							String fid1 = sc.next();
							System.out.print("Enter Quantity: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								
								
								Restaurant rt = b.getRestaurant(rid1);
								FoodItem fi = rt.getFoodItem(fid1);
								fi.addQuantity(amount1);
								
								frwd.writeInFile("New"+amount1+" "+fi.getName()+" has been Added in Restaurant "+rt.getName());
								
								
							}
							System.out.println("-----------------------------------------");
							break;
							
						case 2:
						
							System.out.println("-----------------------------------------");
							System.out.println("Sell FooItem");
							
							System.out.print("Enter Restaurant Id: ");
							String rid2 = sc.next();
							System.out.print("Enter FooItem Id: ");
							String fid2 = sc.next();
							System.out.print("Enter Quantity: ");
							int amount2 = sc.nextInt();
							
							
							if(amount2>0 && amount2 <= b.getRestaurant(rid2).getFoodItem(fid2).getAvailableQuantity())
							{
								Restaurant rt2 = b.getRestaurant(rid2);
								FoodItem fi2 = rt2.getFoodItem(fid2);
								fi2.sellQuantity(amount2);
								
								frwd.writeInFile("New"+amount2+" "+fi2.getName()+" has been sold from the Restaurant "+rt2.getName());
								
							}
							
							System.out.println("-----------------------------------------");
							break;
							
						
						
						case 3:
						
							System.out.println("-----------------------------------------");
							System.out.println("Show Transactions History");
							frwd.readFromFile();
							System.out.println("-----------------------------------------");
							break;
							
						case 5:
						
							System.out.println("-----------------------------------------");
							System.out.println("Going back....");
							System.out.println("-----------------------------------------");
							break;
							
						default:
						
							System.out.println("-----------------------------------------");
							System.out.println("Invalid");
							System.out.println("-----------------------------------------");
							break;
					}
					
					break;
					
				case 5:
					
					System.out.println("You have choosen to exit");
					choice = false;
					break;
					
				default:
				
					System.out.println("Invalid Option");
					break;
			}
		}
	}
}