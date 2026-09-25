public class BrigadaMedica extends EquipoEmergencia{


    public BrigadaMedica(String nombre) {
        super(nombre);

    }

    @Override
    public void AtenderEmergencia() {
        System.out.println("Atendiendo personas heridas");
    }
}
