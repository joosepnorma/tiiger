package ast;

import java.util.ArrayList;
import java.util.List;

public class Funktsioon extends Avaldis {
    private final String funktsiooniNimi;
    private final List<Avaldis> parameetrid;

    public Funktsioon(String funktsiooniNimi, List<Avaldis> parameetrid) {
        this.funktsiooniNimi = funktsiooniNimi;
        this.parameetrid = parameetrid;
    }

    @Override
    public List<Object> getChildren() {
        List<Object> list = new ArrayList<Object>();
        list.add(funktsiooniNimi);
        list.add(parameetrid);
        return list;
    }

    public String getFunktsiooniNimi() {
        return funktsiooniNimi;
    }

    public List<Avaldis> getParameetrid() {
        return parameetrid;
    }
}
