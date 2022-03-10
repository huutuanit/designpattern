package singleton;

public class LazyInitization {

	private static LazyInitization instance;
	
	private LazyInitization() {
		
	}
	
	public static LazyInitization getInstance() {
		if (instance == null) {
			instance = new LazyInitization();
		}
		return instance;
	}
}
