package SerializationUtil;
import java.io.*;

import com.techlabs.model.Car;
public class Serial {
	



	    public static void serialize(Car car, String fileName) throws IOException {
	        try (FileOutputStream fileOut = new FileOutputStream(fileName);
	             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
	            out.writeObject(car);
	        }
	    }

	    public static Car deserialize(String fileName) throws IOException, ClassNotFoundException {
	        try (FileInputStream fileIn = new FileInputStream(fileName);
	             ObjectInputStream in = new ObjectInputStream(fileIn)) {
	            return (Car) in.readObject();
	        }
	    }
	}


