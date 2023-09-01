package com.spring.orm;

/**
 * Hello world!
 *
 */

//class Animal {
//	Animal() {
//		System.out.println("animal is created");
//	}
//
//	 void eat() {
//		// TODO Auto-generated method stub
//		System.out.println("eating ...");
//	}
//	
//	
//}
//
//class Dog extends Animal {
////	Dog() {
////		super();
////		System.out.println("dog is created");
////	}
//	
//	void eat(){System.out.println("eating bread...");}  
//	void bark(){System.out.println("barking...");}  
//	
//	void work(){  
//		super.eat();
//	bark();  
//	}  
//	
//
//}


class Animal { }  

class Dog3 extends Animal {  
  static void method(Animal a) {  
    if(a instanceof Dog3){  
       Dog3 d=(Dog3)a;//downcasting  
       System.out.println("ok downcasting performed");  
            
    }
    
//    Dog3 d=(Dog3)a;//downcasting  
//    System.out.println("ok downcasting performed");  
  }  
   

    
 }  

class A{  
A getA(){  
return this;  
}  
void msg(){System.out.println("Hello java");}  
}  
 

public class App {

	public static void main(String args[]) {
		
		new A().msg();  


		int arr[]={4,4,5};  
		//getting the class name of Java array  
		Class c=arr.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println(name);  
		
	
		
		
//		Animal a=new Dog3();  
//		
////		Animal a=new Animal();  
//	    Dog3.method(a);  
	    
//		Dog d = new Dog();
//		d.work();

	}
}
