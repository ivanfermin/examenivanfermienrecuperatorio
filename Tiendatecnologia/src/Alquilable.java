public class Alquilable extends Producto{
    @Override
    public String toString() {
        return "Alquilable{" +
                "precioHora=" + precioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public Alquilable(String codigo, String modelo, double precioHora) {
        super(codigo, modelo);
        this.precioHora = precioHora;
    }

    public Alquilable(String codigo, String modelo) {
        super(codigo, modelo);
    }
    double precioHora;
}
