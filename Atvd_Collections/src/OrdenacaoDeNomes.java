import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoDeNomes {
    public static void main(String[] args) {
        // Criar um Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite os nomes separados por vírgula
        System.out.println("Digite os nomes separados por vírgula:");
        String input = scanner.nextLine();

        // Fechar o scanner, pois não precisaremos mais dele
        scanner.close();

        // Separar os nomes usando a vírgula como delimitador
        String[] nomes = input.split(",");

        // Criar uma lista para armazenar os nomes
        List<String> listaNomes = new ArrayList<>();

        // Adicionar os nomes à lista
        for (String nome : nomes) {
            listaNomes.add(nome.trim()); // Trim para remover espaços em branco extras
        }

        // Ordenar a lista de nomes
        Collections.sort(listaNomes);

        // Imprimir os nomes ordenados no console
        System.out.println("Nomes ordenados:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
