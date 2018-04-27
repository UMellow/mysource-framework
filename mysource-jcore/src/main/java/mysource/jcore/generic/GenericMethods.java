package mysource.jcore.generic;

public class GenericMethods {

	public <T> void print(T t) {
		System.out.println(t.getClass().getName());
	}
	
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.print(1);
		gm.print(1.0);
		gm.print(1f);
		gm.print("1");
		gm.print('c');
	}
}
