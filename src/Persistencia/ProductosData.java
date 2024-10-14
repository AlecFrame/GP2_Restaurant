
package Persistencia;

import Modelo.Conexion;
import Modelo.Mesa;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductosData {
    private Connection con = Conexion.cargaConexion();

    public ProductosData() {}
    
    public void guardarProducto(Producto p) throws SQLException {
        String sql = "Insert into productos(codigo,nombre,precio,stock,categoria,estado) values(?,?,?,?,?,?);";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setInt(1, p.getCodigo());
        s.setString(2, p.getNombre());
        s.setDouble(3, p.getPrecio());
        s.setInt(4, p.getStock());
        s.setString(5, p.getCategoria());
        s.setBoolean(6, p.isEstado());
        
        int filas = s.executeUpdate();
        if (filas>0) {
            System.out.println("El producto fue registrado con exito");
        }
    }
    
    public void eliminarProducto(int numero) throws SQLException {
        String sql = "delete from productos where codigo = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setInt(1, numero);
        
        int filas = s.executeUpdate();
        if (filas>0) {
            System.out.println("El producto "+numero+" fue eliminado");
        }
    }
    
    public Producto buscar(int numero) throws SQLException {
        Producto producto = null;
        String sql = "Select * From productos Where codigo = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setInt(1, numero);
        
        ResultSet r = s.executeQuery();
        
        while (r.next()) {
            producto = new Producto(
                    numero,r.getString("nombre"),
                    r.getDouble("precio"),
                    r.getBoolean("estado"),
                    r.getInt("stock"),
                    r.getString("categoria"));
        }
        
        return producto;
    }
    
    public void CambiarEstado(boolean estado, int numero) throws SQLException {
        String sql = "Update productos set estado = ? where codigo = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setBoolean(1, estado);
        s.setInt(2, numero);
        
        int filas = s.executeUpdate();
        if (filas>0) {
            System.out.println("El estado de producto "+numero+" fue actualizada a "+estado);
        }
    }
    
    public ArrayList<Producto> filtrarMesasOcupacion(String filtro) throws SQLException {
        ArrayList<Producto> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM productos WHERE categoria = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setString(1, filtro);
        ResultSet r = s.executeQuery(sql);
        
        while (r.next()) {
            lista.add(new Producto(
                    r.getInt("codigo"),r.getString("nombre"),
                    r.getDouble("precio"),
                    r.getBoolean("estado"),
                    r.getInt("stock"),
                    r.getString("categoria")));
        }
        
        return lista;
    }
    
    public ArrayList<Producto> listarMesas() throws SQLException {
        ArrayList<Producto> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM productos";
        
        Statement s = con.createStatement();
        ResultSet r = s.executeQuery(sql);
        
        while (r.next()) {
            lista.add(new Producto(
                    r.getInt("codigo"),r.getString("nombre"),
                    r.getDouble("precio"),
                    r.getBoolean("estado"),
                    r.getInt("stock"),
                    r.getString("categoria")));
        }
        
        return lista;
    }
    
}
