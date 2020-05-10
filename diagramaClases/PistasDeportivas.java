package diagramaClases;

public class PistasDeportivas extends Instalaciones{
	String nombre;
	int dimencion ;
	String estado;
    public void actualizarDimencion(){
    	
    	dimencion = 200;
    }
    public void actualizarEstado(){
    	
    	estado = "alta";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+dimencion);
    	System.out.println (""+estado);
    }
    
}