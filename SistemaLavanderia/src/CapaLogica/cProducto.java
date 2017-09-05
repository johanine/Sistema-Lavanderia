/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

/**
 *
 * @author joha
 */
import CapaDatos.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class cProducto {
    
    //atributos
    public int IdProducto;
    public String Descripcion;
    cConexion oDatos;
    public String mensaje;
    //constructor
    public cProducto(){
        oDatos= new cConexion("localhost","dblavanderia", "root", "12345");
    }
    //metodos
    public int IdProducto() { return IdProducto;}
    public void IdProducto(int IdProducto) {this.IdProducto=IdProducto;}
    public String Descripcion() { return Descripcion;}
    public void Descripcion(String Descripcion) { this.Descripcion=Descripcion;}
    
    // metodos    
    public boolean insertar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Descripcion);
            ResultSet oFila = oDatos.llamarProcedimiento("spuInsertarProducto", datosEnvio);
            String CodError = oFila.getString(0);
            mensaje = oFila.getString(1);
            return CodError == "1";
            }catch(Exception e){
                System.err.println("error al listar: "+e);
            }
            return false;
        }
        public ResultSet Listar() throws SQLException
        {
        try {
            return oDatos.llamarProcedimiento("spuListarProducto",null);
        } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        }
        return null;
        }
        
        public ResultSet ListarEmpleado()
        {
        try {
            return oDatos.llamarProcedimiento("spuListarProductoEmpleado",null);
        } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        
        }
        return null;
        }
        public ResultSet Buscar(String Campo, String Contenido)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Campo);
            datosEnvio.add(Contenido);
            return oDatos.llamarProcedimiento("spuBuscarProducto",datosEnvio);
            } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        
        }
        return null;
        }
        public int BuscarId()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(Descripcion);
            ResultSet oFila = oDatos.llamarProcedimiento("spuBuscarIdProducto",datosEnvio);
            int Cod = Integer.valueOf(oFila.getString(0));
            return Cod;
            } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        
        }
        return -1;
        }
        public boolean deshabilitar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(IdProducto);
            ResultSet oFila = oDatos.llamarProcedimiento("spuDeshabilitarProducto", datosEnvio);
            String CodError = oFila.getString(0);
            mensaje = oFila.getString(2);
            if (CodError == "1")
                return true;
            else
                return false;
            } catch (Exception ex) {
            System.err.println("error al listar: "+ex);
        
        }
        return false;
        }
        public boolean modificar()
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(IdProducto);
            datosEnvio.add(Descripcion);
            ResultSet oFila = oDatos.llamarProcedimiento("spuModificarProducto",  datosEnvio);
            String CodError = oFila.getString(0);
            mensaje = oFila.getString(2);
            if (CodError == "1")
                return true;
            else
                return false;
            } catch (Exception ex) {
            System.err.println("error en producto: "+ex);
        
        }
        return false;
        }
        /**
        public DataSet getEA(DateTime beg, DateTime end)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
        
            return oDatos.TraerDataSet("spuEntradaSalida", beg, end);
        }**/
        public ResultSet salida(Date beg, Date end)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(beg);
        datosEnvio.add(end);
            return oDatos.llamarProcedimiento("spuSalida", datosEnvio);
            } catch (Exception ex) {
            System.err.println("error e productos: "+ex);
        
        }
        return null;
        }
        public ResultSet EntradaBoleta(Date beg, Date end)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(beg);
            datosEnvio.add(end);
            return oDatos.llamarProcedimiento("spuEntradaBoleta", datosEnvio);
            } catch (Exception ex) {
            System.err.println("error e productos: "+ex);
        
        }
        return null;
        }
        public ResultSet EntradaFactura(Date beg, Date end)
        {
            try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(beg);
            datosEnvio.add(end);
            return oDatos.llamarProcedimiento("spuEntradaFactura", datosEnvio);
            } catch (Exception ex) {
            System.err.println("error e productos: "+ex);
        
        }
        return null;
        }
}
