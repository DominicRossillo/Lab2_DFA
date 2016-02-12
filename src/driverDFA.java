import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class driverDFA {
	
	 public static void main(String[] args) {
		 ManWolf ManWolf = new ManWolf();
		 ManWolf.reset();
		 ManWolf.process(args);
		 if(ManWolf.accepted() == true){
			 System.out.println("This statement works for the problem");
		 }
		 else System.out.println("This Statement does not work for the problem");
	 	}
	 
}
