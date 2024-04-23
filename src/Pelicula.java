//Clase modelo de atributos que todas las películas tienen en común
public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;

    void muestraNombre(String nombre)
    {
        System.out.println(nombre);
    }
}
