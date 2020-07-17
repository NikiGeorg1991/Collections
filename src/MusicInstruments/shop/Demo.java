package MusicInstruments.shop;

import MusicInstruments.shop.InstrumentKind.KeyBoard.Piano;
import MusicInstruments.shop.InstrumentKind.MusicInstrument;
import MusicInstruments.shop.InstrumentKind.Percussion.Drums;
import MusicInstruments.shop.InstrumentKind.Stringed.ContraBass;
import MusicInstruments.shop.InstrumentKind.Stringed.Harp;
import MusicInstruments.shop.InstrumentKind.Wind.Flute;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        Shop shop = new Shop(1500);

        MusicInstrument piano = new Piano(165);
        MusicInstrument drums = new Drums(56);
        MusicInstrument contrabass = new ContraBass(76);
        MusicInstrument harp = new Harp(98.34);
        MusicInstrument flute = new Flute(88.99);

        Random r = new Random();
        int pianoRandom = r.nextInt(10);
        shop.addInstrument(piano, pianoRandom);

        Random x = new Random();
        int drumsRandom = x.nextInt(10);
        shop.addInstrument(drums, drumsRandom);

        Random a = new Random();
        int contrabassRandom = a.nextInt(10);
        shop.addInstrument(contrabass, contrabassRandom);

        Random b = new Random();
        int harpRandom = b.nextInt(10);
        shop.addInstrument(harp, harpRandom);

        Random c = new Random();
        int fluteRandom = c.nextInt(10);
        shop.addInstrument(flute, fluteRandom);

        shop.showInstruments();

//        shop.sellInstrument(harp, 2);
//        shop.sellInstrument(flute, 3);
//        shop.sellInstrument(drums, 2);

//        shop.showInstruments();

//        shop.printShopIncome();
//
//        shop.printAllInstrumentsByCriteria(CatalogueCriteria.KIND);
//        shop.printAllInstrumentsByCriteria(CatalogueCriteria.NAME);
//        shop.printAllInstrumentsByCriteria(CatalogueCriteria.PRICE_DOWN);
//        shop.printAllInstrumentsByCriteria(CatalogueCriteria.PRICE_UP);
//
//        shop.printSoldInstrumentsByMarketability();
    }
}
