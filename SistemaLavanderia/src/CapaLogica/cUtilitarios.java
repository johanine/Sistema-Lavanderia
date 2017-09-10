/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joha
 */
public class cUtilitarios {
    public void listar(ResultSet rs,JTable tabla) throws SQLException
    {
        ResultSetMetaData rsm=rs.getMetaData();
        int col=rsm.getColumnCount();
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        for(int i=1;i<=col;i++){modelo.addColumn(rsm.getColumnName(i));}
        Object row[]=new Object[col];
        while(rs.next())
        {             
            for (int i=1;i<=col;i++)row[i-1]=rs.getString(i);
            modelo.addRow(row);
        }
        
    }
}
