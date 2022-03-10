package singleton;

public class EagerInitization {
	private static final EagerInitization INSTANCE = new EagerInitization();

	private EagerInitization() {

	}

	public static EagerInitization getInstance() {
		return INSTANCE;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
