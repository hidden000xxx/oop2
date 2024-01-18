/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package de2;

import com.sun.management.HotSpotDiagnosticMXBean;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class Form extends javax.swing.JFrame {
     private ArrayList<NhanVien> danhSachNhanVien;
    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        danhSachNhanVien = new ArrayList<>();
        loadDuLieuTuFile("C:\\Users\\ADMIN\\OneDrive\\Documents\\NetBeansProjects\\test\\src\\de2\\nhanvien.dat");
        hienThiDanhSachNhanVien();
    }

    
    private void loadDuLieuTuFile(String tenFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\$");
                // Tạo đối tượng NhanVien từ dữ liệu trong file
                String hoTen = parts[0];
                int ngaySinh = Integer.parseInt(parts[1]);
                String diaChi = parts[2];
                String gioiTinh = parts[3];
                String phongBan = parts[4];
                double hesl = Double.parseDouble(parts[5]);
                double lcb = Double.parseDouble(parts[6]);
                int thamNien = Integer.parseInt(parts[7]);
                NhanVien nv = new NhanVien(hoTen, ngaySinh, diaChi, gioiTinh, phongBan, hesl, thamNien, lcb);
                // Thêm vào danh sách
                danhSachNhanVien.add(nv);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private void hienThiDanhSachNhanVien() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Xóa dữ liệu hiện tại trong table
        model.setRowCount(0);

        // Thêm dữ liệu từ danhSachNhanVien vào table
        for (NhanVien nv : danhSachNhanVien) {
            Object[] rowData = {nv.getHoten(), nv.getNgaysinh(), nv.getDiachi(), nv.getGioitinh(),
                    nv.getPhongBan(), nv.getHeSoLuong(), nv.getLuongCb(), nv.getThamNien()};
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
            },
            new String [] {
                "Ho ten", "Ngay sinh", "Dia chi", "Gioi tinh","Phong ban","He so luong","tham nien","lcb"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
