package aula_6;

public class TesteFinally {

	public static void main(String[] args) {

		try {
			System.out.println(1);
		} catch (Exception e) {
			System.out.println(2);
			System.out.println(e);
		} finally {
			System.out.println(3);
		}
		
	}

}
