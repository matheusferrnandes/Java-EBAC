import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrdenacaoDeNomesComGenero {
    public static void main(String[] args) {
        // Criar um Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite os nomes e gêneros separados por vírgula
        System.out.println("Digite os nomes e gêneros separados por vírgula (por exemplo, João,M; Maria,F):");
        String input = scanner.nextLine();

        // Fechar o scanner, pois não precisaremos mais dele
        scanner.close();

        // Separar os pares nome-gênero usando a vírgula como delimitador
        String[] nomeGeneroPares = input.split(",");

        // Criar um mapa para armazenar os nomes por gênero
        Map<String, List<String>> nomesPorGenero = new HashMap<>();

        // Adicionar os nomes aos grupos correspondentes
        for (String nomeGenero : nomeGeneroPares) {
            String[] partes = nomeGenero.split(";");
            String nome = partes[0].trim();
            String genero = partes[1].trim();

            // Verificar se o gênero é válido (M ou F)
            if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F")) {
                // Adicionar o nome ao grupo correspondente
                nomesPorGenero.computeIfAbsent(genero, k -> new ArrayList<>()).add(nome);
            } else {
                System.out.println("Gênero inválido para o nome: " + nome);
            }
        }

        // Ordenar os nomes em cada grupo
        for (List<String> nomes : nomesPorGenero.values()) {
            Collections.sort(nomes);
        }

        // Imprimir os nomes agrupados por gênero
        System.out.println("Nomes ordenados por gênero:");
        for (Map.Entry<String, List<String>> entry : nomesPorGenero.entrySet()) {
            String genero = entry.getKey();
            List<String> nomes = entry.getValue();

            System.out.println("Gênero " + genero + ":");
            for (String nome : nomes) {
                System.out.println("- " + nome);
            }
        }
    }
}
