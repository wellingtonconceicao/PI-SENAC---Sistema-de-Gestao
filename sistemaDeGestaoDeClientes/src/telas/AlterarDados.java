/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.SistemaGestaoDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author welli
 */
public class AlterarDados extends javax.swing.JFrame {

    /**
     * Creates new form AlterarDados
     */
    public AlterarDados() {
        initComponents();
    }

    public AlterarDados(String nomeCli, String sobrenomeCli, String cpfCli, String dataNascCli, String sexoCli, String generoCli, String nomeSocialCli, String telFixoCli, String celularCli, String emailCli) {
        initComponents();
        txtNome.setText(nomeCli);
        txtSobrenome.setText(sobrenomeCli);
        fmtCPF.setText(cpfCli);
        fmtData.setText(dataNascCli);
        cmbSexoBiologico.setSelectedItem(sexoCli);
        cmbIdentidadeDeGenero.setSelectedItem(generoCli);
        txtNomeSocial.setText(nomeSocialCli);
        txtFixo.setText(telFixoCli);
        txtCelular.setText(celularCli);
        txtEmail.setText(emailCli);

        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        fmtCPF.setEnabled(false);
        fmtData.setEnabled(false);
        cmbSexoBiologico.setEnabled(false);
        cmbIdentidadeDeGenero.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeCli = new javax.swing.JLabel();
        lblSobrenomeCli = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        fmtData = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        fmtCPF = new javax.swing.JFormattedTextField();
        lblSexo = new javax.swing.JLabel();
        cmbSexoBiologico = new javax.swing.JComboBox<>();
        lblGenero = new javax.swing.JLabel();
        cmbIdentidadeDeGenero = new javax.swing.JComboBox<>();
        lblNomeSocial = new javax.swing.JLabel();
        txtNomeSocial = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtFixo = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        lblTelFixo = new javax.swing.JLabel();
        lblContato = new javax.swing.JLabel();
        lblDadosPessoais = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTituloCadastro = new javax.swing.JLabel();
        btnCancelAlter = new javax.swing.JButton();
        btnConfirmAlter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblNomeCli.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblNomeCli.setText("NOME:");
        getContentPane().add(lblNomeCli);
        lblNomeCli.setBounds(130, 110, 80, 40);

        lblSobrenomeCli.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblSobrenomeCli.setText("SOBRENOME:");
        getContentPane().add(lblSobrenomeCli);
        lblSobrenomeCli.setBounds(490, 110, 140, 40);

        txtSobrenome.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        getContentPane().add(txtSobrenome);
        txtSobrenome.setBounds(630, 110, 280, 40);

        lblData.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblData.setText("NASCIMENTO:");
        getContentPane().add(lblData);
        lblData.setBounds(60, 170, 140, 40);

        try {
            fmtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtData.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fmtData.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        getContentPane().add(fmtData);
        fmtData.setBounds(210, 170, 130, 40);

        lblCPF.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblCPF.setText("CPF:");
        getContentPane().add(lblCPF);
        lblCPF.setBounds(570, 174, 50, 30);

        txtNome.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtNome.setToolTipText("");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(210, 110, 260, 40);

        try {
            fmtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtCPF.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        getContentPane().add(fmtCPF);
        fmtCPF.setBounds(630, 170, 200, 40);

        lblSexo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblSexo.setText("SEXO:");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(130, 220, 70, 40);

        cmbSexoBiologico.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        cmbSexoBiologico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMININO", "INTERSEXO", "PREFIRO NÃO INFORMAR", " " }));
        cmbSexoBiologico.setToolTipText("");
        getContentPane().add(cmbSexoBiologico);
        cmbSexoBiologico.setBounds(210, 220, 260, 40);

        lblGenero.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblGenero.setText("GÊNERO:");
        getContentPane().add(lblGenero);
        lblGenero.setBounds(100, 290, 100, 30);

        cmbIdentidadeDeGenero.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        cmbIdentidadeDeGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CISGENERO ", "TRANSGENERO", "NÃO BINÁRIO", "PREFIRO NÃO INFORMAR", " " }));
        cmbIdentidadeDeGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdentidadeDeGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(cmbIdentidadeDeGenero);
        cmbIdentidadeDeGenero.setBounds(210, 280, 260, 40);

        lblNomeSocial.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblNomeSocial.setText("NOME SOCIAL:");
        getContentPane().add(lblNomeSocial);
        lblNomeSocial.setBounds(50, 350, 150, 24);

        txtNomeSocial.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        getContentPane().add(txtNomeSocial);
        txtNomeSocial.setBounds(210, 340, 260, 40);

        txtEmail.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        getContentPane().add(txtEmail);
        txtEmail.setBounds(220, 570, 360, 40);

        lblEmail.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblEmail.setText("EMAIL:");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(120, 570, 80, 40);

        try {
            txtFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFixo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        getContentPane().add(txtFixo);
        txtFixo.setBounds(220, 490, 210, 40);

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        getContentPane().add(txtCelular);
        txtCelular.setBounds(640, 490, 220, 40);

        lblCelular.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblCelular.setText("CELULAR:");
        getContentPane().add(lblCelular);
        lblCelular.setBounds(530, 490, 100, 40);

        lblTelFixo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblTelFixo.setText("TELEFONE FIXO:");
        getContentPane().add(lblTelFixo);
        lblTelFixo.setBounds(40, 490, 170, 40);

        lblContato.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lblContato.setText("CONTATO:");
        getContentPane().add(lblContato);
        lblContato.setBounds(30, 430, 120, 30);

        lblDadosPessoais.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        lblDadosPessoais.setText("DADOS PESSOAIS:");
        getContentPane().add(lblDadosPessoais);
        lblDadosPessoais.setBounds(20, 60, 220, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 400, 950, 10);

        lblTituloCadastro.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblTituloCadastro.setForeground(new java.awt.Color(204, 0, 0));
        lblTituloCadastro.setText("ALTERAR DADOS DO CLIENTE");
        getContentPane().add(lblTituloCadastro);
        lblTituloCadastro.setBounds(280, 0, 340, 40);

        btnCancelAlter.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelAlter.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCancelAlter.setText("CANCELAR");
        btnCancelAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAlterActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelAlter);
        btnCancelAlter.setBounds(390, 720, 140, 40);

        btnConfirmAlter.setBackground(new java.awt.Color(0, 153, 0));
        btnConfirmAlter.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnConfirmAlter.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmAlter.setText("CONFIRMAR ALTERAÇÃO");
        btnConfirmAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAlterActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmAlter);
        btnConfirmAlter.setBounds(310, 660, 300, 50);

        setSize(new java.awt.Dimension(966, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void cmbIdentidadeDeGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdentidadeDeGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIdentidadeDeGeneroActionPerformed

    private void btnConfirmAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAlterActionPerformed
        String nomeCli, sobrenomeCli, cpfCli, dataNascCli, sexoCli, generoCli, nomeSocialCli, telFixoCli, celularCli, emailCli;

        nomeCli = txtNome.getText();
        sobrenomeCli = txtSobrenome.getText();
        cpfCli = fmtCPF.getText();
        dataNascCli = fmtData.getText();
        sexoCli = cmbSexoBiologico.getSelectedItem().toString();
        generoCli = cmbIdentidadeDeGenero.getSelectedItem().toString();
        nomeSocialCli = txtNomeSocial.getText();
        telFixoCli = txtFixo.getText();
        celularCli = txtCelular.getText();
        emailCli = txtEmail.getText();
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://bdremotosenac.mysql.database.azure.com:3306/remotosenac", "rootwellington", "Well1997##");
           
             PreparedStatement st = conectar.prepareStatement("UPDATE  clientes SET nome_social = ?, tel_fix = ?, tel_cel = ?, email = ? WHERE cpf = ?");
             st.setString(1, nomeSocialCli );
             st.setString(2, telFixoCli);
             st.setString(3, celularCli);
             st.setString(4, emailCli);
             st.setString(5, cpfCli);
             st.executeUpdate();
             JOptionPane.showMessageDialog(null, "Dados ALterados com Sucesso");
            
             dispose();
                      
             
             
             
         } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }      


    }//GEN-LAST:event_btnConfirmAlterActionPerformed

    private void btnCancelAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAlterActionPerformed
       dispose();
       
    }//GEN-LAST:event_btnCancelAlterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelAlter;
    private javax.swing.JButton btnConfirmAlter;
    private javax.swing.JComboBox<String> cmbIdentidadeDeGenero;
    private javax.swing.JComboBox<String> cmbSexoBiologico;
    private javax.swing.JFormattedTextField fmtCPF;
    private javax.swing.JFormattedTextField fmtData;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblDadosPessoais;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNomeCli;
    private javax.swing.JLabel lblNomeSocial;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSobrenomeCli;
    private javax.swing.JLabel lblTelFixo;
    private javax.swing.JLabel lblTituloCadastro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFixo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeSocial;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
