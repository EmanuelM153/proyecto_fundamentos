package Vista;

public class UIADMINUSUARIOS extends javax.swing.JFrame {

    /**
     * Creates new form UIADMINUSUARIOS
     */
    public UIADMINUSUARIOS() {
        initComponents();
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

        panelAzul = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        panelblanco = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BuscarField = new javax.swing.JTextField();
        BuscarBTN = new javax.swing.JButton();
        tablaUsers = new javax.swing.JScrollPane();
        TablaUsers = new javax.swing.JTable();
        Bienvenido3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        NombreField = new javax.swing.JTextField();
        EdadField = new javax.swing.JTextField();
        ConsultarTodosBTN = new javax.swing.JButton();
        ActualizarUsuarioBTN = new javax.swing.JButton();
        EliminarUsuarioBTN = new javax.swing.JButton();
        ContraseñaField = new javax.swing.JPasswordField();
        CrearUsuarioBTN1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul.setBackground(new java.awt.Color(35, 69, 169));

        Bienvenido.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenido.setText("Administracion de usuarios");

        javax.swing.GroupLayout panelAzulLayout = new javax.swing.GroupLayout(panelAzul);
        panelAzul.setLayout(panelAzulLayout);
        panelAzulLayout.setHorizontalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAzulLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Bienvenido)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        panelAzulLayout.setVerticalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAzulLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Bienvenido)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 80));

        panelblanco.setBackground(new java.awt.Color(255, 255, 255));
        panelblanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Administracion de usurarios");
        panelblanco.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        panelblanco.add(BuscarField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 30));

        BuscarBTN.setBackground(new java.awt.Color(185, 189, 193));
        BuscarBTN.setForeground(new java.awt.Color(185, 189, 193));
        BuscarBTN.setBorder(null);
        BuscarBTN.setBorderPainted(false);
        BuscarBTN.setDefaultCapable(false);
        BuscarBTN.setFocusPainted(false);
        BuscarBTN.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BuscarBTNActionPerformed(evt);
            }
        });
        panelblanco.add(BuscarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 40, 30));

        TablaUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Nombre", "Edad", "Contraseña ", "ID"
            }
        ));
        tablaUsers.setViewportView(TablaUsers);

        panelblanco.add(tablaUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 440, 80));

        Bienvenido3.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Bienvenido3.setText("Buscar usuario");
        panelblanco.add(Bienvenido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Nombre.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Nombre.setText("Nombre ");
        panelblanco.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        Edad.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Edad.setText("Edad");
        panelblanco.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        Contraseña.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Contraseña.setText("Contraseña");
        panelblanco.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        ID.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        ID.setText("ID");
        panelblanco.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));
        panelblanco.add(IDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 170, -1));

        NombreField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NombreFieldActionPerformed(evt);
            }
        });
        panelblanco.add(NombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, -1));
        panelblanco.add(EdadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 170, -1));

        ConsultarTodosBTN.setBackground(new java.awt.Color(59, 159, 255));
        ConsultarTodosBTN.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ConsultarTodosBTN.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarTodosBTN.setText("Consultar Todos ");
        ConsultarTodosBTN.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConsultarTodosBTNActionPerformed(evt);
            }
        });
        panelblanco.add(ConsultarTodosBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 30));

        ActualizarUsuarioBTN.setBackground(new java.awt.Color(59, 159, 255));
        ActualizarUsuarioBTN.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ActualizarUsuarioBTN.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarUsuarioBTN.setText("Actualizar Usuario ");
        ActualizarUsuarioBTN.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ActualizarUsuarioBTNActionPerformed(evt);
            }
        });
        panelblanco.add(ActualizarUsuarioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 170, 40));

        EliminarUsuarioBTN.setBackground(new java.awt.Color(59, 159, 255));
        EliminarUsuarioBTN.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        EliminarUsuarioBTN.setForeground(new java.awt.Color(255, 255, 255));
        EliminarUsuarioBTN.setText("Eliminar Usuario");
        EliminarUsuarioBTN.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EliminarUsuarioBTNActionPerformed(evt);
            }
        });
        panelblanco.add(EliminarUsuarioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 170, 40));
        panelblanco.add(ContraseñaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 170, -1));

        CrearUsuarioBTN1.setBackground(new java.awt.Color(59, 159, 255));
        CrearUsuarioBTN1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        CrearUsuarioBTN1.setForeground(new java.awt.Color(255, 255, 255));
        CrearUsuarioBTN1.setText("Crear Usuario");
        CrearUsuarioBTN1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CrearUsuarioBTN1ActionPerformed(evt);
            }
        });
        panelblanco.add(CrearUsuarioBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 170, 40));

        getContentPane().add(panelblanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarTodosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarTodosBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarTodosBTNActionPerformed

    private void ActualizarUsuarioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarUsuarioBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarUsuarioBTNActionPerformed

    private void EliminarUsuarioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarUsuarioBTNActionPerformed

    private void BuscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarBTNActionPerformed

    private void NombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFieldActionPerformed

    private void CrearUsuarioBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearUsuarioBTN1ActionPerformed

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
            java.util.logging.Logger.getLogger(UIADMINUSUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIADMINUSUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIADMINUSUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIADMINUSUARIOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIADMINUSUARIOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ActualizarUsuarioBTN;
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JLabel Bienvenido3;
    public javax.swing.JButton BuscarBTN;
    public javax.swing.JTextField BuscarField;
    public javax.swing.JButton ConsultarTodosBTN;
    private javax.swing.JLabel Contraseña;
    public javax.swing.JPasswordField ContraseñaField;
    public javax.swing.JButton CrearUsuarioBTN1;
    private javax.swing.JLabel Edad;
    public javax.swing.JTextField EdadField;
    public javax.swing.JButton EliminarUsuarioBTN;
    private javax.swing.JLabel ID;
    public javax.swing.JTextField IDField;
    private javax.swing.JLabel Nombre;
    public javax.swing.JTextField NombreField;
    public javax.swing.JTable TablaUsers;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JPanel panelblanco;
    private javax.swing.JScrollPane tablaUsers;
    // End of variables declaration//GEN-END:variables
}
