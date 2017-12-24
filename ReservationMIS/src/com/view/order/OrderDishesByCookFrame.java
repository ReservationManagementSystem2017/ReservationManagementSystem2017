/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.order;

import com.biz.MenuBiz;
import com.biz.MenuBizImpl;
import com.biz.OrderDishesBiz;
import com.biz.OrderDishesBizImpl;
import com.po.Order;
import com.po.OrderDishes;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class OrderDishesByCookFrame extends javax.swing.JInternalFrame {
    OrderDishesBiz odbiz=new OrderDishesBizImpl();
    MenuBiz mbiz = new MenuBizImpl();
    int Eid=4;
    /**
     * Creates new form OrderByCookFrame
     */
    public OrderDishesByCookFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        lblMenu2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMenu1 = new javax.swing.JTable();
        btnSearch1 = new javax.swing.JButton();

        setClosable(true);

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "编号", "订单编号", "菜品名称", "订单时间"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        btnDelete.setText("cook");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("查询");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete1.setText("完成");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        lblMenu.setText("待做菜单");

        lblMenu2.setText("正在做");

        tblMenu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "编号", "订单编号", "菜品名称", "订单时间"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenu1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMenu1);

        btnSearch1.setText("刷新");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMenu)
                        .addGap(150, 150, 150)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(lblMenu2)
                        .addGap(73, 73, 73)
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMenu)
                    .addComponent(btnSearch)
                    .addComponent(lblMenu2)
                    .addComponent(btnSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked
        this.btnDelete.setEnabled(true);
    }//GEN-LAST:event_tblMenuMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = this.tblMenu.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "请选择要做的的菜！");
            return;
        }
        int answer = JOptionPane.showConfirmDialog(this, "您确定要做吗？");
        if (answer == JOptionPane.YES_OPTION) {
            //删除菜
            Integer odid = (Integer) this.tblMenu.getValueAt(row, 0);
            //调用业务
            boolean result = odbiz.Zuocai(odid);
            if (result == true) {
                JOptionPane.showMessageDialog(this, "做菜成功");
                //刷新表格
            } else {
                JOptionPane.showMessageDialog(this, "做菜失败");
            }  
             List<OrderDishes> list = odbiz.findByEid(1,Eid);
                //显示list信息
             showOnTable(list);//
             List<OrderDishes> list1 = odbiz.findByEid(2,Eid);
                //显示list信息
             showOnTable(list1);//
        }
        DefaultTableModel dtm = (DefaultTableModel) this.tblMenu.getModel();
        dtm.removeRow(row);
        this.btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        List<OrderDishes> list = odbiz.findByEid(1,Eid);
        showOnTable(list);
        this.btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        int row = this.tblMenu1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "请选择要完成的的菜！");
            return;
        }
        int answer = JOptionPane.showConfirmDialog(this, "您确定完成了吗？");
        if (answer == JOptionPane.YES_OPTION) {
            //删除菜
            Integer odid = (Integer) this.tblMenu1.getValueAt(row, 0);
            //调用业务
            boolean result = odbiz.Wanchengcai(odid);
            if (result == true) {
                JOptionPane.showMessageDialog(this, "完成菜成功");
                //刷新表格
                List<OrderDishes> list = odbiz.findByEid(2,Eid);
                //显示list信息
                showOnTable(list);//
            } else {
                JOptionPane.showMessageDialog(this, "做菜失败");
            }          
        }

        this.btnDelete1.setEnabled(false);
        DefaultTableModel dtm1 = (DefaultTableModel) this.tblMenu1.getModel();
        dtm1.removeRow(row);
        row = -1;
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void tblMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenu1MouseClicked
         this.btnDelete1.setEnabled(true);
    }//GEN-LAST:event_tblMenu1MouseClicked

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        List<OrderDishes> list = odbiz.findByEid(2,Eid);
        showOnTable1(list);        
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void showOnTable(List<OrderDishes> list) {
        //1.获取指定表格（tblMenu）模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblMenu.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示数据
        for (OrderDishes od : list) {

            Vector vt = new Vector();
            vt.add(od.getOdid());
            vt.add(od.getMid());
            vt.add(mbiz.findByMid(od.getMid()).getMname());
            vt.add(od.getOdtime());
//            vt.add(m.getMcount());
            dtm.addRow(vt);
        }
    }
        private void showOnTable1(List<OrderDishes> list) {
        //1.获取指定表格（tblMenu）模型
        DefaultTableModel dtm1 = (DefaultTableModel) this.tblMenu1.getModel();
        while (dtm1.getRowCount() > 0) {
            dtm1.removeRow(0);
        }
        //3.显示数据
        for (OrderDishes od : list) {

            Vector vt = new Vector();
            vt.add(od.getOdid());
            vt.add(od.getMid());
            vt.add(mbiz.findByMid(od.getMid()).getMname());
            vt.add(od.getOdtime());
//            vt.add(m.getMcount());
            dtm1.addRow(vt);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenu2;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTable tblMenu1;
    // End of variables declaration//GEN-END:variables
}
