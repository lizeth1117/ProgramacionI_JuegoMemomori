package proyecto_2;

import java.util.Random;

public class JuegoMemori {

public static  UsuarioContra jugador1, jugador2; // variables usuario que almacen a user1 y user2

// genera un arreglo de 16 numeros aleatorios de 1-8 donde cada numero se repite 2 veces
// se usara posteriormente para asignar las 8 imagenes en el juego.
public int []getCardNumbers(){  

   int[] numbers = new int[16];
   int count = 0; 
   
   while(count<16){
   Random r = new Random(); 
   int na = r.nextInt(8)+1;   
   int nvr =0; 
   
       for (int i = 0; i < 16; i++) {
           if(numbers[i]==na){
           nvr++; 
           }
       }
   if(nvr<2){
   numbers[count]=na;
   count++;
   }
   
   }
  return numbers; 
}



 public  UsuarioContra getJugador1() {
        return jugador1;
    }

    public void setJugador1(UsuarioContra jugador1) {
        this.jugador1 = jugador1;
    }

    public UsuarioContra getJugador2() {
        return jugador2;
    }

    public void setJugador2(UsuarioContra jugador2) {
        this.jugador2 = jugador2;
    }

 

   

}