

package project;

import java.util.Scanner;

import java.io.File;

public class NewJFrame extends javax.swing.JFrame {
    String shift=null, givenWord=null, fileWord=null, banglaWord=null;
    int count=0, correctBanglaWord=1;
    boolean shiftChecking=false, found=false;

    
    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        qButton = new javax.swing.JButton();
        wButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        rButton = new javax.swing.JButton();
        tButton = new javax.swing.JButton();
        yButton = new javax.swing.JButton();
        uButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        aButton = new javax.swing.JButton();
        sButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        kButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        zButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        vButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        nButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        findButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display1 = new javax.swing.JTextPane();
        shiftButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        spaceButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        display2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to EN-BN Dictionary");

        qButton.setBackground(new java.awt.Color(153, 255, 255));
        qButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        qButton.setText("Q");
        qButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qButtonActionPerformed(evt);
            }
        });

        wButton.setBackground(new java.awt.Color(153, 255, 255));
        wButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        wButton.setText("W");
        wButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wButtonActionPerformed(evt);
            }
        });

        eButton.setBackground(new java.awt.Color(153, 255, 255));
        eButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        eButton.setText("E");
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });

        rButton.setBackground(new java.awt.Color(153, 255, 255));
        rButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rButton.setText("R");
        rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonActionPerformed(evt);
            }
        });

        tButton.setBackground(new java.awt.Color(153, 255, 255));
        tButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tButton.setText("T");
        tButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tButtonActionPerformed(evt);
            }
        });

        yButton.setBackground(new java.awt.Color(153, 255, 255));
        yButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        yButton.setText("Y");
        yButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yButtonActionPerformed(evt);
            }
        });

        uButton.setBackground(new java.awt.Color(153, 255, 255));
        uButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        uButton.setText("U");
        uButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uButtonActionPerformed(evt);
            }
        });

        iButton.setBackground(new java.awt.Color(153, 255, 255));
        iButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        iButton.setText("I");
        iButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iButtonActionPerformed(evt);
            }
        });

        oButton.setBackground(new java.awt.Color(153, 255, 255));
        oButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        oButton.setText("O");
        oButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oButtonActionPerformed(evt);
            }
        });

        pButton.setBackground(new java.awt.Color(153, 255, 255));
        pButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pButton.setText("P");
        pButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButtonActionPerformed(evt);
            }
        });

        aButton.setBackground(new java.awt.Color(153, 255, 255));
        aButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        aButton.setText("A");
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });

        sButton.setBackground(new java.awt.Color(153, 255, 255));
        sButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sButton.setText("S");
        sButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonActionPerformed(evt);
            }
        });

        dButton.setBackground(new java.awt.Color(153, 255, 255));
        dButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dButton.setText("D");
        dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButtonActionPerformed(evt);
            }
        });

        fButton.setBackground(new java.awt.Color(153, 255, 255));
        fButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fButton.setText("F");
        fButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButtonActionPerformed(evt);
            }
        });

        gButton.setBackground(new java.awt.Color(153, 255, 255));
        gButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        gButton.setText("G");
        gButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButtonActionPerformed(evt);
            }
        });

        kButton.setBackground(new java.awt.Color(153, 255, 255));
        kButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        kButton.setText("K");
        kButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButtonActionPerformed(evt);
            }
        });

        hButton.setBackground(new java.awt.Color(153, 255, 255));
        hButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        hButton.setText("H");
        hButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hButtonActionPerformed(evt);
            }
        });

        jButton.setBackground(new java.awt.Color(153, 255, 255));
        jButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton.setText("J");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        lButton.setBackground(new java.awt.Color(153, 255, 255));
        lButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lButton.setText("L");
        lButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButtonActionPerformed(evt);
            }
        });

        zButton.setBackground(new java.awt.Color(153, 255, 255));
        zButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        zButton.setText("Z");
        zButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zButtonActionPerformed(evt);
            }
        });

        xButton.setBackground(new java.awt.Color(153, 255, 255));
        xButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        xButton.setText("X");
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });

        cButton.setBackground(new java.awt.Color(153, 255, 255));
        cButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        vButton.setBackground(new java.awt.Color(153, 255, 255));
        vButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vButton.setText("V");
        vButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vButtonActionPerformed(evt);
            }
        });

        bButton.setBackground(new java.awt.Color(153, 255, 255));
        bButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bButton.setText("B");
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });

        nButton.setBackground(new java.awt.Color(153, 255, 255));
        nButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nButton.setText("N");
        nButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nButtonActionPerformed(evt);
            }
        });

        mButton.setBackground(new java.awt.Color(153, 255, 255));
        mButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mButton.setText("M");
        mButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonActionPerformed(evt);
            }
        });

        findButton.setBackground(new java.awt.Color(0, 204, 0));
        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        display1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        display1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jScrollPane1.setViewportView(display1);

        shiftButton.setBackground(new java.awt.Color(255, 102, 102));
        shiftButton.setText("Shift");
        shiftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(153, 153, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        spaceButton.setBackground(new java.awt.Color(153, 255, 255));
        spaceButton.setText("Space");
        spaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(204, 255, 51));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("<--");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        display2.setEditable(false);
        display2.setFont(new java.awt.Font("Siyam Rupali", 0, 24)); // NOI18N
        jScrollPane3.setViewportView(display2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(zButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(shiftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(backButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(findButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(aButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lButton))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(qButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pButton)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spaceButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(shiftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:
        givenWord = display1.getText().toLowerCase(); 
        try {
            File file1 = new File("C:\\Users\\Tech Land\\OneDrive\\Desktop\\Project/EngWord.txt");
            Scanner sc = new Scanner(file1);
            while(sc.hasNext()) {
                fileWord=sc.next();
                if(givenWord.equals(fileWord)) {
                    found=true; break;
                }
                count++;
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        if(found) {
            try {
                File file2 = new File("C:\\Users\\Tech Land\\OneDrive\\Desktop\\Project/BangWord.txt");
                Scanner sc1 = new Scanner(file2);
                while(sc1.hasNext()) {
                    banglaWord=sc1.next();
                    if(correctBanglaWord==count) {
                        display2.setText(banglaWord); break;
                    }
                    correctBanglaWord++;
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        } else {
            display2.setText("Not Found");
        }
        found=false; count=0; correctBanglaWord=1;
    }//GEN-LAST:event_findButtonActionPerformed

    private void shiftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            shiftChecking=false;
        } else {
            shiftChecking=true;
        }
    }//GEN-LAST:event_shiftButtonActionPerformed

    private void kButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"K");
        } else {
            display1.setText(display1.getText()+"k");
        }
        shiftChecking=false;
    }//GEN-LAST:event_kButtonActionPerformed

    private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"Q");
        } else {
            display1.setText(display1.getText()+"q");
        }
        shiftChecking=false;
    }//GEN-LAST:event_qButtonActionPerformed

    private void wButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"W");
        } else {
            display1.setText(display1.getText()+"w");
        }
        shiftChecking=false;
    }//GEN-LAST:event_wButtonActionPerformed

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"E");
        } else {
            display1.setText(display1.getText()+"e");
        }
        shiftChecking=false;
    }//GEN-LAST:event_eButtonActionPerformed

    private void rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"R");
        } else {
            display1.setText(display1.getText()+"r");
        }
        shiftChecking=false;
    }//GEN-LAST:event_rButtonActionPerformed

    private void tButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"T");
        } else {
            display1.setText(display1.getText()+"t");
        }
        shiftChecking=false;
    }//GEN-LAST:event_tButtonActionPerformed

    private void yButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"Y");
        } else {
            display1.setText(display1.getText()+"y");
        }
        shiftChecking=false;
    }//GEN-LAST:event_yButtonActionPerformed

    private void uButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"U");
        } else {
            display1.setText(display1.getText()+"u");
        }
        shiftChecking=false;
    }//GEN-LAST:event_uButtonActionPerformed

    private void iButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"I");
        } else {
            display1.setText(display1.getText()+"i");
        }
        shiftChecking=false;
    }//GEN-LAST:event_iButtonActionPerformed

    private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"O");
        } else {
            display1.setText(display1.getText()+"o");
        }
        shiftChecking=false;
    }//GEN-LAST:event_oButtonActionPerformed

    private void pButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"P");
        } else {
            display1.setText(display1.getText()+"p");
        }
        shiftChecking=false;
    }//GEN-LAST:event_pButtonActionPerformed

    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"A");
        } else {
            display1.setText(display1.getText()+"a");
        }
        shiftChecking=false;
    }//GEN-LAST:event_aButtonActionPerformed

    private void sButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"S");
        } else {
            display1.setText(display1.getText()+"s");
        }
        shiftChecking=false;
    }//GEN-LAST:event_sButtonActionPerformed

    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"D");
        } else {
            display1.setText(display1.getText()+"d");
        }
        shiftChecking=false;
    }//GEN-LAST:event_dButtonActionPerformed

    private void fButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"F");
        } else {
            display1.setText(display1.getText()+"f");
        }
        shiftChecking=false;
    }//GEN-LAST:event_fButtonActionPerformed

    private void gButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"G");
        } else {
            display1.setText(display1.getText()+"g");
        }
        shiftChecking=false;
    }//GEN-LAST:event_gButtonActionPerformed

    private void hButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"H");
        } else {
            display1.setText(display1.getText()+"h");
        }
        shiftChecking=false;
    }//GEN-LAST:event_hButtonActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"J");
        } else {
            display1.setText(display1.getText()+"j");
        }
        shiftChecking=false;
    }//GEN-LAST:event_jButtonActionPerformed

    private void lButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"L");
        } else {
            display1.setText(display1.getText()+"l");
        }
        shiftChecking=false;
    }//GEN-LAST:event_lButtonActionPerformed

    private void zButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"Z");
        } else {
            display1.setText(display1.getText()+"z");
        }
        shiftChecking=false;
    }//GEN-LAST:event_zButtonActionPerformed

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"X");
        } else {
            display1.setText(display1.getText()+"x");
        }
        shiftChecking=false;
    }//GEN-LAST:event_xButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"C");
        } else {
            display1.setText(display1.getText()+"c");
        }
        shiftChecking=false;
    }//GEN-LAST:event_cButtonActionPerformed

    private void vButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"V");
        } else {
            display1.setText(display1.getText()+"v");
        }
        shiftChecking=false;
    }//GEN-LAST:event_vButtonActionPerformed

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"B");
        } else {
            display1.setText(display1.getText()+"b");
        }
        shiftChecking=false;
    }//GEN-LAST:event_bButtonActionPerformed

    private void nButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"N");
        } else {
            display1.setText(display1.getText()+"n");
        }
        shiftChecking=false;
    }//GEN-LAST:event_nButtonActionPerformed

    private void mButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonActionPerformed
        // TODO add your handling code here:
        if(shiftChecking) {
            display1.setText(display1.getText()+"M");
        } else {
            display1.setText(display1.getText()+"m");
        }
        shiftChecking=false;
    }//GEN-LAST:event_mButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        display1.setText(""); 
        display2.setText("");
        shiftChecking=false;
    }//GEN-LAST:event_clearButtonActionPerformed

    private void spaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceButtonActionPerformed
        // TODO add your handling code here:
        display1.setText(display1.getText()+" "); 
        shiftChecking=false;
    }//GEN-LAST:event_spaceButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        String str=display1.getText();
        if(str.length()>0) {
            display1.setText(str.substring(0, str.length()-1));
        } else {
            display1.setText("");
        }
        shiftChecking=false;
        display2.setText("");
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aButton;
    private javax.swing.JButton bButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton dButton;
    private javax.swing.JTextPane display1;
    private javax.swing.JTextPane display2;
    private javax.swing.JButton eButton;
    private javax.swing.JButton fButton;
    private javax.swing.JButton findButton;
    private javax.swing.JButton gButton;
    private javax.swing.JButton hButton;
    private javax.swing.JButton iButton;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton kButton;
    private javax.swing.JButton lButton;
    private javax.swing.JButton mButton;
    private javax.swing.JButton nButton;
    private javax.swing.JButton oButton;
    private javax.swing.JButton pButton;
    private javax.swing.JButton qButton;
    private javax.swing.JButton rButton;
    private javax.swing.JButton sButton;
    private javax.swing.JButton shiftButton;
    private javax.swing.JButton spaceButton;
    private javax.swing.JButton tButton;
    private javax.swing.JButton uButton;
    private javax.swing.JButton vButton;
    private javax.swing.JButton wButton;
    private javax.swing.JButton xButton;
    private javax.swing.JButton yButton;
    private javax.swing.JButton zButton;
    // End of variables declaration//GEN-END:variables
}
