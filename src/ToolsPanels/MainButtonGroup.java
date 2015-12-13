/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToolsPanels;

import FileFactory.readingXml;
import FileFactory.savingXML;
import Tools.Selector;
import Shapes.Shapes;
import WhateverPaint.MainWindow;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



public class MainButtonGroup extends javax.swing.JPanel {

    Canvas cc;

    public MainButtonGroup() {
        initComponents();
    }

    public void setCc(Canvas cc) {
        this.cc = cc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        open = new javax.swing.JButton();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        select = new javax.swing.JButton();

        setBackground(new java.awt.Color(40, 40, 40));
        setForeground(new java.awt.Color(40, 40, 40));
        setOpaque(false);

        open.setBackground(new java.awt.Color(40, 40, 40));
        open.setForeground(new java.awt.Color(40, 40, 40));
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Folder-Open-48.png"))); // NOI18N
        open.setToolTipText("Load");
        open.setBorder(null);
        open.setContentAreaFilled(false);
        open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearMousePressed(evt);
            }
        });
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(40, 40, 40));
        save.setForeground(new java.awt.Color(40, 40, 40));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Save As-48.png"))); // NOI18N
        save.setToolTipText("Save As");
        save.setBorder(null);
        save.setContentAreaFilled(false);
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearMousePressed(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(40, 40, 40));
        clear.setForeground(new java.awt.Color(40, 40, 40));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Item-New-48.png"))); // NOI18N
        clear.setToolTipText("Clear");
        clear.setBorder(null);
        clear.setContentAreaFilled(false);
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearMousePressed(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        select.setBackground(new java.awt.Color(40, 40, 40));
        select.setForeground(new java.awt.Color(40, 40, 40));
        select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Rectangle-Selection-48.png"))); // NOI18N
        select.setToolTipText("Select");
        select.setBorder(null);
        select.setContentAreaFilled(false);
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearMousePressed(evt);
            }
        });
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
            .addComponent(open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        Canvas.setShape(new Selector());

        MainWindow.old = select;
    }//GEN-LAST:event_selectActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        Canvas.intersects.clear();
        Canvas.setPrevShapes(new ArrayList());
        cc.repaint();
        Canvas.undost.push(Canvas.prevShapes);
        //EditBox.undo.setEnabled(false);
        //EditBox.redo.setEnabled(false);
    }//GEN-LAST:event_clearActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("XML", "xml", ".XML", ".xml"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = chooser.showOpenDialog(null);
        switch (result) {
            case JFileChooser.APPROVE_OPTION:
                String path = chooser.getSelectedFile().getAbsolutePath();
                readingXml read = new readingXml(path);
                Canvas.prevShapes = read.getShapes2();
                cc.repaint();
                break;
            case JFileChooser.CANCEL_OPTION:

                break;
        }
    }//GEN-LAST:event_openActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML", "xml", ".XML", ".xml"));

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            if (path.endsWith(".xml") || path.endsWith(".XML")) {

            } else {
                path = path + ".xml";
            }

            savingXML save = new savingXML(Canvas.prevShapes, path);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        JButton Button = (JButton) evt.getSource();
        CustomButtonStyle s = new CustomButtonStyle(Button);
        s.exit(Button);
    }//GEN-LAST:event_clearMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        JButton Button = (JButton) evt.getSource();
        CustomButtonStyle s = new CustomButtonStyle(Button);
        s.release(Button);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMousePressed
        JButton Button = (JButton) evt.getSource();
        CustomButtonStyle s = new CustomButtonStyle(Button);
        s.press(Button);
    }//GEN-LAST:event_clearMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton clear;
    public javax.swing.JButton open;
    public javax.swing.JButton save;
    private javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}
