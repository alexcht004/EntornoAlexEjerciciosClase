package diagramaClases;

public class Instalaciones {
	String nombre;
	int dimencion ;
	String conservacion;
    public void actualizarDimencion(){
    	
    	dimencion = 24;
    }
    public void actualizarConservacion(){
    	
    	conservacion = "alta";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+dimencion);
    	System.out.println (""+conservacion);
    }
    
}