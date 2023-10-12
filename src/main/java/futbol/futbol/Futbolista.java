package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	
	@Override
	public int compareTo(Futbolista f) {
		return 1;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion();
	}
	
	
	public boolean equals(Futbolista f) {
		if (this.compareTo(f) == 0 && this.getNombre().equals(f.getNombre()) && this.getPosicion().equals(f.getPosicion())) {
			return true;
		}
		return false;
	}
	
	public abstract boolean jugarConLasManos();
}
