package vista;


public class Formulario_Registro_Vehiculo extends javax.swing.JPanel {

 
    public Formulario_Registro_Vehiculo() {
        initComponents();
        
}
   
    @SuppressWarnings("unchecked")
     Generated code               
   
private void BotoRegistroMouseClicked(java.awt.event.MouseEvent evt) {                                          
    System.out.println("Se hizo click en el boton");
    String aux_Serial = Campo_Serial.getText();
    String aux_Modelo = Campo_Modelo.getText();
    System.out.println(aux_Serial+ " " + aux_Modelo);
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Campo_Modelo;
    private javax.swing.JTextField Campo_Serial;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane5;
    // End of variables declaration                   
}
