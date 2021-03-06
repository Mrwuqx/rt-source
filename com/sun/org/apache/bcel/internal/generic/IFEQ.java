package com.sun.org.apache.bcel.internal.generic;

public class IFEQ extends IfInstruction {
  IFEQ() {}
  
  public IFEQ(InstructionHandle paramInstructionHandle) { super((short)153, paramInstructionHandle); }
  
  public IfInstruction negate() { return new IFNE(this.target); }
  
  public void accept(Visitor paramVisitor) {
    paramVisitor.visitStackConsumer(this);
    paramVisitor.visitBranchInstruction(this);
    paramVisitor.visitIfInstruction(this);
    paramVisitor.visitIFEQ(this);
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\org\apache\bcel\internal\generic\IFEQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */