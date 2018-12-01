package constructor;

public class Hellocons{
	String name;
	int age;
	double num;
	public Hellocons(String n)
	 {
		System.out.println("d c");
		this.name=n;
		}
	public Hellocons(int a)
	{
		this.age = a;
	}

	public Hellocons(double b)
	{
		this.num=b;
		}
	public void m1()
	{
		System.out.println(name);
	}
	public void m2()
	{
		System.out.println(age);
		}

public void m3()
{
	System.out.println(num);
	}
}

