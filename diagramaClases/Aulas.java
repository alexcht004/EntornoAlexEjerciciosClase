package diagramaClases;

public class Aulas extends Instalaciones{
	String nombre;
	int edad ;
	int dimencion;
    public void actualizarDimencion(){
    	
    	dimencion = 200;
    }
    public void actualizarNombre(){
    	
    	nombre = "clase musica";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+dimencion);
    	System.out.println (""+nombre);
    }
    
}