package class_Inheritance;

abstract class Class01
{
	abstract void add();
	abstract void sub();
	abstract void mul();
	abstract void div();
}
abstract class Class02 extends Class01
{
	 void add()
	 {
		 System.out.println("Addition");
	 }
	abstract void sub();
	abstract void mul();
	abstract void div();
}
abstract class Class03 extends Class02
{
	 void sub()
	 {
		 System.out.println("Substraction");
	 }
	abstract void mul();
	abstract void div();
}
abstract class Class04 extends Class03
{
	
	 void mul()
	 {
		 System.out.println("Multiplication");
	 }
	abstract void div();
}
class Class05 extends Class04
{
	 void div()
	 {
		 System.out.println("Division");
	 }
}

public class Incomplete {
public static void main(String[] args) {
	Class05 obj = new  Class05();
	obj.add();
	obj.sub();
	obj.mul();
	obj.div();
}
}
