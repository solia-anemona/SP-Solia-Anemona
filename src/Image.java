import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;

    public Image(String name) {
        this.imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return imageName;
    }

    @Override
    public void print() {
        System.out.println("Image: " + imageName);
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