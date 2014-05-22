package ast;

import java.util.ArrayList;
import java.util.List;

public class Programm extends AstNode {
	private final List<LauseteJada> lauseteJadad;

	public Programm(List<LauseteJada> lauseteJadad) {
		this.lauseteJadad = lauseteJadad;
	}

	@Override
	public List<Object> getChildren() {
		return new ArrayList<Object>(lauseteJadad);
	}
}
