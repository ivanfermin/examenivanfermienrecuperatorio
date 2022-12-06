import Inferfaces.Reseteable;

import java.util.Date;

public class Discosolido extends Tecnologico implements Reseteable {
    public Discosolido(String codigo, String modelo, String paisorigen, Date fechaFabricacion, String fabricanteEmpresa) {
        super(codigo, modelo, paisorigen, fechaFabricacion, fabricanteEmpresa);
    }

    public Discosolido(String codigo, String modelo) {
        super(codigo, modelo);
    }
    int capacidad;

    @Override
    public String toString() {
        return "Discosolido{" +
                "capacidad=" + capacidad +
                ", paisorigen='" + paisorigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricanteEmpresa='" + fabricanteEmpresa + '\'' +
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

    public Discosolido(String codigo, String modelo, String paisorigen, Date fechaFabricacion, String fabricanteEmpresa, int capacidad) {
        super(codigo, modelo, paisorigen, fechaFabricacion, fabricanteEmpresa);
        this.capacidad = capacidad;
    }

    public Discosolido(String codigo, String modelo, int capacidad) {
        super(codigo, modelo);
        this.capacidad = capacidad;
    }

    @Override
    public void reset() {
        System.out.println("formateando disco duro");
    }
}
