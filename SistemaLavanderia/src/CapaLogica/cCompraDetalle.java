/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDatos.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author UNSAAC
 */
public class cCompraDetalle {
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
            oFila.next();
            int CodError = Integer.parseInt(oFila.getString("CodError"));
            mensaje = oFila.getString("Mensaje");
            if (CodError == 0)
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

}
