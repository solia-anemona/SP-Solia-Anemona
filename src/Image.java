public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("Image with url: " + url);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Cannot add to an Image");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Cannot remove from an Image");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Cannot get from an Image");
    }
}