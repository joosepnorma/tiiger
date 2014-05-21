package ast;

import java.util.Arrays;
import java.util.List;

public class KuiLause extends Lause {
    private final Avaldis tingimus;
    private final LauseteJada sisu;

    public KuiLause(Avaldis tingimus, LauseteJada sisu) {
        this.tingimus = tingimus;
        this.sisu = sisu;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object) tingimus, sisu);
    }

    public Avaldis getTingimus() {
        return tingimus;
    }

    public LauseteJada getSisu() {
        return sisu;
    }
}
