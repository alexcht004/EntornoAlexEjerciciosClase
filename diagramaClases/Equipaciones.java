package diagramaClases;

public class Equipaciones extends Alumnos{
	String nombre;
	int precio ;
	String calidad;

       
    public void actualizarPrecio(){
    	
    	precio = 23;
    }
    public void darCalidad(){
    	
    	calidad = "alta";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+precio);
    	System.out.println (""+calidad);
    }
    
    
    
    	
}