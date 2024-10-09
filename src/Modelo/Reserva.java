
package Modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {
    private int idReserva;
    private int numero_mesa;
    private String dni_cliente;
    private String nombre;
    private LocalDate fecha;
    private LocalDateTime hora;
    private String estado;

    public Reserva() {
    }

    public Reserva(int numero_mesa, String dni_cliente, String nombre, LocalDate fecha, LocalDateTime hora, String estado) {
        this.numero_mesa = numero_mesa;
        this.dni_cliente = dni_cliente;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Reserva(int idReserva, int numero_mesa, String dni_cliente, String nombre, LocalDate fecha, LocalDateTime hora, String estado) {
        this.idReserva = idReserva;
        this.numero_mesa = numero_mesa;
        this.dni_cliente = dni_cliente;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getNumero_mesa() {
        return numero_mesa;
    }

    public void setNumero_mesa(int numero_mesa) {
        this.numero_mesa = numero_mesa;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
