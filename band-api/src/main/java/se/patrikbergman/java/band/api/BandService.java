package se.patrikbergman.java.band.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * SEI (Service Endpoint Interface)
 * The SEI specifies, at a high level that befits an interface, the service operations,
 */
@WebService
public interface BandService {

    @WebMethod
    Band getBand(final int index);
}
