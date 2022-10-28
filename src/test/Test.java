
package test;

import static aritmetica.Aritmetica.division;
import excepciones.operacionExcepcion;

public class Test {
    public static void main(String [] args){
        
        //excepciones(); 
       
    }
    
    public static void excepciones(){
         int resultado = 0;
        
       /* try{
            resultado = division(10,0);
        }catch(Exception e){
            //Si ocurre alguna excepción
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());//muestra el msj concreto
        }*/
       
       try{
           resultado = division(10,0);
       }catch (operacionExcepcion e){
           System.out.println("Ocurrió una excepción del tipo OperacionExcepción");
           System.out.println(e.getMessage());
       }
       
       try{
           resultado = division(10, 0);
       }catch(Exception e){
           System.out.println("Ocurrió un error");
           e.printStackTrace(System.out); //Impresión automática del API Java
           System.out.println(e.getMessage());
       }finally{
           System.out.println("Siempre estoy!!");
       }
       
    }
}
