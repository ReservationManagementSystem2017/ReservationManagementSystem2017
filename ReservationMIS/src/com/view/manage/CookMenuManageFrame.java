/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.manage;
import com.po.CookMenu;
import com.biz.CookMenuBiz;
import com.biz.CookMenuBizImpl;
import com.biz.EmployeeBiz;
import com.biz.EmployeeBizImpl;
import com.po.Employee;
import com.po.Menu;
import com.biz.MenuBiz;
import com.biz.MenuBizImpl;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import com.biz.EmployeeBiz;
import com.biz.EmployeeBizImpl;
import com.po.Employee;
import com.util.StringUtil;
import com.view.HomePanel;
import java.awt.Color;
import java.util.List;
import java.util.Vector;


/**
 *
 * @author wenqi
 */
public class CookMenuManageFrame extends javax.swing.JInternalFrame {
 
    CookMenuBiz cmbiz=new CookMenuBizImpl();
    EmployeeBiz ebiz=new EmployeeBizImpl();
    MenuBizImpl mbiz=new MenuBizImpl();
    /**
     * Creates new form CookMenuManageFrame
     */
    public CookMenuManageFrame() {
        initComponents();
        this.btnDelete.setEnabled(false);
        HomePanel hp = new HomePanel();
        this.jScrollPane1.getViewport().setBackground(Color.WHITE);
        this.jScrollPane2.getViewport().setBackground(Color.WHITE);
        this.jScrollPane3.getViewport().setBackground(Color.WHITE);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel2 = new com.view.HomePanel();
        homePanel1 = new com.view.HomePanel();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRelation = new javax.swing.JTable();
        btnSearch1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        lblEmpname = new javax.swing.JLabel();
        txtEmpname1 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblMenuname = new javax.swing.JLabel();
        txtMenuname = new javax.swing.JTextField();
        btnSearchmenu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblmenu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout homePanel2Layout = new javax.swing.GroupLayout(homePanel2);
        homePanel2.setLayout(homePanel2Layout);
        homePanel2Layout.setHorizontalGroup(
            homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        homePanel2Layout.setVerticalGroup(
            homePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("厨师菜品关联管理");

        btnSearch.setBackground(new java.awt.Color(255, 255, 102));
        btnSearch.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnSearch.setText("查询");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 102));
        btnDelete.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblRelation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "编号", "厨师姓名", "菜品名称", "菜品种类"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRelation.getTableHeader().setReorderingAllowed(false);
        tblRelation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRelationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRelation);
        if (tblRelation.getColumnModel().getColumnCount() > 0) {
            tblRelation.getColumnModel().getColumn(0).setResizable(false);
            tblRelation.getColumnModel().getColumn(1).setResizable(false);
            tblRelation.getColumnModel().getColumn(2).setResizable(false);
            tblRelation.getColumnModel().getColumn(3).setResizable(false);
        }

