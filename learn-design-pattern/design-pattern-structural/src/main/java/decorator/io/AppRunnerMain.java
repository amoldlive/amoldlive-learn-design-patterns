package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppRunnerMain {
	public static void main(String[] args) {
		int c = 0;

		try (LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(
				new BufferedInputStream(new FileInputStream("test.txt")))) {

			while ((c = lowerCaseInputStream.read()) >= 0) {
					//additional code goes here
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
