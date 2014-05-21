package ast;

import java.util.Arrays;
import java.util.List;

public class Omistamine extends Lause {
    private final String muutujaNimi;
    private final Avaldis avaldis;

    public Omistamine(String muutujaNimi, Avaldis avaldis) {
        this.muutujaNimi = muutujaNimi;
        this.avaldis = avaldis;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object) muutujaNimi, avaldis);
    }

    public String getMuutujaNimi() {
        return muutujaNimi;
    }

    public Avaldis getAvaldis() {
        return avaldis;
    }
}
