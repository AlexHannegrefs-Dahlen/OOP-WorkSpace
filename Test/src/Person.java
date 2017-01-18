
public class Person implements Comparable<Person>{
	private String name;
	
	public Person(){
		
	}
	
	public Person(String name){
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person arg0) {
		return this.getName().compareTo(arg0.getName());
	}
}
