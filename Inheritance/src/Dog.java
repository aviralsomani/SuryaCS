
public class Dog extends Animal {
	public String breed;
	public String ownerName;
	
	public Dog() {
		super();
		breed = "";
		ownerName = "";
		System.out.println("Child class default");
	}
	
	public Dog(String nName, int nAge, String nBreed) {
		super(nName, nAge);
		breed = nBreed;
		ownerName = "";
		System.out.println("Child class alternate");
	}
	
	public void setBreed(String nBreed) {
		breed = nBreed;
	}
	
	@Override
	public void move() {
		amtMoved += 10;
	}
	
	@Override
	public void eat() {
		amtEaten += 10;
	}
	
	@Override
	public String toString() {
		String toRet = getName() + " is a " + getAge() + " year old " + breed + ".";
		return toRet;
	}
	
	public static void main(String[] args) {
		Animal a = new Animal("Jimmy", 10);
		System.out.println(a);
		Animal d = new Dog();
		System.out.println(d);
		d.setName("Jimmy");
		d.setAge(10);
		((Dog)d).setBreed("Poodle");
		System.out.println(d);
		System.out.println("Dog motion: " + d.getMotion());
		System.out.println("Dog eating: " + d.getConsumption());
		System.out.println("Animal motion: " + a.getMotion());
		System.out.println("Animal consumption: " + a.getConsumption());
		a.move();
		d.move();
		a.eat();
		d.eat();
		System.out.println("Dog motion: " + d.getMotion());
		System.out.println("Dog eating: " + d.getConsumption());
		System.out.println("Animal motion: " + a.getMotion());
		System.out.println("Animal consumption: " + a.getConsumption());
	}
}
