import Inferfaces.Reseteable;

public class Impresora extends Producto implements Reseteable {
    @Override
    public String toString() {
        return "Impresora{" +
                "velocidad=" + velocidad +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Impresora(String codigo, String modelo, int velocidad) {
        super(codigo, modelo);
        this.velocidad = velocidad;
    }

    public Impresora(String codigo, String modelo) {
        super(codigo, modelo);
    }
    int velocidad;

    @Override
    public void reset() {
        System.out.println("reseteando impresora");
    }
}
