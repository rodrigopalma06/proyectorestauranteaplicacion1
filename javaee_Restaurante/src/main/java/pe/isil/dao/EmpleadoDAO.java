package pe.isil.dao;

import pe.isil.business.Cliente;
import pe.isil.business.Empleado;
import pe.isil.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {

    public void createEmpleado(Empleado empleado){
        try (Connection connection = DatabaseUtil.getConnection()) {
            String sql = "INSERT INTO tb_clientes (id_empl,dni_empl,nom_empl, ape_empl,direc_empl,id_dist,tel_empl,sexo,cargo) values (?,?,?,?,?,?,?) ";
            try(PreparedStatement pstm = connection.prepareStatement(sql)){
                pstm.setInt(1, empleado.getIdEmp());
                pstm.setInt(2, empleado.getDniEmp());
                pstm.setString(3, empleado.getNomEmp());
                pstm.setString(4, empleado.getApeEm());
                pstm.setString(4, empleado.getDirEmp());
                pstm.setInt(5, empleado.getDist());
                pstm.setString(6, empleado.getTelEmp());
                pstm.setString(6, empleado.getSexoEmp());
                pstm.setString(6, empleado.getCargoEmp());
                pstm.executeUpdate();
            }
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void updateEmpleado(Empleado empleado) {
        try (Connection connection = DatabaseUtil.getConnection()) {
            final String sql = "UPDATE tb_clientes SET dni_cli=?,nom_cli=?,ape_cli=?,ruc_cli=?,tel_cli=? WHERE id_cli=?";
            try (PreparedStatement pstm = connection.prepareStatement(sql)) {
                pstm.setInt(1, empleado.getIdEmp());
                pstm.setInt(2, empleado.getDniEmp());
                pstm.setString(3, empleado.getNomEmp());
                pstm.setString(4, empleado.getApeEm());
                pstm.setString(4, empleado.getDirEmp());
                pstm.setInt(5, empleado.getDist());
                pstm.setString(6, empleado.getTelEmp());
                pstm.setString(6, empleado.getSexoEmp());
                pstm.setString(6, empleado.getCargoEmp());
                pstm.executeUpdate();
            }
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void deleteCliente(Cliente cliente) {
        try (Connection connection = DatabaseUtil.getConnection()) {
            final String sql = "DELETE FROM tb_clientes  WHERE id_cli=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, cliente.getIdCli());
                statement.executeUpdate();
            }
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static List<Cliente> findAllCliente() {
        List<Cliente> listaClientes = new ArrayList<>();
        try (Connection connection = DatabaseUtil.getConnection()) {
            final String sql = "SELECT * FROM tb_clientes";
            try (Statement stm = connection.createStatement()) {
                try (ResultSet rs = stm.executeQuery(sql)) {
                    while (rs.next()) {
                        Cliente cliente = new Cliente(
                                rs.getInt("id_cli"),
                                rs.getInt("dni_cli"),
                                rs.getString("nom_cli"),
                                rs.getString("ape_cli"),
                                rs.getString("ruc_cli"),
                                rs.getString("tel_cli")
                        );
                        listaClientes.add(cliente);
                    }
                }
            }
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        return listaClientes;
    }
}
