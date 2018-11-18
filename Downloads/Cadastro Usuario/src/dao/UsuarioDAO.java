/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConnectionFactory;
import gui.Principal;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author walney
 */

public class UsuarioDAO {
  private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String pegaID;
    String pegausuario;
    public UsuarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    
      
    public void adiciona(Usuario usuario){ 
        try {
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone, login, senha) VALUES(?,?,?,?,?,?)";
         
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.setString(5, usuario.getLogin());
            stmt.setString(6, usuario.getSenha());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
       public void selecionar(Usuario usuario){ 
        try {
        String sql = "select * from projetojava.usuario";
         
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
      public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM projetojava.usuario WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                //String[] linha = {rs.getString("IDCliente")};
                pegaID = rs.getString("id");
                pegausuario = rs.getString("login");
                
                 Usuario usuarios = new Usuario();
                 usuarios.setpegaId(pegaID);
                 usuarios.setpegausuario(pegausuario);
                 Principal cadastrarUsuario = new Principal();
                 cadastrarUsuario.Login(usuarios);
                 cadastrarUsuario.setVisible(true);
                 
        //int linha = this.jtCliente.getSelectedRow();
        //int id = Integer.parseInt(usuarios.setpegaId(pegaID).toString());
        //int Cod = rs.getInt("id");
        //Principal cadastrarUsuario = new Principal(Cod);
         
        //jdpPrincipal.add(cadastrarCliente);
        //cadastrarUsuario.setVisible(true);  

                check = true;
             
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
      
      public Usuario pesquisar(Integer id) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {

            stmt = con.prepareStatement("SELECT * FROM projetojava.usuario WHERE login = ? and senha = ?");
            //stmt.setString(1, login);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                // pegaID = rs.getString("id");
                //pegausuario = rs.getString("login");
                 Usuario usuarios = new Usuario();
                 usuarios.setpegaId(rs.getString("id"));
                 usuarios.setpegaId(rs.getString("id"));
                //Principal principal = new Principal();  
                //principal.lblUsuario.setText(pegaID);  
                    return usuarios;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
      return null;

      
}

}

