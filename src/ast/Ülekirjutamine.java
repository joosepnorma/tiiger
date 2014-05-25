package ast;

import java.util.Arrays;
import java.util.List;

public class Ülekirjutamine extends Lause {
	private final Avaldis ülekirjutatav;
	private final Avaldis uusVäärtus;

	public Ülekirjutamine(Avaldis ülekirjutatav, Avaldis uusVäärtus) {
		this.ülekirjutatav = ülekirjutatav;
		this.uusVäärtus = uusVäärtus;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object) ülekirjutatav, uusVäärtus);
	}

	public Avaldis getÜlekirjutatav() {
		return ülekirjutatav;
	}

	public Avaldis getUusVäärtus() {
		return uusVäärtus;
	}
}
