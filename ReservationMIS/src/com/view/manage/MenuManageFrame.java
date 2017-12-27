/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.manage;

import com.biz.CookMenuBiz;
import com.biz.CookMenuBizImpl;
import com.biz.MenuBiz;
import com.biz.MenuBizImpl;
import com.po.Menu;
import com.util.FrameUtil;
import com.util.StringUtil;
import com.view.order.OrderDishesByCookFrame;
import java.awt.Color;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class MenuManageFrame extends javax.swing.JInternalFrame {

    MenuBiz mbiz = new MenuBizImpl();
    CookMenuBiz cmbiz = new CookMenuBizImpl();

    /**
     * Creates new form MenuManageFrame
     */
    public MenuManageFrame() {
        initComponents();
         DefaultTableColumnModel dtm_order = (DefaultTableColumnModel) this.tblMenu.getColumnModel();
        dtm_order.getColumn(0).setMinWidth(0);
        dtm_order.getColumn(0).setMaxWidth(0);
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnCancel.setEnabled(false);
        this.jScrollPane1.getViewport().setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createEmptyBorder());//去掉边框
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
        txtCondition = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        lblMenuID = new javax.swing.JLabel();
        tlblMenuprice = new javax.swing.JLabel();
        txtMenuid = new javax.swing.JTextField();
        txtMenuprice = new javax.swing.JTextField();
        lblMenuname = new javax.swing.JLabel();
        lblMenutime = new javax.swing.JLabel();
        txtMenuname = new javax.swing.JTextField();
        txtMenutime = new javax.swing.JTextField();
        lblMenutype = new javax.swing.JLabel();
        txtMenutype = new javax.swing.JTextField();
        txtamt = new javax.swing.JTextField();
        lblMenuam = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setClosable(true);
        setTitle("菜单管理");
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

        txtCondition.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtCondition.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConditionActionPerformed(evt);
            }
        });
        txtCondition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConditionKeyPressed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 102));
        btnSearch.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch.setText("搜索");
        btnSearch.setToolTipText("");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblMenu.setFont(new java.awt.Font("华文细黑", 0, 14)); // NOI18N
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "菜品编号", "菜品名称", "菜品种类", "菜品价格", "所需时间", "已售份额", "库存量"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu.getTableHeader().setReorderingAllowed(false);
        tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenu);
        if (tblMenu.getColumnModel().getColumnCount() > 0) {
            tblMenu.getColumnModel().getColumn(0).setResizable(false);
            tblMenu.getColumnModel().getColumn(1).setResizable(false);
            tblMenu.getColumnModel().getColumn(2).setResizable(false);
            tblMenu.getColumnModel().getColumn(3).setResizable(false);
            tblMenu.getColumnModel().getColumn(4).setResizable(false);
            tblMenu.getColumnModel().getColumn(5).setResizable(false);
            tblMenu.getColumnModel().getColumn(6).setResizable(false);
        }

        lblMenuID.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblMenuID.setForeground(new java.awt.Color(153, 153, 153));
        lblMenuID.setText("菜品编号");

        tlblMenuprice.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        tlblMenuprice.setForeground(new java.awt.Color(255, 51, 51));
        tlblMenuprice.setText("菜品价格");
        tlblMenuprice.setToolTipText("");

        txtMenuid.setEditable(false);
        txtMenuid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtMenuid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtMenuid.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        txtMenuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenuidActionPerformed(evt);
            }
        });

        txtMenuprice.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtMenuprice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtMenuprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMenupriceKeyPressed(evt);
            }
        });

        lblMenuname.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblMenuname.setForeground(new java.awt.Color(255, 51, 51));
        lblMenuname.setText("菜品名称");
        lblMenuname.setToolTipText("");

        lblMenutime.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblMenutime.setForeground(new java.awt.Color(255, 51, 51));
        lblMenutime.setText("所需时间");

        txtMenuname.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtMenuname.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtMenuname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMenunameKeyPressed(evt);
            }
        });

        txtMenutime.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtMenutime.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));

        lblMenutype.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblMenutype.setForeground(new java.awt.Color(255, 51, 51));
        lblMenutype.setText("菜品种类");

        txtMenutype.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtMenutype.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtMenutype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMenutypeKeyPressed(evt);
            }
        });

        txtamt.setEditable(false);
        txtamt.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtamt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamtActionPerformed(evt);
            }
        });
        txtamt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtamtKeyPressed(evt);
            }
        });

        lblMenuam.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblMenuam.setForeground(new java.awt.Color(102, 102, 102));
        lblMenuam.setText("已售份额");

        btnLoad.setBackground(new java.awt.Color(255, 255, 102));
        btnLoad.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnLoad.setText("加载");
        btnLoad.setToolTipText("加载全部菜品信息");
        btnLoad.setBorder(null);
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 102));
        btnAdd.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnAdd.setText("增加");
        btnAdd.setToolTipText("增加新菜品");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 102));
        btnCancel.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnCancel.setText("取消");
        btnCancel.setToolTipText("取消选中");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 102));
        btnExit.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnExit.setText("退出");
        btnExit.setToolTipText("关闭菜单管理界面");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 102));
        btnDelete.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.setToolTipText("删除选中菜品信息");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 102));
        btnSave.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnSave.setText("保存");
        btnSave.setToolTipText("保存修改");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePanel1Layout = new javax.swing.GroupLayout(homePanel1);
        homePanel1.setLayout(homePanel1Layout);
        homePanel1Layout.setHorizontalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tlblMenuprice)
                            .addComponent(lblMenuID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenuid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenuprice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homePanel1Layout.createSequentialGroup()
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(homePanel1Layout.createSequentialGroup()
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMenuname)
                                    .addComponent(lblMenutime))
                                .addGap(18, 18, 18)
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMenutime, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMenuname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(homePanel1Layout.createSequentialGroup()
                                        .addComponent(lblMenuam)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(homePanel1Layout.createSequentialGroup()
                                        .addComponent(lblMenutype)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMenutype, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        homePanel1Layout.setVerticalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMenutype)
                    .addComponent(txtMenutype, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenuname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMenuname)
                    .addComponent(txtMenuid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMenuID))
                .addGap(18, 18, 18)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMenuam)
                        .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMenutime)
                        .addComponent(txtMenutime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMenuprice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tlblMenuprice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //模糊查询
        String condition = this.txtCondition.getText().trim();
        List<Menu> list = mbiz.findByCondition(condition);
        showOnTable(list);
        //清空
        clearInput();
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnCancel.setEnabled(false);
        this.btnAdd.setEnabled(true);
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked
        //鼠标选中某行，该行信息显示到输入面板
        int row = this.tblMenu.getSelectedRow();
        //根据row获取每列的值
        this.txtMenuid.setText(this.tblMenu.getValueAt(row, 0) + "");
        this.txtMenuname.setText(this.tblMenu.getValueAt(row, 1) + "");
        this.txtMenutype.setText(this.tblMenu.getValueAt(row, 2) + "");
        this.txtamt.setText(this.tblMenu.getValueAt(row, 5) + "");
        this.txtMenutime.setText(this.tblMenu.getValueAt(row, 4) + "");
        this.txtMenuprice.setText(this.tblMenu.getValueAt(row, 3) + "");

        //保存，删除,取消按钮可用，添加不可用
        this.btnSave.setEnabled(true);
        this.btnDelete.setEnabled(true);
        this.btnCancel.setEnabled(true);
        this.btnAdd.setEnabled(false);
    }//GEN-LAST:event_tblMenuMouseClicked

    private void txtMenuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenuidActionPerformed

    private void txtMenunameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenunameKeyPressed
        this.getRootPane().setDefaultButton(btnAdd);
    }//GEN-LAST:event_txtMenunameKeyPressed

    private void txtamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamtActionPerformed

    private void txtamtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtamtKeyPressed
        this.getRootPane().setDefaultButton(btnAdd);
    }//GEN-LAST:event_txtamtKeyPressed

    private void txtMenutypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenutypeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenutypeKeyPressed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        //先清空文本
        clearInput();
        this.txtCondition.setText("");
        //查询数据库将数据显示到表格上
        List<Menu> list = mbiz.findAll();
        //显示list信息
        showOnTable(list);
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnCancel.setEnabled(false);
        this.btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        //菜品名称非空验证
        if (StringUtil.checkLength(this.txtMenuname.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "菜品名称不能为空");
            return;
        }
        //菜品种类非空验证
        if (StringUtil.checkLength(this.txtMenutype.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "菜品种类不能为空");
            return;
        }
        //菜品价格非空验证
        if (StringUtil.checkLength(this.txtMenuprice.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "菜品价格不能为空");
            return;
        }
        //菜品价格非小数验证
        if (StringUtil.checkDecimal(this.txtMenuprice.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "菜品价格必须为数字");
            return;
        }
        //所需时间非空验证
        if (StringUtil.checkLength(this.txtMenutime.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "所需时间不能为空");
            return;
        }
        //所需时间整数验证
        if (StringUtil.checkDigit(this.txtMenutime.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "所需时间必须为整数");
            return;
        }

        //新增商品
        //1获取菜品信息
        String mname = this.txtMenuname.getText().trim();
        String mtype = this.txtMenutype.getText().trim();
        double mprice = Double.parseDouble(this.txtMenuprice.getText().trim());
        int mtime = Integer.parseInt(this.txtMenutime.getText().trim());
        int mcount = 0;//新增推荐为0
        int mstorage = 0;//新增的时候库存为0
        
        //组合对象
        Menu m = new Menu(null, mname, mtype, mprice, mtime, mstorage, mcount);

        //调用业务类
        boolean result = mbiz.add(m);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "添加成功");
            //刷新表格
            List<Menu> list = mbiz.findAll();
            //显示list信息
            showOnTable(list);
        } else {
            JOptionPane.showMessageDialog(this, "添加失败");
        }
        //清空面板信息
        clearInput();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        //菜品编号非空验证
        if (StringUtil.checkLength(this.txtMenuid.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "请在表格中进行选择");
            return;
        }
        //菜品名称非空验证
        if (StringUtil.checkLength(this.txtMenuname.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "菜品名称不能为空");
            return;
        }
        //菜品种类非空验证
        if (StringUtil.checkLength(this.txtMenutype.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "菜品种类不能为空");
            return;
        }
        //菜品价格非空验证
        if (StringUtil.checkLength(this.txtMenuprice.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "菜品价格不能为空");
            return;
        }
        //菜品价格非小数验证
        if (StringUtil.checkDecimal(this.txtMenuprice.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "菜品价格必须为数字");
            return;
        }
        //所需时间非空验证
        if (StringUtil.checkLength(this.txtMenutime.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "所需时间不能为空");
            return;
        }
        //所需时间整数验证
        if (StringUtil.checkDigit(this.txtMenutime.getText().trim()) == false) {
            JOptionPane.showMessageDialog(this, "所需时间必须为整数");
            return;
        }

        int mid = Integer.parseInt(this.txtMenuid.getText());
        String mname = this.txtMenuname.getText().trim();
        String mtype = this.txtMenutype.getText().trim();
        double mprice = Double.parseDouble(this.txtMenuprice.getText());
        int mtime = Integer.parseInt(this.txtMenutime.getText());
        int mcount = Integer.parseInt(this.txtamt.getText());
        //库存
        Menu mTemp = mbiz.findByID(mid);
        int mstorage = mTemp.getMstorage();

        //组合对象
        Menu m = new Menu(mid, mname, mtype, mprice, mtime, mstorage, mcount);
        //调用业务类
        boolean result = mbiz.update(m);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "保存成功");
            //刷新表格
            List<Menu> list = mbiz.findAll();
            //显示list信息
            showOnTable(list);
        } else {
            JOptionPane.showMessageDialog(this, "保存失败");
        }
        //清空面板信息
        clearInput();
        //保存，删除,取消按钮不可用，添加可用
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnCancel.setEnabled(false);
        this.btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "您确定要删除吗？");
        if (answer == JOptionPane.YES_OPTION) {
            //删除商品
            int mpid = Integer.parseInt(this.txtMenuid.getText());
            //调用业务
            boolean result = mbiz.delete(mpid);
            cmbiz.updatebyMid(mpid);
            
            if (result == true) {
                JOptionPane.showMessageDialog(this, "删除成功");
                //刷新表格
                List<Menu> list = mbiz.findAll();
                //显示list信息
                showOnTable(list);//
            } else {
                JOptionPane.showMessageDialog(this, "删除失败");
            }
            //清空面板信息
            clearInput();
            //保存，删除,取消按钮不可用，添加可用
            this.btnSave.setEnabled(false);
            this.btnDelete.setEnabled(false);
            this.btnCancel.setEnabled(false);
            this.btnAdd.setEnabled(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        //界面恢复到最初状态
        clearInput();
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnCancel.setEnabled(false);
        this.btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "您确定要关闭吗？");
        if (answer == JOptionPane.YES_OPTION) {
            //界面恢复到最初状态
            clearInput();
            this.txtCondition.setText("");
            this.btnSave.setEnabled(false);
            this.btnDelete.setEnabled(false);
            this.btnCancel.setEnabled(false);
            this.btnAdd.setEnabled(true);
            //获取表格模型,清空表格信息
            DefaultTableModel dtm = (DefaultTableModel) this.tblMenu.getModel();
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            //关闭
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConditionActionPerformed

    private void txtConditionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConditionKeyPressed
        this.getRootPane().setDefaultButton(btnSearch);
    }//GEN-LAST:event_txtConditionKeyPressed

    private void txtMenupriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenupriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenupriceKeyPressed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
         //窗口关闭，从map中移除
        FrameUtil.framemap.remove(MenuManageFrame.class.getName());
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private com.view.HomePanel homePanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMenuID;
    private javax.swing.JLabel lblMenuam;
    private javax.swing.JLabel lblMenuname;
    private javax.swing.JLabel lblMenutime;
    private javax.swing.JLabel lblMenutype;
    private javax.swing.JTable tblMenu;
    private javax.swing.JLabel tlblMenuprice;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtMenuid;
    private javax.swing.JTextField txtMenuname;
    private javax.swing.JTextField txtMenuprice;
    private javax.swing.JTextField txtMenutime;
    private javax.swing.JTextField txtMenutype;
    private javax.swing.JTextField txtamt;
    // End of variables declaration//GEN-END:variables

    private void clearInput() {
        this.txtMenuid.setText("");
        this.txtMenuname.setText("");
        this.txtMenutime.setText("");
        this.txtMenutype.setText("");
        this.txtamt.setText("");
        this.txtMenuprice.setText("");
        tblMenu.clearSelection();
    }

    public void showOnTable(List<Menu> list) {
        //1.获取表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblMenu.getModel();
        //2.清空表格信息
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示数据
        for (Menu m : list) {
            Vector vt = new Vector();
            vt.add(m.getMid());
            vt.add(m.getMname());
            vt.add(m.getMtype());
            vt.add(m.getMprice());
            vt.add(m.getMcooktime());
            vt.add(m.getMcount());
            vt.add(m.getMstorage());
            dtm.addRow(vt);
        }
    }
}
