package zwierzeta;

public abstract class Ryba extends Zwierze {
    String gatunek = "rybus pospolitus";

    @Override
    public void plyn() {
        System.out.println("Ryba plynie");
    }

    @Override
    public void wynurz() {
        System.out.println("Ryba sie wynurza");
    }

    @Override
    public void zanurz() {
        System.out.println("Ryba sie zanurza");
    }

    public void jedz() {
        System.out.println("Ryba je");
    }

    public void wydalaj() {
        System.out.println("Ryba wydala");
    }
}
