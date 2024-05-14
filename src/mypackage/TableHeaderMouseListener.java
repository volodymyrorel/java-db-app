/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Володимир
 */
public class TableHeaderMouseListener extends MouseAdapter {

    private javax.swing.JTable table;
    
    public TableHeaderMouseListener(javax.swing.JTable table) {
        this.table = table;
    }
    
    public int mouseClickedColumn(MouseEvent e) {
        Point point = e.getPoint();
        int column = table.columnAtPoint(point);
        return column;
    }
}
