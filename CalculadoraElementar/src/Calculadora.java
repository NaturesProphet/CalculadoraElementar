
import javax.swing.JOptionPane;

/**
 *
 * @author mgarcia
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    Double subtotal = 0.0;
    char operacao = '0';
    String log = "";

    public Calculadora() {
        initComponents();
        calcula_B.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num7_B = new javax.swing.JButton();
        num9_B = new javax.swing.JButton();
        num8_B = new javax.swing.JButton();
        opcent_B = new javax.swing.JButton();
        opdiv_B = new javax.swing.JButton();
        num6_B = new javax.swing.JButton();
        num5_B = new javax.swing.JButton();
        opinverso_B = new javax.swing.JButton();
        opmult_B = new javax.swing.JButton();
        num4_B = new javax.swing.JButton();
        num3_B = new javax.swing.JButton();
        num2_B = new javax.swing.JButton();
        opsub_B = new javax.swing.JButton();
        num1_B = new javax.swing.JButton();
        virg_B = new javax.swing.JButton();
        num0_B = new javax.swing.JButton();
        calcula_B = new javax.swing.JButton();
        opsoma_B = new javax.swing.JButton();
        c_B = new javax.swing.JButton();
        visor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        log_TA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        num7_B.setText("7");
        num7_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num7_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7_BActionPerformed(evt);
            }
        });

        num9_B.setText("9");
        num9_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num9_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9_BActionPerformed(evt);
            }
        });

        num8_B.setText("8");
        num8_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num8_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8_BActionPerformed(evt);
            }
        });

        opcent_B.setText("%");
        opcent_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcent_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcent_BActionPerformed(evt);
            }
        });

        opdiv_B.setText("/");
        opdiv_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opdiv_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opdiv_BActionPerformed(evt);
            }
        });

        num6_B.setText("6");
        num6_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num6_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6_BActionPerformed(evt);
            }
        });

        num5_B.setText("5");
        num5_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num5_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5_BActionPerformed(evt);
            }
        });

        opinverso_B.setText("1/x");
        opinverso_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opinverso_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opinverso_BActionPerformed(evt);
            }
        });

        opmult_B.setText("x");
        opmult_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opmult_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opmult_BActionPerformed(evt);
            }
        });

        num4_B.setText("4");
        num4_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num4_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4_BActionPerformed(evt);
            }
        });

        num3_B.setText("3");
        num3_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num3_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3_BActionPerformed(evt);
            }
        });

        num2_B.setText("2");
        num2_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num2_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_BActionPerformed(evt);
            }
        });

        opsub_B.setText("-");
        opsub_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opsub_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opsub_BActionPerformed(evt);
            }
        });

        num1_B.setText("1");
        num1_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num1_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_BActionPerformed(evt);
            }
        });

        virg_B.setText(",");
        virg_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        virg_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virg_BActionPerformed(evt);
            }
        });

        num0_B.setText("0");
        num0_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        num0_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0_BActionPerformed(evt);
            }
        });

        calcula_B.setText("=");
        calcula_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcula_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcula_BActionPerformed(evt);
            }
        });
        calcula_B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcula_BKeyPressed(evt);
            }
        });

        opsoma_B.setText("+");
        opsoma_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opsoma_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opsoma_BActionPerformed(evt);
            }
        });

        c_B.setText("C");
        c_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_BActionPerformed(evt);
            }
        });

        visor.setEditable(false);
        visor.setBackground(new java.awt.Color(153, 255, 255));
        visor.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        visor.setForeground(new java.awt.Color(102, 102, 102));

        log_TA.setEditable(false);
        log_TA.setBackground(new java.awt.Color(153, 153, 153));
        log_TA.setColumns(20);
        log_TA.setForeground(new java.awt.Color(0, 255, 51));
        log_TA.setRows(5);
        jScrollPane1.setViewportView(log_TA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num7_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(num8_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num9_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opdiv_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opcent_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num4_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(num5_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num6_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opmult_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opinverso_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num1_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(num2_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num3_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opsub_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(c_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(num0_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(virg_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opsoma_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcula_B, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opdiv_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcent_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opmult_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opinverso_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num1_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num3_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num2_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opsub_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(virg_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num0_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opsoma_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(calcula_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num0_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0_BActionPerformed
        visor.setText(visor.getText() + "0");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num0_BActionPerformed

    private void num1_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_BActionPerformed
        visor.setText(visor.getText() + "1");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num1_BActionPerformed

    private void num2_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_BActionPerformed
        visor.setText(visor.getText() + "2");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num2_BActionPerformed

    private void num3_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3_BActionPerformed
        visor.setText(visor.getText() + "3");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num3_BActionPerformed

    private void num4_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4_BActionPerformed
        visor.setText(visor.getText() + "4");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num4_BActionPerformed

    private void num5_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5_BActionPerformed
        visor.setText(visor.getText() + "5");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num5_BActionPerformed

    private void num6_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6_BActionPerformed
        visor.setText(visor.getText() + "6");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num6_BActionPerformed

    private void num7_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7_BActionPerformed
        visor.setText(visor.getText() + "7");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num7_BActionPerformed

    private void num8_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8_BActionPerformed
        visor.setText(visor.getText() + "8");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num8_BActionPerformed

    private void num9_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9_BActionPerformed
        visor.setText(visor.getText() + "9");
        calcula_B.grabFocus();
    }//GEN-LAST:event_num9_BActionPerformed

    private void virg_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virg_BActionPerformed
        visor.setText(visor.getText() + ".");
        calcula_B.grabFocus();
    }//GEN-LAST:event_virg_BActionPerformed


    private void c_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_BActionPerformed
        visor.setText(null);
        subtotal = 0.0;
        operacao = '0';
        calcula_B.grabFocus();

    }//GEN-LAST:event_c_BActionPerformed

    /*
  esta sub-rotina processa os valores inseridos de maneira iterativa,
  verificando a operação imediatamente anterior à atual e efetuando
  o calculo relativo a esta operação (quando houver).
  a procedure recebe 2 parâmetros para trabalhar:
  1 char contendo o método (divisao, adição multiplicação etc..)
  1 double contendo o valor atual no visor da calculadora (ultimo numero inserido)
     */
    public void calcula(char metodo, Double numero) {
        //verifica a operação anterior
        switch (operacao) {
            case '+':
                subtotal += numero;
                log += log + numero;
                break;

            case '-':
                subtotal -= numero;
                log += log + numero;
                break;

            case 'x':
                subtotal *= numero;
                log += log + " " + numero;
                break;

            case '/':
                if (numero != 0) {
                    subtotal /= numero;
                    log += log + numero;
                } else {
                    log = "ERRO: Divisão por 0\n";
                    visor.setText(null);
                    log_TA.setText(log);
                    JOptionPane.showMessageDialog(null, "Não consigo dividir por 0"
                            + "\nO único que ja fez isto foi Chuck Norris");
                    subtotal = 0.0;
                }
                break;
            /*
                observe que processamentos de porcentagem e inversões são processados 
                "in-loco" no local em que forem invocados e não estão nesta subrotina
             */
            case '0':
                subtotal = numero;
                log += "" + numero + " ";
                break;
        }

        //if para prevenir erro de metodo incorreto (correção da falha)
        if (!log.equals("ERRO: Divisão por 0\n")) {
            //se uma divisão por zero não ocorreu, este é o procedimento normal
            operacao = metodo;
            log += metodo + " "; //trecho de log da operação
        } else {
            //mas se uma divisão por zero aconteceu, preciso ajustar a operacao para não
            //efetuar uma instrução indevida e o log para nao exibir esta operação
            operacao = '0';
            log += " ";

        }
        calcula_B.grabFocus();

    }


    private void opsoma_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opsoma_BActionPerformed
        if (visor.getText() != null) {
            calcula('+', Double.parseDouble(visor.getText()));
            visor.setText(null);
        }
        calcula_B.grabFocus();
    }//GEN-LAST:event_opsoma_BActionPerformed


    private void opsub_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opsub_BActionPerformed
        if (visor.getText() != null) {
            calcula('-', Double.parseDouble(visor.getText()));
            visor.setText(null);
        }
        calcula_B.grabFocus();
    }//GEN-LAST:event_opsub_BActionPerformed

    private void opmult_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opmult_BActionPerformed

        if (visor.getText() != null) {
            calcula('x', Double.parseDouble(visor.getText()));
            visor.setText(null);
        }
        calcula_B.grabFocus();
    }//GEN-LAST:event_opmult_BActionPerformed

    private void opdiv_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opdiv_BActionPerformed
        if (visor.getText() != null) {
            calcula('/', Double.parseDouble(visor.getText()));
            visor.setText(null);
        }
        calcula_B.grabFocus();
    }//GEN-LAST:event_opdiv_BActionPerformed

    private void calcula_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcula_BActionPerformed
        Double valor; //armazena um numero temporario lido do visor

        if (visor.getText() != null) {
            valor = Double.parseDouble(visor.getText());

            switch (operacao) {
                case '+':
                    subtotal += valor;
                    log += valor + " = " + subtotal + "\n";
                    break;

                case '-':
                    subtotal -= valor;
                    log += valor + " = " + subtotal + "\n";
                    break;

                case 'x':
                    subtotal *= valor;
                    log += valor + " = " + subtotal + "\n";
                    break;
                case '/':
                    if (valor != 0) {
                        subtotal /= valor;
                        log += valor + " = " + subtotal + "\n";
                    } else {
                        log = "ERRO: Divisão por 0\n";
                        operacao = '0';
                        visor.setText(null);
                        JOptionPane.showMessageDialog(null, "Não consigo dividir por 0."
                                + "\nO único que ja fez isto foi Chuck Norris");
                    }
                    break;

                default:
                    //entao x = x e nao tem nada pra fazer;
                    subtotal = valor;
                    log += valor + " = " + subtotal + "\n";
                    break;
            }
            operacao = '0';
            visor.setText(subtotal.toString());
            log_TA.setText(log);

        }
        calcula_B.grabFocus();

    }//GEN-LAST:event_calcula_BActionPerformed

    private void opinverso_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opinverso_BActionPerformed
        if (!"0".equals(visor.getText())) {
            Double num = Double.parseDouble(visor.getText());
            log += "<inversao de " + num + ">" + " ";
            num = 1 / num;
            visor.setText(num.toString());
        } else {

            JOptionPane.showMessageDialog(null, "Não sou Chuck Norris."
                    + "\nNão tenho poderes para inverter um zero");
        }
        calcula_B.grabFocus();
    }//GEN-LAST:event_opinverso_BActionPerformed

    private void opcent_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcent_BActionPerformed
        Double num;
        if (visor.getText() != null) {
            num = Double.parseDouble(visor.getText());
            log += "<" + num + "% de " + subtotal + ">" + " ";
            num = (subtotal * (num / 100));
            visor.setText(num.toString());
        }
        calcula_B.grabFocus();
    }//GEN-LAST:event_opcent_BActionPerformed

    private void calcula_BKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcula_BKeyPressed
        //EVENTOS DE TECLA
        switch (evt.getKeyChar()) {
            
            case '0': // 0
                num0_B.doClick();
                break;
                
            case '1':
                num1_B.doClick();
                break;
                
            case '2':
                num2_B.doClick();
                break;
                
            case '3':
                num3_B.doClick();
                break;
                
            case '4':
                num4_B.doClick();
                break;
            
            case '5':
                num5_B.doClick();
                break;
                
            case '6':
                num6_B.doClick();
                break;
                
            case '7':
                num7_B.doClick();
                break;
                
            case '8':
                num8_B.doClick();
                break;
                
            case '9':
                num9_B.doClick();
                break;
             
            case '+':
                opsoma_B.doClick();
                break;
                
            case '-':
                opsub_B.doClick();
                break;
                
            case '*':
               opmult_B.doClick();     
               break;     
                
            case '/':
                opdiv_B.doClick();
                break;
                
            case '%':
                opcent_B.doClick();
                break;
            default:
                if (evt.getKeyCode() == 27) {
                    c_B.doClick();
                }
                break;
        }

    }//GEN-LAST:event_calcula_BKeyPressed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c_B;
    private javax.swing.JButton calcula_B;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea log_TA;
    private javax.swing.JButton num0_B;
    private javax.swing.JButton num1_B;
    private javax.swing.JButton num2_B;
    private javax.swing.JButton num3_B;
    private javax.swing.JButton num4_B;
    private javax.swing.JButton num5_B;
    private javax.swing.JButton num6_B;
    private javax.swing.JButton num7_B;
    private javax.swing.JButton num8_B;
    private javax.swing.JButton num9_B;
    private javax.swing.JButton opcent_B;
    private javax.swing.JButton opdiv_B;
    private javax.swing.JButton opinverso_B;
    private javax.swing.JButton opmult_B;
    private javax.swing.JButton opsoma_B;
    private javax.swing.JButton opsub_B;
    private javax.swing.JButton virg_B;
    private javax.swing.JTextField visor;
    // End of variables declaration//GEN-END:variables
}
