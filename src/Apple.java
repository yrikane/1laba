public class Apple extends Food {
    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void consume() {
        System.out.println(this + " размера " + size.toUpperCase() + " съедено.");
    }

    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}