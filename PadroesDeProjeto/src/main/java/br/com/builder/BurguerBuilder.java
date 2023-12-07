package br.com.builder;

public abstract class BurguerBuilder {

   Burguer burguer = new Burguer();

   abstract void buildBun();
   abstract void buildMeat();
   abstract void buildSalad();
   abstract void buildCheese();
   abstract void buidlSouce();

  Burguer build(){
      return burguer;
  }

}
