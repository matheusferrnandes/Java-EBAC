import java.util.Scanner;
public class Main {
    static public void main (String[] args){

    Scanner scan=new Scanner(System.in);

     Numero n1 = new Numero();
      Numero n2 = new Numero();
       Numero res = new Numero();
        String opc = "Sim";

       while(opc.equals("sim")|| opc.equals("Sim")) {
           System.out.printf("%nDigite o primeiro valor: ");
           n1.setValor(scan.nextInt());

           System.out.printf("%nDigite o segundo valor: ");
           n2.setValor(scan.nextInt());

           res.setValor(n1.getValor() + n2.getValor());
           System.out.printf("%nO resultado da soma é: %d", res.getValor());

           System.out.printf("%nDeseja somar outro valor? %nDigite S para confirmar: ");
           opc = scan.next();
           System.out.printf("%n%n%n");

       }

    }
}