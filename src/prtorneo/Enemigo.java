package prtorneo;


/**
 * Created by javie on 11/03/2019.
 */
public class Enemigo {

    private String tipo;
    private int fuerza;
    private int salud;
    private int saludXsegundo;
    private int velocidadAtaque;
    private String arma;
    private boolean boss;
    private String habilidadEspecial;
    private int nivel = 0;

    /**
     * Anuncia el nuevo enemigo en la arena
     */
    public void PresentaEnemigoArena(){
        if (boss)
            System.out.println("Un nuevo Jefe de tipo "+tipo+" a aparecido en la arena");
        else
            System.out.println("Un nuevo enemigo de tipo "+tipo+" a aparecido en la arena");
        System.out.println("Nivel "+nivel+"\n"+fuerza+" de fuerza\n"+salud+" de salud\n"+saludXsegundo+" de recuperacion por segundo");
        System.out.println("El enemigo posee  un "+arma+" y su habilidad especial es "+habilidadEspecial+"\nY tiene "+this.velocidadAtaque+" de velocidad de ataque\n");
    }

    /**
     * Sube la fuerza, salud y salud por segundo de un enemigo dependiendo de su mivel
     */
    public void subirNivel(){
        for (int i=0;i<nivel;i++) {
            this.fuerza *= 1.1;
            this.salud *= 1.1;
            this.saludXsegundo *= 1.05;
        }
    }

    public void calcularVelocidadAtaque(){
        this.velocidadAtaque=this.salud/this.fuerza+this.saludXsegundo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public String getTipo() {
        return tipo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getSaludXsegundo() {
        return saludXsegundo;
    }

    public String getArma() {
        return arma;
    }

    public boolean isBoss() {
        return boss;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setSaludXsegundo(int saludXsegundo) {
        this.saludXsegundo = saludXsegundo;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public int getVelocidadAtaque() {  return velocidadAtaque;  }

    public void setVelocidadAtaque(int velocidadAtaque) {  this.velocidadAtaque = velocidadAtaque; }
}
