package se.patrikbergman.java.jaxws.band;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;
import se.patrikbergman.java.band.api.Band;
import se.patrikbergman.java.band.api.BandService;
import se.patrikbergman.java.jaxws.band.service.BandServiceImpl;

import static org.junit.Assert.assertEquals;

public class BandServiceTest {

    private final String BAND_NAME = "Judas Priest";
    private final String BAND_DESCRIPTION = "Judas Priest is a British heavy metal band formed in Birmingham, England, in 1970";
    private final int BAND_ROCK_FACTOR = 7;
    private BandService bandService;

    @Before
    public void setup() {
        bandService = BandServiceImpl.of(
                ImmutableList.of(
                        Band.builder()
                                .name(BAND_NAME)
                                .description(BAND_DESCRIPTION)
                                .rockFactor(BAND_ROCK_FACTOR)
                                .build()
                )
        );
    }

    @Test
    public void getBand() {
        final Band band = bandService.getBand(0);
        assertEquals(band.getName(), BAND_NAME);
        assertEquals(band.getDescription(), BAND_DESCRIPTION);
        assertEquals(band.getRockFactor(), BAND_ROCK_FACTOR);
    }

}