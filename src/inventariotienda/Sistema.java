
package inventariotienda;

/**
 * @author Monica Gomez
 */
public class Sistema {
  private String trans;
  private String codP;
  private String cantP;
  private float total;

  public Sistema(){};
   
  public String trans(){
        return trans;
    }
    public void setTrans(String trans){
        this.trans=trans;
    }
public String codP(){
        return codP;
    }
    public void setCodP(String codP){
        this.codP=codP;
    }
public String cantP(){
        return cantP;
    }
    public void setCantP(String cantP){
        this.cantP=cantP;
    }
public float total(){
        return total;
    }
    public void setTotal(float total){
        this.total=total;
    }
}
