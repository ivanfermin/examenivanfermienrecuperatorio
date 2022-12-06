import java.util.Date;

public class Tecnologico extends Producto{
    @Override
    public String toString() {
        return "Tecnologico{" +
                "paisorigen='" + paisorigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricanteEmpresa='" + fabricanteEmpresa + '\'' +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setFabricanteEmpresa(String fabricanteEmpresa) {
        this.fabricanteEmpresa = fabricanteEmpresa;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public String getFabricanteEmpresa() {
        return fabricanteEmpresa;
    }

    public Tecnologico(String codigo, String modelo, String paisorigen, Date fechaFabricacion, String fabricanteEmpresa) {
        super(codigo, modelo);
        this.paisorigen = paisorigen;
        this.fechaFabricacion = fechaFabricacion;
        this.fabricanteEmpresa = fabricanteEmpresa;
    }

    public Tecnologico(String codigo, String modelo) {
        super(codigo, modelo);
    }
    String paisorigen;
    Date fechaFabricacion;
    String fabricanteEmpresa;
}
