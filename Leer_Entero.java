import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Leer_Entero { 
  public static void main( String args[] ) throws IOException { 
    try { 
      BufferedReader entrada = 
        new BufferedReader(new InputStreamReader(System.in));   
 
      System.out.print( "Introduzca un numero: " );
      int num_1 = Integer.parseInt( entrada.readLine() ); 
 
     System.out.println(  num_1 );
    }
    catch(NumberFormatException ex){
    	System.out.println("NO ES UN NUMERO ENTERO");
    }
  } 
} 