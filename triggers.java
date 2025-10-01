import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Vamos a obtener la variable para el entorno de Github
        String username = System.getenv("USERNAME");
        String language = System.getenv("LANGUAGE");

        System.out.println("Usuario: " + username);
        System.out.println("Lenguaje: " + language);

        }
    }
