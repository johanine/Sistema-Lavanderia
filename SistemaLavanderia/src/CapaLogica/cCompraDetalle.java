
package capalogica;

import java.sql.ResultSet;
import CapaDatos.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class cCompraDetalle {
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
            oFila.next();
            int CodError = oFila.getInt("CodError");
            mensaje = oFila.getString("Mensaje");
            if (CodError == 1)
                return true;
            else
                return false;
        } catch (Exception e) {
            System.out.println("Error insertar en cCompraDetalle");
            System.out.println(e);
            return false;
        }
    }
    public ResultSet Listar()
    {
        try{
        return oDatos.llamarProcedimiento("spuListaCompraDetalle",null);
        } catch (Exception e) {
            System.out.println("Error insertar en cCompraDetalle");
            System.out.println(e);
            return null;
        }
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
}
