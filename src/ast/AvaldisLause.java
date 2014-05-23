package ast;

import java.util.Arrays;
import java.util.List;

public class AvaldisLause extends Lause {
	private final Avaldis avaldis;

	public AvaldisLause(Avaldis avaldis) {
		this.avaldis = avaldis;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)avaldis);
	}
}
