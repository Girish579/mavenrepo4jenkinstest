package com.application.fullstackdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    	
	public static void main( String[] args )
    {
		
		String name = "Girish";
	    int myNum = 26;
	    double myFloat = 22.33;
	    char myLetter = 'G';
	    boolean myBool = true; //false or true
	    
        System.out.println( "Hello World!" );
        System.out.println(name);
        System.out.println(myNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        
        // Integer Types - byte, short, int, long
        // Float Types - float, double
        
       // Byte - whole numbers -128 to 127
       // short - whole numbers - -32768 to 32767
        // int - -21474883648 to 21474883647
        // long - -9....   L
        
        
       //float and double
        // 2.11f
        //333.1111d
        
        float f1 = 22222.33f;
        double d1 = 383838383838338.333d;
        
        
     //   Type Casting
        
     //  converting from one datatype to another datatype

        
        double myDouble = 22.333d;
        int myInt = (int)myDouble;// Manual Type Casting - double to int
        
        System.out.println(myDouble);
        System.out.println(myInt);
        
        System.out.println((float)myInt);
        
        String msg = "Welcome to Java World!";
        
       
        print(msg);

        print(Integer.toString(msg.length()));
        
        print(msg.toLowerCase());
        print(msg.toUpperCase());
        
       String myFavNo = "26";
       int myFavNoInt = Integer.parseInt(myFavNo);
       System.out.println(myFavNoInt);
       
       for (int i=0;i < 10; i++) {
           System.out.println(i);

       }
       String[] favFruits = {"Banana","Apple","Papaya","Orange"};
       for (String x: favFruits) {
    	   System.out.println(x);
       }
       
       int x = 33;
       int y = 22;
       
       if (x > y)
       {
    	   System.out.println("X is Greater then y");
       }
       for(int i=1; i<10; i++)
       {
    	   System.out.println(i);
       }
		
	String[] weekdays = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	for (String x1: weekdays){
		System.out.println(x1);	
	}
      
        
    }
	
	public static void print(String value){
		
		System.out.println(value);
		
	}
}
