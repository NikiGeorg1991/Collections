package MusicInstruments.shop.InstrumentKind.Electronic;

import MusicInstruments.shop.InstrumentKind.InstrumentKind;
import MusicInstruments.shop.InstrumentKind.MusicInstrument;

public class ElectronicInstrument extends MusicInstrument {

    public ElectronicInstrument(String name, double price) {
        super(name, price, InstrumentKind.ELECTRONIC);
    }
}
