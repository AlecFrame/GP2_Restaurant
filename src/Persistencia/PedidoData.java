
package Persistencia;

import Modelo.Conexion;
import Modelo.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class PedidoData {
    private Connection con = Conexion.cargaConexion();

    public PedidoData() {}
    
    public void guardarPedido(Pedido p) throws SQLException {
        String sql = "Insert into pedido(idPedido,dni_mesero,numero_mesa,importe,cobrado,estado) values(?,?,?,?,?,?);";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setInt(1, p.getIdPedido());
        s.setString(2, p.getDni_mesero());
        s.setInt(3, p.getMesa().getNumeroMesa());
        s.setDouble(4, p.getImporte());
        s.setBoolean(5, p.isCobrado());
        s.setBoolean(6, p.isEstado());
        
        int filas = s.executeUpdate();
        if (filas>0) {
            System.out.println("Mesa registrada con exito");
        }
    }
    
    public void eliminarPedido(int numero) throws SQLException {
        String sql = "delete from pedido where idPedido = ?";
        
        PreparedStatement s = con.prepareStatement(sql);
        s.setInt(1, numero);
        
        int filas = s.executeUpdate();
        if (filas>0) {
            System.out.println("El pedido "+numero+" fue eliminado");
        }
    }
}
