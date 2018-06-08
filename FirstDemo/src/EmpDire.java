import java.util.Scanner;
class EmpDire
{
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
	int count=0;
	int empid=1000;
	char LoopRun='a';
	do
	{
	        System.out.println("Enter your First Name :");
        	String FirstName = in.nextLine(); 
		System.out.println("\nEnter your Last Name :");
        	String LastName = in.nextLine();
		System.out.println("\nEnter your Salary :");
	        int Salary = in.nextInt();
		System.out.println("\nEnter your Grade :");
	        String Grade = in.nextLine();
		System.out.println("\nEnter your joining month(mmm:yyyy) :");
	        String DOJ = in.nextLine();
		empid=empid+count;
		count=count+1;
		System.out.println("\nEmployee id : " +empid);
		System.out.println("\nDo you want add another employee (Y/N) :");
	        LoopRun=in.next().charAt(0);
	}while((LoopRun=='Y')||(LoopRun=='y')); 	
    }
}