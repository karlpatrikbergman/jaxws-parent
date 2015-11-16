package se.patrikbergman.java.jaxws.band.service;

import com.google.common.collect.ImmutableList;
import lombok.Data;
import se.patrikbergman.java.band.api.Band;
import se.patrikbergman.java.band.api.BandService;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * SIB (Service Implementation Bean)
 * The SIB provides an implementation of the operations
 */
@Data
@WebService(endpointInterface = "se.patrikbergman.java.band.api.BandService")
public class BandServiceImpl implements BandService {

    private ImmutableList<Band> bands;


    /**
     * action:
     * The action for this operation. For SOAP bindings, this determines the value of the SOAPAction header.
     *
     * operationName:
     * Name of the wsdl:operation matching this method
     *
     *  @param index
     * @return
     */
    @WebMethod(action = "getBandAction", operationName = "get")
    public Band getBand(final int index) {
        return bands.get(index);
    }

    public static BandService of(ImmutableList<Band> bands) {
        final BandServiceImpl bandService = new BandServiceImpl();
        bandService.setBands(bands);
        return bandService;
    }
}
