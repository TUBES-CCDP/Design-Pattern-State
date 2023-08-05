public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.draw();
        lingkaran.erase();
        lingkaran.setState(new StateB());
        lingkaran.draw();
        lingkaran.erase();
    }
}