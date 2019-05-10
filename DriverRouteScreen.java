/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbs2;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DriverRouteScreen extends JDialog implements ActionListener{
    private JTable AvailableRouteLocations = new JTable();
    private Route route;
    private JButton JBCancel = new JButton();
    private JButton JBSubmit = new JButton();
    
    public DriverRouteScreen(JFrame screen){
        super(screen, true);

        setTitle("Route overzicht");
        setSize(800, 600);
        setLayout(new FlowLayout());

        String[][] data = {
                { "1", "Freek de Jonge", "Straat 2", "Zwolle" },
        };
        String[] columnNames = {
                "Ordernummer", "klant", "adres", "woonplaats" };

        jtDeliveryRouteTable = new JTable(data, columnNames);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jtDeliveryRouteTable.getModel());
        jtDeliveryRouteTable.setRowSorter(sorter);
        JScrollPane tableSP = new JScrollPane(jtDeliveryRouteTable);
        tableSP.setPreferredSize(new Dimension(800, 500));
        tableSP.setAlignmentX(LEFT_ALIGNMENT);
        add(tableSP);

        jbSubmit = new JButton("Route afgerond");
        jbSubmit.setBackground(new Color(158, 188, 237));
        jbSubmit.setForeground(Color.BLACK);
        jbSubmit.setBounds(100,100,100,100);
        jbSubmit.addActionListener(this);
        add(jbSubmit);

        jbCancel = new JButton("Annuleren");
        jbCancel.setBackground(new Color(158, 188, 237));
        jbCancel.setForeground(Color.BLACK);
        jbCancel.setBounds(100,100,100,100);
        jbCancel.addActionListener(this);
        add(jbCancel);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbSubmit){
            dispose();
            // MOET AANGEVEN DAT DE ROUTE IS GEREDEN
        } if(e.getSource() == jbCancel){
            dispose();
        }
    }
        
}
