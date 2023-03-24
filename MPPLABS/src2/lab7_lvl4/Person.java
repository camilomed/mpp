package lab7_lvl4;

public class Person  implements IPerson{
	
	private String name;
	private String phone;
	private int age;
	public Person(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	@Override
	public void myAbstract() {
		// TODO Auto-generated method stub
		System.out.println("Overrided myAbstract method");
		
	}
	
	

}
