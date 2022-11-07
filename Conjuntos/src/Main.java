
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Para o exemplo vamos criar um conjunto que representa uma sacola de frutas");
        System.out.println("-------------------------------------------------");
        //Criando o conjunto sacolaFrutas usando HashSet
        HashSet<String> sacolaFrutas = new HashSet<>();

        System.out.println("Inserindo Nomes para Frutas que entrarão na sacola");
        sacolaFrutas.add("Maçã");
        sacolaFrutas.add("Goiaba");
        sacolaFrutas.add("Laranja");
        sacolaFrutas.add("Uva");
        sacolaFrutas.add("Abacaxi");
        sacolaFrutas.add("Pêra");
        sacolaFrutas.add("Tomate");
        sacolaFrutas.add("Maçã");

        System.out.println(sacolaFrutas);

        System.out.println("Removendo item 'Laranja' da sacola");
        sacolaFrutas.remove("Laranja");

        System.out.println(sacolaFrutas);
        System.out.println("O tamanho do conjunto é: " + sacolaFrutas.size());
        System.out.println("-------------------------------------------------");




        System.out.println("-------------------------------------------------");
        TreeSet<Integer> OrdenaNumero = new TreeSet<>();

        System.out.println("Inserindo Números para o Conjunto ordenado!");
        OrdenaNumero.add(13);
        OrdenaNumero.add(18);
        OrdenaNumero.add(47);
        OrdenaNumero.add(3);
        OrdenaNumero.add(89);
        OrdenaNumero.add(30);
        OrdenaNumero.add(19);

        System.out.println(OrdenaNumero);

        System.out.println("Removendo item '3' do conjunto");
        OrdenaNumero.remove(3);

        System.out.println(OrdenaNumero);
        System.out.println("O tamanho do conjunto é: " + OrdenaNumero.size());
        System.out.println("-------------------------------------------------");




        System.out.println("-------------------------------------------------");
        LinkedHashSet<Double> OrdenaInsercao = new LinkedHashSet<>();

        System.out.println("Inserindo Números para o Conjunto ordenado conforme inserido");
        OrdenaInsercao.add(1.3);
        OrdenaInsercao.add(18.2);
        OrdenaInsercao.add(4.7);
        OrdenaInsercao.add(0.3);
        OrdenaInsercao.add(89.7);
        OrdenaInsercao.add(30.4);
        OrdenaInsercao.add(19.6);

        System.out.println(OrdenaInsercao);
        System.out.println("Removendo item '89.7' da sacola");
        OrdenaInsercao.remove(89.7);

        System.out.println(OrdenaInsercao);
        System.out.println("O tamanho do conjunto é: " + OrdenaInsercao.size());
        System.out.println("-------------------------------------------------");

    }

}