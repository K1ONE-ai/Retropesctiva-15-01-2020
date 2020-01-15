import java.util.Scanner;
import java.util.ArrayList;

public class ListaFuncionario01<li> {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] StringArray = new String[]{"José", "josefa", "jerfferson", "carol"};

        ArrayList<String> listaDeFuncionarios = new ArrayList<>();

        listaDeFuncionarios.add("José");
        listaDeFuncionarios.add("josefa");
        listaDeFuncionarios.add("jerfferson");
        listaDeFuncionarios.add("carol");

        int contador = 0;
        for (String nomes : listaDeFuncionarios) {
            contador++;
            System.out.println(contador + ": " + nomes);
        }
        System.out.println("Você deseja remover alguém da lista");
        String nome = ler.nextLine();

        listaDeFuncionarios.remove(nome);

        int contado = 0;
        for (String nomes : listaDeFuncionarios) {
            contado++;
            System.out.println(contado + ": " + nomes);
        }
    }

}


