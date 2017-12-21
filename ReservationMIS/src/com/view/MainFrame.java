/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.view.manage.EmployeeManageFrame;
import com.biz.EmployeeBiz;
import com.biz.EmployeeBizImpl;
import com.po.Employee;
import com.po.User;
import com.util.FrameUtil;
import com.util.LocationUtil;
import com.view.manage.CustomerManageFrame;
import com.view.manage.DiscountManageFrame;
import com.view.manage.MenuManageFrame;
import com.view.manage.RoomManageFrame;
import com.view.manage.RoomOrTableManageFrame;
import com.view.order.BillByWaiterFrame;
import com.view.order.OrderDishesByCookFrame;
import com.view.order.OrderByWaiterFrame;
import com.view.order.OrderDishesByWaiterFrame;
import java.beans.PropertyVetoException;
import java.util.List;
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
//        LocationUtil.setFullScreen(this);
//        初始化按键
        initButton(permission);
    }
    
 private void initButton(String permission) {
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainDeskPaneDell = new com.view.MainDeskPaneDell();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSystem = new javax.swing.JMenu();
        itemLogin = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        itemOrderByWaiter = new javax.swing.JMenuItem();
        itemBillByWaiter = new javax.swing.JMenuItem();
        itemOrderDishesByCook = new javax.swing.JMenuItem();
        itemOrderDishesByWaiter = new javax.swing.JMenuItem();
        mnuManager = new javax.swing.JMenu();
        itemEmployeeManage = new javax.swing.JMenuItem();
        itemCustomerManage = new javax.swing.JMenuItem();
        itemDiscountManage = new javax.swing.JMenuItem();
        itemManuManage = new javax.swing.JMenuItem();
        itemRoomOrTableManage = new javax.swing.JMenuItem();
        itemRoomManage = new javax.swing.JMenuItem();
        itemTableManage = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuSystem.setText("系统设置");

        itemLogin.setText("登录用户");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        mnuSystem.add(itemLogin);

        jMenuBar1.add(mnuSystem);

        mnuOrder.setText("订单管理");

        itemOrderByWaiter.setText("顾客下单");
        itemOrderByWaiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOrderByWaiterActionPerformed(evt);
            }
        });
        mnuOrder.add(itemOrderByWaiter);

        itemBillByWaiter.setText("顾客结账");
        itemBillByWaiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBillByWaiterActionPerformed(evt);
            }
        });
        mnuOrder.add(itemBillByWaiter);

        itemOrderDishesByCook.setText("厨师做菜");
        itemOrderDishesByCook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOrderDishesByCookActionPerformed(evt);
            }
        });
        mnuOrder.add(itemOrderDishesByCook);

        itemOrderDishesByWaiter.setText("服务员上菜");
        itemOrderDishesByWaiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOrderDishesByWaiterActionPerformed(evt);
            }
        });
        mnuOrder.add(itemOrderDishesByWaiter);

        jMenuBar1.add(mnuOrder);

        mnuManager.setText("基本资料管理");

        itemEmployeeManage.setText("职员管理");
        itemEmployeeManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmployeeManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemEmployeeManage);

        itemCustomerManage.setText("顾客管理");
        itemCustomerManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCustomerManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemCustomerManage);

        itemDiscountManage.setText("打折管理");
        itemDiscountManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDiscountManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemDiscountManage);

        itemManuManage.setText("菜单管理");
        itemManuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemManuManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemManuManage);

        itemRoomOrTableManage.setText("房间与餐桌管理");
        itemRoomOrTableManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRoomOrTableManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemRoomOrTableManage);

        itemRoomManage.setText("房间管理");
        itemRoomManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRoomManageActionPerformed(evt);
            }
        });
        mnuManager.add(itemRoomManage);

        itemTableManage.setText("餐桌管理");
        mnuManager.add(itemTableManage);

        jMenuBar1.add(mnuManager);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainDeskPaneDell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainDeskPaneDell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEmployeeManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmployeeManageActionPerformed
        showFrame(EmployeeManageFrame.class);
    }//GEN-LAST:event_itemEmployeeManageActionPerformed

    private void itemCustomerManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCustomerManageActionPerformed
        showFrame(CustomerManageFrame.class);
    }//GEN-LAST:event_itemCustomerManageActionPerformed

    private void itemManuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemManuManageActionPerformed
       showFrame(MenuManageFrame.class);
    }//GEN-LAST:event_itemManuManageActionPerformed

    private void itemDiscountManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDiscountManageActionPerformed
        showFrame(DiscountManageFrame.class);
    }//GEN-LAST:event_itemDiscountManageActionPerformed

    private void itemRoomOrTableManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRoomOrTableManageActionPerformed
      showFrame(RoomOrTableManageFrame.class);
    }//GEN-LAST:event_itemRoomOrTableManageActionPerformed

    private void itemOrderByWaiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOrderByWaiterActionPerformed
       showFrame(OrderByWaiterFrame.class);
    }//GEN-LAST:event_itemOrderByWaiterActionPerformed

    private void itemBillByWaiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBillByWaiterActionPerformed
         showFrame(BillByWaiterFrame.class);
    }//GEN-LAST:event_itemBillByWaiterActionPerformed

    private void itemOrderDishesByCookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOrderDishesByCookActionPerformed
        showFrame(OrderDishesByCookFrame.class);
    }//GEN-LAST:event_itemOrderDishesByCookActionPerformed

    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed
//        //创建
//        LoginFrame ldf = new LoginFrame(null, this, true);
//        //显示
//        LocationUtil.setScreenCenter(ldf);
//        ldf.setVisible(true);
//        if(user != null){
//        this.initButton(user.getPermission());
//        }
    }//GEN-LAST:event_itemLoginActionPerformed

    private void itemOrderDishesByWaiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOrderDishesByWaiterActionPerformed
     showFrame(OrderDishesByWaiterFrame.class);
    }//GEN-LAST:event_itemOrderDishesByWaiterActionPerformed

    private void itemRoomManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRoomManageActionPerformed
        showFrame(RoomManageFrame.class);
    }//GEN-LAST:event_itemRoomManageActionPerformed

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
            LocationUtil.setParentCenter(this,frame);
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
    public void showFrame(Class clazz,User user) {
        try {
            //打开商品管理内部窗体
            //1new对象
            JInternalFrame frame = FrameUtil.buildFrame(clazz,user);
            //2桌面容器先删除
            this.mainDeskPaneDell.remove(frame);
            //3桌面容器再添加
            this.mainDeskPaneDell.add(frame);
            //4显示
           LocationUtil.setParentCenter(this,frame);
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
    private javax.swing.JMenuItem itemCustomerManage;
    private javax.swing.JMenuItem itemDiscountManage;
    private javax.swing.JMenuItem itemEmployeeManage;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemManuManage;
    private javax.swing.JMenuItem itemOrderByWaiter;
    private javax.swing.JMenuItem itemOrderDishesByCook;
    private javax.swing.JMenuItem itemOrderDishesByWaiter;
    private javax.swing.JMenuItem itemRoomManage;
    private javax.swing.JMenuItem itemRoomOrTableManage;
    private javax.swing.JMenuItem itemTableManage;
    private javax.swing.JMenuBar jMenuBar1;
    private com.view.MainDeskPaneDell mainDeskPaneDell;
    private javax.swing.JMenu mnuManager;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JMenu mnuSystem;
    // End of variables declaration//GEN-END:variables
}
