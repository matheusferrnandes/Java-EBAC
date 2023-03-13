public class Main {
    public static void main(String args[]) {

        System.out.println("Informações do Carro");
        System.out.println("--------------------");

        /*referenciando*/
        MecanicaCarro mecanicaCarro = new MecanicaCarro();

        /*chamando variavel de acentos*/
        System.out.println("Numero de Acentos:");
        mecanicaCarro.getAcentos();
        System.out.println(mecanicaCarro.getAcentos());
        System.out.println("--------------------");

        /*chamando variavel de marchas*/
        System.out.println("Numero de Marchas:");
        mecanicaCarro.getMarchas();
        System.out.println(mecanicaCarro.getMarchas());
        System.out.println("--------------------");

        /*chamando variavel do modelo*/
        System.out.println("Modelo do carro:");
        String info = mecanicaCarro.retornarModelo();
        System.out.println(info);
        System.out.println("--------------------");

    }
}