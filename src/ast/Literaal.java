package ast;

import java.util.Arrays;
import java.util.List;

public class Literaal<T> extends Avaldis {
    protected final T väärtus;

    public Literaal(T väärtus) {
        this.väärtus = väärtus;
    }

    @Override
    public List<Object> getChildren() {
        return Arrays.asList((Object) väärtus);
    }

    public T getVäärtus() {
        return väärtus;
    }
}
