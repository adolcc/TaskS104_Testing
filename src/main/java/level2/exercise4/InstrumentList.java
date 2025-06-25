package level2.exercise4;

import java.util.ArrayList;

import java.util.List;

public class InstrumentList {

    private final List<Instrument> instruments = new ArrayList<>();

    public void addInstrument(Instrument instrument) {

        instruments.add(instrument);

    }

    public List<Instrument> getInstruments() {

        return instruments;

    }

    public boolean containsInstrument(Instrument instrument) {

        return instruments.contains(instrument);
    }

    public int countInstrument(Instrument instrument) {

        return (int) instruments.stream()
                .filter(i -> i.equals(instrument))
                .count();
    }
}
