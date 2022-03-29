import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileClass {
	String fileName;

	public void addManager(ArrayList<Employee> list) {
		fileName = "managers.txt";

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);

			for (Employee s : list) {
				oos.writeObject(s);
				oos.flush();
			}
			System.out.println("Written to the file successfully!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}

	}
	public void readObject() {
		fileName = "managers.txt";
		FileInputStream fis = null;
		ObjectInputStream bis = null;
		boolean flag=true;
		try {
			fis = new FileInputStream(fileName);
			bis = new ObjectInputStream(fis);

			while(flag) {
			Employee s = (Employee) bis.readObject();
			if(s!=null)
				s.getDetails();
			else
				flag=false;
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found exception!!");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}
