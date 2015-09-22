/**
 * 
 */

/**
 * @author Usman Hatela
 *
 */
public class Person {
	private   String _gender;
	private  String _name;
	private int _age;
	
	
	

	// PROPERTIES++++++++++++++++++++++++++++++++
	public String getGender() {
		return this._gender;
	}

	public void setGender(String gender) {
		this._gender = gender;
	}
	public String getName() {
		return this._name;
	}

	public void setName(String name) {
		this._name = name;
	}
	

	// CONSTRUCTOR++++++++++++++++++++++++++++++++
	public Person(int age)
	{
		this._age = age;
	}
	
	public void runs()
	{
		System.out.printf("%s Runs", this._name);
	}
		}


