package builder;

public class House {

	private int walls;
	private int doors;
	private boolean hasPool;
	private boolean hasRoof;
	private String colors;

	public House(int walls, int doors, boolean hasPool, boolean hasRoof, String colors) {
		this.walls = walls;
		this.doors = doors;
		this.hasPool = hasPool;
		this.hasRoof = hasRoof;
		this.colors = colors;
	}

	public int getWalls() {
		return walls;
	}

	public int getDoors() {
		return doors;
	}

	public boolean isHasPool() {
		return hasPool;
	}

	public boolean isHasRoof() {
		return hasRoof;
	}

	public String getColors() {
		return colors;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
