/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.order;

import com.biz.BillBiz;
import com.biz.BillBizImpl;
import com.biz.CustomerBiz;
import com.biz.CustomerBizImpl;
import com.biz.DiscountBiz;
import com.biz.DiscountBizImpl;
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
import com.biz.UserBiz;
import com.biz.UserBizImpl;
import com.po.Bill;
import com.po.Customer;
import com.po.Discount;
import com.po.Menu;
import com.po.Order;
import com.po.OrderDishes;
import com.po.Room;
import com.po.Table;
import com.po.User;
import com.util.FrameUtil;
import com.util.StringUtil;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class BillByWaiterFrame extends javax.swing.JInternalFrame {

    OrderBiz obiz = new OrderBizImpl();
    OrderDishesBiz odbiz = new OrderDishesBizImpl();
    MenuBiz mbiz = new MenuBizImpl();
    DiscountBiz dbiz = new DiscountBizImpl();
    CustomerBiz cbiz = new CustomerBizImpl();
    BillBiz bbiz = new BillBizImpl();
    TableBiz tbiz = new TableBizImpl();
    RoomBiz rbiz = new RoomBizImpl();
    UserBiz ubiz = new UserBizImpl();
     public User userNew = null;//设置静态值对象，供界面传值用
    /**
     * Creates new form BillByWaiterFrame
     */
    public BillByWaiterFrame() {
        initComponents();
        initDiscount();
    }
    
     public BillByWaiterFrame(User user) {
         System.out.println(user.getPermission());
        this.userNew = user;
        initComponents();
        initDiscount();
         this.jScrollPane1.getViewport().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel1 = new com.view.HomePanel();
        lblDiscount = new javax.swing.JLabel();
        lblDiscount2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        lblOid = new javax.swing.JLabel();
        txtOid = new javax.swing.JTextField();
        lblCid = new javax.swing.JLabel();
        txtCid = new javax.swing.JTextField();
        lblCusNumber = new javax.swing.JLabel();
        txtCusNumber = new javax.swing.JTextField();
        txtRid = new javax.swing.JTextField();
        lblRid = new javax.swing.JLabel();
        txtTid = new javax.swing.JTextField();
        lblTid = new javax.swing.JLabel();
        txtOtime = new javax.swing.JTextField();
        lblOtime = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        lblActualPrice = new javax.swing.JLabel();
        txtActualPrice = new javax.swing.JTextField();
        btnCountPrice = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();

        setClosable(true);
        setTitle("顾客结账");
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

        lblDiscount.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(255, 51, 51));
        lblDiscount.setText("打折规则：无");

        lblDiscount2.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblDiscount2.setForeground(new java.awt.Color(255, 51, 51));
        lblDiscount2.setText("打折规则：无");

        btnSearch.setBackground(new java.awt.Color(255, 255, 102));
        btnSearch.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch.setText("搜索");
        btnSearch.setToolTipText("模糊查询：商品名称，商品型号");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblOid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblOid.setForeground(new java.awt.Color(102, 102, 102));
        lblOid.setText("订单编号");

        txtOid.setEditable(false);
        txtOid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtOid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtOid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOidActionPerformed(evt);
            }
        });

        lblCid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblCid.setForeground(new java.awt.Color(255, 51, 51));
        lblCid.setText("顾客编号");
        lblCid.setToolTipText("员工姓名须由2-4个中文组成");

        txtCid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtCid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtCid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidKeyPressed(evt);
            }
        });

        lblCusNumber.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblCusNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblCusNumber.setText("顾客人数");

        txtCusNumber.setEditable(false);
        txtCusNumber.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtCusNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtCusNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusNumberActionPerformed(evt);
            }
        });
        txtCusNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCusNumberKeyPressed(evt);
            }
        });

        txtRid.setEditable(false);
        txtRid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtRid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtRid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRidActionPerformed(evt);
            }
        });

        lblRid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblRid.setForeground(new java.awt.Color(102, 102, 102));
        lblRid.setText("房间编号");

        txtTid.setEditable(false);
        txtTid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtTid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTidActionPerformed(evt);
            }
        });

        lblTid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblTid.setForeground(new java.awt.Color(102, 102, 102));
        lblTid.setText("餐桌编号");

        txtOtime.setEditable(false);
        txtOtime.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtOtime.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtOtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtimeActionPerformed(evt);
            }
        });

        lblOtime.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblOtime.setForeground(new java.awt.Color(102, 102, 102));
        lblOtime.setText("订单时间");

        lblTotalPrice.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(102, 102, 102));
        lblTotalPrice.setText("合计金额");

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtTotalPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        lblActualPrice.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblActualPrice.setForeground(new java.awt.Color(102, 102, 102));
        lblActualPrice.setText("实际金额");

        txtActualPrice.setEditable(false);
        txtActualPrice.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtActualPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtActualPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualPriceActionPerformed(evt);
            }
        });

        btnCountPrice.setBackground(new java.awt.Color(255, 255, 102));
        btnCountPrice.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnCountPrice.setText("计算价格");
        btnCountPrice.setBorder(null);
        btnCountPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountPriceActionPerformed(evt);
            }
        });

        btnPay.setBackground(new java.awt.Color(255, 255, 102));
        btnPay.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnPay.setText("生成账单");
        btnPay.setBorder(null);
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        tblOrder.setForeground(new java.awt.Color(51, 51, 51));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "订单编号", "顾客人数", "订单时间", "服务员编号", "餐桌编号", "房间编号", "合计金额"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrder.getTableHeader().setReorderingAllowed(false);
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(0).setResizable(false);
            tblOrder.getColumnModel().getColumn(1).setResizable(false);
            tblOrder.getColumnModel().getColumn(2).setResizable(false);
            tblOrder.getColumnModel().getColumn(3).setResizable(false);
            tblOrder.getColumnModel().getColumn(4).setResizable(false);
            tblOrder.getColumnModel().getColumn(5).setResizable(false);
            tblOrder.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout homePanel1Layout = new javax.swing.GroupLayout(homePanel1);
        homePanel1.setLayout(homePanel1Layout);
        homePanel1Layout.setHorizontalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiscount2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePanel1Layout.createSequentialGroup()
                            .addGap(656, 656, 656)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(homePanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(homePanel1Layout.createSequentialGroup()
                                    .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(homePanel1Layout.createSequentialGroup()
                                            .addComponent(lblTotalPrice)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(homePanel1Layout.createSequentialGroup()
                                            .addComponent(lblOtime)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtOtime, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(homePanel1Layout.createSequentialGroup()
                                            .addComponent(lblOid)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtOid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(36, 36, 36)
                                    .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(homePanel1Layout.createSequentialGroup()
                                            .addComponent(lblCid)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(homePanel1Layout.createSequentialGroup()
                                            .addComponent(lblTid)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtTid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(homePanel1Layout.createSequentialGroup()
                                            .addComponent(lblActualPrice)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(26, 26, 26)
                                    .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(homePanel1Layout.createSequentialGroup()
                                            .addComponent(lblRid)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtRid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(homePanel1Layout.createSequentialGroup()
                                            .addComponent(lblCusNumber)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCusNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnCountPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        homePanel1Layout.setVerticalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblDiscount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiscount2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOid)
                            .addComponent(txtOid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOtime)
                            .addComponent(txtOtime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPrice)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homePanel1Layout.createSequentialGroup()
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCid)
                                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTid)
                                    .addComponent(txtTid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(homePanel1Layout.createSequentialGroup()
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCusNumber)
                                    .addComponent(txtCusNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRid)
                                    .addComponent(txtRid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblActualPrice)
                                .addComponent(txtActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCountPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //模糊查询
        List<Order> list = obiz.findAll();
        showOnTable(list);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        this.txtActualPrice.setText("");
//鼠标选中某行，该行信息显示到输入面板
        int row = this.tblOrder.getSelectedRow();
//        //根据row获取每列的值
        this.txtOid.setText(this.tblOrder.getValueAt(row, 0) + "");
        this.txtCusNumber.setText(this.tblOrder.getValueAt(row, 1) + "");
        this.txtOtime.setText(this.tblOrder.getValueAt(row, 2) + "");
        this.txtTid.setText(this.tblOrder.getValueAt(row, 4) + "");
        this.txtRid.setText(this.tblOrder.getValueAt(row, 5) + "");
        this.txtTotalPrice.setText(this.tblOrder.getValueAt(row, 6) + "");


    }//GEN-LAST:event_tblOrderMouseClicked

    private void txtOidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOidActionPerformed

    private void txtCidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidKeyPressed

    }//GEN-LAST:event_txtCidKeyPressed

    private void txtCusNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusNumberActionPerformed

    private void txtCusNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusNumberKeyPressed

    }//GEN-LAST:event_txtCusNumberKeyPressed

    private void txtTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTidActionPerformed

    private void txtOtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtimeActionPerformed

    private void txtRidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRidActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void txtActualPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualPriceActionPerformed

    private void btnCountPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountPriceActionPerformed
        Double totalPrice = Double.parseDouble(this.txtTotalPrice.getText().trim());
        Double actualPrice1 = totalPrice;
        Double actualPrice2 = totalPrice;
        List<Discount> dlist = dbiz.findAll();
        for (Discount d : dlist) {
            if (d.getDtype() == 1) {
                actualPrice1 *= d.getDiscountrate();
            } else if (d.getDtype() == 2) {
                if (actualPrice2 > d.getDmeetmoney()) {
                    actualPrice2 -= d.getDreducemoney();
                }
            }
        }

        if (actualPrice1 > actualPrice2) {
            this.txtActualPrice.setText(actualPrice2.toString());
        } else {
            this.txtActualPrice.setText(actualPrice1.toString());
        }
    }//GEN-LAST:event_btnCountPriceActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        if (StringUtil.checkLength(this.txtActualPrice.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "请先计算实际价格");
            return;
        }
        
        Boolean cidFlag = false;
        String cid = this.txtCid.getText().trim();
        if (StringUtil.checkLength(cid) == true) {
            cidFlag = true;
            if (StringUtil.checkDigit(cid) == false) {
                JOptionPane.showMessageDialog(this, "顾客账号只能为数字");
                return;
            }
        }

        
        int cid_int = 0;
        if (cidFlag == true) {
            cid_int = Integer.parseInt(cid);
        }
        //当前时间
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date);

        double actualPrice = Double.parseDouble(this.txtActualPrice.getText().trim());
        Integer oid = Integer.parseInt(this.txtOid.getText().trim());
        
        List<Order> olist  = obiz.findIsFinish(oid);
        if(olist.isEmpty()==false)
        {
             JOptionPane.showMessageDialog(this, "还有菜没有上");
                return;
        }
        //
        Bill b = new Bill();
        if (cidFlag == true) {
            b = new Bill(oid, actualPrice, cid_int, userNew.getEid(), time, false);
            cbiz.addScore(cid_int, actualPrice/10);//积分
            
        } else {
            b = new Bill(oid, actualPrice, null, userNew.getEid(), time, false);
        }
        //生成订单，并获取订单对象
        boolean result = bbiz.add(b);

        //删除订单
        obiz.delete(oid);

        //恢复桌子
        int tid = Integer.parseInt(this.txtTid.getText().trim());
        Table t = tbiz.findByID(tid);
        t.setTcondition(1);
        tbiz.update(t);

//        //房间中可用桌子数增加1
//        Room room = rbiz.findByID(tid);
//        int curcondition = room.getRcondition();
//        room.setRcondition(curcondition - 1);
//        boolean result_room = rbiz.update(room);
        
        
        if (result == true) {
            JOptionPane.showMessageDialog(this, "创建账单成功");
        } else {
            JOptionPane.showMessageDialog(this, "创建账单失败");
        }

        clearUp();

    }//GEN-LAST:event_btnPayActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
         //窗口关闭，从map中移除
        FrameUtil.framemap.remove(BillByWaiterFrame.class.getName());
    }//GEN-LAST:event_formInternalFrameClosed

    private void showOnTable(List<Order> list) {
        //1.获取指定表格（tblProduct）模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblOrder.getModel();
        //2.清空表格信息
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示数据
        for (Order o : list) {
            Vector vt = new Vector();
            vt.add(o.getOid());
            vt.add(o.getOpopulation());
            vt.add(o.getOtime());
            vt.add(o.getEid());
            vt.add(o.getTid());
            vt.add(o.getRid());
            double totalPrice = 0;
            List<OrderDishes> odlist = odbiz.findByOidNot0(o.getOid());
            for (OrderDishes od : odlist) {
                Menu m = mbiz.findbyID_all(od.getMid());
                totalPrice += od.getOdcount() * m.getMprice();
            }
            vt.add(totalPrice);
            dtm.addRow(vt);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCountPrice;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSearch;
    private com.view.HomePanel homePanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActualPrice;
    private javax.swing.JLabel lblCid;
    private javax.swing.JLabel lblCusNumber;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblDiscount2;
    private javax.swing.JLabel lblOid;
    private javax.swing.JLabel lblOtime;
    private javax.swing.JLabel lblRid;
    private javax.swing.JLabel lblTid;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtActualPrice;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCusNumber;
    private javax.swing.JTextField txtOid;
    private javax.swing.JTextField txtOtime;
    private javax.swing.JTextField txtRid;
    private javax.swing.JTextField txtTid;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables

    private void initDiscount() {
        List<Discount> dlist = dbiz.findAll();
        for (Discount d : dlist) {
            if (d.getDtype() == 1) {
                this.lblDiscount.setText("打折规则：实际金额仅为原价的" + d.getDiscountrate() + "倍");
            } else if (d.getDtype() == 2) {
                this.lblDiscount2.setText("打折规则：满" + d.getDmeetmoney() + "元减" + d.getDreducemoney() + "元");
            }
        }
    }

    private void clearUp() {
        this.txtCid.setText("");
        this.txtOid.setText("");
        this.txtCusNumber.setText("");
        this.txtTid.setText("");
        this.txtRid.setText("");
        this.txtOtime.setText("");
        this.txtTotalPrice.setText("");
        this.txtActualPrice.setText("");
        DefaultTableModel dtm = (DefaultTableModel) this.tblOrder.getModel();

        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
    }
}
