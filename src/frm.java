/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayyam8774
 */
public class frm extends javax.swing.JFrame {

    /**
     * Creates new form frm
     */
    public frm() {
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

        lbltitle = new javax.swing.JLabel();
        lblfact = new javax.swing.JLabel();
        txtfactIn = new javax.swing.JTextField();
        btnfact = new javax.swing.JButton();
        lblfactOut = new javax.swing.JLabel();
        lblprime = new javax.swing.JLabel();
        txtprimeIn = new javax.swing.JTextField();
        btnprime = new javax.swing.JButton();
        lblprimeOut = new javax.swing.JLabel();
        lblfibo = new javax.swing.JLabel();
        txtfiboIn = new javax.swing.JTextField();
        btnfibo = new javax.swing.JButton();
        lblfiboOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitle.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lbltitle.setText("Numbers");

        lblfact.setText("Enter a number and click the button to find the factorial : ");

        btnfact.setText("Factorial →");
        btnfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfactActionPerformed(evt);
            }
        });

        lblfactOut.setText("...");

        lblprime.setText("Enter a number and click the button to determine whatheror not it is a prime number :");

        btnprime.setText("Prime →");
        btnprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimeActionPerformed(evt);
            }
        });

        lblprimeOut.setText("...");

        lblfibo.setText("Enter a number and click the button to see the corresponding Fibonacci Number : ");

        btnfibo.setText("Fibonacci");
        btnfibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiboActionPerformed(evt);
            }
        });

        lblfiboOut.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(lbltitle)
                .addGap(250, 250, 250))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfiboIn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnfibo)
                        .addGap(111, 111, 111)
                        .addComponent(lblfiboOut))
                    .addComponent(lblfibo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtprimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnprime)
                        .addGap(115, 115, 115)
                        .addComponent(lblprimeOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblprime)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfactIn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnfact)
                        .addGap(100, 100, 100)
                        .addComponent(lblfactOut))
                    .addComponent(lblfact))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbltitle)
                .addGap(18, 18, 18)
                .addComponent(lblfact)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfactIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfact)
                    .addComponent(lblfactOut))
                .addGap(50, 50, 50)
                .addComponent(lblprime)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprime)
                    .addComponent(lblprimeOut))
                .addGap(50, 50, 50)
                .addComponent(lblfibo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfiboIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfibo)
                    .addComponent(lblfiboOut))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfactActionPerformed
        int factin = Integer.parseInt(txtfactIn.getText());
        int ans = 1;

        for (int i = factin; i > 0 ; i = i - 1)
        {
            ans = ans * i;
        }
        
        lblfactOut.setText(""+ ans +"");

    }//GEN-LAST:event_btnfactActionPerformed

    private void btnprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimeActionPerformed
        int n = Integer.parseInt(txtprimeIn.getText());
        
         for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                lblprimeOut.setText("Not Prime");
                return;
            }
        }
        lblprimeOut.setText("It's Prime");
        
    }//GEN-LAST:event_btnprimeActionPerformed

    private void btnfiboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiboActionPerformed
        int number = Integer.parseInt(txtfiboIn.getText());
        int ans = 1;
        
        
        function fibonacci(number) 
        
        {
        var sequence = [1, 1];

	for (var i = 2; i < number; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence[number - 1];
    }
    
        function fibonacci(number) {

	if (number < 1) {
                return 0;
            }

            if (number <= 2) {
                return 1;
            }

            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    
        lblfiboOut.setText(""+ fibonacci +"")
        
        
        
        
    }//GEN-LAST:event_btnfiboActionPerformed

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
            java.util.logging.Logger.getLogger(frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfact;
    private javax.swing.JButton btnfibo;
    private javax.swing.JButton btnprime;
    private javax.swing.JLabel lblfact;
    private javax.swing.JLabel lblfactOut;
    private javax.swing.JLabel lblfibo;
    private javax.swing.JLabel lblfiboOut;
    private javax.swing.JLabel lblprime;
    private javax.swing.JLabel lblprimeOut;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtfactIn;
    private javax.swing.JTextField txtfiboIn;
    private javax.swing.JTextField txtprimeIn;
    // End of variables declaration//GEN-END:variables
}
