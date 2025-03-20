# interfaces
package proyectointerfaz;

public class Proyectointerfaz {

    public static void main(String[] args) {
        // TODO code application logic here
        controlador objcontrolador = new controlador;
    }
    
}

public class Vehiculo {

    private String Modelo_Vehiculo;
    private String Serial_vehiculo;

    public Vehiculo{
        this.Modelo_Vehiculo;
        this.Serial_vehiculo;
    }

    public String getSerial_vehiculo() {
        return Serial_vehiculo;
    }

    public void setSerial_vehiculo(String Serial_vehiculo) {
        this.Serial_vehiculo = Serial_vehiculo;
    }

    public void getModelo_Vehiculo() {
        return Modelo_Vehiculo;
    }

    public void setModelo_Vehiculo(String Modelo_Vehiculo) {
        this.Modelo_Vehiculo = Modelo_Vehiculo;
    }
   
    public void conexion () {
        
    }
}



package controlador;

import Vista.Formulario_Registro_Vehiculo;

public class proyectointerfaz {
    
    public static void main(String[]args){
    Formulario_Registro_Vehiculo.objRegistro_vehiculo new registro_Vehiculo ;
    objRegistro_Vehiculo.setVisible(b:true);
    }
}
package controlador2;

import modelo.Vehiculo;
import Vista.Formulario_Registro_Vehiculo;

public class Controlador2 {
    
    private Vehiculo objVehiculo;
    private Formulario_Registro_Vehiculo objformulario;
    
    
    public Controlador2(){
     this.objVehiculo = new Vehiculo();
     this.objformulario = new Formulario_Registro_Vehiculo();
    
    }
}
