package Vista;

import Controllers.ControllerAdmin;
import ModeloDAO.ArchivoHashMap;
import ModeloDTO.Usuario;

import java.util.Objects;

import Controllers.ControllerUser;


public class UILOGIN extends javax.swing.JFrame {

    /**
     * Creates new form loginVista
     */
    public UILOGIN() {
        initComponents();
    }

    private void OnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        ArchivoHashMap archivoHashMap = new ArchivoHashMap("user.dat");

        Usuario usuarioEncontrado = (Usuario) archivoHashMap.leer(Integer.parseInt(UsuarioField.getText()));
        Boolean contrasenaIgual = Objects.equals(usuarioEncontrado.getContrasena(), contraseñaField.getText());


        if(contrasenaIgual){
            if(Objects.equals(usuarioEncontrado.getTipo(), "Administrador")){
//                System.out.println("Mostrar pantalla Admin");
                new ControllerAdmin(new UIADMIN());
                this.setVisible(false);
            }
            if(Objects.equals(usuarioEncontrado.getTipo(), "Usuario")){
//                System.out.println("Mostrar pantalla usuario");
                new ControllerUser(new UIUSER());
                this.setVisible(false);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        UsuarioField = new javax.swing.JTextField();
        usuarioText = new javax.swing.JLabel();
        contraseñaText = new javax.swing.JLabel();
        contraseñaField = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 65, 169));

        text1.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        text1.setForeground(new java.awt.Color(242, 242, 242));
        text1.setText("LOGIN");

        text2.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(242, 242, 242));
        text2.setText("Ingrese su usuario y contraseña");

        UsuarioField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UsuarioFieldActionPerformed(evt);
            }
        });

        usuarioText.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(242, 242, 242));
        usuarioText.setText("Contraseña");

        contraseñaText.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        contraseñaText.setForeground(new java.awt.Color(242, 242, 242));
        contraseñaText.setText("Usuario");

        loginbtn.setText("INGRESAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(text2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(text1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuarioText)
                            .addComponent(UsuarioField)
                            .addComponent(contraseñaText)
                            .addComponent(contraseñaField)
                            .addComponent(loginbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text2)
                .addGap(20, 20, 20)
                .addComponent(contraseñaText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuarioText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioFieldActionPerformed

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
            java.util.logging.Logger.getLogger(UILOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UILOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UILOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UILOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UILOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField UsuarioField;
    public javax.swing.JPasswordField contraseñaField;
    private javax.swing.JLabel contraseñaText;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton loginbtn;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel usuarioText;
    // End of variables declaration//GEN-END:variables
}
