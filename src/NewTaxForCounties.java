
import java.io.Serializable;

@SuppressWarnings("serial")
public class NewTaxForCounties implements Serializable {
	
	//Just test this line only
	//Second line from GitHub
	String countyName;
	String cityName;
	String secretPassword;
	double amountIncrease;
	
	
	public void showTaxInfo() {
		System.out.println("Counties and Cities listed inside the FeeTables.ser \n"
							+ "will be affected by Mid of July 15, 2021");
	}
}
