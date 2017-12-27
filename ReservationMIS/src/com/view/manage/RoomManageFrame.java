/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.manage;
import com.biz.RoomBiz;
import com.biz.RoomBizImpl;
import com.po.Room;
import com.util.FrameUtil;
import com.util.StringUtil;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Qu Leigang
 */
public class RoomManageFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form RoomManageFrame
     */
    RoomBiz rbiz = new RoomBizImpl();
    public RoomManageFrame() {
        initComponents();
         this.jScrollPane1.getViewport().setBackground(Color.WHITE);
         this.btnSave.setEnabled(false);
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

        jDialog1 = new javax.swing.JDialog();
        homePanel1 = new com.view.manage.HomePanel();
        txtCondition = new javax.swing.JTextField();
        btnfind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoom = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtRid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRcount = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(true);
        setTitle("房间管理");
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

        btnfind.setBackground(new java.awt.Color(255, 255, 102));
        btnfind.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnfind.setText("查询");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        tblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "房间号", "房间名", "最大容纳桌数", "当前桌数"
            }
        ));
        tblRoom.setDragEnabled(true);
        tblRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRoom);

        jLabel1.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("房间号");

        txtRid.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtRid.setText(" ");
        txtRid.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("房间名");

        txtRname.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtRname.setText(" ");

        jLabel3.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("最大容纳桌数");

        txtRcount.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        txtRcount.setText(" ");

        btnAdd.setBackground(new java.awt.Color(255, 255, 102));
        btnAdd.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnAdd.setText("添加");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 102));
        btnDelete.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 102));
        btnReset.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnReset.setText("重置");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 102));
        btnSave.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
        btnSave.setText("保存");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePanel1Layout = new javax.swing.GroupLayout(homePanel1);
        homePanel1.setLayout(homePanel1Layout);
        homePanel1Layout.setHorizontalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnfind))
                    .addGroup(homePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtRid, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homePanel1Layout.createSequentialGroup()
                                .addComponent(btnReset)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave))
                            .addGroup(homePanel1Layout.createSequentialGroup()
                                .addComponent(txtRname, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtRcount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        homePanel1Layout.setVerticalGroup(
            homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRcount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(homePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(homePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
        String condition = this.txtCondition.getText().trim();
        List<Room> list = rbiz.findByCondition(condition);
        showOnTable(list);
    }//GEN-LAST:event_btnfindActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearInput();
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String rname = this.txtRname.getText().trim();
        String strcount = this.txtRcount.getText().trim();
              
        //数据格式验证(使用StringUtil)
        //1.验证非空。
        if(StringUtil.checkLength(rname)==false){
            JOptionPane.showMessageDialog(this, "房间名称不能为空");
            return ;
        }
        if(StringUtil.checkLength(strcount)==false){
            JOptionPane.showMessageDialog(this, "最大容纳桌数不能为空");
            return ;
        }
        Integer rcount = Integer.parseInt(strcount);  
        
        //组合对象
        Room r = new Room(null,rname,rcount,0);
        //调用业务类
        boolean result = rbiz.add(r);
        if(result == true){
            JOptionPane.showMessageDialog(this,"添加成功");
            List<Room> list = rbiz.findAll();
            //显示list中的信息
            showOnTable(list);
        }else{
            JOptionPane.showMessageDialog(this,"添加失败");
        }
        //清空面板信息
        clearInput();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "您确定要删除吗？");
        if(answer == JOptionPane.YES_OPTION){
            // 删除商品
            int rid = Integer.parseInt(this.txtRid.getText());
            Room r = rbiz.findByID(rid);
            if(r.getRcondition()!=0){
                 JOptionPane.showMessageDialog(this, "该房间还有桌子");
                 return;
            }
            //调用业务
            boolean result = rbiz.delete(rid);
            if(result == true){
                JOptionPane.showMessageDialog(this, "删除成功");
                List<Room> list = rbiz.findAll();
                //显示list中的信息
                showOnTable(list);
            }else{
                JOptionPane.showMessageDialog(this, "删除失败");
            }
        }
        clearInput();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomMouseClicked
        // 鼠标选中某行，改行信息显示到输入面板。
        int row = this.tblRoom.getSelectedRow();
        //根据row获取每列的值。
        this.txtRid.setText(this.tblRoom.getValueAt(row, 0)+"");
        this.txtRname.setText(this.tblRoom.getValueAt(row, 1)+"");
        this.txtRcount.setText(this.tblRoom.getValueAt(row, 2)+"");
        //保存，删除按钮可用。
        this.btnSave.setEnabled(true);
        this.btnDelete.setEnabled(true);
        this.btnAdd.setEnabled(false);
    }//GEN-LAST:event_tblRoomMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String rid = this.txtRid.getText().trim();
        String rname = this.txtRname.getText().trim();
        String rcount = this.txtRcount.getText().trim();
        //数据格式验证(使用StringUtil)
        //1.验证非空。
        if(StringUtil.checkLength(rid)==false){
            JOptionPane.showMessageDialog(this, "房间号不能为空");
            return ;
        }
        if(StringUtil.checkLength(rname)==false){
            JOptionPane.showMessageDialog(this, "房间名不能为空");
            return ;
        }
        if(StringUtil.checkLength(rcount)==false){
            JOptionPane.showMessageDialog(this, "最大容纳桌数不能为空");
            return ;
        }
        
        //组合对象
        int rcondition = rbiz.findByID(Integer.parseInt(rid)).getRcondition();
        Room c = new Room(Integer.parseInt(rid),rname,Integer.parseInt(rcount),rcondition);
        //调用业务类
        boolean result = rbiz.update(c);
        if(result == true){
            JOptionPane.showMessageDialog(this,"修改成功");
            List<Room> list = rbiz.findAll();
            //显示list中的信息
            showOnTable(list);
        }else{
            JOptionPane.showMessageDialog(this,"修改失败");
        }
        //清空面板信息
        clearInput();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
         //窗口关闭，从map中移除
        FrameUtil.framemap.remove(RoomManageFrame.class.getName());
    }//GEN-LAST:event_formInternalFrameClosed

    /**
     * @param args the command line arguments
     */
    public void showOnTable(List<Room> list) {
        //1.获取指定表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblRoom.getModel();
        //2.清空表格信息
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        //3.显示数据
        for(Room r :list){
            Vector vt = new Vector();
            vt.add(r.getRid());
            vt.add(r.getRname());
            vt.add(r.getRcounttable());
            vt.add(r.getRcondition());
            dtm.addRow(vt);
        }
        
    }
    private void clearInput() {
        this.txtRid.setText("");
        this.txtRname.setText("");
        this.txtRcount.setText("");
        this.btnSave.setEnabled(false);
         this.btnDelete.setEnabled(false);
         this.btnAdd.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnfind;
    private com.view.manage.HomePanel homePanel1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRoom;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtRcount;
    private javax.swing.JTextField txtRid;
    private javax.swing.JTextField txtRname;
    // End of variables declaration//GEN-END:variables
}
