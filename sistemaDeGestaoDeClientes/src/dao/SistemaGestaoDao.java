package dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class SistemaGestaoDao {

    Connection conectar;

    private void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://bdremotosenac.mysql.database.azure.com:3306/remotosenac", "rootwellington", "Well1997##");
    }

    public void cadastrarCliente(String nomeCli, String sobrenomeCli, String dataNascCli, String cpfCli, String sexoCli, String generoCli, String nomeSocialCli, String telFixoCli, String celularCli, String emailCli) throws ClassNotFoundException, SQLException {

        conectar();

        PreparedStatement st = conectar.prepareStatement("INSERT INTO clientes VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )");
        st.setString(1, nomeCli);
        st.setString(2, sobrenomeCli);
        st.setString(3, cpfCli);
        st.setString(4, dataNascCli);

        st.setString(5, sexoCli);
        st.setString(6, generoCli);
        st.setString(7, nomeSocialCli);
        st.setString(8, telFixoCli);
        st.setString(9, celularCli);
        st.setString(10, emailCli);
        st.executeUpdate();

    }

    public void cadastrarUsuario(String usu, String senha) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("INSERT INTO usuarios VALUES (?, ?)");
        st.setString(1, usu);
        st.setString(2, senha);
        st.executeUpdate();

    }
    
    public void alterarUsuario(String usu, String senha) throws ClassNotFoundException, SQLException{
         conectar();
         
          PreparedStatement st = conectar.prepareStatement("UPDATE usuarios SET senha = ? WHERE usuario = ?");
            st.setString(1, usu);
            st.setString(2, senha);
            st.executeUpdate();
        
        }
    
    
     public int excluirUsuario(String usu) throws ClassNotFoundException, SQLException{
        conectar();
        
        PreparedStatement st = conectar.prepareStatement("DELETE FROM usuarios WHERE usuario = ?");
             st.setString (1, usu);
             int retorno = st.executeUpdate();
             
             return retorno;
        
    }

    public int excluirCliente(String cpfCliente) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("DELETE FROM clientes WHERE cpf = ?");
        st.setString(1, cpfCliente);

        int retorno = st.executeUpdate();
        return retorno;

    }

    public ResultSet listarClientes() throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("SELECT * FROM clientes");
        ResultSet clientes = st.executeQuery();

        return clientes;
    }

    public ResultSet listarProdutos() throws ClassNotFoundException, SQLException {

        conectar();

        PreparedStatement st = conectar.prepareStatement("SELECT * FROM produtos");
        ResultSet produtos = st.executeQuery();

        return produtos;

    }

    public ResultSet buscarProdutos(String nomeProduto) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("SELECT * FROM produtos WHERE nomeProd LIKE ?");
        st.setString(1, "%" + nomeProduto + "%");
        ResultSet produtos = st.executeQuery();

        return produtos;

    }

    public void cadastrarProduto(String nome, int quantidade) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("INSERT INTO produtos VALUES (default, ?, ?)");
        st.setString(1, nome);
        st.setString(2, Integer.toString(quantidade));
        st.executeUpdate();

    }

    public void novoPedido(String cpfCli, String nomeCli, int codProd, String nomeProd, int quantidade) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("INSERT INTO pedido VALUES (default, ?, ?, DEFAULT, ?)");
        st.setString(1, cpfCli);
        st.setString(2, Integer.toString(codProd));

        st.setString(3, Integer.toString(quantidade));
        st.executeUpdate();

    }

    public int excluirProduto(String codProd) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("DELETE FROM produtos where cod_prod = ?");
        st.setString(1, codProd);
        int retorno = st.executeUpdate();

        return retorno;
    }

    public void alterarProduto(String nomeProduto, int qtdProduto, int codigoProduto) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("UPDATE produtos SET nomeProd = ?, qtd = ? WHERE cod_prod = ?");
        st.setString(1, nomeProduto);
        st.setInt(2, qtdProduto);
        st.setInt(3, codigoProduto);
        st.executeUpdate();

    }
}
