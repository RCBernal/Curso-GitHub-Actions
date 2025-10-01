import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Vamos a obtener la variable para el entorno de Github
         String nombre= Optional.ofNullable(System.getenv("USERNAME")).orElse("DefaultUser");
        String language= Optional.ofNullable(System.getenv("LANGUAGE")).orElse("Default");
        System.out.println("Hola ->" + nombre + " desde HitHub, tu lenguaje favorito es : " + language);

        }
    }
