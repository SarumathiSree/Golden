package sss;
import java.util.Scanner;
class Staff
{
	private int StaffId;
	private String Name;
	private String phone;
	private long salary;
	public Staff(int StaffId, String name,String phone,long salary)
	{
		StaffId=StaffId;
		Name=name;
		phone=phone;
		salary=salary;
	}
	public void display()
	{
		System.out.println("\t"+StaffId+"\t"+Name+"\t"+phone+"\t"+salary);
	}
}
class Teaching extends Staff
{
	private String Domain;
	private int publications;
	public Teaching(int StaffId,String name,String phone,long salary,String domain,int publications)
	{
		super(StaffId,name,phone,salary);
		Domain=domain;
		publications=publications;
	}
	public void display()
	{
		super.display();
		System.out.println("\t"+Domain+"\t"+publications+"\t"+"--"+"\t"+"--");
	}
}
class Technical extends Staff
{
	private String skills;
	public Technical(int StaffId,String name,String phone,long salary,String skills)
	{
		super(StaffId,name,phone,salary);
		skills=skills;
	}
	public void display()
	{
		super.display();
		System.out.println("\t--"+"\t"+skills+"\t"+"--");
	}
}
class contract extends Staff
{
	private int period;
	public contract(int StaffId,String name,String phone,long salary,int period)
	{
		super(StaffId,name,phone,salary);
		this.period=period;
	}
	public void Display()
	{
		super.display();
		System.out.println("\t--"+"\t"+"--"+"\t"+"--"+"\t"+period);
	}
}
public class Lab2 
{
	public static void main(String[] args) 
	{
		Staff Staff[]=new Staff[3];
		Staff[0]=new Teaching(0001,"Narendra","271173",90000,"CSE",3);
		Staff[1]=new Technical(0002,"Aroha","271172",2000,"Server Admin");
		Staff[2]=new contract(0003,"Rahul","271174",9000,3);
		System.out.println("StaffID\t\tName\t\tphone\tsalary\t\tDomain\tpublication\tskills\t\tperiod");
		for(int i=0;i<3;i++)
		{
			Staff[i].display();
			System.out.println();
		}
	}
}