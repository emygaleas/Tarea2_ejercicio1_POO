public class Jugador {
    //nombre, posición en el campo, edad y número de camiseta
    private String nombre;
    private String posicion;
    private Integer edad;
    private Integer camiseta;

    public Jugador(String nombre, String posicion, Integer edad, Integer camiseta){
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.camiseta = camiseta;
    }

    public void mostrar_informacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Posición en el campo: "+posicion);
        System.out.println("Edad: "+edad);
        System.out.println("Número de Camiseta: "+camiseta);
    }
}

