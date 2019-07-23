/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import Bo.CBoLoginRegistro;
import Catalogos.ListaLogin;
import Catalogos.ListaUsuario;

/**
 * REST Web Service
 *
 * @author jose.higuera
 */
@Path("login")
public class LoginResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LoginResource
     */
    public LoginResource() {
        
    }

    /**
     * Retrieves representation of an instance of Servicio.LoginResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of LoginResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
    
    
    @GET
    @Path("RegistroUsuario")
    @Consumes(value = {MediaType.APPLICATION_FORM_URLENCODED})
    @Produces(MediaType.APPLICATION_JSON) 
    public Response RegistroUsuario(@DefaultValue("") @QueryParam("Nombre") String nombre,
                @DefaultValue("") @QueryParam("ApellidoP") String apellidoP,
                @DefaultValue("") @QueryParam("ApellidoM") String apellidoM,
                @DefaultValue("0") @QueryParam("Edad") int edad ,
                @DefaultValue("0") @QueryParam("Telefono") String Telefono ,
		@DefaultValue("") @QueryParam("Calle") String calle,
                @DefaultValue("") @QueryParam("Colonia") String colonia,
                @DefaultValue("0") @QueryParam("NumerInterior") int numerInterior,
                @DefaultValue("0") @QueryParam("CodigoPostal") int codigoPostal,
	        @DefaultValue("") @QueryParam("correo") String correo  ,  
    	        @DefaultValue("") @QueryParam("contraseña") String contraseña   
) throws Exception , Throwable
    {
	    String Resultado =null;
	    
        CBoLoginRegistro Registro = new  CBoLoginRegistro();
        try {
		if (nombre !="" && apellidoP !="" && apellidoM !="" && edad !=0 && Telefono !=""  && calle !="" && colonia !="" && numerInterior !=0 
			&& codigoPostal !=0 && correo != "" && contraseña != ""  ){
		
		Resultado =  Registro.RegistroUsiaro(nombre, apellidoP, apellidoM, edad,
		Telefono, calle, colonia, numerInterior, codigoPostal, correo, contraseña);
		}else {
			Resultado = "Algunos Campos Faltan De Llenar";
		}
        } 
        catch (Exception e) 
	{
		Resultado = "Error Servicio";
           throw e;
        }
       
        return Response.ok(Resultado).build();
    }
    @GET
    @Path("RegistroDomiciolio")
    @Consumes(value = {MediaType.APPLICATION_FORM_URLENCODED})
    @Produces(MediaType.APPLICATION_JSON)
    public Response RegistroDomiciolio(@DefaultValue("") @QueryParam("Calle") String calle,
                @DefaultValue("") @QueryParam("Colonia") String colonia,
                @DefaultValue("0") @QueryParam("NumerInterior") int numerInterior,
                @DefaultValue("0") @QueryParam("CodigoPostal") int codigoPostal ,
		@DefaultValue("") @QueryParam("correo") String correo
                ) throws Throwable 
    {
	String Resultado = "";
        CBoLoginRegistro Registro = new  CBoLoginRegistro();
        try {
            if (calle != null && colonia != null && numerInterior !=0 && codigoPostal != 0  ) {
            Resultado = Registro.RegistroDomicilio(calle, colonia, numerInterior, codigoPostal, correo) ;
	    }else {
	    	Resultado = "Algunos Campos Faltan De Llenar";
	    }
	    } 
        catch (Exception e) 
	{
		Resultado = "Error Servicio";
           throw e ;
        }
       
        return Response.ok(Resultado).build();
    }
    @GET
    @Path("AccesoLogin")
    @Consumes(value = {MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public Response AccesoLogin(
                @DefaultValue("") @QueryParam("correo") String correo,
                @DefaultValue("") @QueryParam("contrasena") String contraseña,
		@DefaultValue("") @QueryParam("ip") String ip,
		@DefaultValue("") @QueryParam("direccionMac") String direccionMac,
		@DefaultValue("") @QueryParam("resolucionP") String resolucionP
               // @DefaultValue("") @QueryParam("ip") String ip
                ) throws Throwable 
    {
	    
	String Resultado = "";
        CBoLoginRegistro Registro = new  CBoLoginRegistro();
	//ListaLogin  listLog = new ListaLogin();
	
        try {
            if (correo !="" && contraseña != "" ) {
		Resultado =Registro.AccesoLogin(correo ,contraseña ,ip ,direccionMac , resolucionP);
	   
	    }
        else {
		Resultado = "Algunos Campos Faltan De Llenar";	
		}
	}catch (Exception e) 
        {
            	Resultado = "Error Servicio";
		
        	//throw e;
		return Response.ok(Resultado).build();
	}
        return Response.ok(Resultado)
	.header("Access-Control-Allow-Origin", "*")
	.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
	.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").build();
    }
 @GET
    @Path("consultaUsuario")
    @Consumes(value = {MediaType.APPLICATION_FORM_URLENCODED})
    @Produces(MediaType.APPLICATION_JSON) 
    public Response  ConsultaUsuario (		
	        @DefaultValue("") @QueryParam("correo") String correo  
    	        ) throws Throwable 
    {
	    //String Resultado =null;
	    ListaUsuario Resultado = new ListaUsuario();
        CBoLoginRegistro Registro = new  CBoLoginRegistro();
        try {
		if (correo !=""){
		
		Resultado =  Registro.ConsultaUsuario( correo );
		}else {
			return Response.ok("Algunos Campos Faltan De Llenar").build(); 
		}
        } 
        catch (Exception e) 
	{
		
		return Response.ok(e).build();
        }
       
        return Response.ok(Resultado).header("Access-Control-Allow-Origin", "*")
	.header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
	.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").build();
    }
    
    
}

























