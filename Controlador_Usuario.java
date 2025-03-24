package controlador;

import modelo.Usuario;
import Vista.Formulario_Registro_Usuario;

public class Controlador{
    
    private Usuario objUsuario;
    private formulario_Registro_Usuario objformulario;
    
    
    public void Controlador(){
     this.objUsuario = new Usuario();
     this.objformulario = new Formulario_Registro_Usuario();
    
    }
