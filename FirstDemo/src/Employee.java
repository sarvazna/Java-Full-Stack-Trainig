public class Employee
{ 
private String firstName; 
private String lastName; 
private double salary;
private String doj;
static int count; 
private int id;



public Employee() 
{ 
System.out.println("inside default constructor");
firstName = "NA"; 
lastName = "NA"; 
id = ++count; 
salary = 0; 
doj = "NA"; 
} 
 
public Employee(String firstName,String lastName,String doj,double salary) 
{ 
System.out.println("inside parameterized constructor");
this.firstName = firstName; 
this.lastName = lastName; 
this.salary = salary; 
this.doj = doj; 
id = ++count; 
} 
public static void main(String[] args){
  Employee e = null;
		
		e = new Employee();
		e.displayDetails();
		
		e = new Employee("sarvazna","aditya","sep2017",15000);
		e.displayDetails();
		e = new Employee("sarvazna","aditya","sep2017",15000);
		e.displayDetails();
		e = new Employee("sarvazna","aditya","sep2017",15000);
		e.displayDetails();
		e = new Employee("sarvazna","aditya","sep2017",15000);
		e.displayDetails();
}
public void displayDetails(){
		System.out.print("\nid "+ id);
		System.out.println("\nfirstname "+ firstName);
		System.out.println("\nlastName "+ lastName);
		System.out.println("\ndoj "+ doj);
		System.out.println("\nsalary "+ salary);
	}
}