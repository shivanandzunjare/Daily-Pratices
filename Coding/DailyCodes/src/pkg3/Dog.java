package pkg3;

public class Dog extends Animal{
	


		@Override
		public void sound() {
			System.out.println("dog barking");
		}
		
		
	public static void main(DemoString[] args) {
		// TODO Auto-generated method stub
		
//		Animal a =  new Dog();
//		a.sound();
		
//		Dog d = new Dog();
//		d.sound();
		
		Animal aa= new Dog();
		aa.sound();
//		
//		if(a instanceof Dog) {
//			Dog d = (Dog )a;
//			d.sound();
//		}

	}

}
