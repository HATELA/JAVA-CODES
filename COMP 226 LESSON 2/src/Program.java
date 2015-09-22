
public class Program {
	public static Person person; //reference to the person class 

	public static void main(String[] args) {
		System.out.println("program started");
		
		person = new Person(18);

		person.setName("Hatela");
		System.out.println();
	}

}
