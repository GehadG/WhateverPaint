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
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Gehad
 */
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        select = new javax.swing.JButton();

        setBackground(new java.awt.Color(40, 40, 40));
        setForeground(new java.awt.Color(40, 40, 40));

        jButton1.setBackground(new java.awt.Color(40, 40, 40));
        jButton1.setForeground(new java.awt.Color(40, 40, 40));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/open.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(40, 40, 40));
        jButton2.setForeground(new java.awt.Color(40, 40, 40));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/80.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(40, 40, 40));
        clear.setForeground(new java.awt.Color(40, 40, 40));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/newpage.png"))); // NOI18N
        clear.setBorder(null);
        clear.setOpaque(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        select.setBackground(new java.awt.Color(40, 40, 40));
        select.setForeground(new java.awt.Color(40, 40, 40));
        select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/select.png"))); // NOI18N
        select.setBorder(null);
        select.setOpaque(false);
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
         Canvas.setShape(new Selector());
      
       
        MainWindow.old=select;
    }//GEN-LAST:event_selectActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
ArrayList<Shapes> prevShapes2 = new ArrayList();
Canvas.intersects.clear();
        Canvas.setPrevShapes(prevShapes2);
        cc.repaint();
        EditBox.undo.setEnabled(false);
        EditBox.redo.setEnabled(false);        
    }//GEN-LAST:event_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     JFileChooser chooser = new JFileChooser();
      chooser.addChoosableFileFilter(new FileNameExtensionFilter("XML", "xml", ".XML",".xml"));
      chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    int result = chooser.showOpenDialog(null);
    switch (result) {
    case JFileChooser.APPROVE_OPTION:
      String path =  chooser.getSelectedFile().getAbsolutePath();
        readingXml read = new readingXml(path);
        Canvas.prevShapes=read.getShapes2();
        cc.repaint();
      break;
    case JFileChooser.CANCEL_OPTION:
   
      break;
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
fileChooser.setDialogTitle("Specify a file to save");   
 fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML", "xml", ".XML",".xml"));

int userSelection = fileChooser.showSaveDialog(null);
 
if (userSelection == JFileChooser.APPROVE_OPTION) {
    String path = fileChooser.getSelectedFile().getAbsolutePath();
    if(path.endsWith(".xml")||path.endsWith(".XML")){
        
    }
    else{
        path=path+".xml";
    }
        
   
    savingXML save = new savingXML(Canvas.prevShapes,path );
}
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}
