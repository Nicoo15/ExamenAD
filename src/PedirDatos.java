import java.util.Scanner;

public class PedirDatos {

	public static final int BUSCARPALABRA = 1;
	public static final int LISTARPALABRAS = 2;
	public static final int RECUPERARIMAGEN = 3;
	public static final int SALIR = 4;
	static Scanner sc = new Scanner(System.in);

	public static int Opcion() {

		while (true) {

			System.out.println("1-Escriba una palabra para buscar");
			System.out.println("2.-Listar palabra");
			System.out.println("3.-Recuperar imagen");
			System.out.println("SALIR");

			int opc = Integer.parseInt(sc.nextLine());
			return opc;
		}

	}
}
