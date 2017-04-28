
public class RodarHipo {
	public static void main(String[] args) {
		Hipopotamo hipo = new Hipopotamo();
		hipo.setCor("Rosa");
		hipo.setAltura(2);
		hipo.setPeso(800);
		
		hipo.comer();
		System.out.println("Peso: " +hipo.getPeso() + "Altura" +hipo.getAltura() + "Cor" +hipo.getCor());
		
		
}
}
