import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugador[] jugadores = new Jugador[3];

        jugadores[0] =new Jugador("Juan","defensa",30,5);
        jugadores[1]  =new Jugador("Ricardo", "defensa", 35,4);

        for (int i = 2; i < jugadores.length; i++) {

            System.out.println("Ingresar los datos del jugador: ");

            System.out.printf("Ingresa el nombre: ");
            String nombre = sc.nextLine();
            System.out.printf("Ingresa la posición en el campo: ");
            String posicion = sc.nextLine();
            System.out.printf("Ingresa la edad: ");
            Integer edad = sc.nextInt();
            System.out.printf("Ingresa el número de camiseta: ");
            Integer camiseta = sc.nextInt();
            sc.nextLine();
            jugadores[i] = new Jugador(nombre, posicion, edad, camiseta);
        }

        System.out.println("\nMostrando Información de Jugadores...");
        for (Jugador j : jugadores){
            j.mostrar_informacion();
        }
        System.out.println("Informacion mostrada correctamente :D");
        System.out.println("Probando commits");
    }
}
