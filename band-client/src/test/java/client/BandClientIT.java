package client;

import org.junit.Test;

/**
 * Still not sure of how to properly write integrations-tests with
 * jax-ws. This test fits better in band-service as BandServiceIT.
 */
public class BandClientIT {

    @Test
    public void getBands() {
        //set up
        BandServiceImplService service = new BandServiceImplService();
        BandService port = service.getBandServiceImplPort();

        //sample calls
        System.out.println(port.getBand(0).getName());
    }

}