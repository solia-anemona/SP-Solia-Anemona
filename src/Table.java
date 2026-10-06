public class Table implements Element {
    private String something;

    public Table(String something) {
        this.something = something;
    }

    @Override
    public void print() {
        System.out.println("Table: " + something);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Cannot add to a Table");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Cannot remove from a Table");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Cannot get from a Table");
    }
}