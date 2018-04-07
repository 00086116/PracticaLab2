
package inventariotienda;

/**
 * @author Monica Gomez
 */
public class Provedores {
    private String empresa;
    private String nombre;       
    private String producto;
    private String telefono;       
  

public Provedores(){};
   public String getEmpresa(){
        return empresa;
    }
    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }
 public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }   
public String getProducto(){
        return producto;
    }
    public void setProducto(String producto){
        this.producto=producto;
    }
public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

}
