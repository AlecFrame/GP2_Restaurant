
package Persistencia;

import Modelo.Mesa;
import java.sql.*;
import java.util.ArrayList;

public class MesaData {
    private Connection con = Conexion.cargaConexion();

    public MesaData() {}
    
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
