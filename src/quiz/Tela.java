package quiz;

import java.awt.Color;
import javax.swing.JOptionPane;



public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jOptionPane1 = new javax.swing.JOptionPane();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblCorreta = new javax.swing.JLabel();
        lblCorreta2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        btnResposta = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        errada3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnElena = new javax.swing.JButton();
        btnKatherine = new javax.swing.JButton();
        btnBonnie = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnStefan = new javax.swing.JButton();
        damon = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton1.setText("Avançar");

        jButton3.setText("jButton3");

        lblMensagem.setText("A resposta está:");

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jRadioButton2.setText("placa mãe");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jRadioButton4.setText("processador");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jRadioButton1.setText("memória ram");

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jRadioButton3.setText("placa de video");

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel1.setText("O que é uma cpu?");

        jButton6.setText("jButton2");

        jButton5.setText("jButton2");

        jButton4.setText("jButton2");

        jButton2.setText("jButton2");

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setText("VOLTAR");

        jButton9.setText("jButton9");

        jButton13.setText("jButton13");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setText("A RESPOSTA ESTÁ:");

        lblCorreta.setBackground(new java.awt.Color(0, 255, 102));
        lblCorreta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCorreta.setText("jLabel4");

        lblCorreta2.setBackground(new java.awt.Color(51, 204, 0));
        lblCorreta2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCorreta2.setText("jLabel5");

        jButton8.setBackground(new java.awt.Color(255, 153, 0));
        jButton8.setText("VOLTAR");

        btnResposta.setBackground(new java.awt.Color(0, 204, 0));
        btnResposta.setText("avançar");
        btnResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespostaActionPerformed(evt);
            }
        });

        jButton11.setText("jButton11");

        jLabel6.setText("jLabel6");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        errada3.setBackground(new java.awt.Color(204, 0, 204));
        errada3.setText("Jeremy");
        errada3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errada3ActionPerformed(evt);
            }
        });

        jLabel7.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 98, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 0, -1, 218));

        btnElena.setBackground(new java.awt.Color(255, 0, 255));
        btnElena.setText("Elena");
        btnElena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElenaActionPerformed(evt);
            }
        });
        getContentPane().add(btnElena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 170, 32));

        btnKatherine.setBackground(new java.awt.Color(255, 0, 255));
        btnKatherine.setText("Katherine");
        btnKatherine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKatherineActionPerformed(evt);
            }
        });
        getContentPane().add(btnKatherine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, 32));

        btnBonnie.setBackground(new java.awt.Color(255, 0, 255));
        btnBonnie.setText("Bonnie");
        btnBonnie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBonnieActionPerformed(evt);
            }
        });
        getContentPane().add(btnBonnie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 170, 32));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("          Quem leva a cura da mordida de lobisomem para o Damon?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 513, 34));

        btnStefan.setBackground(new java.awt.Color(255, 0, 255));
        btnStefan.setText("Stefan");
        btnStefan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStefanActionPerformed(evt);
            }
        });
        getContentPane().add(btnStefan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 170, 32));

        damon.setIcon(new javax.swing.ImageIcon("C:\\Users\\dudan\\Pictures\\Saved Pictures\\ade2140c0193cddffc44ad3ec944d00d.gif")); // NOI18N
        damon.setText("jLabel7");
        getContentPane().add(damon, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 11, 496, 197));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespostaActionPerformed
        // TODO add your handling code here:
        dispose();
        new  Tela3().setVisible(true);
        
    }//GEN-LAST:event_btnRespostaActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnElenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElenaActionPerformed
       
        btnElena.setBackground(Color.red);
        new Thread(){
            public void run(){
                try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.getMessage();
            }
                dispose();
            new Tela3().setVisible(true);
            
            }
        }.start();


    }//GEN-LAST:event_btnElenaActionPerformed

    private void btnKatherineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKatherineActionPerformed

        btnKatherine.setBackground(Color.green);
        new Thread(){
            public void run(){
                try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.getMessage();
            }
                dispose();
            new Tela3().setVisible(true);
            
            }
        }.start();

    }//GEN-LAST:event_btnKatherineActionPerformed

    private void btnBonnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBonnieActionPerformed

 btnBonnie.setBackground(Color.red);
        new Thread(){
            public void run(){
                try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.getMessage();
            }
                dispose();
            new Tela3().setVisible(true);
            
            }
        }.start();
        // TODO add your handling code here:
        
               btnBonnie.setBackground(Color.red);

    }//GEN-LAST:event_btnBonnieActionPerformed

    private void btnStefanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStefanActionPerformed
        // TODO add your handling code here:
        
        btnStefan.setBackground(Color.red);
        new Thread(){
            public void run(){
                try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.getMessage();
            }
                dispose();
            new Tela3().setVisible(true);
            
            }
        }.start();
    }//GEN-LAST:event_btnStefanActionPerformed

    private void errada3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errada3ActionPerformed
        // TODO add your handling code here:
         
        errada3.setBackground(Color.red);
        new Thread(){
            public void run(){
                try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.getMessage();
            }
                dispose();
            new Tela3().setVisible(true);
            
            }
        }.start();
    }//GEN-LAST:event_errada3ActionPerformed

  
    public static void main(String args[]) {
       new Tela3().setVisible(true);
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBonnie;
    private javax.swing.JButton btnElena;
    private javax.swing.JButton btnKatherine;
    private javax.swing.JButton btnResposta;
    private javax.swing.JButton btnStefan;
    private javax.swing.JLabel damon;
    private javax.swing.JButton errada3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblCorreta;
    private javax.swing.JLabel lblCorreta2;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
