package MusicInstruments.shop.InstrumentKind.KeyBoard;

import MusicInstruments.shop.InstrumentKind.InstrumentKind;
import MusicInstruments.shop.InstrumentKind.MusicInstrument;

public class KeyboardInstrument extends MusicInstrument {

    public KeyboardInstrument(String name, double price) {
        super(name, price, InstrumentKind.KEYBOARD);
    }
}
