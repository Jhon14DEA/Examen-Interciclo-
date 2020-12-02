/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ed.ups.Vista;

import ec.ed.ups.Controlador.Controlador;
import ec.ed.ups.Controlador.ControladorActividad;
import ec.ed.ups.Controlador.ControladorAlumno;
import ec.ed.ups.Controlador.ControladorCurso;
import ec.ed.ups.Controlador.ControladorPersona;
import ec.ed.ups.Controlador.ControladorProfesor;
import ec.ed.ups.Controlador.ControladorRector;
import ec.ed.ups.Controlador.ControladorRgx;
import ec.ed.ups.Modelo.Persona;



/**
 * 
 * 
 */
public class Principal extends javax.swing.JFrame {

        
        
private Controlador<Persona> controlador;

    private final IniciarSesion login;
    private  final Registrarse registrarse;
    private  final GestionDocente gestionDocente;
    
    public Principal() {
        controlador= new Controlador<Persona>() {
            @Override
            public boolean validar(Persona obj) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int generarId() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
           
        initComponents();
        login = new IniciarSesion();
        registrarse  = new Registrarse();
        gestionDocente = new GestionDocente();
        
        
        
        
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bProfes = new javax.swing.JButton();
        bAlumno = new javax.swing.JButton();
        bRectr = new javax.swing.JButton();
        bLog = new javax.swing.JButton();
        bRegistra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Bienvenido ");

        jLabel2.setText("Elija una opcion. ");

        bProfes.setText("Profesor");

        bAlumno.setText("Alumno ");

        bRectr.setText("Rector");
        bRectr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRectrActionPerformed(evt);
            }
        });

        bLog.setText("Iniciar sesion");
        bLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogActionPerformed(evt);
            }
        });

        bRegistra.setText("Registrarse ");
        bRegistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(bProfes)
                        .addGap(84, 84, 84)
                        .addComponent(bAlumno)
                        .addGap(80, 80, 80)
                        .addComponent(bRectr, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(bLog, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(bRegistra)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bProfes)
                    .addComponent(bAlumno)
                    .addComponent(bRectr))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLog)
                    .addComponent(bRegistra))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogActionPerformed
        // TODO add your handling code here:
        //IniciarSesion login = new  IniciarSesion();
        //login.setEnabled(true);
        
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bLogActionPerformed

    private void bRegistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistraActionPerformed
        // TODO add your handling code here:
        registrarse.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bRegistraActionPerformed

    private void bRectrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRectrActionPerformed
        // TODO add your handling code here:
        gestionDocente.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bRectrActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlumno;
    private javax.swing.JButton bLog;
    private javax.swing.JButton bProfes;
    private javax.swing.JButton bRectr;
    private javax.swing.JButton bRegistra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
