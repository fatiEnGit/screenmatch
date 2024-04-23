import java.util.Scanner;


 public class Main {
    public static void main(String[] args) {

        Scanner datosDePelicula = new Scanner(System.in);
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = datosDePelicula.nextLine();

        System.out.println(miPelicula.nombre);

        miPelicula.muestraNombre(miPelicula.nombre);

    }
}