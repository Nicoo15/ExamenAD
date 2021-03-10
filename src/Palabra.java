
public class Palabra {

	private int id;
	private String palabra;
	private String definicion;
	private String imagen;

	

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	

	@Override
	public String toString() {
		return "Palabra [id=" + id + ", palabra=" + palabra + ", definicion=" + definicion + ", imagen=" + imagen
				+ ", getPalabra()=" + getPalabra() + ", getId()=" + getId() + ", getDefinicion()=" + getDefinicion()
				+ ", getImagen()=" + getImagen() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Palabra() {
		super();
	}

	public Palabra(String palabra, String definicion, String imagen, int id) {
		super();
		this.id = id;
		this.palabra = palabra;
		this.definicion = definicion;
		this.imagen = imagen;
	}

}