import java.util.Scanner;
import java.io.Reader;
import java.io.FileReader;
public class main {

	public static void main(String[] args) {
		Tree t = new Tree();
		String filename = "src/raven.txt";
		/*t.insert("data");
		t.insert("structures");
		t.insert("file");
		t.insert("analysis");
		t.insert("file");
		t.insert("data");
		t.insert("data");*/
		
		
		
		try{
			Scanner s = new Scanner(new FileReader(filename));
			while(s.hasNext()){
				t.insert(s.next());
			}
			s.close();
		}
		catch(Exception e){
			System.err.format("Exception occurred trying to read '%s'.", filename);
		    e.printStackTrace();
		}
		t.inorder();

	}

}
