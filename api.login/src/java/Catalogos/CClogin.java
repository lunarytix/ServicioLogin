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
public class CClogin {
	private String correo ;
	private String contraseña ;
	private String ip;
	private String direccionMac;
	private String resolucionP;
	private int idAcceso ;
	
	public CClogin(){}
	
	public CClogin(int idAcceso , String correo , String contraseña , String ip , String direccionMac , String resolucionP){
		this.idAcceso = idAcceso;
		this.correo = correo;
		this.contraseña = contraseña;
		this.ip = ip;
		this.direccionMac = direccionMac ;
		this.resolucionP = resolucionP;
	}

	public int getIdAcceso() {
		return idAcceso;
	}

	public void setIdAcceso(int idAcceso) {
		this.idAcceso = idAcceso;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDireccionMac() {
		return direccionMac;
	}

	public void setDireccionMac(String direccionMac) {
		this.direccionMac = direccionMac;
	}

	public String getResolucionP() {
		return resolucionP;
	}

	public void setResolucionP(String resolucionP) {
		this.resolucionP = resolucionP;
	}
	
}



