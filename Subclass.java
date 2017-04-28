
public class Subclass extends Superclass{
	int num = 10;
	public void display(){
		System.out.println("Subclasse Display");
	}
	
	public void metodos(){
		Subclass sub = new Subclass();
		
		sub.display();
		super.display();
		
		System.out.println("Numero sub" +sub.num);
		System.out.println("Super num" +super.num);
		
	}
	public static void main(String[] args) {
		Subclass obj = new Subclass();
		obj.metodos();
	}
	
}
