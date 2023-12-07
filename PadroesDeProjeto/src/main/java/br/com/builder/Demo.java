package br.com.builder;

public class Demo {

   public static void main (String []args){

       BurguerRestauranteDirector burguerRestaurant = new BurguerRestauranteDirector ();
       burguerRestaurant.setBuilder(new ChessBurguer());
       buildBurguer(burguerRestaurant);

       burguerRestaurant.setBuilder((new VeganBurguerBuilder()));
       buildBurguer(burguerRestaurant);

   }

    private static void buildBurguer(BurguerRestauranteDirector burguerRestaurant) {
       Burguer burguer = burguerRestaurant.buildBurguer();
       burguer.print();
    }


}
