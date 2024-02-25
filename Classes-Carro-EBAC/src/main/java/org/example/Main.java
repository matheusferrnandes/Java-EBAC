import java.util.ArrayList;
import java.util.List;

// Definição da classe Carro
class Carro {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}

// Classe para um tipo específico de carro
class GM extends Carro {
    public GM() {
        super("GM");
    }
}

// Classe para outro tipo específico de carro
class Honda extends Carro {
    public Honda() {
        super("Honda");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando a lista de carros
        List<Carro> listaCarros = new ArrayList<>();

        // Instanciando objetos de diferentes tipos de carros e adicionando à lista
        listaCarros.add(new GM());
        listaCarros.add(new Honda());

        // Iterando sobre a lista e imprimindo as marcas dos carros
        for (Carro carro : listaCarros) {
            System.out.println("Marca do Carro: " + carro.getMarca());
        }
    }
}
