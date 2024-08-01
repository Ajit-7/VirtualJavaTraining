package com.accenture.lkm.z.assignment;
interface MyInterface11{
	void service(int i, String str, double d); // should dispay all the details
}
interface MyInterface22{
	double computeTax(double salary, double taxPer); // return tax
}
//(salary+salary*tax/100)
interface MyInterface33{
	void dummyFunction();// prints hello world
}
interface MyInterface444{
	int dummyFunction2();// should return  a random value
}
interface MyInterface5{
	int dummyFunction2(int x);// should return  a random value
}

public class Tester10008_Assignment {
	
	public static void main(String[] args) {
		//Line1
		/*MyInterface11 my1 = (var1, var2,var3)->{
			System.out.println(var1);
			System.out.println(var2);
			System.out.println(var3);
			
		};*/
		
		
		MyInterface11 my1 = (var1, var2,var3)->System.out.println(var1+" "+var2+" "+var3);

		
		my1.service(12, "Jack", 123);
		
		/*MyInterface22 my2 = (var2,var3)->{
			System.out.println(var2);
			System.out.println(var3);
			double tax= var2+var2*var3/100;
			return (int)tax;
		};*/
		
		MyInterface22 my2=(var2,var3)->var2+var2*var3/100;
		my2.computeTax(123,10);
		
		//MyInterface33 my3 = ()->{System.out.println("Hello world");};
		
		MyInterface33 my3 = ()->System.out.println("Hello world");
		my3.dummyFunction();
		
		
		MyInterface444 my4 = ()->{System.out.println("REtunring value");
								return (int)(Math.random()*10);	
								};
		
		my4.dummyFunction2();
		
		
		MyInterface5 my5 = (x)->{return x+10;};
		
		MyInterface5 my6 = x->x+10;
		
		
		
	}

}
