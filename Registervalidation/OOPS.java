package Registervalidation;

//class Employee{
//	float salary=40000;
//}
//class OOPS extends Employee{
//	int bonus=1000;
//
//
//	public static void main(String[] args) {
//		OOPS p = new OOPS();
//		System.out.println("Programmer salary "+p.salary);
//		System.out.println("Bonus salary "+p.bonus);
//		
//
//	}
//}

//class Animal {
//	void eat() {
//		System.out.println("eating...");
//	}
//class Dog extends Animal {
//	void bark() {
//		System.out.println("barking...");
//	}
//class testInheritance{
//	public static void main(String args[]) {
//		Dog d=new Dog();
//		d.bark();
//		d.eat();
//	}
//}
 
//single inheritance
//class Animal{  
//void eat(){
//	System.out.println("eating...");
//	}  
//}  
//class Dog extends Animal{  
//void bark(){
//	System.out.println("barking...");
//	}  
//}  
//class OOPS{  
//public static void main(String args[]){  
//Dog d=new Dog();  
//d.bark();  
//d.eat();  
 
//multilevel inheritance

//class Animal{  
//void eat(){System.out.println("eating...");}  
//}  
//class Dog extends Animal{  
//void bark(){System.out.println("barking...");}  
//}  
//class BabyDog extends Dog{  
//void weep(){System.out.println("weeping...");}  
//}  
//class OOPS{  
//public static void main(String args[]){  
//BabyDog d=new BabyDog();  
//d.weep();  
//d.bark();  
//d.eat();  
 
//class Animal{  
//void eat(){System.out.println("eating...");}  
//}  
//class Dog extends Animal{  
//void bark(){System.out.println("barking...");}  
//}  
//class Cat extends Animal{  
//void meow(){System.out.println("meowing...");}
//
//public void bark() {
//	// TODO Auto-generated method stub
//	
//}  
//}  
//class OOPS{  
//public static void main(String args[]){
//Cat c=new Cat();  
//c.meow();  
//c.eat();  
//c.bark(); //C.T.Error  

class Vehicle{  
	  //defining a method  
	  void run(){System.out.println("Vehicle is running");}  
	}  
	//Creating a child class  
	class OOPS extends Vehicle{  
	  //defining the same method as in the parent class  
	  void run(){System.out.println("Bike is running safely");}  
	  
	  public static void main(String args[]){  
	  OOPS obj = new OOPS();//creating object  
	  Vehicle obs = new Vehicle();
	  obj.run();//calling method
	  obs.run();//calling method
	  
	  }  
	

}