/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author User
 */
public class kalkulator extends javax.swing.JFrame {
private String angka = " ";
    @FXML
    private Button num0;
    @FXML
    private Button titik;
    @FXML
    private Button num8;
    @FXML
    private Button num5;
    @FXML
    private Button num2;
    @FXML
    private Button num7;
    @FXML
    private Button num1;
    @FXML
    private Button num4;
    @FXML
    private Button num3;
    @FXML
    private Button num6;
    @FXML
    private Button num9;
    @FXML
    private Button sin;
    @FXML
    private Button cos;
    @FXML
    private Button tan;
    @FXML
    private Button log;
    
    
    double jumlah,angka1,angka2;
    int pilih;
    
    

    
    public kalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        hasil = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        tampilan = new javax.swing.JTextField();
        bagi1 = new javax.swing.JButton();
        LOG = new javax.swing.JButton();
        SIN = new javax.swing.JButton();
        COS = new javax.swing.JButton();
        TAN = new javax.swing.JButton();
        persen = new javax.swing.JButton();
        pangkat2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zerricho Helsa Bagus Givalle");
        setResizable(false);
        getContentPane().setLayout(null);

        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah);
        tambah.setBounds(160, 270, 40, 45);

        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });
        getContentPane().add(number1);
        number1.setBounds(10, 120, 39, 45);

        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });
        getContentPane().add(number4);
        number4.setBounds(10, 170, 39, 45);

        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });
        getContentPane().add(number7);
        number7.setBounds(10, 220, 39, 45);

        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });
        getContentPane().add(number0);
        number0.setBounds(10, 270, 39, 45);

        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });
        getContentPane().add(number2);
        number2.setBounds(60, 120, 39, 45);

        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });
        getContentPane().add(number5);
        number5.setBounds(60, 170, 39, 45);

        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });
        getContentPane().add(number8);
        number8.setBounds(60, 220, 39, 45);

        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(60, 270, 39, 45);

        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });
        getContentPane().add(number3);
        number3.setBounds(110, 120, 39, 45);

        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });
        getContentPane().add(number6);
        number6.setBounds(110, 170, 39, 45);

        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });
        getContentPane().add(number9);
        number9.setBounds(110, 220, 39, 45);

        hasil.setText("=");
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        getContentPane().add(hasil);
        hasil.setBounds(220, 270, 130, 45);

        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        getContentPane().add(bagi);
        bagi.setBounds(160, 120, 40, 45);

        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        getContentPane().add(kali);
        kali.setBounds(160, 170, 39, 45);

        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        getContentPane().add(kurang);
        kurang.setBounds(160, 220, 40, 45);
        getContentPane().add(tampilan);
        tampilan.setBounds(10, 60, 340, 50);

        bagi1.setText("/");
        bagi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagi1ActionPerformed(evt);
            }
        });
        getContentPane().add(bagi1);
        bagi1.setBounds(160, 120, 40, 45);

        LOG.setText("Log");
        LOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGActionPerformed(evt);
            }
        });
        getContentPane().add(LOG);
        LOG.setBounds(290, 170, 60, 40);

        SIN.setText("Sin");
        SIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SINActionPerformed(evt);
            }
        });
        getContentPane().add(SIN);
        SIN.setBounds(220, 120, 60, 40);

        COS.setText("Cos");
        COS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COSActionPerformed(evt);
            }
        });
        getContentPane().add(COS);
        COS.setBounds(290, 120, 60, 40);

        TAN.setText("Tan");
        TAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TANActionPerformed(evt);
            }
        });
        getContentPane().add(TAN);
        TAN.setBounds(220, 170, 60, 40);

        persen.setText("%");
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });
        getContentPane().add(persen);
        persen.setBounds(290, 220, 60, 40);

        pangkat2.setText("X^2");
        pangkat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pangkat2ActionPerformed(evt);
            }
        });
        getContentPane().add(pangkat2);
        pangkat2.setBounds(220, 220, 60, 40);

        jButton2.setText(".");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 270, 40, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setText("Kalkulator");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 140, 20);

        setSize(new java.awt.Dimension(382, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
       angka1=Double.parseDouble(angka);
       tampilan.setText("+");
       angka="";
       pilih = 1;
    }//GEN-LAST:event_tambahActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        angka +="1";
        tampilan.setText(angka);
                  
    }//GEN-LAST:event_number1ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
     angka +="4";
        tampilan.setText(angka);
    }//GEN-LAST:event_number4ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        angka +="7";
        tampilan.setText(angka);
    }//GEN-LAST:event_number7ActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        angka +="0";
        tampilan.setText(angka);
    }//GEN-LAST:event_number0ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
      angka +="2";
        tampilan.setText(angka);
    }//GEN-LAST:event_number2ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
      angka +="5";
        tampilan.setText(angka);
    }//GEN-LAST:event_number5ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
       angka +="8";
        tampilan.setText(angka);
    }//GEN-LAST:event_number8ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       tampilan.setText(" ");
       angka1 = 0.0;
       angka2 = 0.0;
       jumlah= 0.0;
       angka= " ";
    }//GEN-LAST:event_clearActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
      angka +="3";
        tampilan.setText(angka);
    }//GEN-LAST:event_number3ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
       angka +="6";
        tampilan.setText(angka);
    }//GEN-LAST:event_number6ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
       angka +="9";
        tampilan.setText(angka);
    }//GEN-LAST:event_number9ActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
       switch(pilih){
           case 1 : 
                angka2=Double.parseDouble(angka);
                jumlah = angka1 + angka2;
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
                break;
                case 2 : 
                angka2=Double.parseDouble(angka);
                jumlah = angka1 - angka2;
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
                break;
                case 3 : 
                angka2=Double.parseDouble(angka);
                jumlah = angka1 * angka2;
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
                break;
                case 4 : 
                angka2=Double.parseDouble(angka);
                jumlah = angka1 / angka2;
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
                break;
                
               
                case 6 :  
                    
                jumlah = Math.cos(angka1);
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
                break;
                case 5 :  
                jumlah = Math.sin(angka1) ;
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
                break;
                case 7 :  
                jumlah = Math.tan(angka1) ;
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
                break;
                case 8 :  
                angka2 = Double.parseDouble(angka);
                jumlah = Math.log(angka1);
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
                break;
                case 9 :  
                jumlah = Math.pow(angka1, 2);
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
                break;
            
                
          

        default:
         break;
       
       }
    }//GEN-LAST:event_hasilActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        angka1=Double.parseDouble(angka);
       tampilan.setText("x");
       angka="";
       pilih = 3;
    }//GEN-LAST:event_kaliActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
       angka1=Double.parseDouble(angka);
       tampilan.setText("-");
       angka="";
       pilih = 2;
    }//GEN-LAST:event_kurangActionPerformed

    private void bagi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bagi1ActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        angka1=Double.parseDouble(angka);
        tampilan.setText("/");
        angka="";
        pilih = 4;
    }//GEN-LAST:event_bagiActionPerformed

    private void LOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGActionPerformed
        angka1=Double.parseDouble(angka);
        tampilan.setText("Log");
        angka="";
        pilih = 8;
    }//GEN-LAST:event_LOGActionPerformed

    private void SINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SINActionPerformed
         angka1=Double.parseDouble(angka);
        tampilan.setText("Sin");
        angka="";
        pilih = 5;
    }//GEN-LAST:event_SINActionPerformed

    private void COSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COSActionPerformed
       angka1=Double.parseDouble(angka);
        tampilan.setText("Cos");
        angka="";
        pilih = 6;
    }//GEN-LAST:event_COSActionPerformed

    private void TANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TANActionPerformed
         angka1=Double.parseDouble(angka);
        tampilan.setText("/");
        angka="";
        pilih = 7;
    }//GEN-LAST:event_TANActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
         angka1=Double.parseDouble(angka);
        
         jumlah = angka1/100;
                angka = Double.toString(jumlah);
                tampilan.setText(angka);
    }//GEN-LAST:event_persenActionPerformed

    private void pangkat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangkat2ActionPerformed
        angka1=Double.parseDouble(angka);
        tampilan.setText("^");
        angka="";
        pilih = 9;
    }//GEN-LAST:event_pangkat2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        angka += ".";
        tampilan.setText(angka);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton COS;
    private javax.swing.JButton LOG;
    private javax.swing.JButton SIN;
    private javax.swing.JButton TAN;
    private javax.swing.JButton bagi;
    private javax.swing.JButton bagi1;
    private javax.swing.JButton clear;
    private javax.swing.JButton hasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton pangkat2;
    private javax.swing.JButton persen;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tampilan;
    // End of variables declaration//GEN-END:variables
}
