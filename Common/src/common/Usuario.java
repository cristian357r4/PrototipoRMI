package common;

import java.io.Serializable;

public class Usuario implements Serializable {
  private String noCuenta;
  private String unip;
  public Usuario (){

  }

  public String getNoCuenta() {
    return noCuenta;
  }

  public void setNoCuenta(String noCuenta) {
    this.noCuenta = noCuenta;
  }

  public String getUnip() {
    return unip;
  }

  public void setUnip(String unip) {
    this.unip = unip;
  }
}
