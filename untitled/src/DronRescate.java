public class  DronRescate extends EquipoEmergencia  implements IVolador{


    public DronRescate(String nombre ) {
        super(nombre);

    }

    @Override
    public void AtenderEmergencia() {
        System.out.println("inspenccionando zona de emergencia");

    }

    @Override
    public void volar() {
        System.out.println("empezara el vuelo en 10 minutos");
    }
}
