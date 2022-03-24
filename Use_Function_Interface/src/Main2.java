import java.util.function.Function;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str =  new Function<String, String>() {
			public String apply(String t) {
				return "Hello" + t;
			}
		}.apply("World");
		System.out.print(str);
	}

}
