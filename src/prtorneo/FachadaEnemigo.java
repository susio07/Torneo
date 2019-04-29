package prtorneo;


/**
 * Clase fachada de enemigo, una forma mas simple de crearlos
 * Created by javie on 11/03/2019.
 */
public class FachadaEnemigo {
    Enemigo enemigo;

    /**
     * Metodo encargado de proporcionar valores por defecto a la hora de crear un enemigo
     * @param tipo
     * @param habilidadEspecial
     * @param arma
     * @param nivel
     */
    public FachadaEnemigo(String tipo, String habilidadEspecial, String arma,int nivel){
        super();
        enemigo = new Enemigo();
        enemigo.setArma(arma);
        enemigo.setBoss(false);
        enemigo.setFuerza(40);
        enemigo.setHabilidadEspecial(habilidadEspecial);
        enemigo.setSalud(600);
        enemigo.setSaludXsegundo(20);
        enemigo.setTipo(tipo);
        enemigo.setNivel(nivel);
        enemigo.calcularVelocidadAtaque();
    }

    /**
     * Metodo encargado de proporcionar valores por defecto a la hora de crear un Jefe
     * @param tipo
     * @param arma
     * @param nivel
     */
    public FachadaEnemigo(String tipo, String arma,int nivel){
        super();
        enemigo = new Enemigo();
        enemigo.setArma(arma);
        enemigo.setBoss(true);
        enemigo.setFuerza(300);
        enemigo.setHabilidadEspecial("Thunder God");
        enemigo.setSalud(3000);
        enemigo.setSaludXsegundo(100);
        enemigo.setTipo(tipo);
        enemigo.setNivel(nivel);
        enemigo.calcularVelocidadAtaque();
    }

    /**
     * Metodo encargado de ejecutar el metodo de subir el nivel
     */
    public void subirNivelEnemigo(){enemigo.subirNivel();}

    /**
     * Metodo que llama a presentar enemigo de la clase enemigo
     */
    public void lanzarEnemigoArena(){ enemigo.PresentaEnemigoArena();}
}
