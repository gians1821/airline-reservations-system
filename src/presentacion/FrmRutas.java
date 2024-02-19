/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import entidades.*;
import logica.*;

/**
 *
 * @author RenzoF
 */
public class FrmRutas extends javax.swing.JFrame {
    GrafoMatriz gr = new GrafoMatriz(12);

    /**
     * Creates new form FrmRutas
     */
    public FrmRutas() {
        initComponents();
        setLocationRelativeTo(null);
        gr.insertarVertice(0, "PERU");
        gr.insertarVertice(1, "CANADA");
        gr.insertarVertice(2, "EE.UU");
        gr.insertarVertice(3, "REYNO UNIDO");
        gr.insertarVertice(4, "ESPAÑA");
        gr.insertarVertice(5, "BRASIL");
        gr.insertarVertice(6, "FRANCIA");
        gr.insertarVertice(7, "ALEMANIA");
        gr.insertarVertice(8, "ITALIA");
        gr.insertarVertice(9, "AUSTRALIA");
        gr.insertarVertice(10, "JAPON");
        gr.InsertarArista(0, 1, 7800);
        gr.InsertarArista(0, 2, 5500);
        gr.InsertarArista(0, 3, 9700);
        gr.InsertarArista(0, 4, 9000);
        gr.InsertarArista(0, 5, 3300);
        gr.InsertarArista(1, 2, 2400);
        gr.InsertarArista(2, 3, 4200);
        gr.InsertarArista(3, 6, 340);
        gr.InsertarArista(4, 5, 7800);
        gr.InsertarArista(4, 6, 970);
        gr.InsertarArista(4, 7, 1800);
        gr.InsertarArista(4, 8, 1500);
        gr.InsertarArista(5, 7, 9400);
        gr.InsertarArista(5, 8, 9000);
        gr.InsertarArista(5, 9, 15000);
        gr.InsertarArista(6, 7, 800);//
        gr.InsertarArista(7, 9, 14000);
        gr.InsertarArista(7, 10, 9000);
        gr.InsertarArista(8, 10, 9700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnCalcularRutas = new javax.swing.JButton();
        cbOrigen = new javax.swing.JComboBox<>();
        cbDestino = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("DESTINO: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 90, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("ORIGEN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 60, 20));

        btnAtras.setBackground(new java.awt.Color(255, 153, 153));
        btnAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRÁS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 150, 50));

        btnCalcularRutas.setBackground(new java.awt.Color(204, 255, 204));
        btnCalcularRutas.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 14)); // NOI18N
        btnCalcularRutas.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcularRutas.setText("CALCULAR");
        btnCalcularRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularRutasActionPerformed(evt);
            }
        });
        jPanel2.add(btnCalcularRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 160, 40));

        cbOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peru", "Canada", "EE.UU", "Reino Unido", "España", "Brasil", "Francia", "Alemania", "Italia", "Australia", "Japon" }));
        jPanel2.add(cbOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 120, 30));

        cbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peru", "Canada", "EE.UU", "Reino Unido", "España", "Brasil", "Francia", "Alemania", "Italia", "Australia", "Japon" }));
        cbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDestinoActionPerformed(evt);
            }
        });
        jPanel2.add(cbDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 120, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("NUESTRAS RUTAS MAS CORTAS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 300, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel-mapa-mundial-mapa-politico-mundo-sobre-fondo-gris_594089-71.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDestinoActionPerformed

    private void btnCalcularRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRutasActionPerformed
        String origen = (String) cbOrigen.getSelectedItem();
        String destino = (String) cbDestino.getSelectedItem();
        int o = gr.buscarVertice(origen);
        int d = gr.buscarVertice(destino);
        gr.calcularDijkstra(o, d);
    }//GEN-LAST:event_btnCalcularRutasActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.setVisible(false);
        FrmRegistroClientes frameRegistroClientes = new FrmRegistroClientes();
        frameRegistroClientes.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCalcularRutas;
    private javax.swing.JComboBox<String> cbDestino;
    private javax.swing.JComboBox<String> cbOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}