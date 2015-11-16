
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBandResponse_QNAME = new QName("http://api.band.java.patrikbergman.se/", "getBandResponse");
    private final static QName _GetBand_QNAME = new QName("http://api.band.java.patrikbergman.se/", "getBand");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBand }
     * 
     */
    public GetBand createGetBand() {
        return new GetBand();
    }

    /**
     * Create an instance of {@link GetBandResponse }
     * 
     */
    public GetBandResponse createGetBandResponse() {
        return new GetBandResponse();
    }

    /**
     * Create an instance of {@link Band }
     * 
     */
    public Band createBand() {
        return new Band();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.band.java.patrikbergman.se/", name = "getBandResponse")
    public JAXBElement<GetBandResponse> createGetBandResponse(GetBandResponse value) {
        return new JAXBElement<GetBandResponse>(_GetBandResponse_QNAME, GetBandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.band.java.patrikbergman.se/", name = "getBand")
    public JAXBElement<GetBand> createGetBand(GetBand value) {
        return new JAXBElement<GetBand>(_GetBand_QNAME, GetBand.class, null, value);
    }

}
