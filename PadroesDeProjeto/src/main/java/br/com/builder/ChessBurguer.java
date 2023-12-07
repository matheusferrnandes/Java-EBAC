package br.com.builder;

public class ChessBurguer extends BurguerBuilder{


    @Override
    public void buildBun() {
        burguer.setBun("White Beard");
    }

    @Override
    public void buildMeat() {
         burguer.setMeat("Beaf");
    }

    @Override
    public void buildSalad() {
           burguer.setSalad("Salad");
    }

    @Override
    public void buildCheese() {
          burguer.setChesse("American Cheese");
    }

    @Override
    public void buidlSouce() {
        burguer.setSouce("Hot Souce");
    }
}
