package inventariotienda;

/**

 * @author Monica Gomez
 */
public class Usuario {
    private String nombre;
    private String id;
    private String contra;

public Usuario (){};
public String nombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
public String getContra(){
        return contra;
    }
    public void setContra(String contra){
        this.contra=contra;
    }    
}
