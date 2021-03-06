import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Traffic {

	public static void main(String[] args) {
		StreetLight light = new StreetLight();
		Driver d1 = new Driver();
		Driver d2 = new Driver();
		
		light.subscribe(d1);
		light.subscribe(d2 );
		
		keepAppOpen();
	}
	
	private static void keepAppOpen(){
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
