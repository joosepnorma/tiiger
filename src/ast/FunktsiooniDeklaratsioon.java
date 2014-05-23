package ast;

import java.util.ArrayList;
import java.util.List;

public class FunktsiooniDeklaratsioon extends Lause {
	private final String funktsiooniNimi;
	private final List<String> parameetrid;
	private final LauseteJada sisu;

	public FunktsiooniDeklaratsioon(String funktsiooniNimi, List<String> parameetrid, LauseteJada sisu) {
		this.funktsiooniNimi = funktsiooniNimi;
		this.parameetrid = parameetrid;
		this.sisu = sisu;
	}

	@Override
	public List<Object> getChildren() {
		List<Object> list = new ArrayList<Object>();
		list.add(funktsiooniNimi);
		list.add(parameetrid);
		list.add(sisu);
		return list;
	}

	public String getFunktsiooniNimi() {
		return funktsiooniNimi;
	}

	public List<String> getParameetrid() {
		return parameetrid;
	}

	public LauseteJada getSisu() {
		return sisu;
	}
}
