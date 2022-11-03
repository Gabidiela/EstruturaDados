import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Para o exemplo vamos criar um conjunto que representa uma sacola de frutas");
        System.out.println("-------------------------------------------------");
        //Criando o conjunto sacolaFrutas
        Set<String> sacolaFrutas = new HashSet<>();

        System.out.println("Inserindo Nomes para Frutas que entrarão na sacola");
        sacolaFrutas.add("Maçã");
        sacolaFrutas.add("Goiaba");
        sacolaFrutas.add("Laranja");
        sacolaFrutas.add("Uva");
        sacolaFrutas.add("Abacaxi");
        sacolaFrutas.add("Pêra");
        sacolaFrutas.add("Tomate");

        System.out.println(sacolaFrutas);
        System.out.println("-------------------------------------------------");

    }

}