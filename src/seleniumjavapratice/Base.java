package seleniumjavapratice;



abstract class Base1

{ 
    abstract void fun(); 
    
} 


class Derived1 extends Base1 { 
	
    void fun() {
    	
    	System.out.println("Derived fun() called");
    	
    
    } 
} 
class Main1 { 
	
    public static void main(String args[]) {  
    	
    	
      
        // Uncommenting the following line will cause compiler error as the  
        // line tries to create an instance of abstract class. 
        // Base b = new Base(); 
  
        // We can have references of Base type. 
        Base1 b = new Derived1(); 
        b.fun();  
    } 
} 