package MusicInstruments.shop.InstrumentKind.Wind;

import MusicInstruments.shop.InstrumentKind.InstrumentKind;
import MusicInstruments.shop.InstrumentKind.MusicInstrument;

public class WindInstrument extends MusicInstrument {

    public WindInstrument(String name, double price) {
        super(name, price, InstrumentKind.WIND);
    }
}
