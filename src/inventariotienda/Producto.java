
package inventariotienda;
/**

 * @author Monica Gomez
 */
public class Producto {
    private String producto;
    private String detalle;
    private float precio;
    private String codigo;
    private String estado;
    private String cantidad;
    private int min;
    private int max;
    
    public Producto(){};
    public String getProducto(){
        return producto;
    }
    public void setProducto(String producto){
        this.producto=producto;
    }
public String getDetalle(){
        return detalle;
    }
    public void setDetalle(String detalle){
        this.detalle=detalle;
    }
public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
public String getCantidad(){
        return cantidad;
    }
    public void setCantidad(String cantidad){
        this.cantidad=cantidad;
    }
public int getMin(){
        return min;
    }
    public void setMin(int min){
        this.min=min;
    }
public int getMax(){
        return max;
    }
    public void setMax(int max){
        this.max=max;
    }   
}
