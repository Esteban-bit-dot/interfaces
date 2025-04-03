package vista;


public class Formulario_Registro_Usuario extends javax.swing.JPanel {

   
    public Formulario_Registro_Usuario() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    
    
    private void BotoRegistroMouseClicked(java.awt.event.MouseEvent evt) {                                          
        System.out.println("Se hizo click en el boton");
        String aux_Nombre = Campo_Nombre.getText();
        String aux_Correo = Campo_Correo.getText();
        String aux_Contraseña = Campo_Contraseña.getText();
        System.out.println(aux_Nombre+ " " + aux_Correo+ " " +aux_Contraseña);
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Campo_Contraseña;
    private javax.swing.JTextField Campo_Correo;
    private javax.swing.JTextField Campo_Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    // End of variables declaration                   
}
