/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.view.manage.EmployeeManageFrame;
import com.po.User;
import com.util.FrameUtil;
import com.util.LocationUtil;
import com.view.manage.CustomerManageFrame;
import com.view.manage.DiscountManageFrame;
import com.view.manage.MenuManageFrame;
import com.view.manage.RoomManageFrame;
import com.view.manage.TableManageFrame;
import com.view.manage.CookMenuManageFrame;
import com.view.manage.PurchaseManageFrame;
import com.view.order.BillByWaiterFrame;
import com.view.order.OrderDishesByCookFrame;
import com.view.order.OrderByWaiterFrame;
import com.view.order.OrderDishesByWaiterFrame;
import com.view.search.OrderDetailFrame;
import com.view.search.SearchBillFrame;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class MainFrame extends javax.swing.JFrame {

    public User user = null;//设置静态值对象，供界面传值用
    public static String permission = null;

    /**
     * Createsd new form MainFrame
     */
    public MainFrame() {
        initComponents();
        //全屏
        LocationUtil.setFullScreen(this);
        this.setResizable(false);
//        初始化按键
        initButton(permission);
        System.out.println(this.getWidth());
        System.out.println(this.getHeight());
    }

    private void initButton(String permission) {
        //        关于权限
        //null表示没有登录
        if (permission == null) {
            //菜单
            mnuOrder.setEnabled(false);
            mnuManager.setEnabled(false);
            mnuSearch.setEnabled(false);
            //菜单项
            itemUpdatePassword.setEnabled(false);
            itemExitLogin.setEnabled(false);
            itemLogin.setEnabled(true);
            itemRegister.setEnabled(true);
        }
        //老板拥有所有权限
        if ("经理".equals(permission)) {
            //菜单
            mnuOrder.setEnabled(true);
            mnuManager.setEnabled(true);
            mnuSearch.setEnabled(true);
            //菜单项
            itemUpdatePassword.setEnabled(true);
            itemExitLogin.setEnabled(true);
            itemLogin.setEnabled(false);
            itemRegister.setEnabled(false);
            //工具栏按钮
            itemOrderByWaiter.setEnabled(true);
            itemOrderDishesByCook.setEnabled(true);
            itemOrderDishesByWaiter.setEnabled(true);
            itemBillByWaiter.setEnabled(true);
            itemEmployeeManage.setEnabled(true);
            itemCustomerManage.setEnabled(true);
            itemDiscountManage.setEnabled(true);
            itemMenuManage.setEnabled(true);
            itemRoomManage.setEnabled(true);
            itemTableManage.setEnabled(true);
            itemCookMenu.setEnabled(true);
            itemPurchase.setEnabled(true);
            itemOrderDetail.setEnabled(true);
            itemSearchBill.setEnabled(true);

        }
        //采购员可以进行采购操作
        if ("采购员".equals(permission)) {
            //菜单
            mnuManager.setEnabled(true);
            //菜单项
            itemUpdatePassword.setEnabled(true);
            itemExitLogin.setEnabled(true);
            itemLogin.setEnabled(false);
            itemRegister.setEnabled(false);
            //工具栏按钮
            itemEmployeeManage.setEnabled(false);
            itemCustomerManage.setEnabled(false);
            itemDiscountManage.setEnabled(false);
            itemMenuManage.setEnabled(false);
            itemRoomManage.setEnabled(false);
            itemTableManage.setEnabled(false);
            itemCookMenu.setEnabled(false);
            itemPurchase.setEnabled(true);
        }

        if ("服务员".equals(permission)) {
            //菜单
            mnuOrder.setEnabled(true);
            mnuManager.setEnabled(true);
            mnuSearch.setEnabled(true);
            //菜单项
            itemUpdatePassword.setEnabled(true);
            itemExitLogin.setEnabled(true);
            itemLogin.setEnabled(false);
            itemRegister.setEnabled(false);
            //工具栏按钮
            itemOrderByWaiter.setEnabled(true);
            itemOrderDishesByCook.setEnabled(false);
            itemOrderDishesByWaiter.setEnabled(true);
            itemBillByWaiter.setEnabled(true);
            itemEmployeeManage.setEnabled(false);
            itemCustomerManage.setEnabled(true);
            itemDiscountManage.setEnabled(false);
            itemMenuManage.setEnabled(true);
            itemRoomManage.setEnabled(true);
            itemTableManage.setEnabled(true);
            itemCookMenu.setEnabled(false);
            itemPurchase.setEnabled(false);
            itemOrderDetail.setEnabled(true);
            itemSearchBill.setEnabled(true);

        }
        if ("厨师".equals(permission)) {
            //菜单
            mnuOrder.setEnabled(true);
            mnuManager.setEnabled(true);
            //菜单项
            itemUpdatePassword.setEnabled(true);
            itemExitLogin.setEnabled(true);
            itemLogin.setEnabled(false);
            itemRegister.setEnabled(false);
            //工具栏按钮
            itemOrderByWaiter.setEnabled(false);
            itemOrderDishesByCook.setEnabled(true);
            itemOrderDishesByWaiter.setEnabled(false);
            itemBillByWaiter.setEnabled(false);
            itemEmployeeManage.setEnabled(false);
            itemCustomerManage.setEnabled(false);
            itemDiscountManage.setEnabled(false);
            itemMenuManage.setEnabled(true);
            itemRoomManage.setEnabled(false);
            itemTableManage.setEnabled(false);
            itemCookMenu.setEnabled(true);
            itemPurchase.setEnabled(false);
            itemOrderDetail.setEnabled(false);
            itemSearchBill.setEnabled(false);
        }

        if (user == null) {
            this.setTitle("吃了么 订餐管理系统[暂未登陆]");
        } else {
            this.setTitle("吃了么 订餐管理系统 [ " + user.getUname() + "  -  " + user.getPermission() + " ]");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mainDeskPaneDell = new com.view.MainDeskPaneDell();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSystem = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        itemRegister = new javax.swing.JMenuItem();
        itemUpdatePassword = new javax.swing.JMenuItem();
        itemExitLogin = new javax.swing.JMenuItem();
        itemExitSystem = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        itemOrderByWaiter = new javax.swing.JMenuItem();
        itemOrderDishesByCook = new javax.swing.JMenuItem();
        itemOrderDishesByWaiter = new javax.swing.JMenuItem();
        itemBillByWaiter = new javax.swing.JMenuItem();
        mnuManager = new javax.swing.JMenu();
        itemEmployeeManage = new javax.swing.JMenuItem();
        itemCustomerManage = new javax.swing.JMenuItem();
        itemDiscountManage = new javax.swing.JMenuItem();
        itemMenuManage = new javax.swing.JMenuItem();
        itemRoomManage = new javax.swing.JMenuItem();
        itemTableManage = new javax.swing.JMenuItem();
        itemCookMenu = new javax.swing.JMenuItem();
        itemPurchase = new javax.swing.JMenuItem();
        mnuSearch = new javax.swing.JMenu();
        itemOrderDetail = new javax.swing.JMenuItem();
        itemSearchBill = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuSystem.setText("系统设置");
        mnuSystem.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N

        itemLogin.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemLogin.setText("登录用户");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        mnuSystem.add(itemLogin);

        itemRegister.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemRegister.setText("注册用户");
        itemRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegisterActionPerformed(evt);
            }
        });
        mnuSystem.add(itemRegister);

        itemUpdatePassword.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemUpdatePassword.setText("修改密码");
        itemUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdatePasswordActionPerformed(evt);
            }
        });
        mnuSystem.add(itemUpdatePassword);

        itemExitLogin.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemExitLogin.setText("退出登录");
        itemExitLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitLoginActionPerformed(evt);
            }
        });
        mnuSystem.add(itemExitLogin);

        itemExitSystem.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemExitSystem.setText("退出系统");
        itemExitSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitSystemActionPerformed(evt);
            }
        });
        mnuSystem.add(itemExitSystem);

        jMenuBar1.add(mnuSystem);

        mnuOrder.setText("订单管理");
        mnuOrder.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N

        itemOrderByWaiter.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemOrderByWaiter.setText("顾客下单");
        itemOrderByWaiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOrderByWaiterActionPerformed(evt);
            }
        });
        mnuOrder.add(itemOrderByWaiter);

        itemOrderDishesByCook.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemOrderDishesByCook.setText("厨师做菜");
        itemOrderDishesByCook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOrderDishesByCookActionPerformed(evt);
            }
        });
        mnuOrder.add(itemOrderDishesByCook);

        itemOrderDishesByWaiter.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemOrderDishesByWaiter.setText("服务员上菜");
        itemOrderDishesByWaiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOrderDishesByWaiterActionPerformed(evt);
            }
        });
        mnuOrder.add(itemOrderDishesByWaiter);

        itemBillByWaiter.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemBillByWaiter.setText("顾客结账");
        itemBillByWaiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBillByWaiterActionPerformed(evt);
            }
        });
        mnuOrder.add(itemBillByWaiter);

        jMenuBar1.add(mnuOrder);

        mnuManager.setText("基本资料管理");
        mnuManager.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N

        itemEmployeeManage.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemEmployeeManage.setText("职员管理");
        itemEmployeeManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmployeeManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemEmployeeManage);

        itemCustomerManage.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemCustomerManage.setText("顾客管理");
        itemCustomerManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCustomerManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemCustomerManage);

        itemDiscountManage.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemDiscountManage.setText("打折管理");
        itemDiscountManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDiscountManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemDiscountManage);

        itemMenuManage.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemMenuManage.setText("菜单管理");
        itemMenuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemMenuManage);

        itemRoomManage.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemRoomManage.setText("房间管理");
        itemRoomManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRoomManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemRoomManage);

        itemTableManage.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemTableManage.setText("餐桌管理");
        itemTableManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTableManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemTableManage);

        itemCookMenu.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemCookMenu.setText("厨师菜品关联管理");
        itemCookMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCookMenuActionPerformed(evt);
            }
        });
        mnuManager.add(itemCookMenu);

        itemPurchase.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemPurchase.setText("采购管理");
        itemPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPurchaseActionPerformed(evt);
            }
        });
        mnuManager.add(itemPurchase);

        jMenuBar1.add(mnuManager);

        mnuSearch.setText("订单查询");
        mnuSearch.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N

        itemOrderDetail.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemOrderDetail.setText("订单详细");
        itemOrderDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOrderDetailActionPerformed(evt);
            }
        });
        mnuSearch.add(itemOrderDetail);

        itemSearchBill.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        itemSearchBill.setText("历史账单查询");
        itemSearchBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSearchBillActionPerformed(evt);
            }
        });
        mnuSearch.add(itemSearchBill);

        jMenuBar1.add(mnuSearch);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDeskPaneDell, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDeskPaneDell, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEmployeeManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmployeeManageActionPerformed
        showFrame(EmployeeManageFrame.class);
    }//GEN-LAST:event_itemEmployeeManageActionPerformed

    private void itemCustomerManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCustomerManageActionPerformed
        showFrame(CustomerManageFrame.class);
    }//GEN-LAST:event_itemCustomerManageActionPerformed

    private void itemMenuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuManageActionPerformed
        showFrame(MenuManageFrame.class);
    }//GEN-LAST:event_itemMenuManageActionPerformed

    private void itemDiscountManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDiscountManageActionPerformed
        showFrame(DiscountManageFrame.class);
    }//GEN-LAST:event_itemDiscountManageActionPerformed

    private void itemOrderByWaiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOrderByWaiterActionPerformed
        try {

            showFrame(OrderByWaiterFrame.class, user);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemOrderByWaiterActionPerformed

    private void itemBillByWaiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBillByWaiterActionPerformed
        try {
            showFrame(BillByWaiterFrame.class, user);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemBillByWaiterActionPerformed

    private void itemOrderDishesByCookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOrderDishesByCookActionPerformed
        try {
            showFrame(OrderDishesByCookFrame.class, user);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemOrderDishesByCookActionPerformed

    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed
        //创建
        LoginFrame ldf = new LoginFrame(null, this, true);
        //显示
        LocationUtil.setScreenCenter(ldf);
        ldf.setVisible(true);
        if (user != null) {
            this.initButton(user.getPermission());
        }
    }//GEN-LAST:event_itemLoginActionPerformed

    private void itemOrderDishesByWaiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOrderDishesByWaiterActionPerformed
        showFrame(OrderDishesByWaiterFrame.class);
    }//GEN-LAST:event_itemOrderDishesByWaiterActionPerformed

    private void itemRoomManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRoomManageActionPerformed
        showFrame(RoomManageFrame.class);
    }//GEN-LAST:event_itemRoomManageActionPerformed

    private void itemTableManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTableManageActionPerformed
        showFrame(TableManageFrame.class);
    }//GEN-LAST:event_itemTableManageActionPerformed

    private void itemOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOrderDetailActionPerformed
        showFrame(OrderDetailFrame.class);
    }//GEN-LAST:event_itemOrderDetailActionPerformed

    private void itemSearchBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSearchBillActionPerformed
        showFrame(SearchBillFrame.class);
    }//GEN-LAST:event_itemSearchBillActionPerformed

    private void itemCookMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCookMenuActionPerformed
        showFrame(CookMenuManageFrame.class);
    }//GEN-LAST:event_itemCookMenuActionPerformed

    private void itemPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPurchaseActionPerformed
        showFrame(PurchaseManageFrame.class);
    }//GEN-LAST:event_itemPurchaseActionPerformed

    private void itemRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegisterActionPerformed

        //创建
        RegisterFrame_Short rdfs = new RegisterFrame_Short(null, true);
        //显示
        LocationUtil.setScreenCenter(rdfs);
        rdfs.setVisible(true);
    }//GEN-LAST:event_itemRegisterActionPerformed

    private void itemUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdatePasswordActionPerformed
        //创建
        UpdatePasswordFrame upf = new UpdatePasswordFrame(null, this, true);
        //显示
        LocationUtil.setScreenCenter(upf);
        upf.setVisible(true);
    }//GEN-LAST:event_itemUpdatePasswordActionPerformed

    private void itemExitLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitLoginActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "是否退出登录？", "", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.NO_OPTION) {
            return;
        }
        user = null;
        this.initButton(null);
        
    }//GEN-LAST:event_itemExitLoginActionPerformed

    private void itemExitSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitSystemActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "是否退出系统？", "", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.NO_OPTION) {
            return;
        }
        this.dispose();
    }//GEN-LAST:event_itemExitSystemActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    //显示内部窗体的公共方法
    public void showFrame(Class clazz) {
        try {
            //打开商品管理内部窗体
            //1new对象
            JInternalFrame frame = FrameUtil.buildFrame(clazz);
            //2桌面容器先删除
            this.mainDeskPaneDell.remove(frame);
            //3桌面容器再添加
            this.mainDeskPaneDell.add(frame);
            //4显示
            LocationUtil.setParentCenter(this, frame);
            frame.setVisible(true);
            //5显示在最前
            frame.toFront();
            //6处于选中状态
            frame.setSelected(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }

    //显示内部窗体的公共方法
    public void showFrame(Class clazz, User user) throws NoSuchMethodException {
        try {
            //打开商品管理内部窗体
            //1new对象
            JInternalFrame frame = FrameUtil.buildFrame(clazz, user);
            //2桌面容器先删除
            this.mainDeskPaneDell.remove(frame);
            //3桌面容器再添加
            this.mainDeskPaneDell.add(frame);
            //4显示
            LocationUtil.setParentCenter(this, frame);
            frame.setVisible(true);
            //5显示在最前
            frame.toFront();
            //6处于选中状态
            frame.setSelected(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemBillByWaiter;
    private javax.swing.JMenuItem itemCookMenu;
    private javax.swing.JMenuItem itemCustomerManage;
    private javax.swing.JMenuItem itemDiscountManage;
    private javax.swing.JMenuItem itemEmployeeManage;
    private javax.swing.JMenuItem itemExitLogin;
    private javax.swing.JMenuItem itemExitSystem;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemMenuManage;
    private javax.swing.JMenuItem itemOrderByWaiter;
    private javax.swing.JMenuItem itemOrderDetail;
    private javax.swing.JMenuItem itemOrderDishesByCook;
    private javax.swing.JMenuItem itemOrderDishesByWaiter;
    private javax.swing.JMenuItem itemPurchase;
    private javax.swing.JMenuItem itemRegister;
    private javax.swing.JMenuItem itemRoomManage;
    private javax.swing.JMenuItem itemSearchBill;
    private javax.swing.JMenuItem itemTableManage;
    private javax.swing.JMenuItem itemUpdatePassword;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private com.view.MainDeskPaneDell mainDeskPaneDell;
    private javax.swing.JMenu mnuManager;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JMenu mnuSearch;
    private javax.swing.JMenu mnuSystem;
    // End of variables declaration//GEN-END:variables
}
