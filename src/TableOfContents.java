public class TableOfContents implements Element {
    private String something;

    public TableOfContents(String something) {
        this.something = something;
    }

    public TableOfContents() {
        this.something = "Table of Contents";
    }

    @Override
    public void print() {
        System.out.println("TableOfContents: " + something);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Cannot add to TableOfContents");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Cannot remove from TableOfContents");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Cannot get from TableOfContents");
    }
}