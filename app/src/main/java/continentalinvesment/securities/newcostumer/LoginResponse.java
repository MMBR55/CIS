package continentalinvesment.securities.newcostumer;

import java.io.Serializable;

public class LoginResponse implements Serializable {

    private  String ID;
    private  String Correo;
    private  String Contrasena;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }
    /*private int ID;
    private String Privilegios;
    private String Nombre;
    private String Apellidos;
    private String Correo;
    private String Contrasena;
    private String Telefono;
    private String Direccion;
    private String PreguntaSeguridad;
    private String RespuestaSeguridad;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPrivilegios() {
        return Privilegios;
    }

    public void setPrivilegios(String privilegios) {
        Privilegios = privilegios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getPreguntaSeguridad() {
        return PreguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        PreguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return RespuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        RespuestaSeguridad = respuestaSeguridad;
    }*/
}
