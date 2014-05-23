package evaluator;

import ast.Avaldis;
import ast.VanaFunktsioon;

import java.util.List;

public class BuiltInMethods extends Evaluator {
	public static void täidaFunktsioon(String fNimi, List<Avaldis> params) {
		switch(fNimi) {
			case "+":
				;
		}
	}

	public static void liitmine(VanaFunktsioon f) {
		List<Avaldis> params = f.getParameetrid();

		int a;

	}
}
