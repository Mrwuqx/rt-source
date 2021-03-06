package java.rmi;

import java.io.IOException;

public class RemoteException extends IOException {
  private static final long serialVersionUID = -5148567311918794206L;
  
  public Throwable detail;
  
  public RemoteException() { initCause(null); }
  
  public RemoteException(String paramString) {
    super(paramString);
    initCause(null);
  }
  
  public RemoteException(String paramString, Throwable paramThrowable) {
    super(paramString);
    initCause(null);
    this.detail = paramThrowable;
  }
  
  public String getMessage() { return (this.detail == null) ? super.getMessage() : (super.getMessage() + "; nested exception is: \n\t" + this.detail.toString()); }
  
  public Throwable getCause() { return this.detail; }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\java\rmi\RemoteException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */