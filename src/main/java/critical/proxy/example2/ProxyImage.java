package critical.proxy.example2;

/**
 * Lazy loading image
 */
class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage = null;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
