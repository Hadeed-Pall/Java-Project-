public class City {
	/** variables created for the  name, and values x and y **/
	private String name;
	private int x;
	private int y;
	private CityMarker marker;
		
	public City(String name, int x, int y) {
		/** variables created for the City class**/
		this.name=name;
		this.x=x;
		this.y=y;
		
	}
	/** Getter method- gets the name**/

	public String getName() {
		return name;
		}
	/**  Getter method- gets the x value**/
	public int getX() {
		return x;
		}
	/**  Getter method- gets the y value **/
	public int getY() {
		return y;
		}
	/**  Getter method- gets the marker value **/
	public CityMarker getMarker() {
		return marker;
		}
	/** Setter method - sets the name value**/
	public void setName (String name) {
		this.name = name;
		}
	/** Setter method- sets the x value **/
	public void setX (int x) {
		this.x = x;
		}
	/** Setter method- sets the y value **/

	public void setY (int y) {
		this.y = y;
		}
	/** Setter method- sets the Marker value **/
	public void setMarker(City Marker) {
		this.marker=marker;
		}
	/**Used to print out given info**/
		@Override
	public String toString() {
			return "City name: "+ name;
		
		
		
		
	
		
	}

}
