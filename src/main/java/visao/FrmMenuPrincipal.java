package visao;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuItemArquivo = new javax.swing.JMenu();
        jMenuItemNovoAluno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuGerenciarAlunos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Aluno");

        jMenuItemArquivo.setText("File");

        jMenuItemNovoAluno.setText("Cadastrar Aluno");
        jMenuItemNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoAlunoActionPerformed(evt);
            }
        });
        jMenuItemArquivo.add(jMenuItemNovoAluno);
        jMenuItemArquivo.add(jSeparator1);

        jMenuGerenciarAlunos.setText("Gerenciar Alunos");
        jMenuGerenciarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarAlunosActionPerformed(evt);
            }
        });
        jMenuItemArquivo.add(jMenuGerenciarAlunos);
        jMenuItemArquivo.add(jSeparator2);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuItemArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuItemArquivo);

        jMenuItemSobre.setText("Edit");
        jMenuBar1.add(jMenuItemSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoAlunoActionPerformed
        FrmCadastroAluno objeto = new FrmCadastroAluno();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItemNovoAlunoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuGerenciarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerenciarAlunosActionPerformed
        FrmGerenciarAluno objeto = new FrmGerenciarAluno();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuGerenciarAlunosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuGerenciarAlunos;
    private javax.swing.JMenu jMenuItemArquivo;
    private javax.swing.JMenuItem jMenuItemNovoAluno;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuItemSobre;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
