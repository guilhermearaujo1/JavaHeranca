
public class RodarEncap {
	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
		encap.setAge(17);
		encap.setIdnum("123aa");
		encap.setNome("Guilherme");
		System.out.println(encap.getNome() + encap.getAge());
	}
}
