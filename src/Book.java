public class Book extends Section {
    public Book(String title) {
        super(title);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        for (Element child : children) {
            child.accept(visitor);
        }
    }
}