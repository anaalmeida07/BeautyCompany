/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.TabelaController;
import Controller.agendamentoController;
import Controller.VoltarController;
import Controller.agendamentoController;
import Controller.agendamentoController;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author lmene
 */
public class agendamento extends javax.swing.JFrame {

    private final TabelaController controller;
    private final agendamentoController controller2;
    
    

    /**
     * Creates new form agendamento
     */
    public agendamento() {
        initComponents();
        this.controller = new TabelaController(this);
         this.controller2 = new agendamentoController(this);
    
        iniciar1();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        concluir = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        cliente = new javax.swing.JComboBox<>();
        servico = new javax.swing.JComboBox<>();
        hora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valor.setBackground(new java.awt.Color(254, 254, 250));
        valor.setText("jTextField1");
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 290, 40));

        jButton1.setBackground(new java.awt.Color(254, 254, 250));
        jButton1.setText("Tabela de agendamentos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 610, 280, 40));

        concluir.setBackground(new java.awt.Color(254, 254, 250));
        concluir.setText("Concluir");
        concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirActionPerformed(evt);
            }
        });
        getContentPane().add(concluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 550, 150, 40));

        id.setBackground(new java.awt.Color(254, 254, 250));
        id.setText("jTextField1");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 40));

        data.setBackground(new java.awt.Color(254, 254, 250));
        data.setText("jTextField1");
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 290, 40));

        cliente.setBackground(new java.awt.Color(254, 254, 250));
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, 40));

        servico.setBackground(new java.awt.Color(254, 254, 250));
        servico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                servicoItemStateChanged(evt);
            }
        });
        servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicoActionPerformed(evt);
            }
        });
        getContentPane().add(servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 290, 40));

        hora.setBackground(new java.awt.Color(254, 254, 250));
        hora.setText("jTextField1");
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 290, 40));

        observacao.setBackground(new java.awt.Color(254, 254, 250));
        observacao.setColumns(20);
        observacao.setRows(5);
        jScrollPane1.setViewportView(observacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 560, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/agendamento.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1420, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirActionPerformed
      // this.controller2.agendar();
    }//GEN-LAST:event_concluirActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicoActionPerformed

    private void servicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_servicoItemStateChanged
        this.controller2.atualizaValor();
    }//GEN-LAST:event_servicoItemStateChanged

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
            java.util.logging.Logger.getLogger(agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cliente;
    private javax.swing.JButton concluir;
    private javax.swing.JTextField data;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea observacao;
    private javax.swing.JComboBox<String> servico;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables

    private void iniciar1() {
       this.controller2.atualizaCliente();
       this.controller2.atualizaServico();
    }

    public JComboBox<String> getCliente() {
        return cliente;
    }

    public void setCliente(JComboBox<String> cliente) {
        this.cliente = cliente;
    }

    public JComboBox<String> getServico() {
        return servico;
    }

    public void setServico(JComboBox<String> servico) {
        this.servico = servico;
    }

    public JTextField getValor() {
        return valor;
    }

    public void setValor(JTextField valor) {
        this.valor = valor;
    }

    public JTextField getData() {
        return data;
    }

    public void setData(JTextField data) {
        this.data = data;
    }

    public JTextField getHora() {
        return hora;
    }

    public void setHora(JTextField hora) {
        this.hora = hora;
    }

    public JTextField getId() {
        return id;
    }

    public void setId(JTextField id) {
        this.id = id;
    }

    public JTextArea getObservacao() {
        return observacao;
    }

    public void setObservacao(JTextArea observacao) {
        this.observacao = observacao;
    }

    
    

 

   

    
}