        btnSearch1.setBackground(new java.awt.Color(255, 255, 102));
        btnSearch1.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnSearch1.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch1.setText("查询");
        btnSearch1.setToolTipText("模糊查询：员工姓名");
        btnSearch1.setBorder(null);
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "厨师编号", "厨师姓名"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.getTableHeader().setReorderingAllowed(false);
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);
        if (tblEmployee.getColumnModel().getColumnCount() > 0) {
            tblEmployee.getColumnModel().getColumn(0).setResizable(false);
            tblEmployee.getColumnModel().getColumn(1).setResizable(false);
        }

        lblEmpname.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblEmpname.setForeground(new java.awt.Color(102, 102, 102));
        lblEmpname.setText("厨师姓名");
        lblEmpname.setToolTipText("员工姓名须由2-4个中文组成");

        txtEmpname1.setEditable(false);
        txtEmpname1.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtEmpname1.setBorder(null);
        txtEmpname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpname1ActionPerformed(evt);
            }
        });
        txtEmpname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpname1KeyPressed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 102));
        btnAdd.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnAdd.setText("增加");
        btnAdd.setToolTipText("增加新员工");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 102));
        btnExit.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnExit.setText("退出");
        btnExit.setToolTipText("关闭员工管理界面");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblMenuname.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        lblMenuname.setForeground(new java.awt.Color(102, 102, 102));
        lblMenuname.setText(" 菜品名称");
        lblMenuname.setToolTipText("员工姓名须由2-4个中文组成");

        txtMenuname.setEditable(false);
        txtMenuname.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtMenuname.setBorder(null);
        txtMenuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenunameActionPerformed(evt);
            }
        });
        txtMenuname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMenunameKeyPressed(evt);
            }
        });

        btnSearchmenu.setBackground(new java.awt.Color(255, 255, 102));
        btnSearchmenu.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnSearchmenu.setForeground(new java.awt.Color(51, 51, 51));
        btnSearchmenu.setText("查询");
        btnSearchmenu.setToolTipText("模糊查询：员工姓名");
        btnSearchmenu.setBorder(null);
        btnSearchmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchmenuActionPerformed(evt);
            }
        });

        tblmenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "菜品编号", "菜品姓名", "菜品种类"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblmenu.getTableHeader().setReorderingAllowed(false);
        tblmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmenuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblmenu);
        if (tblmenu.getColumnModel().getColumnCount() > 0) {
            tblmenu.getColumnModel().getColumn(0).setResizable(false);
            tblmenu.getColumnModel().getColumn(1).setResizable(false);
            tblmenu.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel1.setText(" ←→");

        jLabel2.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("厨师与菜品关系表");

        jLabel3.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("厨师表");

        jLabel4.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("菜单表");

        javax.swing.GroupLayout homePanel1Layout = new javax.swing.GroupLayout(homePanel1);
        homePanel1.setLayout(homePanel1Layout);
        homePanel1Layout.setHorizontalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanel1Layout.createSequentialGroup()
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(homePanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(homePanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearchmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(homePanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homePanel1Layout.createSequentialGroup()
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(homePanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmpname)
                                    .addComponent(lblMenuname))
                                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(homePanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmpname1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(homePanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(txtMenuname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );
        homePanel1Layout.setVerticalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpname)
                            .addComponent(txtEmpname1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenuname)
                            .addComponent(txtMenuname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnSearchmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        List<CookMenu> list =  cmbiz.findAll();
        showOnTable(list);
        this.btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        
        int selectrow = this.tblRelation.getSelectedRow();
        //String ename = (String) this.tblRelation.getValueAt(selectrow, 0);
        //String muname = (String) this.tblRelation.getValueAt(selectrow, 1);
        Integer cmid=(Integer)this.tblRelation.getValueAt(selectrow, 2);
        CookMenu cm=new CookMenu(cmid,null,null);
        boolean result=cmbiz.delete(cmid);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "删除成功");
            //刷新表格
            // List<OrderDishes> list = odbiz.findFinshed();
            //显示list信息
            // showOnTable(list);
        } else {
            JOptionPane.showMessageDialog(this, "删除失败");
        }
         this.btnDelete.setEnabled(false);
          List<CookMenu> list =  cmbiz.findAll();
          showOnTable(list);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblRelationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRelationMouseClicked
        // TODO add your handling code here:
         this.btnDelete.setEnabled(true);
    }//GEN-LAST:event_tblRelationMouseClicked

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        //模糊查询
        List<Employee> list = ebiz.findByCook( );
        showOnTableCook(list);
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        //鼠标选中某行，该行信息显示到输入面板
        int row = this.tblEmployee.getSelectedRow();
        //根据row获取每列的值
        this.txtEmpname1.setText(this.tblEmployee.getValueAt(row, 1) + "");
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void txtMenunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenunameActionPerformed

    private void txtMenunameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenunameKeyPressed
        this.getRootPane().setDefaultButton(btnAdd);
    }//GEN-LAST:event_txtMenunameKeyPressed

    private void btnSearchmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchmenuActionPerformed
        // TODO add your handling code here:
        
        List<Menu> list = mbiz.findAll();
        showOnTableMenu(list);
   
    }//GEN-LAST:event_btnSearchmenuActionPerformed

    private void tblmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmenuMouseClicked
        // TODO add your handling code here:
         int row = this.tblmenu.getSelectedRow();
        //根据row获取每列的值
        this.txtMenuname.setText(this.tblmenu.getValueAt(row, 1) + "");
    }//GEN-LAST:event_tblmenuMouseClicked

    private void txtEmpname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpname1ActionPerformed

    private void txtEmpname1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpname1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpname1KeyPressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        //1获取员工信息
        int row1 = this.tblEmployee.getSelectedRow();
        int row2 = this.tblmenu.getSelectedRow();
        
        int eid =  Integer.parseInt(this.tblEmployee.getValueAt(row1, 0).toString());
        int mid= Integer.parseInt(this.tblmenu.getValueAt(row2, 0).toString());
        CookMenu cm = new CookMenu( null, eid, mid );
        //调用业务类
        List<CookMenu> cmlist  = cmbiz.isRepetion(eid, mid);
        if(cmlist.isEmpty()==false)
        {
            JOptionPane.showMessageDialog(this, "请不要进行重复操作");
            return;
        }
            
        boolean result = cmbiz.add(cm);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "添加成功");
            //刷新表格
            List<CookMenu> list =  cmbiz.findAll();
            //显示list信息
            showOnTable(list);
        } else {
            JOptionPane.showMessageDialog(this, "添加失败");
        }
        //获取表格模型,清空表格信息
            DefaultTableModel dtm = (DefaultTableModel) this.tblEmployee.getModel();
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
             DefaultTableModel dtm2 = (DefaultTableModel) this.tblmenu.getModel();
            while (dtm2.getRowCount() > 0) {
                dtm2.removeRow(0);
            }
            this.txtEmpname1.setText("");
            this.txtMenuname.setText("");
    
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "您确定要关闭吗？");
        if (answer == JOptionPane.YES_OPTION) {
            //界面恢复到最初状态
            clearInput();
            
             
            //获取表格模型,清空表格信息
            DefaultTableModel dtm = (DefaultTableModel) this.tblEmployee.getModel();
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            //关闭
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed
    private void showOnTable(List<CookMenu> list) {
        //1.获取指定表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblRelation.getModel();
        //2.清空表格信息
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示数据
        for(CookMenu cm : list){
            Vector vt=new Vector();
            vt.add(cm.getCmid());
            Integer eid=cm.getEid();
            Employee e=ebiz.findByID(eid);
            String ename=e.getEname();
            vt.add(ename);
            Integer mid=cm.getMid();
            Menu m=mbiz.findByID(mid);
            String mname=m.getMname();
            String mtype=m.getMtype();
            vt.add(mname);
            vt.add(mtype);
            dtm.addRow(vt);
        }   
    }

    private void showOnTableCook(List<Employee> list) {
        //1.获取指定表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblEmployee.getModel();
        //2.清空表格信息
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示数据
        for(Employee e : list){
            Vector vt=new Vector();
            Integer eid=e.getEid();
            vt.add(eid);
            String ename=e.getEname();
            vt.add(ename);
            
            dtm.addRow(vt);
        }   
    }
    
    private void showOnTableMenu(List<Menu> list) {
        //1.获取指定表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblmenu.getModel();
        //2.清空表格信息
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示数据
        for(Menu m : list){
            Vector vt=new Vector();
            Integer mid=m.getMid();
            vt.add(mid);
            String mname=m.getMname();
            String mtype=m.getMtype();
            vt.add(mname);
            vt.add(mtype);
            
            dtm.addRow(vt);
        }   
    }
    private void clearInput() {
       
          tblRelation.clearSelection();
    } 
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearchmenu;
    private com.view.HomePanel homePanel1;
    private com.view.HomePanel homePanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEmpname;
    private javax.swing.JLabel lblMenuname;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTable tblRelation;
    private javax.swing.JTable tblmenu;
    private javax.swing.JTextField txtEmpname1;
    private javax.swing.JTextField txtMenuname;
    // End of variables declaration//GEN-END:variables
}
