import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Deserialization: 
		//1. Declare your object, but do not instantiate
		//2. Add import java.io.Serializable to your class
		//3. FileInputStream FileIn = new FileInputStream(file path)
		//4. ObjectInputStream in = new ObjectInputStream(FileIn)
		//5. objectName = (Class) in.readObject();
		//6. in.close(); fileIn.close();
		
		NewTaxForCounties tax = null;
		FileInputStream fileIn = new FileInputStream("/Users/son/eclipse/java-2020-12/Serialier/FeeTables.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		tax = (NewTaxForCounties) in.readObject();
		in.close();
		fileIn.close();
		
		//SimpleDateFormat = new SimpleDateFormat();
		//second line
		//third line
		System.out.println("Read back Objects from Serialization File: ");
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("County Name: " + tax.countyName);
		System.out.println("City Name: " + tax.cityName);
		System.out.println("Secret Password: " + tax.secretPassword);
		System.out.println("Amount Increase: " + "$"+tax.amountIncrease);
		
		System.out.println("___________________________________________");
		tax.showTaxInfo();

	}

}
