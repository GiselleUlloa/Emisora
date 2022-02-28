/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emisoragiselle;

import java.util.ArrayList;
import java.util.Scanner;




/**
 *
 * @author Gisselle De La Rosa
 */
public class Emisoragiselle {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        // utilizando el objeto entrada obtendremos lo que el usuario ingrese por consola.
        Scanner entrada = new Scanner(System.in);
        // Creamos la lista en dónde serán almacenados las  emisoras :
               ArrayList<emisoras> listaemisoras = new ArrayList<>();
        // El while será ejecutado hasta que salir sea TRUE.
           boolean salir = false;
        while (!salir) {  
        // Le indicamos al usuario cuales son sus opciones:
         System.out.println(" ingrsar ala  emisora con us SISTEMA CON SUS DATOS PERSONALES  ");
              System.out.println(" 1 -ingresar canal  ");
            System.out.println(" 2 -ingresar password  ");
            System.out.println(" 3 -ingrese pais   ");
           System.out.println(" 4 -ingrese descripcion de programa   ");
            System.out.println(" 5 -ingresar marca ");
         
            System.out.println(" 0 - ingresar Salir ");

            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = Integer.parseInt(entrada.nextLine());
            // Según el número que el usuario ingreso en la consola se ejecutará el "case" correspondiente.
           switch(opcion) {
                case 1: // "case" Ingresar nueva  emisora 
                    // Instanciamos una emisora o vacio (Sin atributos)
                    emisoragiselle a = new emisora ();
                    System.out.println("Ingrese el  canal :");
                    // Obtenemos la canal que el usuario escribió y la guardamos en el emisora 
                    a.setcanal(entrada.nextLine());
                    System.out.println("Ingrese la password : ");
                    // De la misma forma, guardamos la contraseña
                    a.setpassword(entrada.nextLine());
                    System.out.println("Ingrese pais : ");
                    // guardamos el pais que el usuario ingresó
                    a.setpais(entrada.nextLine());
                    System.out.println("ingrese descripcion ");
                    a.setdescrición(entrada.nextLine());
                    // Y guardamos la despcripcion 
                    System.out.println("ingresar la marca ");
                    a.setpatrocinador(Integer.parseInt(entrada.nextLine()));

                  // Este paso es fundamental, tomamos  la emisora  (En este caso definido con la variable a),
                    // Y lo guardamos en la lista de emisoras  utilizando el método de la lista .add(a);
              listaemisoras.add(a);
              
                                  // Le avisamos al usuario del emisora creada 
              
               System.out.println("emisora creada : ");
                    System.out.println("bandafmbandaam " + a.getbandafmbandaam());
                    System.out.println("contraseña " +a.getcontraseña());
                    System.out.println("numciudades " + a.getnumciudades());
                    System.out.println(" descripción: " + a.get descripción());
                    

                 break ;
                 
                case 2 :  // Listar todas  las  emisoras   en la lista:
               for(int i = 0; i < listaemisoras.size(); i++){ // listaemisoras .size() Permite ver cuantos elementos hay guardados.
              System.out.println("emisoras: " + (i + 1));
                          // Para obtener un elemento de la lista, utilizamos .get():
               emisora auto =  listaemisoras.get(i); 

 System.out.println("bandafmbandaam " + auto.getbandafmbandaam());
 System.out.println("contraseña " +auto.getcontraseña());
 System.out.println("numciudades " + auto.getnumciudades());
 System.out.println(" descripción: " + auto.get descripción());
    }
               
    break ;
   case 3 : //agregar las emisoras 
   System.out.println("ingresar las  emisoras a eliminar y  ponerlas ");
   String  bandafmbandaam  = entrada.nextLine(); 
   for (int i = 0; i < listaemisoras.size(); i++) {
    emisora auto= listaemisoras.get(i);
             String contraseña;
    
    
     if (contraseña.equals(auto.getcontraseña()))  {
    
     listaemisoras.remove(i);
     System.out.println("emisora eliminadoo agregada ");
      
         
   }  
  else  {
  System.out.println("la emisora no se elimina ");
     } 
    
}
           
 break ;
   case 4 :   // modificar emisora 
  System.out.println(" Ingrese la placa del vehiculo a modificar");
 contraseña =entrada.nextLine();
  for (int  i =0 ; < listaemisoras.size(); i++   ) {
       emisora auto = listaemisoras.get(i);
       if(contraseña.equals(auto.getcontraseña())) {
        System.out.println("bandafmbandaam"+auto.getbandafmbandaam());
        System.out.println("contraseña "+auto.getcontraseña());
        System.out.println("Ingrese nueva  banda am o fm: ");
       String bandafmbandafm   = entrada.nextLine();
       System.out.println("Ingrese nueva contraseña: ");
       String contraseña = entrada.nextLine();;
       System.out.println("modificacion exitosa");
       
       auto.setbandafmbandaam(bandafmbandaam);
       auto.setcontraseña(contraseña);
          
       
       }
       else {
       System.out.println("la emisora no existe ");

       }
       
   }
     
  break ;
   case 0 :// ingresar  salir //
     salir = true ;
     System.out.println("Saliendo del programa");
     
     break ;
     default: // En caso de que el numero ingresado no corresponda a ningún "case"
                    System.out.println("Opcion invalida!!!!!!!");
     

  
        }
    }
}
}