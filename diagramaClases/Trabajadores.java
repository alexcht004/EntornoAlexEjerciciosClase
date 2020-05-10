package diagramaClases;

public class Trabajadores extends Personas {
	String nombre;
	int edad ;
	String cargo;
	///metodos
    public void actualizarEdad(){
    	
    	edad = 24;
    }
    public void darCargo(){
    	
    	cargo = "director";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+edad);
    	System.out.println (""+cargo);
    }
    
}