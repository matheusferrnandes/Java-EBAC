package br.com.factory;

public class Demo {

    public static void main (String[]args){

        Customer cliente = new Customer("A",false);
        Factory factory = getFactory(cliente);
        factory.create(cliente.gradeRequest());
    }

    private static Factory getFactory(Customer cliente) {
        if(cliente.hasCompanyContract()){
            return new ContratosFactory();
        }else{
            return new SemContratoFactory();
        }
    }


}
