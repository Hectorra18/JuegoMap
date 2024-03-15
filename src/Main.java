import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static ArrayList<Ubicacion> ubicaciones = new ArrayList<>();


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Ubicacion clase = new Ubicacion(0, "Estás sentado en la clase de programación");
        Ubicacion montanya = new Ubicacion(1, "Estás en la cima de una montaña");
        Ubicacion playa = new Ubicacion(2, "Estás bañándote en la playa");
        Ubicacion edificio = new Ubicacion(3, "Estás dentro de un edificio muy alto");
        Ubicacion puente = new Ubicacion(4, "Estás de pie en un puente");
        Ubicacion bosque = new Ubicacion(5, "Estás en un bosque");

        ubicaciones.add(0, clase);
        ubicaciones.add(1, montanya);
        ubicaciones.add(2, playa);
        ubicaciones.add(3, edificio);
        ubicaciones.add(4, puente);
        ubicaciones.add(5, bosque);


        ubicaciones.get(1).addExit("N",5);
        ubicaciones.get(1).addExit("S",4);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("Q", 0);

        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("Q", 0);

        ubicaciones.get(3).addExit("O", 1);
        ubicaciones.get(3).addExit("Q", 0);

        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("O", 2);
        ubicaciones.get(4).addExit("Q", 0);

        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("S", 1);
        ubicaciones.get(5).addExit("Q", 0);

        int num=1;
        String opcion;
        do {
            System.out.println(ubicaciones.get(num).getDescripcion());
            for(Map.Entry<String, Integer> entry: ubicaciones.get(num).getMapa().entrySet()){
                System.out.print(entry.getKey() + " ");
            }
            System.out.println();
            System.out.println("Ingrese la opción: ");
            opcion = scan.next();

            if(!opcion.equalsIgnoreCase("Q")){
                for(Map.Entry<String, Integer> entry: ubicaciones.get(num).getMapa().entrySet()){
                    if(opcion.equalsIgnoreCase(entry.getKey())){
                        num = entry.getValue();
                    }
                }
            }else
                System.out.println("Adiós");

        } while (!opcion.equalsIgnoreCase("q"));

   }

}
