
public class Animal {
	private String name;
	private int age;
	protected int amtMoved;
	protected int amtEaten;
	
	public Animal() {
		name = "";
		age = 0;
		amtMoved = 0;
		amtEaten = 0;
		System.out.println("In parent default constructor");
	}
	
	public Animal(String nName, int nAge) {
		name = nName;
		age = nAge;
		amtMoved = 0;
		amtEaten = 0;
		System.out.println("In parent alternate constructor.");
	}
	
	public void setName(String nName) {
		name = nName;
	}
	
	public void setAge(int nAge) {
		age = nAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getMotion() {
		return amtMoved;
	}
	
	public int getConsumption() {
		return amtEaten;
	}
	
	public void move() {
		amtMoved += 5;
	}
	
	public void eat() {
		amtEaten += 5;
	}
	
	@Override
	public String toString() {
		String toRet = "Name: " + name + "\n" + "Age: " + age;
		return toRet;
	}
	
	public static void main(String[] args) {
		Animal a = new Animal("Jimmy", 10);
		System.out.println(a);
	}
}
