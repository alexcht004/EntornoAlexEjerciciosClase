package diagramaClases;

public class Alumnos extends Personas{
	String nombre;
	int edad ;
	String rendimiento;
    public void actualizarEdad(){
    	
    	edad = 24;
    }
    public void darNombre(){
    	
    	nombre = "alex";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+edad);
    	System.out.println (""+nombre);
    }
    
}