package veterinariaguia3;

public class Perros {
    
    private String nombre;
    private String raza;
    private String localidad;
    private String dueño;
    private String cedula;
    private String telefono;
    private String asistencia;
    static Perros perro1;
    
    public void Perros(String nombre, String raza, String localidad, String dueño, String cedula, String telefono, String asistencia ){
        
        this.nombre = nombre;
        this.raza = raza;
        this.localidad = localidad;
        this.dueño = dueño;
        this.cedula = cedula;
        this.telefono = telefono;
        this.asistencia = asistencia;
      
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getRaza(){
        return raza;
    }
    
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public String getLocalidad(){
        return localidad;
    }
    
    public void setLocalidad(String localidad){
        this.localidad = localidad;
    }
    
    public String getDueño(){
        return dueño;
    }
    
    public void setDueño(String dueño){
        this.dueño = dueño;
    }    
    
    public String getCedula(){
        return cedula;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }    
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }    
    
    public String getAsistencia(){
        return asistencia;
    }
    
    public void setAsistencia(String asistencia){
        this.asistencia = asistencia;
    } 

}



