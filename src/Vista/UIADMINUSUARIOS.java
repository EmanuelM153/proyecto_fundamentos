package Vista;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UIADMINUSUARIOS extends javax.swing.JFrame {

    /**
     * Creates new form adminUsuariosVista
     */
    
  
    public UIADMINUSUARIOS() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

        BOTONES = new javax.swing.ButtonGroup();
        panelAzul = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        Bienvenido3 = new javax.swing.JLabel();
        BuscarField = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        ConsultarTodosBTN = new javax.swing.JButton();
        tablaUsers = new javax.swing.JScrollPane();
        TablaUsers = new javax.swing.JTable();
        Nombre = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();
        EdadField = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        ContraseñaField = new javax.swing.JPasswordField();
        ID1 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        Tipo = new javax.swing.JLabel();
        TipoAdminBTN = new javax.swing.JRadioButton();
        TipoUserBTN = new javax.swing.JRadioButton();
        CrearUsuarioBTN1 = new javax.swing.JButton();
        ActualizarUsuarioBTN = new javax.swing.JButton();
        EliminarUsuarioBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAzulLayout.setVerticalGroup(
            panelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAzulLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Bienvenido)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Bienvenido3.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Bienvenido3.setText("Buscar usuario");

        searchbtn.setBackground(new java.awt.Color(59, 159, 255));
        searchbtn.setForeground(new java.awt.Color(185, 189, 193));
        searchbtn.setText("BUSCAR");
        searchbtn.setBorder(null);
        searchbtn.setBorderPainted(false);
        searchbtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                searchbtnActionPerformed(evt);
            }
        });

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

        TablaUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Nombre", "Edad"
            }
        ));
        TablaUsers.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                TablaUsersMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                TablaUsersMousePressed(evt);
            }
        });
        tablaUsers.setViewportView(TablaUsers);

        Nombre.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Nombre.setText("Nombre ");

        Edad.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Edad.setText("Edad");

        NombreField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NombreFieldActionPerformed(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Contraseña.setText("Contraseña");

        ID1.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        ID1.setText("ID");

        Tipo.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        Tipo.setText("Tipo");

        TipoAdminBTN.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        TipoAdminBTN.setText("ADMINISTRADOR");
        TipoAdminBTN.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TipoAdminBTNActionPerformed(evt);
            }
        });

        TipoUserBTN.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        TipoUserBTN.setText("USUARIO");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CrearUsuarioBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ActualizarUsuarioBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarUsuarioBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tablaUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(ConsultarTodosBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Bienvenido3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre)
                            .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contraseña)
                            .addComponent(ContraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tipo))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID1)
                            .addComponent(EdadField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edad)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoAdminBTN)
                        .addGap(18, 18, 18)
                        .addComponent(TipoUserBTN)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Bienvenido3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarTodosBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tablaUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(Edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EdadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contraseña)
                    .addComponent(ID1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Tipo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoAdminBTN)
                    .addComponent(TipoUserBTN))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearUsuarioBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarUsuarioBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarUsuarioBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed

    private void ConsultarTodosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarTodosBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarTodosBTNActionPerformed

    private void NombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFieldActionPerformed

    private void TipoAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoAdminBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoAdminBTNActionPerformed

    private void CrearUsuarioBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearUsuarioBTN1ActionPerformed

    private void ActualizarUsuarioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarUsuarioBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarUsuarioBTNActionPerformed

    private void EliminarUsuarioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarUsuarioBTNActionPerformed

    private void TablaUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsersMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TablaUsersMouseClicked

    private void TablaUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsersMousePressed

    }//GEN-LAST:event_TablaUsersMousePressed

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
    public javax.swing.ButtonGroup BOTONES;
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JLabel Bienvenido3;
    public javax.swing.JTextField BuscarField;
    public javax.swing.JButton ConsultarTodosBTN;
    private javax.swing.JLabel Contraseña;
    public javax.swing.JPasswordField ContraseñaField;
    public javax.swing.JButton CrearUsuarioBTN1;
    private javax.swing.JLabel Edad;
    public javax.swing.JTextField EdadField;
    public javax.swing.JButton EliminarUsuarioBTN;
    private javax.swing.JLabel ID1;
    public javax.swing.JTextField IDField;
    private javax.swing.JLabel Nombre;
    public javax.swing.JTextField NombreField;
    public javax.swing.JTable TablaUsers;
    private javax.swing.JLabel Tipo;
    public javax.swing.JRadioButton TipoAdminBTN;
    public javax.swing.JRadioButton TipoUserBTN;
    private javax.swing.JPanel panelAzul;
    public javax.swing.JButton searchbtn;
    private javax.swing.JScrollPane tablaUsers;
    // End of variables declaration//GEN-END:variables
}
