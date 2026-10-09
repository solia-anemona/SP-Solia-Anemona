public class ImageProxy implements Element {
    private String imageName;
    private Image realImage = null;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    private Image loadImage() {
        if (realImage == null) {
            realImage = new Image(imageName);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element element) {}

    @Override
    public void remove(Element element) {}

    @Override
    public Element get(int index) {
        return null;
    }
}