/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.manage;

import com.biz.TableBiz;
import com.biz.TableBizImpl;
import com.po.Table;
import com.util.FrameUtil;
import com.util.StringUtil;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yinggang
 */
public class TableManageFrame extends javax.swing.JInternalFrame {
    TableBiz tbiz = new TableBizImpl();
    
    
    
    public TableManageFrame() {
        initComponents();
        //初始化保存按钮和删除按钮,一开始它们不能用
        this.btnUpdate.setEnabled(false);
        this.btnDelete.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcondition = new javax.swing.JTextField();
        btnfind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtproid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtproname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtprosafecount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsugpurchase = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsugsell = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("商品资料管理");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        txtcondition.setText("请输入ID");
        txtcondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconditionActionPerformed(evt);
            }
        });

        btnfind.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        btnfind.setText("查询");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "编号", "产品名称", "安全存量", "建议购买价", "建议销售价", "当前数量", "最后进货时间", "最后送货时间"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        jLabel1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel1.setText("编号");

        txtproid.setEditable(false);

        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("产品名称");

        jLabel3.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("安全存量");

        jLabel4.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel4.setText("建议购买价");

        jLabel5.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel5.setText("建议销售价");

        btnAdd.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        btnAdd.setText("新增");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        btnUpdate.setText("修改");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        btnCancel.setText("取消");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        btnExit.setText("退出");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnLoad.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        btnLoad.setText("载入");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 0, 153));
        jLabel6.setText("*红色为必填项");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txtcondition, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnfind))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtprosafecount, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(txtproid, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(45, 45, 45)
                                        .addComponent(btnLoad)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtsugpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18))
                                            .addComponent(txtproname, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8)
                                        .addComponent(txtsugsell, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(btnAdd)
                                        .addGap(61, 61, 61)
                                        .addComponent(btnDelete)
                                        .addGap(46, 46, 46)
                                        .addComponent(btnUpdate)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnCancel)
                                        .addGap(57, 57, 57)
                                        .addComponent(btnExit)))))
                        .addGap(118, 118, 118)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnfind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcondition, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtproid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtproname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtprosafecount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsugpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtsugsell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtproid, txtproname, txtprosafecount, txtsugpurchase, txtsugsell});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // 6.退出页面
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
         this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed
    //0.模糊查询
    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
        String condition = this.txtcondition.getText().trim();
        List<Table> list = tbiz.findByTcondition(condition);
        showOnTable(list);
        
    }//GEN-LAST:event_btnfindActionPerformed

        // 1.载入商品
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // 查询数据库，将数据显示在表格中
        List<Product> list = pbiz.findAll();
        //显示list信息
        showOnTable(list);
    }//GEN-LAST:event_btnLoadActionPerformed
    
      //2. 增加商品
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //1.获取商品信息
        String proname = this.txtproname.getText().trim();
        int safecount = Integer.parseInt(this.txtprosafecount.getText().trim());
        String sugpurchase_s = this.txtsugpurchase.getText().trim();
        String sugsell_s = this.txtsugsell.getText().trim();
        //2.数据格式验证(使用StringUtil)
        //(1)非空验证
        if(StringUtil.checkLength(proname)==false){
            JOptionPane.showMessageDialog(this,"商品名称不能为空！");
            return;
        }
        if(StringUtil.checkLength(safecount+"")==false){
            JOptionPane.showMessageDialog(this,"商品类型不能为空！");
            return;
        }
         
        //（2）数字格式验证
        if(StringUtil.checkLength(sugpurchase_s+"")==true){
            if(StringUtil.checkDecimal(sugpurchase_s)==false){
                JOptionPane.showMessageDialog(this,"建议购买价格须为数字格式！");
                return;
            }
        }
        if(StringUtil.checkLength(sugpurchase_s+"")==true){
            if(StringUtil.checkDecimal(sugsell_s+"")==false){
                JOptionPane.showMessageDialog(this,"建议销售价格须为数字格式！");
                return;
             }
        }
        
        //3.类型转换
        BigDecimal sugpurchase = new BigDecimal(sugpurchase_s);
        BigDecimal sugsell = new BigDecimal(sugsell_s);
        
        int storecount = 0;
        
        
        //4.组合对象
        Product p = new Product(null,proname,safecount,sugpurchase,sugsell,storecount,null,null);
        //5.调用业务类
        boolean result = pbiz.add(p);
        
        if(result == true){
            JOptionPane.showMessageDialog(this,"添加成功！");
            List<Product>list = pbiz.findAll();
            //显示list中的信息
            showOnTable(list);
           
        }else{
            JOptionPane.showMessageDialog(this, "添加失败！");
        }
        //清空面板信息
        clearInput();
    }//GEN-LAST:event_btnAddActionPerformed
    // 3.删除商品
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
            int answer = JOptionPane.showConfirmDialog(this,"您确定要删除吗？");
            if(answer == JOptionPane.YES_OPTION){
            int proid = Integer.parseInt(this.txtproid.getText());
            //调用业务
            boolean result = pbiz.delete(proid);
            if(result == true){
                JOptionPane.showMessageDialog(this, "删除成功！");
                List<Product>list = pbiz.findAll();
                //显示list中的信息
                showOnTable(list);
             }else{
                JOptionPane.showMessageDialog(this, "删除失败！");
             }
            clearInput();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    // 4.修改商品
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //1.获取商品信息
        int proid = Integer.parseInt(this.txtproid.getText());
        String proname = this.txtproname.getText().trim();
        int safecount = Integer.parseInt(this.txtprosafecount.getText());
        String sugpurchase_s = this.txtsugpurchase.getText().trim();
        String sugsell_s = this.txtsugsell.getText().trim();
        //2.数据格式验证(使用StringUtil)
        //(1)非空验证
       if(StringUtil.checkLength(proname)==false){
            JOptionPane.showMessageDialog(this,"商品名称不能为空！");
            return;
        }
        if(StringUtil.checkLength(safecount+"")==false){
            JOptionPane.showMessageDialog(this,"商品类型不能为空！");
            return;
        }
         
        //（2）数字格式验证
        if(StringUtil.checkLength(sugpurchase_s+"")==true){
            if(StringUtil.checkDecimal(sugpurchase_s)==false){
                JOptionPane.showMessageDialog(this,"建议购买价格须为数字格式！");
                return;
            }
        }
        if(StringUtil.checkLength(sugpurchase_s+"")==true){
            if(StringUtil.checkDecimal(sugsell_s+"")==false){
                JOptionPane.showMessageDialog(this,"建议销售价格须为数字格式！");
                return;
             }
        }
        
        //3.类型转换
        BigDecimal sugpurchase = new BigDecimal(sugpurchase_s);
        BigDecimal sugsell = new BigDecimal(sugsell_s);
        //4.组合对象
        Product p = new Product(proid,proname,safecount,sugpurchase,sugsell,0,null,null);
        //5.调用业务类
        boolean result = pbiz.update(p);
        //6.判断
        if(result == true){
            JOptionPane.showMessageDialog(this,"修改成功！");
            List<Product>list = pbiz.findAll();
            //显示list中的信息
            showOnTable(list);
           
        }else{
            JOptionPane.showMessageDialog(this, "修改失败！");
        }
        //清空面板信息
        clearInput();
    }//GEN-LAST:event_btnUpdateActionPerformed
     // 5.取消商品
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       //清空面板
        clearInput();
        this.btnUpdate.setEnabled(true);
        this.btnDelete.setEnabled(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    
    // 小程序1.鼠标选中某行，该行信息显示到输入面板
    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        int row = this.tblProduct.getSelectedRow();
        //根据row获取某列的值
        this.txtproid.setText(this.tblProduct.getValueAt(row, 0)+"");
        this.txtproname.setText(this.tblProduct.getValueAt(row,1)+"");
        this.txtprosafecount.setText(this.tblProduct.getValueAt(row,2)+"");
        this.txtsugpurchase.setText(this.tblProduct.getValueAt(row,3)+"");
        this.txtsugsell.setText(this.tblProduct.getValueAt(row,4)+"");
        //使保存、删除按钮可用
        this.btnUpdate.setEnabled(true);
        this.btnDelete.setEnabled(true);
    }//GEN-LAST:event_tblProductMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
       FrameUtil.framemap.remove(Product.class.getName());
       //1.获取指定表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblProduct.getModel();
        //2.清空表格信息
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
       
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtconditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconditionActionPerformed


       //小程序2.清空输入信息；
    private void clearInput() {
        this.txtproid.setText("");
        this.txtproname.setText("");
        this.txtprosafecount.setText("");
        this.txtsugpurchase.setText("");
        this.txtsugsell.setText("");
    }
    //小程序3.将list数据显示到表格上
    public void showOnTable(List<Product> list) {
        //1.获取指定表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblProduct.getModel();
        //2.清空表格信息
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        //3.显示数据
        for(Product p :list){
            Vector vt = new Vector();
            vt.add(p.getProId());
            vt.add(p.getProName());
            vt.add(p.getSafeStorecount());
            vt.add(p.getSugPurchase());
            vt.add(p.getSugSelprice());
            vt.add(p.getStorecount());
            vt.add(p.getPurchaseDate());
            vt.add(p.getSelDate());
            dtm.addRow(vt);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnfind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtcondition;
    private javax.swing.JTextField txtproid;
    private javax.swing.JTextField txtproname;
    private javax.swing.JTextField txtprosafecount;
    private javax.swing.JTextField txtsugpurchase;
    private javax.swing.JTextField txtsugsell;
    // End of variables declaration//GEN-END:variables
}

    