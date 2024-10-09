
package Modelo;

public class Pedido {
    private Pedido idPedido;
    private Mesero dni_mesero;
    private Mesa numero_mesa;
    private double pago;
    private boolean pendiente;

    public Pedido() {
    }

    public Pedido(Mesero dni_mesero, Mesa numero_mesa, double pago, boolean pendiente) {
        this.dni_mesero = dni_mesero;
        this.numero_mesa = numero_mesa;
        this.pago = pago;
        this.pendiente = pendiente;
    }

    public Pedido(Pedido idPedido, Mesero dni_mesero, Mesa numero_mesa, double pago, boolean pendiente) {
        this.idPedido = idPedido;
        this.dni_mesero = dni_mesero;
        this.numero_mesa = numero_mesa;
        this.pago = pago;
        this.pendiente = pendiente;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public Mesero getDni_mesero() {
        return dni_mesero;
    }

    public void setDni_mesero(Mesero dni_mesero) {
        this.dni_mesero = dni_mesero;
    }

    public Mesa getNumero_mesa() {
        return numero_mesa;
    }

    public void setNumero_mesa(Mesa numero_mesa) {
        this.numero_mesa = numero_mesa;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public boolean isPendiente() {
        return pendiente;
    }

    public void setPendiente(boolean pendiente) {
        this.pendiente = pendiente;
    }
}
