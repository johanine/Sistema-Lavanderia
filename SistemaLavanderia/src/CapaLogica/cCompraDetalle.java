/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDatos.cDatos;
import java.sql.ResultSet;
<<<<<<< HEAD
import CapaDatos.*;
=======
>>>>>>> de5e55e6afabf338d9606ca909efeebf10ecf00c
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author UNSAAC
 */
public class cCompraDetalle {
<<<<<<< HEAD
    public int IdComDetalle ;
    public double PrecioUnitario;
    public int IdProducto ;
    public String DocSalida ;
    public int Cantidad ;
    cConexion oDatos;
    public String mensaje;
    //constructor
    public cCompraDetalle(){
        oDatos= new cDatos("dblavanderia", "localhost", "root", "", "TComprobante_Detalle");
    }
    public boolean insertar()
    {
        ArrayList<Object> datosEnvio = new ArrayList<Object>();
        datosEnvio.add(Cantidad);
        datosEnvio.add(PrecioUnitario);
        datosEnvio.add(IdProducto);
        datosEnvio.add(DocSalida);
        try {
            ResultSet oFila = oDatos.llamarProcedimiento("spuInsertarCompraDetalle",datosEnvio);
=======
        public int IdComDetalle;
        public double PrecioUnitario ;
        public int IdProducto ;
        public String DocSalida ;
        public int Cantidad ;
        private cDatos oDatos;
        public String mensaje;
        public cCompraDetalle()
        {
            oDatos=  new cDatos("localhost","dblavanderia","root","");
            oDatos.setNombreTabla("tcompra_detalle");
        }
        public boolean insertar() throws SQLException, ClassNotFoundException
        {
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(Cantidad);
            lis.add(PrecioUnitario);
            lis.add(IdProducto);
            lis.add(DocSalida);
            oDatos.Conectar();
            ResultSet oFila = oDatos.llamarProcedimiento("spuInsertarCompraDetalle",lis);
            oDatos.Desconectar();
>>>>>>> de5e55e6afabf338d9606ca909efeebf10ecf00c
            oFila.next();
            int CodError = Integer.parseInt(oFila.getString("CodError"));
            mensaje = oFila.getString("Mensaje");
            if (CodError == 1)
                return true;
            else
                return false;
        }
        public ResultSet Listar() throws SQLException, ClassNotFoundException
        {
            oDatos.Conectar();
            ResultSet oFila = oDatos.llamarProcedimiento("spuListaCompraDetalle",null);
            oDatos.Desconectar();
            return oFila;
        }
        public ResultSet ListarPorCompra(String doc) throws SQLException, ClassNotFoundException
        {
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(doc);
            oDatos.Conectar();
            ResultSet oFila = oDatos.llamarProcedimiento("spuListarCompraDetalle",lis);
            oDatos.Desconectar();
            return oFila;
        }
<<<<<<< HEAD
    }
    public ResultSet ListarPorCompra(String doc)
    {
        try{
            ArrayList<Object> datosEnvio = new ArrayList<Object>();
            datosEnvio.add(doc);
            return oDatos.llamarProcedimiento("spuListarCompraDetalle",datosEnvio);
        } catch (Exception e) {
            System.out.println("Error insertar en cCompraDetalle");
            System.out.println(e);
            return null;
        }
    }
    public ResultSet ListarEmpleado() throws SQLException
    {
        return oDatos.llamarProcedimiento("spuListarCompraDetalleHabilitado",null);
    }
    public ResultSet Buscar(String Campo, String Contenido) throws SQLException
    {
        ArrayList<Object> datosEnvio = new ArrayList<>();
        datosEnvio.add(Campo);
        datosEnvio.add(Contenido);
        return oDatos.llamarProcedimiento("spuBuscarCompraDetalle", datosEnvio);
    }
    public boolean modificar() throws SQLException
    {
        ArrayList<Object> datosEnvio = new ArrayList<>();
        datosEnvio.add(IdComDetalle);
        datosEnvio.add(PrecioUnitario);
        datosEnvio.add(IdProducto);
        datosEnvio.add(DocSalida);
        datosEnvio.add(Cantidad);
        ResultSet oFila = oDatos.llamarProcedimiento("spuModificarCompraDetalle", datosEnvio);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        if (CodError == 1)
            return true;
        else
            return false;
    }
    public boolean deshabilitar() throws SQLException
    {
        ArrayList<Object> lis=new ArrayList<>();
        lis.add(IdComDetalle);
        ResultSet oFila = oDatos.llamarProcedimiento("spuDeshabilitarCompraDetalle", lis);
        oFila.next();
        int CodError = Integer.parseInt(oFila.getString("CodError"));
        mensaje = oFila.getString("Mensaje");
        if (CodError == 1)
            return true;
        else
            return false;
    }
    public String generarCodigo() throws SQLException
    {
        return oDatos.llamarProcedimiento("spuGenerarCodigoCompraDetalle",null).getString("Codigo");
    }
=======
        public ResultSet ListarEmpleado() throws SQLException, ClassNotFoundException
        {
            oDatos.Conectar();
            ResultSet oFila = oDatos.llamarProcedimiento("spuListarCompraDetalleHabilitado",null);
            oDatos.Desconectar();
            return oFila;
        }
        public ResultSet Buscar(String Campo, String Contenido) throws SQLException, ClassNotFoundException
        {
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(Campo);
            lis.add(Contenido);
            oDatos.Conectar();
            ResultSet oFila = oDatos.llamarProcedimiento("spuBuscarCompraDetalle",lis);
            oDatos.Desconectar();
            return oFila;
        }
        public boolean modificar() throws SQLException, ClassNotFoundException
        {
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(IdComDetalle);
            lis.add(PrecioUnitario);
            lis.add(IdProducto);
            lis.add(DocSalida);
            lis.add(Cantidad);
            oDatos.Conectar();
            ResultSet oFila = oDatos.llamarProcedimiento("spuModificarCompraDetalle", lis);
            oDatos.Desconectar();
            oFila.next();
            int CodError = Integer.parseInt(oFila.getString("CodError"));
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        }
        public boolean deshabilitar() throws SQLException, ClassNotFoundException
        {
            ArrayList<Object> lis=new ArrayList<>();
            lis.add(IdComDetalle);
            oDatos.Conectar();
            ResultSet oFila = oDatos.llamarProcedimiento("spuDeshabilitarCompraDetalle", lis);
            oDatos.Desconectar();
            oFila.next();
            int CodError = Integer.parseInt(oFila.getString("CodError"));
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
                return true;
            else
                return false;
        }
        public String generarCodigo() throws ClassNotFoundException, SQLException
        {
            oDatos.Conectar();
            ResultSet oFila = oDatos.llamarProcedimiento("spuGenerarCodigoCompraDetalle",null);
            oDatos.Desconectar();
            oFila.next();
            return oFila.getString("Codigo");
        }

>>>>>>> de5e55e6afabf338d9606ca909efeebf10ecf00c
}
