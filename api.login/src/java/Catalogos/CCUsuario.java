/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalogos;

/**
 *
 * @author jose_
 */
public class CCUsuario {
	 
	private int idUsuario;
	private String nombre  ;
	private String apellidoP ;
	private String  apellidoM ;
	private int edad  ; 
	private  String telefono ;
	private  String correo ;
    
    
    public CCUsuario (){
    
    }
  
    public CCUsuario ( int idUsuario , String nomrbe ,String  apellidoP , String apellidoM , int edad , String  telefono , 
             String  correo ){
        
        this.idUsuario = idUsuario;
        this.nombre = nomrbe ;
        this.apellidoP = apellidoP ; 
        this.apellidoM = apellidoM;
	this.edad = edad;
        this.telefono = telefono;
	this.correo = correo ; 
        
    
    }

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
    
    
}


