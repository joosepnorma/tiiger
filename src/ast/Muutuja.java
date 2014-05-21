package ast;

import java.util.Arrays;
import java.util.List;

public class Muutuja extends Avaldis {
    private final String nimi;

    public Muutuja(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object) nimi);
    }

    public String getNimi() {
        return nimi;
    }
}
