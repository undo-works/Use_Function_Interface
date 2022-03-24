import java.util.function.Function;

public class MyFunc implements Function<String, String> {

	@Override
	public String apply(String str) {
		return "function" + str;
	}

}
