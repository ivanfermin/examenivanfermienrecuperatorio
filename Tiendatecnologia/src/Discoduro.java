import Inferfaces.Reseteable;

public class Discoduro extends Alquilable implements Reseteable {
    @Override
    public String toString() {
        return "Discoduro{" +
                "capacidad=" + capacidad +
                ", precioHora=" + precioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Discoduro(String codigo, String modelo, double precioHora, int capacidad) {
        super(codigo, modelo, precioHora);
        this.capacidad = capacidad;
    }

    public Discoduro(String codigo, String modelo, int capacidad) {
        super(codigo, modelo);
        this.capacidad = capacidad;
    }

    public Discoduro(String codigo, String modelo, double precioHora) {
        super(codigo, modelo, precioHora);
    }

    public Discoduro(String codigo, String modelo) {
        super(codigo, modelo);
    }
    int capacidad;

    @Override
    public void reset() {
        System.out.println("reseteando formateando");
    }
}
