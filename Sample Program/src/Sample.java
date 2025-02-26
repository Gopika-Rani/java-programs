
public class Sample{
	
	int age;
	String name;
	
	public Sample(int age , String name) {
		
    this.age = age;
	this.name = name;
	
	}
	
	
	public static void main(String args[]) {
		
		Sample person=new Sample(27, "Gopika");
		
		System.out.println(person.age + "  " + person.name);
		
		
	}

}
