/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.order;
import com.biz.EmployeeBiz;
import com.biz.EmployeeBizImpl;
import com.biz.MenuBiz;
import com.biz.MenuBizImpl;
import com.biz.OrderBiz;
import com.biz.OrderBizImpl;
import com.biz.OrderDishesBiz;
import com.biz.OrderDishesBizImpl;
import com.biz.RoomBiz;
import com.biz.RoomBizImpl;
import com.biz.TableBiz;
import com.biz.TableBizImpl;
import com.po.Menu;
import com.po.Order;
import com.po.OrderDishes;
import com.po.Room;
import com.po.Table;
import com.util.StringUtil;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Administrator
 */
public class OrderDishesByWaiterFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form OrderDishesByWaiterFrame
     */
   OrderDishesBiz odbiz = new OrderDishesBizImpl();
     MenuBiz mbiz = new MenuBizImpl();
     OrderBiz obiz = new OrderBizImpl();
    public OrderDishesByWaiterFrame() {
        initComponents();
        this.btnShangcai.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDish = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        btnShangcai = new javax.swing.JButton();

        lblDish.setText("待上菜");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnSearch.setText("查询");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "菜品名称", "菜品数量", "上菜桌号", "odid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
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

        btnShangcai.setText("上菜");
        btnShangcai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShangcaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnShangcai)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDish)
                            .addGap(41, 41, 41)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDish)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShangcai)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        this.getRootPane().setDefaultButton(btnSearch);
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String condition = txtSearch.getText().trim();
        List<OrderDishes> list = odbiz.findFinshed();
        showOnTable(list);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked
        int selectrow = this.tblMenu.getSelectedRow();
        this.btnShangcai.setEnabled(true);

    }//GEN-LAST:event_tblMenuMouseClicked

    private void btnShangcaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShangcaiActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        int selectrow = this.tblMenu.getSelectedRow();
        String mname = (String) this.tblMenu.getValueAt(selectrow, 0);
        Integer odcount = (Integer) this.tblMenu.getValueAt(selectrow, 1);
        Integer ntable = (Integer) this.tblMenu.getValueAt(selectrow, 2);
        Integer odid=(Integer)this.tblMenu.getValueAt(selectrow, 3);
        //Integer odid=(Integer)this.tblMenu.getValueAt(selectrow, 3);
        OrderDishes od=new OrderDishes(odid,null,null,odcount,null);
        boolean result=odbiz.Shangcai(od);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "上菜成功");
            //刷新表格
            // List<OrderDishes> list = odbiz.findFinshed();
            //显示list信息
            // showOnTable(list);
        } else {
            JOptionPane.showMessageDialog(this, "上菜失败");
        }
    }//GEN-LAST:event_btnShangcaiActionPerformed
    private void showOnTable(List<OrderDishes> list) {
        //1.获取指定表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblMenu.getModel();
        //2.清空表格信息
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示数据
        for(OrderDishes od : list){
            Vector vt=new Vector();
            Menu me= mbiz.findByMid(od.getMid());
            String name=me.getMname();
            vt.add(name);
            vt.add(od.getOdcount());
            Order o=obiz.findByID(od.getOid());
            Integer tid=o.getTid();
            vt.add(tid);
            vt.add(od.getOdid());
            dtm.addRow(vt);
        }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShangcai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDish;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
