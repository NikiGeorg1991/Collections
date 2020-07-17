package MusicInstruments.shop.InstrumentKind.Percussion;

import MusicInstruments.shop.InstrumentKind.InstrumentKind;
import MusicInstruments.shop.InstrumentKind.MusicInstrument;

public class PercussionInstrument extends MusicInstrument {

    public PercussionInstrument(String name, double price) {
        super(name, price, InstrumentKind.PERCUSSION);
    }
}
