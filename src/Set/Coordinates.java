package Set;

public class Coordinates {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Coordinates [x=" + x + ", y=" + y + "]";
	}

	public Coordinates(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		return this.x + this.y;
	}

	@Override
	public boolean equals(Object o) {

		// If the object is compared with itself then return true
		if (o == this) {
			return true;
		}

		/*
		 * Check if o is an instance of Complex or not "null instanceof [type]" also
		 * returns false
		 */
		if (!(o instanceof Coordinates)) {

			return false;
		}

		// typecast o to Complex so that we can compare data members
		Coordinates c = (Coordinates) o;

		// Compare the data members and return accordingly
		return Double.compare(x, c.x) == 0 && Double.compare(y, c.y) == 0;
	}
}
