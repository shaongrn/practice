package Object;

public class Teacher {

	String name, gender;
	int phone;
     
	Teacher(){
		System.out.println("No valu");
	}
	
	
	Teacher(String n,String g,int ph){  //[parametrized constructor method]
		name=n;
		gender=g;
		phone=ph;
				
	}
	
	
	
	//void setInformation(String n, String m, int ph) [parametrized method]
		// name=n;
		// gender=m;
		// phone=ph;
	

	void displayInformation() {

		System.out.println("Name:" + name);
		System.out.println("Gender:" + gender);
		System.out.println("Phone:" + phone);
		System.out.print("\n");
	}
}