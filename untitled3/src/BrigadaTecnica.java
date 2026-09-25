public class BrigadaTecnica extends  EquipoEmergencia {

    public BrigadaTecnica(String nombre, String nombre1) {
        super(nombre);
        this.nombre = nombre1;
    }

    @java.lang.Override
    public void atenderEmergencia() {
        System.out.println("Atendiendo personas heridas...");


    }
}
