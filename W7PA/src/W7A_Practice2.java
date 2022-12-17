import java.io.*;

public class W7A_Practice2 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		try {
			PrintWriter writer = new PrintWriter(System.out);
			writer.write("10" + 6);
			writer.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
