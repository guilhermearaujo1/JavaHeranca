
public class UsaCalculadora extends Calculadora{
	public void multi(int x, int y){
		z = x * y;
		System.out.println("A multiplicao dos numeros é: " +z);
		
	
	
	}
	public static void main(String[] args) {
		int a = 20, b = 10;
		UsaCalculadora pega = new UsaCalculadora();
		pega.adicao(a, b);
		pega.multi(a, b);
		pega.subtracao(a, b);
		
	}
}

