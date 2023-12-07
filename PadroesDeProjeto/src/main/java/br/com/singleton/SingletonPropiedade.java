package br.com.singleton;

public class SingletonPropiedade {

    private static SingletonPropiedade singleton;
    private String value;
    private SingletonPropiedade(String value){
        this.value = value;
    }

    public static SingletonPropiedade getInstance(String value){
        if(singleton == null){
            singleton = new SingletonPropiedade(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
