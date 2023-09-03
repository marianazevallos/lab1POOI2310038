/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	
	{
		//los ejercicios los tuve que hacer en archivos separados porque me salia error
	    //ejercicio a
	    if (6<6*5)
		System.out.println("Hello");
		System.out.println(" There");
		
		//respuesta: Hello
		// There
		
		/* ejercicio b */ 
		
		int x=1, y=2, z=3;
		
		if(x>y)
	    	if(x>z)
		    System.out.println("1111");
	    	else
		    System.out.println("2222");
	
		//Respueta: no imprime nada

		//ejercicio c
	    int x=1, y=2, z=3;
	    
	    if(x < z)
		    System.out.println("*");
		else if (x == z)
		    System.out.println("&");
		else
		    System.out.println("$");
		    
	    //respuesta: *

		/* ejercicio d */
	     int x=1, y=2, z=3;
	     
	     if(x<y)
	        System.out.println("####");
	    else
	        System.out.println("&&&&");
	        System.out.println("****");
	        
	       //respuesta: ####
	       // ****

		/* ejercicio e */
	       
	        int x=1, y=2, z=3;
	     
	     if(x>y)
	        System.out.println("####");
	    else {
	        System.out.println("&&&&");
	        System.out.println("****");
	        
	        //respuesta: &&&&
	        //****
	    }
	    
	    /* ejercicio f */
	    
	    int a1=100; int a2=200;
	    
	    if(a1>100 && a2<=200)
	        System.out.print(a1+" "+a2+" "+(a1+a2));
	    else
	        System.out.print(a1+" "+a2+" "+(2*a1-a2));
	        
	        //respuesta: 100 200 0

		/** ejercicio g */
	   
	   int x=1, y=2, z=3;
	   
	   if(++x > y++ || x-- > 0)
	        z++;
	    else
	        z--;
	   System.out.println(x+" "+y+" "+z);
	   
	   //respuesta: 1 3 4

	/** ejercicio h */
	   
	   int x=1, y=2, z=3;
	   
	   if(x<y){
	       System.out.println("####");
	       System.out.println("****");
	   }
	   else
	        System.out.println("&&&&");
	        
	        //respuesta: ####
	        //****

	/*** ejercicio i */
	    
	    int x=1, y=2, z=3;
	    
	    if('x' > 'y' || 66 > (int)('A'))
	        System.out.println("#*#");
	    
	        //respuesta: #*#

		   /*** ejercicio j */
	   
	   int x=1, y=2, z=3;
	   
	   if(x < z)
	    System.out.println("*");
	   else if(x==z)
	    System.out.println("&");
	   else
	    System.out.println("$");
	       
	    //respuesta: *



	}
}
