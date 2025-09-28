import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Vamos a obtener la variable para el entorno de Github
        String nombre= Optional.ofNullable(System.getenv("USERNAME")).orElse("DefaultUser");
        System.out.println("Hola ->" + nombre + " desde HitHub");

        }
    }

