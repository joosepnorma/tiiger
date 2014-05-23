package ast;

import java.util.ArrayList;
import java.util.List;

public class Hulk extends Avaldis {
	private final List<Avaldis> elemendid;

	public Hulk(List<Avaldis> elemendid) {
		this.elemendid = elemendid;
	}

	@Override
	public List<Object> getChildren() {
		return new ArrayList<Object>(elemendid);
	}

	public List<Avaldis> getElemendid() {
		return elemendid;
	}
}
