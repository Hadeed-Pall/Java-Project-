
import java.util.Arrays;


public class CompressedArray {
	/** variables created with given info**/
	private int origArraySize;
	private double[] array;
	int x = 0;
	double y;	
	/** method - takes in 2d double array,adds values in order**/
	public CompressedArray(double[][]newArray) {
		int len = newArray.length;
		int Arrayslength = (len*(len-1))/2;
		this.origArraySize= len;
		int pos = 0;
		this.array= new double[Arrayslength];
		for (int i = 0; i<newArray.length; i++ ) {
			for(int j = 0; j< newArray.length;j++) {
				if(i>j) {
					this.array[pos] = newArray[i][j];
					/** inc value of pos**/
					pos++;
				}
			}
		}
		
		
		
			}
			


	
	/** Getter method - gets the array.length **/
	public int getLength() {
		return array.length;
	}
	/** Getter method- gets the array value at x **/
	public double getElement(int x) {
		return array[x];
	}
	@Override
	/** boolean created to check equality between the two CompressedArray objects*/
	public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final CompressedArray other = (CompressedArray) o;
        if (this.origArraySize != other.origArraySize) {
            return false;
        }
        if (!Arrays.equals(this.array, other.array)) {
            return false;
        }
        return true;
    }
	/**Used to print out given info**/
	public String toString() {
		String t = "";
		t= t+("\n");
		int s = 1;
		int x = 1;
		for(int i= 0; i<array.length;i++) {
			if (s==x) {
				t= t+(String.format("%8.2f", array[i]));
				t= t+("\n");
				x++;
				s=1;
			}
			else {
				t=t+(String.format("%8.2f", array[i]));
				s++;
			}
		}
		return t;
	
		
	}
}