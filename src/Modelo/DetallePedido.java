
package Modelo;


public class DetallePedido {
    private int idDetalle;
    private int codigo;
    private Pedido idPedido;
    private int cantidad;
    private int total;

    public DetallePedido(int idDetalle, int codigo, Pedido idPedido, int cantidad, int total) {
        this.idDetalle = idDetalle;
        this.codigo = codigo;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
        this.total = total;
    }

    public DetallePedido(int codigo, Pedido idPedido, int cantidad, int total) {
        this.codigo = codigo;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
        this.total = total;
    }

    public DetallePedido(){}

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
