package factorymethod;

class JokuToinenOtus extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Mehu(); // Luo joku toinen juoma
    }
}