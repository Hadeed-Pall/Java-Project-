import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	/**creation of given variables**/
	private int cityCount;
	private City[] cityArray;
	private CompressedArray array;
	
	/**@param Program takes in a string and boolean **/
	public Program(String file,boolean showMap) {
		
		this.cityCount = 0;
	/**Initialize cityArray with 3 cells**/
		this.cityArray= new City[3];
	/**Create an object of MyFileReader or use your own code to read in a text file, and
load in the file with the given name**/
		MyFileReader oMyFileReader= new MyFileReader(file);
		oMyFileReader.readString();
		/**ensures there is data to read**/
		while (!oMyFileReader.endOfFile()) {
			String cityName= oMyFileReader.readString();
			int x= oMyFileReader.readInt();
			int y= oMyFileReader.readInt();
			
			City city= new City(cityName, x, y);
			if(this.cityCount==this.cityArray.length) {
				this.expandCapacity();
			}
			this.cityArray[this.cityCount]=city;
			/** inc value of cityCount**/
			this.cityCount++;
		
	}
		/**If the boolean (showMap) is true, it will create a Map object and call addCity() on
the Map object for each city in the cityArray. This will add the marker icons to the
map for each city**/
		if(showMap) {
			Map display = new Map();
			for (int i=0; i<this.cityCount; i++) {
				display.addCity(this.cityArray[i]);
			}
		}
	}
	
	/**Method City gets the value of city Array**/
	public City[] getCityArray() {
		return cityArray;
	}
	/** expands the Capacity**/
	private void expandCapacity() {
		City[] newArray= new City[cityArray.length + 3];
		for (int i= 0; i<cityArray.length; i++)
			newArray[i]= cityArray[i];
		cityArray=newArray;
		}
	/** used to calc dist between cities **/
	public double distBetweenCities(City city1, City city2) {
		double nn= Math.abs(city2.getY()-city1.getY());
		double mm= Math.abs(city2.getX()-city1.getX());
		return Math.hypot(nn, mm);
		
	}
	/** method used to compare dist between cities **/

	public void compareDistances() {
	double[][] CityArraytwo = new double[this.cityCount][this.cityCount];
	for(int i =0; i< this.cityCount; i++) {
		for(int j=0; j<this.cityCount; j++) {
			CityArraytwo[i][j]= distBetweenCities(this.cityArray[i],this.cityArray[j]);
			
		}
	}
	this.array= new CompressedArray(CityArraytwo);
	
	}
	public CompressedArray getArray() {
		
		/**@return returns array value **/
		return array;
	}
	}
	
	
	



