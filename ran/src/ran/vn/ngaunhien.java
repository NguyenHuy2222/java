package ran.vn;
import java.util.Random;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ngaunhien {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(19900828);
		double value = generator.nextDouble() * 360.0;
		int code = (int) Math.floor(((Math.random() * 899999) + 100000));
		System.out.println("Code: "+code);
		
		
	}

}
