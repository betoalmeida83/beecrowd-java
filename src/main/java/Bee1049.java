import java.util.Scanner;

public class Bee1049 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe se o animal é vertebrado ou invertebrado: ");
        String tipoAnimal = input.next();
        System.out.println("Informe o grupo que ele pertence: ");
        String grupoAnimal = input.next();
        System.out.println("Informe o habito alimentar do animal: ");
        String habitoAlimentar = input.next();

        if (tipoAnimal.equals("vertebrado")) {
            if (grupoAnimal.equals("ave")){
                if (habitoAlimentar.equals("carnivoro"))
                    System.out.println("aguia");
            }
        }

        if (tipoAnimal.equals("vertebrado")) {
            if (grupoAnimal.equals("ave")){
                if (habitoAlimentar.equals("onivoro"))
                    System.out.println("pomba");
            }
        }

        if (tipoAnimal.equals("vertebrado")) {
            if (grupoAnimal.equals("mamifero")){
                if (habitoAlimentar.equals("onivoro"))
                    System.out.println("homem");
            }
        }

        if (tipoAnimal.equals("vertebrado")) {
            if (grupoAnimal.equals("mamifero")){
                if (habitoAlimentar.equals("herbivoro"))
                    System.out.println("vaca");
            }
        }

        if (tipoAnimal.equals("invertebrado")) {
            if (grupoAnimal.equals("inseto")){
                if (habitoAlimentar.equals("hematofago"))
                    System.out.println("pulga");
            }
        }

        if (tipoAnimal.equals("invertebrado")) {
            if (grupoAnimal.equals("inseto")){
                if (habitoAlimentar.equals("herbivoro"))
                    System.out.println("lagarta");
            }
        }

        if (tipoAnimal.equals("invertebrado")) {
            if (grupoAnimal.equals("anelideo")){
                if (habitoAlimentar.equals("hematofago"))
                    System.out.println("sanguessuga");
            }
        }

        if (tipoAnimal.equals("invertebrado")) {
            if (grupoAnimal.equals("anelideo")){
                if (habitoAlimentar.equals("onivoro"))
                    System.out.println("minhoca");
            }
        }

        input.close();

    }
}
