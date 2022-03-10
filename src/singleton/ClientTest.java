package singleton;

public class ClientTest {

	public static void main(String[] arg) {
		EagerInitization eg1 = EagerInitization.getInstance();
		eg1.setName("John");
		System.out.println(eg1.getName());
		EagerInitization eg2 = EagerInitization.getInstance();
		System.out.println(eg2.getName());
	}
}