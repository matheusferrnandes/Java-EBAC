import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        Double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        Double nota2 = input.nextDouble();

        System.out.print("Digite a teceira  nota: ");
        Double nota3 = input.nextDouble();

        System.out.print("Digite a quarta nota: ");
        Double nota4 = input.nextDouble();

        double soma = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("Sua media é: " + soma);
    }

}

