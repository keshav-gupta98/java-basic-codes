import java.util.*;
class Student implements Comparable<Student>
{
	int r_no;
	String name;
	int age;
	Student(int r,String n,int a)
	{
		r_no=r;
		name=n;
		age=a;
	}
	public int compareTo(Student st)
	{//we are sorting on basis of age
		if(age==st.age)
			return 0;
		else 
			if(age>st.age)
				return 1;
			else
				return 1;
	}
	public String toString()
	{
		return r_no + " " + name + " " + age;
	}
}
public class comparabledemo
{
	public static void main(String[] args) {
	ArrayList <Student> al=new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i = 0 ; i < n ; i++)
	{
		System.out.println("Student:"+(i+1));
		System.out.println("Enter Roll No.:");
		int r = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter age:");
		int age = sc.nextInt();
		al.add(new Student(r, name, age));
	}
	Collections.sort(al);
	for(int i = 0 ; i< al.size() ; i++)
	{
		System.out.println(al.get(i));
	}    
	sc.close(); 
}
}
