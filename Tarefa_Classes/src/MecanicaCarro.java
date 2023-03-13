public class MecanicaCarro {

    /* declarando variaveis */
    public int marchas = 5;
    public int acentos = 5;
    public String modelo;


    /* inicio getters e setters */
    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }


    public int getAcentos() {
        return acentos;
    }

    public void setAcentos(int acentos) {
        this.acentos = acentos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   /*fim de getters e setters*/


    /*inicio do metodo*/
    public String retornarModelo(){
        return "Nissan R32 GT-R";
    }
    // fim dos metodo


}
