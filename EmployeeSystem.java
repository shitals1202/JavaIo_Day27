import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EmployeeSystem{
	
	static int Id;
	static String username;
	static long salary;
	static ArrayList<File> empdata = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static File file;
	
	static void showUser() throws IOException{
		System.out.println("Enter your Id here: ");
		Id = sc.nextInt();
		System.out.println("Your name : ");
		userName = sc.next();
		System.out.println("Enter your Salary:");
		salary = sc.nextLong();
		empdata.add(new File(Id, userName, salary));
		
		file = empdata.get(1);
		System.out.println(file.Id + " "+ file.userName +" " + file.salary);
		
		if (Files.exists(Paths.get("src\\default package\\filedemo.txt")))
			
		{
			Files.write(Paths.get("src\\default package\\\\filedemo.txt"), empdata.toString().getBytes());

		}
		{
			System.out.println("file not there");
		}
		int count = 0;
		for (int i = 0; i < empdata.lastIndexOf(empdata); i++) {
			count = count + 1;
			System.out.println(empdata);
			System.out.println("you have " + count + " employee entery ");
		}
	}
	
}