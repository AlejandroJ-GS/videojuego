package org.palomafp.videojuego.modelo;
/**
 es un objeto de tipo Usuario que tiene una serie de atributos ( nombre , id , correo , personaje )
 * @author Alejandro y Cristina
 * @version 1.0
 */
public class Usuario {
    private String nombre;
    private String id;
    private String correo;
    private Personaje personaje;
/**
 * constructor de usuario donde definimos los atributos de usuario
 * @param nombre se trata del nombre del usuario
 * @param id se trata del id del usuario  
 * @param correo se trata del correo electronico del usuario
 */
    public Usuario(String nombre, String id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }
/**
 * nos devuelve el nombre del usuario
 * @return nombre del usuario
 */
    public String getNombre() {
        return nombre;
    }
/**
 * establecemos el nombre del usuario
 * @param nombre nombre del usuario
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * nos devuelve el id del usuario
 * @return id del usuario
 */
    public String getId() {
        return id;
    }
/**
 * establecemos el id del usuario
 * @param id id del usuario
 */
    public void setId(String id) {
        this.id = id;
    }
/**
 * nos devuelve el correo del usuario
 * @return correo del usuario
 */
    public String getCorreo() {
        return correo;
    }
/**
 * establecemos el correo del usuario
 * @param correo correo del usuario
 */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
/**
 * nos devuelve el personaje del usuario
 * @return personaje del usuario
 */
    public Personaje getPersonaje() {
        return personaje;
    }

    /**
     * Establece el personaje del usuario
     * @param personaje personaje del usuario
     */
    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

/**
 * es un metodo sobre el usuario que nos dice todos los atributos
 */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}

