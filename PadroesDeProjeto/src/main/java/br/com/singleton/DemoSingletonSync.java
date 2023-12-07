package br.com.singleton;

public class DemoSingletonSync {

    private static DemoSingletonSync singleton;
    private String value;
    private DemoSingletonSync(String value){
        this.value = value;
    }

    public static synchronized DemoSingletonSync getInstance(String value){
        if(singleton == null){
            singleton = new DemoSingletonSync(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }


}
