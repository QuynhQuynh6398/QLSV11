/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.diem;
import model.diemDAO;
import model.sinhvien;
import model.sinhvienDAO;

/**
 *
 * @author HP
 */
public class quanlydiemDialog extends javax.swing.JDialog {
     sinhvienDAO svDAO = new sinhvienDAO();
     diemDAO dDAO = new diemDAO();
     int index = 0;
     
    /**
     * Creates new form quanlydiemDialog
     */
    public quanlydiemDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void fillDataTABLE(){
       DefaultTableModel model = (DefaultTableModel)tbdiem.getModel();
       model.setRowCount(0);
       for(diem d: dDAO.getAlldiem()){
           Object rowData[] = new Object[7];
           rowData[0] = d.getSv().getMasv();
           rowData[1] =  d.getSv().getTensv();
           rowData[2] = d.getAnhVan();
           rowData[3] = d.getCsdl();
           rowData[4] = d.getGiaitich();
           rowData[5] = d.getTBC();
           rowData[6] = d.getXeploai();
           model.addRow(rowData);    
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txttimkiemmasv = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdiem = new javax.swing.JTable();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnluu = new javax.swing.JButton();
        txtanhvan = new javax.swing.JTextField();
        txtcsdl = new javax.swing.JTextField();
        txtgiaitich = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        lbltbc = new javax.swing.JLabel();
        btndautien = new javax.swing.JButton();
        btntrolai = new javax.swing.JButton();
        btntieptheo = new javax.swing.JButton();
        btncuoicung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("                                                     QUẢN LÝ ĐIỂM");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("HỌ VÀ TÊN:");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("MÃ SINH VIÊN:");

        btntimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btntimkiem.setText("TÌM KIẾM");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(87, 87, 87)
                .addComponent(txttimkiemmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btntimkiem)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttimkiemmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnthem.setText("THÊM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ANH VĂN:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CƠ SỞ DỮ LIỆU:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("GIẢI TÍCH");

        tbdiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ SINH VIÊN", "HỌ VÀ TÊN", "ANH VĂN", "CƠ SỞ DỮ LIỆU", "GIẢI TÍCH", "TRUNG BÌNH CỘNG", "XẾP LOẠI"
            }
        ));
        tbdiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdiem);

        btnsua.setText("SỬA");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("XÓA");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnluu.setText("LƯU");
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("TRUNG BÌNH CỘNG:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("XẾP LOẠI:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("MÃ SINH VIÊN:");

        lbltbc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltbc.setText("0.0");

        btndautien.setText("|<");
        btndautien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndautienActionPerformed(evt);
            }
        });

        btntrolai.setText("<<");
        btntrolai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntrolaiActionPerformed(evt);
            }
        });

        btntieptheo.setText(">>");
        btntieptheo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntieptheoActionPerformed(evt);
            }
        });

        btncuoicung.setText(">|");
        btncuoicung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuoicungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(245, 245, 245))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btntieptheo)
                                .addGap(18, 18, 18)
                                .addComponent(btncuoicung))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txthoten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtanhvan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcsdl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtgiaitich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmasv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbltbc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnluu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addGap(92, 92, 92)
                        .addComponent(btnsua)))
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btndautien)
                .addGap(18, 18, 18)
                .addComponent(btntrolai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnthem)
                            .addComponent(btnsua)
                            .addComponent(txtanhvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcsdl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnxoa)
                            .addComponent(btnluu))
                        .addGap(2, 2, 2)
                        .addComponent(txtgiaitich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbltbc))
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndautien)
                    .addComponent(btntrolai)
                    .addComponent(btntieptheo)
                    .addComponent(btncuoicung))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:
        if(txttimkiemmasv.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "bạn chưa nhập mã sinh viên");
        }else{
            sinhvien sv = svDAO.getsinhvienByID(txttimkiemmasv.getText());
            if(sv != null){
                txtmasv.setText(sv.getMasv());
                txthoten.setText(sv.getTensv());
                txtanhvan.setText("-1");
                txtcsdl.setText("-1");
                txtgiaitich.setText("-1");
                lbltbc.setText("0.0");
            }
        
        }
    }//GEN-LAST:event_btntimkiemActionPerformed

    public boolean validateForm(){
        if(txtmasv.getText().isEmpty()
                ||txthoten.getText().isEmpty()
                ||txtanhvan.getText().isEmpty()
                ||txtcsdl.getText().isEmpty()
                ||txtgiaitich.getText().isEmpty()){
            return false;
        }else{
            try{
                double av = Double.parseDouble(txtanhvan.getText());
                if(av < 0 || av > 10){
                    return false;
                }
            }catch(Exception e){
                return false;
            }  
        }
        return true;
    }
    
    public diem getModel(){
        diem d = new diem();
        d.setId(0);
        sinhvien sv = new sinhvien(txtmasv.getText(), txthoten.getText());
        d.setSv(sv);
        d.setAnhVan(Double.parseDouble(txtanhvan.getText()));
        d.setCsdl(Double.parseDouble(txtcsdl.getText()));
        d.setGiaitich(Double.parseDouble(txtgiaitich.getText()));
        return d;
    }
    
    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            diem d = getModel();
            if(dDAO.add(d)>0){
                fillDataTABLE();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Xin vui lòng kiểm tra thông tin");
        }
           
    }//GEN-LAST:event_btnluuActionPerformed
    
    public void setModel(diem d){
        txtanhvan.setText(String.valueOf(d.getAnhVan()));
        txtcsdl.setText(String.valueOf(d.getCsdl()));
        txtgiaitich.setText(String.valueOf(d.getGiaitich()));
        txtmasv.setText(d.getSv().getMasv());
        txthoten.setText(d.getSv().getTensv());
        lbltbc.setText(String.valueOf(d.getTBC()));
    }
    
    private void tbdiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdiemMouseClicked
        // TODO add your handling code here:
        int id = tbdiem.rowAtPoint(evt.getPoint());
        String masv = tbdiem.getValueAt(id, 0).toString();
        diem d = dDAO.getOnediemBymasv(masv);
        setModel(d);
    }//GEN-LAST:event_tbdiemMouseClicked

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            diem d = getModel();
            if(dDAO.updatediem(d)>0){
                JOptionPane.showMessageDialog(this, "cập nhật thành công");
                fillDataTABLE();
            }
        }else{
            JOptionPane.showMessageDialog(this, "bạn chưa nhập thông tin");
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            diem d = getModel();
            if(dDAO.deldiem(txtmasv.getText())>0){
                fillDataTABLE();
            }else{
                JOptionPane.showMessageDialog(this, "xin vui lòng kiểm tra thông tin");
            }
        }
        
        
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btndautienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndautienActionPerformed
        // TODO add your handling code here:
        index = 0;
        diem d = dDAO.getAtPosition(index);
        setModel(d);
        
    }//GEN-LAST:event_btndautienActionPerformed

    private void btncuoicungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuoicungActionPerformed
        // TODO add your handling code here:
        index = dDAO.getAlldiem().size() -1;
        diem d = dDAO.getAtPosition(index);
        setModel(d);
    }//GEN-LAST:event_btncuoicungActionPerformed

    private void btntrolaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntrolaiActionPerformed
        // TODO add your handling code here:
        index --;
        if(index <= 0){
            index = 0;
        }
        diem d = dDAO.getAtPosition(ERROR);
        setModel(d);
    }//GEN-LAST:event_btntrolaiActionPerformed

    private void btntieptheoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntieptheoActionPerformed
        // TODO add your handling code here:
        index ++;
        if(index >= dDAO.getAlldiem().size()-1){
            index = dDAO.getAlldiem().size()-1;
        }
        diem d = dDAO.getAtPosition(ERROR);
        setModel(d);
    }//GEN-LAST:event_btntieptheoActionPerformed

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
            java.util.logging.Logger.getLogger(quanlydiemDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanlydiemDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanlydiemDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanlydiemDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                quanlydiemDialog dialog = new quanlydiemDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncuoicung;
    private javax.swing.JButton btndautien;
    private javax.swing.JButton btnluu;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntieptheo;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btntrolai;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltbc;
    private javax.swing.JTable tbdiem;
    private javax.swing.JTextField txtanhvan;
    private javax.swing.JTextField txtcsdl;
    private javax.swing.JTextField txtgiaitich;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txttimkiemmasv;
    // End of variables declaration//GEN-END:variables
}
