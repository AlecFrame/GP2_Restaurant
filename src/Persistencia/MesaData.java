
package Persistencia;

import Modelo.Conexion;
import Modelo.Mesa;
import java.sql.*;
import java.util.ArrayList;

public class MesaData {
    private Connection con = Conexion.cargaConexion();

    public MesaData() {}
    
    public void guardarMesa(Mesa m) throws SQLException {
        String sql = "Insert into mesa(numero_mesa,capacidad,estado) values(?,?,?);";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setInt(1, m.getNumeroMesa());
        s.setInt(2, m.getCapacidad());
        s.setString(3, m.getEstado());
        
        int filas = s.executeUpdate();
        if (filas>0) {
            System.out.println("Mesa registrada con exito");
        }
    }
    
    public void eliminarMesa(int numero) throws SQLException {
        String sql = "delete from mesa where numero_mesa = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setInt(1, numero);
        
        int filas = s.executeUpdate();
        if (filas>0) {
            System.out.println("La mesa "+numero+" fue eliminada");
        }
    }
    
    public Mesa buscar(int numero) throws SQLException {
        Mesa mesa = null;
        String sql = "Select * From mesa Where numero_mesa = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setInt(1, numero);
        
        ResultSet r = s.executeQuery();
        
        while (r.next()) {
            mesa = new Mesa(r.getInt("numero_mesa"),
                    r.getInt("capacidad"),
                    r.getString("estado"));
        }
        
        return mesa;
    }
    
    public void CambiarEstado(String estado, int numero) throws SQLException {
        String sql = "Update mesa set estado = ? where numero_mesa = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setString(1, estado);
        s.setInt(2, numero);
        
        int filas = s.executeUpdate();
        if (filas>0) {
            System.out.println("Mesa "+numero+" fue actualizada a "+estado);
        }
    }
    
    public ArrayList<Mesa> filtrarMesasEstado(String filtro) throws SQLException {
        ArrayList<Mesa> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM mesa WHERE estado = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setString(1, filtro);
        ResultSet r = s.executeQuery(sql);
        
        while (r.next()) {
            lista.add(new Mesa(r.getInt("numero_mesa"),
                    r.getInt("capacidad"),
                    r.getString("estado")));
        }
        
        return lista;
    }
    
    public ArrayList<Mesa> filtrarMesasCapacidad(int filtro) throws SQLException {
        ArrayList<Mesa> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM mesa WHERE capacidad = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setInt(1, filtro);
        ResultSet r = s.executeQuery(sql);
        
        while (r.next()) {
            lista.add(new Mesa(r.getInt("numero_mesa"),
                    r.getInt("capacidad"),
                    r.getString("estado")));
        }
        
        return lista;
    }
    
    public ArrayList<Mesa> listarMesas() throws SQLException {
        ArrayList<Mesa> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM mesa";
        
        Statement s = con.createStatement();
        ResultSet r = s.executeQuery(sql);
        
        while (r.next()) {
            lista.add(new Mesa(r.getInt("numero_mesa"),
                    r.getInt("capacidad"),
                    r.getString("estado")));
        }
        
        return lista;
    }
}
