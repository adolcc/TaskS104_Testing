package level2.exercise4;

public class Instrument {

    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getNombre() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "nombre='" + name + '\'' +
                '}';
    }
}
