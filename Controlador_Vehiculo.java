package controlador;

import modelo.Vehiculo;

import Vista.formulario_Registro_Vehiculo;

public class Controlador{
    
    private Vehiculo objVehiculo;
    private formulario_Registro_Vehiculo objformulario;
    
    
    public Controlador(){
     this.objVehiculo = new Vehiculo();
     this.objformulario = new formulario_Registro_Vehiculo();
    
    }
}
