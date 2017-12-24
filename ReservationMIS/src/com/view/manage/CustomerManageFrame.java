/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.manage;
import com.biz.CustomerBiz;
import com.biz.CustomerBizImpl;
import com.po.Customer; 
import com.util.StringUtil;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class CustomerManageFrame extends javax.swing.JInternalFrame {
    CustomerBiz cbiz=new CustomerBizImpl();
    /**
     * Creates new form CustomerManageFrame
     */
    public CustomerManageFrame() {
        initComponents();
        this.tblCustomer.getTableHeader().setReorderingAllowed(false);//表头不可移动
        this.tblCustomer.getTableHeader().setResizingAllowed(false);//列大小不可改变
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnCancel.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        lblEmpid = new javax.swing.JPanel();
        lblCID = new javax.swing.JLabel();
        txtCid = new javax.swing.JTextField();
        lblCname = new javax.swing.JLabel();
        txtCname = new javax.swing.JTextField();
        lblscore = new javax.swing.JLabel();
        txtscorce = new javax.swing.JTextField();
        lblCtel = new javax.swing.JLabel();
        txtCtel = new javax.swing.JTextField();
        lblNotice = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        txtCondition = new javax.swing.JTextField();

        setClosable(true);

        btnSearch.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch.setText("Search");
        btnSearch.setToolTipText("模糊查询：员工姓名");
        btnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(204, 51, 255), new java.awt.Color(204, 102, 255)));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "顾客ID", "顾客姓名", "积分", "联系方式"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        lblCID.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        lblCID.setForeground(new java.awt.Color(204, 0, 0));
        lblCID.setText("顾客ID");
        lblCID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));

        txtCid.setEditable(false);
        txtCid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidActionPerformed(evt);
            }
        });

        lblCname.setFont(new java.awt.Font("微软雅黑 Light", 1, 14)); // NOI18N
        lblCname.setForeground(new java.awt.Color(204, 0, 51));
        lblCname.setText("顾客姓名");
        lblCname.setToolTipText("员工姓名须由2-4个中文组成");
        lblCname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));

        txtCname.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtCname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCnameKeyPressed(evt);
            }
        });

        lblscore.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        lblscore.setText("积分");
        lblscore.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));

        txtscorce.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));

        lblCtel.setFont(new java.awt.Font("微软雅黑 Light", 1, 14)); // NOI18N
        lblCtel.setForeground(new java.awt.Color(204, 0, 51));
        lblCtel.setText("联系方式");
        lblCtel.setToolTipText("手机号须由11位数字组成");
        lblCtel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));

        txtCtel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 153, 255)));
        txtCtel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCtelKeyPressed(evt);
            }
        });

        lblNotice.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        lblNotice.setForeground(new java.awt.Color(204, 0, 0));
        lblNotice.setText("注意：红色字体项目为必填！");

        btnLoad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnLoad.setText("Load");
        btnLoad.setToolTipText("加载数据库内全部员工信息");
        btnLoad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("增加新员工");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setToolTipText("保存修改");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("删除选中员工信息");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setToolTipText("取消选中");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setToolTipText("关闭员工管理界面");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnExport.setText("Export");
        btnExport.setToolTipText("导出excel表");
        btnExport.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(204, 102, 255)));
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblEmpidLayout = new javax.swing.GroupLayout(lblEmpid);
        lblEmpid.setLayout(lblEmpidLayout);
        lblEmpidLayout.setHorizontalGroup(
            lblEmpidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblEmpidLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblEmpidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblEmpidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(lblEmpidLayout.createSequentialGroup()
                            .addComponent(lblscore, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtscorce, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(lblCtel))
                        .addGroup(lblEmpidLayout.createSequentialGroup()
                            .addComponent(lblCID)
                            .addGap(18, 18, 18)
                            .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblCname)))
                    .addGroup(lblEmpidLayout.createSequentialGroup()
                        .addComponent(lblNotice)
                        .addGap(30, 30, 30)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(lblEmpidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblEmpidLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCtel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblEmpidLayout.setVerticalGroup(
            lblEmpidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblEmpidLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblEmpidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCID)
                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCname))
                .addGap(18, 18, 18)
                .addGroup(lblEmpidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCtel)
                    .addComponent(txtscorce, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCtel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblscore))
                .addGap(59, 59, 59)
                .addGroup(lblEmpidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotice)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(lblEmpid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //模糊查询
        String condition = this.txtCondition.getText().trim();
        List<Customer> list = cbiz.findByCondition(condition);
        showOnTable(list);
        //清空
        clearInput();
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnCancel.setEnabled(false);
        this.btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        //鼠标选中某行，该行信息显示到输入面板
        int row = this.tblCustomer.getSelectedRow();
        //根据row获取每列的值
        this.txtCid.setText(this.tblCustomer.getValueAt(row, 0) + "");
        this.txtCname.setText(this.tblCustomer.getValueAt(row, 1) + "");
        this.txtscorce.setText(this.tblCustomer.getValueAt(row, 2) + "");
        this.txtCtel.setText(this.tblCustomer.getValueAt(row, 3) + "");

        //保存，删除,取消按钮可用，添加不可用
        this.btnSave.setEnabled(true);
        this.btnDelete.setEnabled(true);
        this.btnCancel.setEnabled(true);
        this.btnAdd.setEnabled(false);
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void txtCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidActionPerformed

    private void txtCnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnameKeyPressed
        this.getRootPane().setDefaultButton(btnAdd);
    }//GEN-LAST:event_txtCnameKeyPressed

    private void txtCtelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCtelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCtelKeyPressed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        //先清空文本
        clearInput();
        this.txtCondition.setText("");
        //查询数据库将数据显示到表格上
        List<Customer> list = cbiz.findAll();
        //显示list信息
        showOnTable(list);
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
        this.btnCancel.setEnabled(false);
        this.btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //新增商品
        //1获取员工信息
        String cname = this.txtCname.getText().trim();
        double scorce=Double.parseDouble(this.txtscorce.getText());
        
        String ctel = this.txtCtel.getText().trim();
       
        //员工名称非空验证，中文验证
        if (StringUtil.checkLength(cname) == false) {
            JOptionPane.showMessageDialog(this, "员工名称不能为空");
            return;
        }
        if (StringUtil.checkName(cname) == false) {
            JOptionPane.showMessageDialog(this, "姓名须由2-4个中文组成");
            return;
        }
        
        //手机非空验证,数字验证
        if (StringUtil.checkLength(ctel) == false) {
            JOptionPane.showMessageDialog(this, "手机号不能为空");
            return;
        }
        if (StringUtil.checkTel(ctel) == false) {
            JOptionPane.showMessageDialog(this, "手机号须由11位数字组成");
            return;
        }
  

        Customer c = new Customer( null, cname,scorce,ctel  );
        //调用业务类
        boolean result = cbiz.add(c);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "添加成功");
            //刷新表格
            List<Customer> list = cbiz.findAll();
            //显示list信息
            showOnTable(list);
        } else {
            JOptionPane.showMessageDialog(this, "添加失败");
        }
        //清空面板信息
        clearInput();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //修改员工
        //1获取员工信息
        int cid = Integer.parseInt(this.txtCid.getText());
        String cname = this.txtCname.getText().trim();
        double scorce=Double.parseDouble(this.txtscorce.getText());
        String ctel = this.txtCtel.getText().trim();
       
        //员工名称非空验证，中文验证
        if (StringUtil.checkLength(cname) == false) {
            JOptionPane.showMessageDialog(this, "员工名称不能为空");
            return;
        }
        if (StringUtil.checkName(cname) == false) {
            JOptionPane.showMessageDialog(this, "姓名须由2-4个中文组成");
            return;
        }
       
        //手机非空验证,数字验证
        if (StringUtil.checkLength(ctel) == false) {
            JOptionPane.showMessageDialog(this, "手机号不能为空");
            return;
        }
        if (StringUtil.checkTel(ctel) == false) {
            JOptionPane.showMessageDialog(this, "手机号须由11位数字组成");
            return;
        }
        //组合对象
       Customer c = new Customer(cid, cname,scorce, ctel );
        //调用业务类
        boolean result = cbiz.update(c);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "保存成功");
            //刷新表格
            List<Customer> list = cbiz.findAll();
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
            int cid = Integer.parseInt(this.txtCid.getText());
            //调用业务
            boolean result = cbiz.delete(cid);
            if (result == true) {
                JOptionPane.showMessageDialog(this, "删除成功");
                //刷新表格
                List<Customer> list = cbiz.findAll();
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
            DefaultTableModel dtm = (DefaultTableModel) this.tblCustomer.getModel();
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            //关闭
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        //        List<ProductManager> pmlist = new ArrayList<>();
        //        // 显示list中的信息
        //        int row = this.tblProduct.getRowCount();
        //        for (int i = 0; i < row; i++) {
            //            ProductManager pm = new ProductManager(
                //                (Integer)this.tblProduct.getValueAt(i, 0),(String)this.tblProduct.getValueAt(i, 1),(String)this.tblProduct.getValueAt(i, 2),
                //                (Integer)this.tblProduct.getValueAt(i, 3),(Integer)this.tblProduct.getValueAt(i, 4),(BigDecimal)this.tblProduct.getValueAt(i, 5),
                //                (BigDecimal)this.tblProduct.getValueAt(i, 6),(String)this.tblProduct.getValueAt(i, 7),(String)this.tblProduct.getValueAt(i, 8));
            //            pmlist.add(pm);
            //        }
        //        JFileChooser savefile = new JFileChooser();//文件选择对话框
        //        FileFilter filter = new FileNameExtensionFilter("Excel文件(*.xls)", "xls");
        //        savefile.addChoosableFileFilter(filter);//添加过滤器
        //        savefile.setFileFilter(filter);
        //        //打开文件选择对话框，showSaveDialog是保存，showOpenDialog是打开
        //        int flag = savefile.showSaveDialog(this);
        //        File file = null;
        //        //如果点击了保存按钮
        //        if (flag == JFileChooser.APPROVE_OPTION) {
            //            file = savefile.getSelectedFile();//所选择的文件名（手写或选择）
            //            System.out.println("文件名：" + file.getAbsolutePath());
            //            String filename = file.getAbsolutePath();
            //            //截取文件扩展名（文件名长度后4位）
            //            String ftype = filename.substring(filename.length() - 4);
            //            if (!ftype.equals(".xls")) {
                //                //如果用户没有填写扩展名，自动添加扩展名.xls
                //                file = new File(filename + ".xls");
                //            }
            //            //集合获取数据，输出到文件：ExportExcel类的printSale方法
            //            ExportExcel.printProductManager(pmlist, file); //psalelist是要导出到excel的数据集合，来自有数据库查询
            //        }
    }//GEN-LAST:event_btnExportActionPerformed

    private void txtConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConditionActionPerformed

    private void txtConditionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConditionKeyPressed
        this.getRootPane().setDefaultButton(btnSearch);
    }//GEN-LAST:event_txtConditionKeyPressed
   private void clearInput() {
        this.txtCid.setText("");
        this.txtCname.setText("");
         this.txtscorce.setText("");
        this.txtCtel.setText("");
         
        tblCustomer.clearSelection();
    }  
     public void showOnTable(List<Customer> list) {
        //1.获取表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblCustomer.getModel();
        //2.清空表格信息
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示数据
        for (Customer c : list) {
            Vector vt = new Vector();
            vt.add( c.getCid());
            vt.add(c.getCname());
            vt.add(c.getCscore());
            vt.add( c.getCphone());
            
            dtm.addRow(vt);
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCID;
    private javax.swing.JLabel lblCname;
    private javax.swing.JLabel lblCtel;
    private javax.swing.JPanel lblEmpid;
    private javax.swing.JLabel lblNotice;
    private javax.swing.JLabel lblscore;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCname;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtCtel;
    private javax.swing.JTextField txtscorce;
    // End of variables declaration//GEN-END:variables
}
