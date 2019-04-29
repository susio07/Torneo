package prtorneo;

/**
 * Created by javie on 11/03/2019.
 */
public class FachadaTorneo {
    /**
     * Diferentes objetos a comprobar
     */
    private Arena arena;
    private Espectadores espectadores;
    private Trampas trampas;
    private Puerta puerta;

    /**
     * Inicialización de los componentes del torneo
     */
    public FachadaTorneo() {
        this.arena = new Arena();
        this.espectadores = new Espectadores();
        this.trampas = new Trampas();
        this.puerta = new Puerta();

    }

    /**
     * Comprueba el estado de los componentes y devuelve un buleano
     * @return estado
     */
    public boolean compruebaTodo(){
        boolean estado=true;
        if (!arena.comprobar())
            estado=false;
        if (!espectadores.comprobar())
            estado=false;
        if (!trampas.comprobar())
            estado=false;
        if (!puerta.comprobar())
            estado=false;

        return estado;
    }

    /**
     * Dependiendo del estado de los componentes de la arena comenzara la batalla o no
     */
    public void ComenzarBatalla(){
        if (compruebaTodo())
            System.out.println("\nLa batalla comenzara en breves\n");
        else
            System.out.println("\nAun faltan algunos preparativos para comenzar\n");
    }
}