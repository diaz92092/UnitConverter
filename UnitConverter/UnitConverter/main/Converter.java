package main;

import java.util.Scanner;
class Converter
{
	public static void main(String arg[])	
	{
	    double m,y,f,i,c,k;
             	    Scanner scan=new Scanner(System.in);
             	   int menuSelection;
        do {
	    System.out.println("Please select an option: \n 1.Miles to Yards \n 2.Yards to Feet \n 3.Feet to Inches \n 4.Inches to Centimeters \n 5.Kilometers to Miles \n 6.Quit");
                   menuSelection=scan.nextInt();
                
	    switch(menuSelection)
	    {
	    case 1:  System.out.println("Enter distance in Miles");
                   	  m=scan.nextDouble();
	    	  y=m*1760;
	    	  System.out.println("The distance in Yards is = "+y);
		  break;
	    case 2:  System.out.println("Enter Yards");
                   	  y=scan.nextDouble();
	    	  f=y*3;
	    	  System.out.println("The distance in Feet is = "+f);
		  break;
	    case 3:  System.out.println("Enter distance in Feet");
     	  		      f=scan.nextDouble();
     	  	  i=f*12;
     	  		 System.out.println("The distance in Inches is = "+i);
     	  		 break;
	    case 4:  System.out.println("Enter distance in Inches");
		              i=scan.nextDouble();
	         c=i*2.54;
		 System.out.println("The distance in Centimeters = "+c);
		 break;
	    case 5:  System.out.println("Enter distance in Kilometers");
	                  k=scan.nextDouble();
            m=k*.62;
	     System.out.println("The distance in Miles is = "+m);
	     break;
	    case 6:  
	     System.out.println("Exiting...");
	     System.exit(0);
	     break;
	    default:  System.out.println("please choose valid choice");
	    scan.close();
	    }  
	}while(menuSelection!=6);
	}
}

