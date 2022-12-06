import Inferfaces.Reseteable;

import java.util.Date;

public class Cpu extends Tecnologico implements Reseteable {
    @Override
    public String toString() {
        return "Cpu{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", paisorigen='" + paisorigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricanteEmpresa='" + fabricanteEmpresa + '\'' +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public Cpu(String codigo, String modelo, String paisorigen, Date fechaFabricacion, String fabricanteEmpresa, int memoriaPrincipal) {
        super(codigo, modelo, paisorigen, fechaFabricacion, fabricanteEmpresa);
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public Cpu(String codigo, String modelo, int memoriaPrincipal) {
        super(codigo, modelo);
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public Cpu(String codigo, String modelo, String paisorigen, Date fechaFabricacion, String fabricanteEmpresa) {
        super(codigo, modelo, paisorigen, fechaFabricacion, fabricanteEmpresa);
    }

    public Cpu(String codigo, String modelo) {
        super(codigo, modelo);
    }
    int memoriaPrincipal;

    @Override
    public void reset() {
        System.out.println("reseteando valores de fabrica");
    }
}
