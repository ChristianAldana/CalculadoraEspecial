/*Christian Eduardo Aldana Sosa */

package calculadoraespecial1;

import java.util.Scanner;

public class CALCULADORAESPECIAL1 {

    //ZONA DE ATRIBUTOS
    
    //ATRIBUTOS DE SENO Y COSENO
   double Seno, Coseno, Tangente, Raiz;
   double Num_001;
    
   
    public void Entrada_NumeroEspecial (){
        Scanner Entrada_NumeroEspecial1 = new Scanner (System.in);
        System.out.println ("********************************************");
        System.out.println ("Bienvenido a la calculadora con metodos math");
        System.out.println ("********************************************");
        System.out.println ("Ingrese un digito para realizar el calculo");
        Num_001 = Entrada_NumeroEspecial1.nextDouble ();
    }
        public void CALCULO_SENO () { //PRIMER METODO
            Seno = Math.sin (Num_001);
    } 
        public void CALCULO_COSENO1 (){ //SEGUNDO METODO
            Coseno = Math.cos (Num_001);
    }
        public void CALCULO_TANGENTE (){ //TERCER METODO
            Tangente = Math.tan (Num_001);
    }
       
        public void RESULT_END001 (){
            System.out.println ("********************************************");
            System.out.println ("El seno de " + Num_001 + " es: " + Seno );
            System.out.println ("El Coseno de " + Num_001 + " es: " + Coseno );
            System.out.println ("La tangente de " + Num_001 + " es: " + Tangente );

        }   
}
      
    

