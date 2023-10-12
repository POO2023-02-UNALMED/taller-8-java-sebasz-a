package futbol;

public class Portero extends Jugador{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero", (short) 0, dorsal);
		this.golesRecibidos = golesRecibidos;
	}

	public short getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.getDorsal() + ". Le han marcado " + this.getGolesRecibidos();
	}
	
	public int compareTo(Object o) {
		Portero p = (Portero) o;
		return Math.abs(this.getGolesRecibidos() - p.getGolesRecibidos());
	}
}
