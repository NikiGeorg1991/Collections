package MusicInstruments.shop.InstrumentKind.Stringed;

import MusicInstruments.shop.InstrumentKind.InstrumentKind;
import MusicInstruments.shop.InstrumentKind.MusicInstrument;

public class StringedInstrument extends MusicInstrument {

    public StringedInstrument(String name, double price) {
        super(name, price, InstrumentKind.STRINGED);
    }
}
