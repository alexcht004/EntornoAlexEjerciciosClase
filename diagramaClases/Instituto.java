package diagramaClases;

public class Instituto {
	String nombre;
	int edad ;
	int titulos;
	
	
    public void actualizarEdad(){
    	
    	edad = 24;
    }
    public void darNombre(){
    	
    	nombre = "ADA";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+edad);
    	System.out.println (""+nombre);
    }
    
}