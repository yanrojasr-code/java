public class BrigadaTecnica extends EquipoEmergencia{

    public BrigadaTecnica(String nombre) {
        super(nombre);

    }
    @Override
    public void AtenderEmergencia() {
        System.out.println("Revisando  infraestructura dañada");

    }
}
