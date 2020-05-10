package diagramaClases;

public class SalasDeReunion	extends Instalaciones {


		String nombre;
		int dimencion ;
		String estado;
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