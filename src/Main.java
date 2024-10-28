
public class Main {

	public static void main(String[] args) {

		try {
			
			conectaDAO a = new conectaDAO();
			
			a.connectDB();
			System.out.println("Conectado com sucesso");

		} catch (Exception e) {
			
			System.out.println("Programa não conectado.");

		}

	}

}
