package CoreJava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {
	String Name;
	int rollno,marks;
	Student() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 Name=br.readLine();
		 rollno=Integer.parseInt(br.readLine());
		 marks=Integer.parseInt(br.readLine());
	}
	void display() {
		System.out.println("name is  " + Name + "Roll no. is "+ rollno +"marks is "+ marks );
	}

	public static void main(String[] args) throws IOException {
		Student b1=new Student();
		Student b2=new Student();
   b1.display();
   b2.display();
	}

}
