package ast;

import java.util.ArrayList;
import java.util.List;

public class LauseteJada extends Lause {
    private final List<Lause> laused;

    public LauseteJada(List<Lause> laused) {
        this.laused = laused;
    }

    @Override
    public List<Object> getChildren() {
        return new ArrayList<Object>(laused);
    }
}
