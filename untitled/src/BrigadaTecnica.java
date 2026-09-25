public class BrigadaTecnica extends EquipoEmergencia implements  IReparador{

    public BrigadaTecnica(String nombre) {
        super(nombre);

    }
    @Override
    public void AtenderEmergencia() {
        System.out.println("Revisando  infraestructura dañada");

    }

    @Override
    public void reparar() {
        System.out.println("reparamos en 5 ");
    }
}
