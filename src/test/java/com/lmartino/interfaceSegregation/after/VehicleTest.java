package com.lmartino.interfaceSegregation.after;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lore on 14/01/18.
 */
public class VehicleTest {


    @Test
    public void porsheCanChangeGears() throws Exception {
        Porsche porsche = new Porsche();
        porsche.changeGear(4);
        assertThat(porsche.getGear(), is(4));
    }

    @Test
    public void porshePlayIpod() throws Exception {
        Porsche porsche = new Porsche();
        porsche.playIPod();
    }

    @Test
    public void oldBeaterCannotChangeGears() throws Exception {
        OldBeaterAutomaticTransmission oldBeaterAutomaticTransmission = new OldBeaterAutomaticTransmission();
        assertThat(oldBeaterAutomaticTransmission.getGear(), is(1));
    }
}