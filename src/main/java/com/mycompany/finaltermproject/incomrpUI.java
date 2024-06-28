/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finaltermproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author letri
 */
public class incomrpUI extends javax.swing.JFrame {

    /**
     * Creates new form incomrpUI
     */
    /* */
    public incomrpUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report-columns-icon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel3.setText("INCOME REPORT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(900, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/win.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fiwi.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battery-charging-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose month", "January", "February", "March", "April", "May", "June", "July", "August", "November", "October", "September", "December" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose month for details:");

        jLabel4.setText("Best seller:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose criteria", "By quantity", "By income and profit" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(83, 83, 83)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        mainUI main = new mainUI();
        main.setLocation(this.getX(), this.getY());
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerystore", "root", "2704");
            String query =  "SELECT report_month, income, profit\n" + 
                                "FROM INCOME_REPORT_VIEW;";

            PreparedStatement pr = con.prepareStatement(query);
            ResultSet resultSet = pr.executeQuery();
            java.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
            defaultTableModel.setRowCount(0);

            int columnCount = resultSetMetaData.getColumnCount();
            String[] columnName = new String[columnCount];
            columnName[0] = "Month";
            columnName[1] = "Total income";
            columnName[2] = "Profit";
            defaultTableModel.setColumnIdentifiers(columnName);

            String month, income,profit;
            while (resultSet.next()) {
                month = resultSet.getString(1);
                switch (month) {
                    case "202301":
                        month = "January";
                        break;
                    case "202302":
                        month = "February";
                        break;
                    case "202303":
                        month = "March";
                        break;
                    case "202304":
                        month = "April";
                        break;
                    case "202305":
                        month = "May";
                        break;
                    case "202306":
                        month = "June";
                        break;
                    case "202307":
                        month = "July";
                        break;
                    case "202308":
                        month = "August";
                        break;
                    case "202309":
                        month = "November";
                        break;
                    case "202310":
                        month = "October";
                        break;
                    case "202311":
                        month = "September";
                        break;
                    case "202312":
                        month = "December";
                        break;
                    default:
                        break;
                }
                income =  resultSet.getString(2);
                profit = resultSet.getString(3);
                String[] row = {month,income,profit};
                defaultTableModel.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowActivated

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerystore", "root", "2704");
            String query =  "SELECT * FROM INCOME_DETAILS WHERE REPORT_MONTH = ?";

            PreparedStatement pr = con.prepareStatement(query);
            String month;
            switch ((String)jComboBox1.getSelectedItem()) {
                    case "January":
                        month = "202301";
                        pr.setString(1, month);
                        break;
                    case "February":
                        month = "202302";
                        pr.setString(1, month);
                        break;
                    case "March":
                        month = "202303";
                        pr.setString(1, month);
                        break;
                    case "April":
                        month = "202304";
                        pr.setString(1, month);
                        break;
                    case "May":
                        month = "202305";
                        pr.setString(1, month);
                        break;
                    case "June":
                        month = "202306";
                        pr.setString(1, month);
                        break;
                    case "July":
                        month = "202307";
                        pr.setString(1, month);
                        break;
                    case "August":
                        month = "202308";
                        pr.setString(1, month);
                        break;
                    case "November":
                        month = "202309";
                        pr.setString(1, month);
                        break;
                    case "October":
                        month = "202310";
                        pr.setString(1, month);
                        break;
                    case "September":
                        month = "202311";
                        pr.setString(1, month);
                        break;
                    case "December":
                        month = "202312";
                        pr.setString(1, month);
                        break;
                    default:
                        return;
            
                }
                
            ResultSet resultSet = pr.executeQuery();
            java.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
            defaultTableModel.setRowCount(0);

            int columnCount = resultSetMetaData.getColumnCount();
            String[] columnName = new String[columnCount];
            columnName[0] = "Product ID";
            columnName[1] = "Sold quantity";
            columnName[2] = "Report month";
            defaultTableModel.setColumnIdentifiers(columnName);

            String month1,sold_quantity,ID;
            while (resultSet.next()) {
                ID = resultSet.getString(1);
                month1 = resultSet.getString(3);
                switch (month1) {
                    case "202301":
                        month1 = "January";
                        break;
                    case "202302":
                        month1 = "February";
                        break;
                    case "202303":
                        month1 = "March";
                        break;
                    case "202304":
                        month1 = "April";
                        break;
                    case "202305":
                        month1 = "May";
                        break;
                    case "202306":
                        month1 = "June";
                        break;
                    case "202307":
                        month1 = "July";
                        break;
                    case "202308":
                        month1 = "August";
                        break;
                    case "202309":
                        month1 = "November";
                        break;
                    case "202310":
                        month1 = "October";
                        break;
                    case "202311":
                        month1 = "September";
                        break;
                    case "202312":
                        month1 = "December";
                        break;
                    default:
                        break;
                }
                sold_quantity =  resultSet.getString(2);
                String[] row = {ID,sold_quantity,month1};
                defaultTableModel.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerystore", "root", "2704");
            String query =  "SELECT report_month, income, profit\n" + 
                                "FROM INCOME_REPORT_VIEW;";

            PreparedStatement pr = con.prepareStatement(query);
            ResultSet resultSet = pr.executeQuery();
            java.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
            defaultTableModel.setRowCount(0);

            int columnCount = resultSetMetaData.getColumnCount();
            String[] columnName = new String[columnCount];
            columnName[0] = "Month";
            columnName[1] = "Total income";
            columnName[2] = "Profit";
            defaultTableModel.setColumnIdentifiers(columnName);

            String month, income,profit;
            while (resultSet.next()) {
                month = resultSet.getString(1);
                switch (month) {
                    case "202301":
                        month = "January";
                        break;
                    case "202302":
                        month = "February";
                        break;
                    case "202303":
                        month = "March";
                        break;
                    case "202304":
                        month = "April";
                        break;
                    case "202305":
                        month = "May";
                        break;
                    case "202306":
                        month = "June";
                        break;
                    case "202307":
                        month = "July";
                        break;
                    case "202308":
                        month = "August";
                        break;
                    case "202309":
                        month = "November";
                        break;
                    case "202310":
                        month = "October";
                        break;
                    case "202311":
                        month = "September";
                        break;
                    case "202312":
                        month = "December";
                        break;
                    default:
                        break;
                }
                income =  resultSet.getString(2);
                profit = resultSet.getString(3);
                String[] row = {month,income,profit};
                defaultTableModel.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try {
            if (jComboBox2.getSelectedItem().equals("By quantity")) {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerystore", "root", "2704");
                String query =  "SELECT \n" + 
                                        "    p.product_name,\n" + 
                                        "    MAX(id.sold_quantity) AS sold_quantity,\n" + 
                                        "    MAX(id.sold_quantity * p.sell_price) AS revenue,\n" + 
                                        "    id.report_month\n" + 
                                        "FROM \n" + 
                                        "    INCOME_DETAILS id\n" + 
                                        "JOIN \n" + 
                                        "    PRODUCT p ON id.product_id = p.id\n" + 
                                        "GROUP BY \n" + 
                                        "    id.report_month, p.product_name\n" + 
                                        "HAVING \n" + 
                                        "    sold_quantity = (\n" + 
                                        "        SELECT \n" + 
                                        "            MAX(sold_quantity)\n" + 
                                        "        FROM \n" +
                                        "            INCOME_DETAILS id2\n" +
                                        "        WHERE \n" + 
                                        "            id2.report_month = id.report_month\n" + 
                                        "    )\n" + 
                                        "ORDER BY \n" + 
                                        "    id.report_month;";
    
                PreparedStatement pr = con.prepareStatement(query);
                ResultSet resultSet = pr.executeQuery();
                java.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
                defaultTableModel.setRowCount(0);
    
                int columnCount = resultSetMetaData.getColumnCount();
                String[] columnName = new String[columnCount];
                columnName[0] = "Product name";
                columnName[1] = "Sold quantity";
                columnName[2] = "Income";
                columnName[3] =  "Month";
                defaultTableModel.setColumnIdentifiers(columnName);
    
                String product_name,sold_quantity,income,month;
                while (resultSet.next()) {
                    product_name = resultSet.getString(1);
                    sold_quantity =  resultSet.getString(2);
                    income = resultSet.getString(3);
                    month = resultSet.getString(4);
                switch (month) {
                    case "202301":
                        month = "January";
                        break;
                    case "202302":
                        month = "February";
                        break;
                    case "202303":
                        month = "March";
                        break;
                    case "202304":
                        month = "April";
                        break;
                    case "202305":
                        month = "May";
                        break;
                    case "202306":
                        month = "June";
                        break;
                    case "202307":
                        month = "July";
                        break;
                    case "202308":
                        month = "August";
                        break;
                    case "202309":
                        month = "November";
                        break;
                    case "202310":
                        month = "October";
                        break;
                    case "202311":
                        month = "September";
                        break;
                    case "202312":
                        month = "December";
                        break;
                    default:
                        break;
                }
                    String[] row = {product_name,sold_quantity,income,month};
                    defaultTableModel.addRow(row);
                }
                //jButton1.setEnabled(false);

            } else if(jComboBox2.getSelectedItem().equals("By income and profit")){
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerystore", "root", "2704");
                    String query =  "SELECT \n" + //
                                                "    p.product_name,\n" + //
                                                "    id.sold_quantity,\n" + //
                                                "    id.sold_quantity * p.sell_price AS revenue,\n" + //
                                                "    (id.sold_quantity * p.sell_price - id.sold_quantity * p.import_price) AS profit,\n" + //
                                                "    id.report_month\n" + //
                                                "FROM \n" + //
                                                "    INCOME_DETAILS id\n" + //
                                                "JOIN \n" + //
                                                "    PRODUCT p ON id.product_id = p.id\n" + //
                                                "WHERE \n" + //
                                                "    (id.sold_quantity * p.sell_price) = (\n" + //
                                                "        SELECT \n" + //
                                                "            MAX(id2.sold_quantity * p2.sell_price)\n" + //
                                                "        FROM \n" + //
                                                "            INCOME_DETAILS id2\n" + //
                                                "        JOIN \n" + //
                                                "            PRODUCT p2 ON id2.product_id = p2.id\n" + //
                                                "        WHERE \n" + //
                                                "            id2.report_month = id.report_month\n" + //
                                                "    )\n" + //
                                                "ORDER BY \n" + //
                                                "    id.report_month;";
        
                    PreparedStatement pr = con.prepareStatement(query);
                    ResultSet resultSet = pr.executeQuery();
                    java.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                    DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
                    defaultTableModel.setRowCount(0);
        
                    int columnCount = resultSetMetaData.getColumnCount();
                    String[] columnName = new String[columnCount];
                    columnName[0] = "Product name";
                    columnName[1] = "Sold quantity";
                    columnName[2] = "Income";
                    columnName[3] = "Profit";
                    columnName[4] =  "Month";
                    defaultTableModel.setColumnIdentifiers(columnName);
        
                    String product_name,sold_quantity,income,profit,month;
                    while (resultSet.next()) {
                        product_name = resultSet.getString(1);
                        sold_quantity =  resultSet.getString(2);
                        income = resultSet.getString(3);
                        profit = resultSet.getString(4);
                        month = resultSet.getString(5);
                        switch (month) {
                            case "202301":
                                month = "January";
                                break;
                            case "202302":
                                month = "February";
                                break;
                            case "202303":
                                month = "March";
                                break;
                            case "202304":
                                month = "April";
                                break;
                            case "202305":
                                month = "May";
                                break;
                            case "202306":
                                month = "June";
                                break;
                            case "202307":
                                month = "July";
                                break;
                            case "202308":
                                month = "August";
                                break;
                            case "202309":
                                month = "November";
                                break;
                            case "202310":
                                month = "October";
                                break;
                            case "202311":
                                month = "September";
                                break;
                            case "202312":
                                month = "December";
                                break;
                            default:
                                break;
                        }
                        String[] row = {product_name,sold_quantity,income,profit,month};
                        defaultTableModel.addRow(row);
                    }
                }else{
                    jButton1ActionPerformed(evt);
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(incomrpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(incomrpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(incomrpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(incomrpUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new incomrpUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
