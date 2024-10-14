
package Modelo;

public class Mesero {
    private String dniMesero;
    private String apellido;

    public Mesero() {
    }

    public Mesero(String apellido) {
        this.apellido = apellido;
    }
    
    public Mesero(String dniMesero, String apellido) {
        this.dniMesero = dniMesero;
        this.apellido = apellido;
    }

    public Mesero(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDniMesero() {
        return dniMesero;
    }

    public void setDniMesero(String dniMesero) {
        this.dniMesero = dniMesero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
