import Inferfaces.Reseteable;

public class Monitor extends Alquilable implements Reseteable{
    public Monitor(String codigo, String modelo, double precioHora) {
        super(codigo, modelo, precioHora);
    }

    public Monitor(String codigo, String modelo) {
        super(codigo, modelo);
    }
    String resolucionMaxima;

    @Override
    public void reset() {
        System.out.println("reseteando monitor");
    }
}
