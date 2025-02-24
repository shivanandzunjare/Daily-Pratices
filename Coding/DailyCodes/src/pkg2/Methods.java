package pkg2;

public class Methods {

	public static void main(String[] args) {
	  staticMethod();
		Methods object = new Methods();
		object.nonStaticMethod();
	}
	
	 static void staticMethod() {
		// TODO Auto-generated method stub
		 System.out.println(" this is static ");	
	}
	 
	 void nonStaticMethod() {
		 System.out.println(" this is non-static ");	 
	 }
}
