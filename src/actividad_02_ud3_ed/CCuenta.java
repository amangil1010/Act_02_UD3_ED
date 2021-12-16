/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 *
 * @author Ana
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

 
    public CCuenta ()
    {
    }
   /**
    *
    * @param nom Nombre del titular de la cuenta
    * @param cue
    * @param sal
    * @param tipo
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   *
   * @param nom nombre del titular de la cuenta
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    *
    * @return numero de cuenta
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     *
     * @return saldo de la cuenta
     */
   
     public double estado ()
    {
        return saldo;
    }
/**
 *
 * @param cantidad cantidad de dinero de la cuenta
 * @throws Exception no puede ingresar una cantidad negativa
 */
   
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }
/**
 *
 * @param cantidad cantidad de dinero de la cuenta
 * @throws Exception no se puede retirar una cantidad negativa
 */
   
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     *
     * @return numero de cuenta a obtener
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   *
   * @param cuenta numero de cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   *
   * @param saldo saldo de la cuenta
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  *
  * @return interes de la cuenta
  */

  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   *
   * @param tipoInterés tipo de interes de la cuenta
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
