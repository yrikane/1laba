public class Cheese extends Food {
    public Cheese() {
        super("Сыр");
    }

    @Override
    public void consume() {
        System.out.println(this + " съеден.");
    }
}