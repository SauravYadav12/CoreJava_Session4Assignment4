class Employees
{
	double Bsalary;                //declared the salary variable
	double Tallowance;             // declared the Travel allowance variable
	double Gsalary;
	
	void Display()						// Salary Calculation
	{
		Bsalary = Integer.parseInt(System.console().readLine());
		Gsalary = ((Bsalary * Tallowance) + Bsalary);
	}
	
}
	
class Manager extends Employees
{
		void Display()
		{									// overriding Display method for calculating manager's salary
		Tallowance = 0.15;					// TA is 15% of the basic salary for manager
		System.out.println("===============================" + "\n" + "Enter basic Salary of Manager:" 
		+ "\n" + "==============================");
		super.Display();
		System.out.println("===============================" +"\n"+ "The GrossSalary of Manager is : " + Gsalary + 
		"\n" +"===============================");
		}
}

class Trainee extends Employees
{
		 void Display()
		{									// overriding Display method for calculating Trainee's salary
		
		Tallowance = 0.10;					// TA is 10% of the basic salary for Trainee
		System.out.println("===============================" +"\n"+ "Enter basic Salary Trainee :" + "\n" + 
		"===============================");
		super.Display();
		System.out.println("==============================="+"\n"+ "The GrossSalary of Trainee is : " + 
		Gsalary + "\n" + "===============================");
		}
}

class SalaryCalc
{
	public static void main(String[] args)
	{
		Manager M = new Manager();
		Trainee T = new Trainee();
		
		M.Display();
		T.Display();
		
		System.out.println("================Thank you For Using Our Payroll management System==============");
	}
}