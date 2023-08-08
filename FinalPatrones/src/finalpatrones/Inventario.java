
package finalpatrones;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisd
 */
public class Inventario extends javax.swing.JFrame {
    String DRIVER ="com.mysql.jdbc.Driver";
    String USUARIO="root";
    String PASSWORD="JOSMANU18";
    String URL="jdbc:mysql://localhost:3306/Proyecto";
    Connection con = null;
    Statement smt = null;
    

    /**
     * Creates new form Inventario
     */
    public Inventario() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Inventarios El Rey");
        TableDatos();
        
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regresarInve = new javax.swing.JButton();
        prenda = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        btnAnadir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblPrenda = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        jLabel1.setText("Inventario");

        regresarInve.setText("Regresar");
        regresarInve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarInveActionPerformed(evt);
            }
        });

        prenda.setBackground(new java.awt.Color(204, 255, 255));
        prenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prenda.setName("da"); // NOI18N

        marca.setBackground(new java.awt.Color(204, 255, 255));
        marca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        marca.setName("da"); // NOI18N

        codigo.setBackground(new java.awt.Color(204, 255, 255));
        codigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigo.setName("da"); // NOI18N

        precio.setBackground(new java.awt.Color(204, 255, 255));
        precio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        precio.setName("da"); // NOI18N

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prenda", "Marca", "Codigo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaInventario);

        btnAnadir.setText("Anadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPrenda.setText("Prenda");

        lblMarca.setText("Marca");

        lblCod.setText("Codigo");

        lblPrecio.setText("Precio");

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnAnadir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prenda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMarca)
                                        .addComponent(lblCod)))
                                .addComponent(lblPrecio)
                                .addComponent(lblPrenda))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(regresarInve)
                                .addGap(79, 79, 79)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(regresarInve))
                        .addGap(23, 23, 23)
                        .addComponent(lblPrenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecio)
                        .addGap(3, 3, 3)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addComponent(btnAnadir)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnUpdate))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void regresarInveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarInveActionPerformed
        this.setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_regresarInveActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed

            anadir(); 
           
            
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Eliminar m = new Eliminar();
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            // TODO add your handling code here:
            con = DriverManager.getConnection(URL,USUARIO,PASSWORD);
            String id = tablaInventario.getValueAt(tablaInventario.getSelectedRow(),0).toString();
            Actualizar(prenda, marca,precio,id);
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed
    public void Actualizar(JTextField prenda,JTextField marca,JTextField precio,String id){
        try {
            String sql = "update product set  prenda =  '" +prenda.getText() +"', marca = '" +marca.getText() +"', price = '"+ Integer.parseInt(precio.getText())+ "', where code = " + id;
            Statement st;
            con = DriverManager.getConnection(URL,USUARIO,PASSWORD);
            st = con.createStatement();
            int rs =st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    void anadir(){
        
    try {
            // TODO add your handling code here:
        
            con = DriverManager.getConnection(URL,USUARIO,PASSWORD);           
            String sql = "Insert into product values(?,?,?,?)";
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setInt(1,Integer.parseInt(codigo.getText()));
            psmt.setInt(2, Integer.parseInt(precio.getText()));
            psmt.setString(3, marca.getText());
            psmt.setString(4, prenda.getText());
            psmt.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tablaInventario.getModel();
            model.addRow(new Object[]{prenda.getText(),marca.getText(),codigo.getText(),precio.getText()});
            //smt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 
    private void TableDatos()  {
        try{
          con = DriverManager.getConnection(URL,USUARIO,PASSWORD);
          DefaultTableModel model = (DefaultTableModel)tablaInventario.getModel();   
          //model.setRowCount(0);
          
    
          
          Statement s = con.createStatement();
          
          ResultSet rs = s.executeQuery("SELECT * from product");
          
          while(rs.next()){
            String precioo = String.valueOf(rs.getString("price"));
            String marca = rs.getString("marca");
            String cod = String.valueOf(rs.getString("code"));
            String prenda = rs.getString("prenda");     
            System.out.print(precioo);
            String jdata[] = {prenda,marca,cod,precioo};
            model.addRow(jdata);
             
          }
          
          
         con.close();
         
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
}
    
    void eliminar(){
        this.setVisible(false);
        Eliminar eli = new Eliminar();
        eli.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnUpdate;
    public javax.swing.JTextField codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrenda;
    public javax.swing.JTextField marca;
    public javax.swing.JTextField precio;
    public javax.swing.JTextField prenda;
    private javax.swing.JButton regresarInve;
    public javax.swing.JTable tablaInventario;
    // End of variables declaration//GEN-END:variables
}
