package com.sun.xml.internal.ws.message.stream;

import com.sun.istack.internal.FinalArrayList;
import com.sun.xml.internal.stream.buffer.XMLStreamBuffer;
import com.sun.xml.internal.ws.message.Util;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StreamHeader11 extends StreamHeader {
  protected static final String SOAP_1_1_MUST_UNDERSTAND = "mustUnderstand";
  
  protected static final String SOAP_1_1_ROLE = "actor";
  
  public StreamHeader11(XMLStreamReader paramXMLStreamReader, XMLStreamBuffer paramXMLStreamBuffer) { super(paramXMLStreamReader, paramXMLStreamBuffer); }
  
  public StreamHeader11(XMLStreamReader paramXMLStreamReader) throws XMLStreamException { super(paramXMLStreamReader); }
  
  protected final FinalArrayList<StreamHeader.Attribute> processHeaderAttributes(XMLStreamReader paramXMLStreamReader) {
    FinalArrayList finalArrayList = null;
    this._role = "http://schemas.xmlsoap.org/soap/actor/next";
    for (byte b = 0; b < paramXMLStreamReader.getAttributeCount(); b++) {
      String str1 = paramXMLStreamReader.getAttributeLocalName(b);
      String str2 = paramXMLStreamReader.getAttributeNamespace(b);
      String str3 = paramXMLStreamReader.getAttributeValue(b);
      if ("http://schemas.xmlsoap.org/soap/envelope/".equals(str2))
        if ("mustUnderstand".equals(str1)) {
          this._isMustUnderstand = Util.parseBool(str3);
        } else if ("actor".equals(str1) && str3 != null && str3.length() > 0) {
          this._role = str3;
        }  
      if (finalArrayList == null)
        finalArrayList = new FinalArrayList(); 
      finalArrayList.add(new StreamHeader.Attribute(str2, str1, str3));
    } 
    return finalArrayList;
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\xml\internal\ws\message\stream\StreamHeader11.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */