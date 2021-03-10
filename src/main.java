import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
	int opc = PedirDatos.Opcion();
	static Scanner sc = new Scanner(System.in);
		switch (opc) {
		
		
		case PedirDatos.BUSCARPALABRA:
			System.out.println("Escriba una palabra");
			Palabra palabra = sc.nextLine();
			
			palabra = WebScraping.buscar(palabra);
			System.out.println(plbr);

			break;
		
		case PedirDatos.SALIR:
			System.exit(0);

			break;
		}
	}
}
