class Thing{
	public final static int LUCKY_NUMBER=89;
	
	// Member variable -each member can have its own copy
	public String name;
	
	//Static variable/class variable-associated with the class-members cannot have their own copies
	public static String description;
	public static int count=0;
	public int id;
	public Thing() {
		id=count;
		count++;
	}
	
	public void showName() {
		System.out.println("Object id: " +id+","+description+ ":" +name);
	}
	// Static methods can access static data because both belong to the class
	public static void showInfo() {
		System.out.println(description);
	}
}
public class Application {

	public static void main(String[] args) {
		
		Thing.description="I am not human";
		//Calling the static method by the class
		Thing.showInfo();
		//-----------------
		System.out.println("Before creating objects,count is:"+Thing.count);
		
		//System.out.println(Thing.description);
		Thing thing1=new Thing();
		Thing thing2=new Thing();
		System.out.println("After creating objects,count is:"+Thing.count);
		thing1.name="Mohamed";
		thing2.name="Lamin";
		
//		System.out.println(thing1.name);
//		System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);

	}

}
