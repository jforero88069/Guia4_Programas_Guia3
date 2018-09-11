package supermercadosantafe;

public class Empleado {
    
    private String nombre;
    private String depto;
    private String posicion;
    private String salario;
    
    public void Empleado(String nombre, String depto, String posicion, String salario){
        
        this.nombre = nombre;
        this.depto = depto;
        this.posicion = posicion;
        this.salario = salario;
    
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDepto(){
        return depto;
    }
    
    public void setDepto(String depto){
        this.depto = depto;
    }
    
    public String getPosicion(){
        return posicion;
    }
    
    public void setPosicion(String posicion){
        this.posicion = posicion;
    }
    
    public String getSalario(){
        return salario;
    }
    
    public void setSalario(String salario){
        this.salario = salario;
    }
}
