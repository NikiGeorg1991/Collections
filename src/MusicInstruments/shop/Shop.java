package MusicInstruments.shop;

import MusicInstruments.shop.InstrumentKind.InstrumentKind;
import MusicInstruments.shop.InstrumentKind.MusicInstrument;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Shop {

    private String name;
    private double money;
    private Map<InstrumentKind, Map<MusicInstrument, Integer>> catalogue;
    private Map<MusicInstrument, Integer> sold;
    private double income;

    public Shop(double money) {
        this.money = money;
        this.catalogue = new HashMap<>();
        this.sold = new HashMap<>();
    }

    public void addInstrument(MusicInstrument instrument, int quantity){
        InstrumentKind kind = instrument.getKind();
        this.catalogue.putIfAbsent(kind, new TreeMap<>());

        this.catalogue.get(kind).putIfAbsent(instrument, 0);
        this.catalogue.get(kind).put(instrument, this.catalogue.get(kind).get(instrument) + quantity);
    }

    public void showInstruments() {
        for (Map.Entry<InstrumentKind, Map<MusicInstrument, Integer>> entry : this.catalogue.entrySet()) {
            System.out.println(entry.getKey());

            for (Map.Entry<MusicInstrument, Integer> innerEntry : entry.getValue().entrySet()) {
                System.out.println("\t" + innerEntry.getKey() + " - quantity: " + innerEntry.getValue());
            }
        }
    }




}
