/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.manage;

import com.biz.DiscountBiz;
import com.biz.DiscountBizImpl;
import com.po.Discount;
import com.util.FrameUtil;
import com.util.StringUtil;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Administrator
 */
public class DiscountManageFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form DiscountManageFrame
     */
    DiscountBiz dbiz = new DiscountBizImpl();
    public DiscountManageFrame() {
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
        tblDiscount = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMeet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDecrease = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("折扣规则管理");

        tblDiscount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "规则编号", "规则类型", "规则描述"
            }
        ));
        jScrollPane1.setViewportView(tblDiscount);
        if (tblDiscount.getColumnModel().getColumnCount() > 0) {
            tblDiscount.getColumnModel().getColumn(0).setResizable(false);
            tblDiscount.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblDiscount.getColumnModel().getColumn(1).setResizable(false);
            tblDiscount.getColumnModel().getColumn(1).setPreferredWidth(5);
            tblDiscount.getColumnModel().getColumn(2).setResizable(false);
            tblDiscount.getColumnModel().getColumn(2).setPreferredWidth(15);
        }

        btnSearch.setText("查询");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("规则类型");

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "折扣", "满减", " " }));
        cbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("折扣额度");

        jLabel3.setText("满");

        jLabel4.setText("减");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMeet, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDecrease, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSearch)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtMeet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDecrease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        List<Discount> list = dbiz.findAll();
        showOnTable(list);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeActionPerformed
        
    }//GEN-LAST:event_cbTypeActionPerformed
    private void showOnTable(List<Discount> list) {
      /**
       * 将制定的list数据显示到表上
       */  
        //1.获取指定表格模型
        DefaultTableModel dtm =
               (DefaultTableModel) this.tblDiscount.getModel();
        //2.清空表格信息
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        //3.显示数据
         for(Discount d :list){
            Vector vt = new Vector();
            vt.add(d.getDid());
            Discount dct = d;
            if(d.getDtype() == 1){
                //打折
                vt.add("打折");
                String str1 = "折扣额度："+Double.toString(d.getDiscountrate());
                vt.add(str1);
            }
            else {
                vt.add("满减");
                String str2 = "满"+Double.toString(d.getDmeetmoney())+"减"+Double.toString(d.getDreducemoney());
                vt.add(str2);
            }
            dtm.addRow(vt);
        }
       
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDiscount;
    private javax.swing.JTextField txtDecrease;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtMeet;
    // End of variables declaration//GEN-END:variables
}
