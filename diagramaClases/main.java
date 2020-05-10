package diagramaClases;



public class main {
    public static void main(String[] args) {
        //OBJETO
        Instituto instituto = new Instituto();
        
        
        
        
        Instalaciones instalaciones = new Instalaciones();
        Alumnos alumnos = new Alumnos();
        PistasDeportivas pistasDeportivas = new PistasDeportivas();

        PistasDescanso pistasDescanso = new PistasDescanso();
        Aulas aulas = new Aulas();
        Personas personas = new Personas();
        Trabajadores trabajadores = new Trabajadores();
        
        //OBJETO EQUIPACIONES

        Equipaciones equipaciones = new Equipaciones();
        //MOSTRAR METODOS
        equipaciones.actualizarPrecio();
        equipaciones.darCalidad();
        equipaciones.mostrarDatos();
      
        
        
        SalasDeReunion salasDeReunion = new SalasDeReunion();
        
        //METODOS EQUIPACIONES
        


    }
}