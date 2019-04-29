package prtorneo;

/**
 * Created by javie on 11/03/2019.
 */
public class ApTorneo {
    /**
     * Abre la arena y agrega los enemigos para que luchen entre ellos.
     */
    public void ejecutar(){
        abrirArenaBatalla();
        agregarEnemigoFacade("Psiquico","Gonorea","Guantelete de Thanos",5);
        agregarEnemigoFacade("Hielo","Mirada Fulminante","dedos leprosos",13);
        agregarBossFacade("Psiquico","Stick",7);
    }

    /**
     * Ejecutamos el metodo comprobar que engloba a todos los substemas complejos de comprobacion, a traves de una fachada
     * utilizando el patron Facade.
     */
    private void abrirArenaBatalla(){
        FachadaTorneo comprobar = new FachadaTorneo();
        comprobar.ComenzarBatalla();
    }


    /**
     * De esta forma mas compacta agregamos un nuevo enemigo utilizando el patron Facade
     * por lo que solo tenemos que asignar los siguientes parametros: (los demas vienen por defecto)
     * @param tipo
     * @param habilidadEspecial
     * @param arma
     * @param nivel
     */
    private void agregarEnemigoFacade(String tipo, String habilidadEspecial, String arma,int nivel){
        FachadaEnemigo enemigo = new FachadaEnemigo(tipo, habilidadEspecial, arma,nivel);
        enemigo.subirNivelEnemigo();
        enemigo.lanzarEnemigoArena();
    }

    /**De esta forma mas compacta agregamos un nuevo Jefe utilizando el patron Facade
     * por lo que solo tenemos que asignar los siguientes parametros: (los demas vienen por defecto)
     * @param tipo
     * @param arma
     * @param nivel
     */
    private void agregarBossFacade(String tipo, String arma,int nivel){
        FachadaEnemigo enemigo = new FachadaEnemigo(tipo, arma,nivel);
        enemigo.subirNivelEnemigo();
        enemigo.lanzarEnemigoArena();
    }
}
