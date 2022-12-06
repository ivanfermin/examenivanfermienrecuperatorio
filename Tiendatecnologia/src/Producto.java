public class Producto {
    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public Producto(String codigo, String modelo) {
        this.codigo = codigo;
        this.modelo = modelo;
    }

    String codigo;
    String modelo;
}
