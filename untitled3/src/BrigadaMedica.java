public class BrigadaMedica  extends EquipoEmergencia {

    public BrigadaMedica(String nombre, Strinng nombre1) {
        super(nombre);
        this.nombre = nombre1;

    }

    @java.lang.Override
    public void atenderEmergencia() {
        System.out.println("Revisando infraestructura dañada...");

    }

}

