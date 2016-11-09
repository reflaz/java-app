/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxinvoiceautomationsystem;

import java.awt.Color;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author Refly IDFA
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        ((DefaultCaret) textareaResult.getCaret()).setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        bg = textfieldExtractStart.getBackground();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImportFolder = new javax.swing.JLabel();
        textfieldImportFolder = new javax.swing.JTextField();
        buttonImportFolder = new javax.swing.JButton();
        labelExportFolder = new javax.swing.JLabel();
        textfieldExportFolder = new javax.swing.JTextField();
        buttonExportFolder = new javax.swing.JButton();
        buttonExecute = new javax.swing.JButton();
        calendar = new taxinvoiceautomationsystem.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        textfieldExtractStart = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textfieldExtractEnd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textareaResult = new javax.swing.JTextArea();
        labelImportIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImportFolder.setText("Import Folder");

        textfieldImportFolder.setEditable(false);
        textfieldImportFolder.setBackground(new java.awt.Color(255, 255, 255));
        textfieldImportFolder.setToolTipText("");
        textfieldImportFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldImportFolderMouseClicked(evt);
            }
        });

        buttonImportFolder.setText("Browse");
        buttonImportFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImportFolderActionPerformed(evt);
            }
        });

        labelExportFolder.setText("Export Folder");

        textfieldExportFolder.setEditable(false);
        textfieldExportFolder.setBackground(new java.awt.Color(255, 255, 255));
        textfieldExportFolder.setToolTipText("");
        textfieldExportFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldExportFolderMouseClicked(evt);
            }
        });

        buttonExportFolder.setText("Browse");
        buttonExportFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExportFolderActionPerformed(evt);
            }
        });

        buttonExecute.setText("Execute");
        buttonExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExecuteActionPerformed(evt);
            }
        });

        calendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarPropertyChange(evt);
            }
        });

        jLabel1.setText("Extract Start");

        textfieldExtractStart.setEditable(false);
        textfieldExtractStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldExtractStartMouseClicked(evt);
            }
        });

        jLabel2.setText("Extract End (D+1)");

        textfieldExtractEnd.setEditable(false);
        textfieldExtractEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldExtractEndMouseClicked(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("result"));
        jScrollPane2.setAutoscrolls(true);

        textareaResult.setBackground(new java.awt.Color(240, 240, 240));
        textareaResult.setColumns(20);
        textareaResult.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        textareaResult.setRows(5);
        textareaResult.setBorder(null);
        jScrollPane2.setViewportView(textareaResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfieldExtractEnd)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textfieldExportFolder, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfieldImportFolder))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonImportFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonExportFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(textfieldExtractStart)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(labelExportFolder)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelImportFolder)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelImportIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 247, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonExecute, buttonExportFolder, buttonImportFolder});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelExportFolder, labelImportFolder});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfieldExtractStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfieldExtractEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelImportFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelImportIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfieldImportFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonImportFolder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelExportFolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfieldExportFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonExportFolder)))
                    .addComponent(calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonExecute)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelExportFolder, labelImportFolder, labelImportIcon});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonExecute, buttonExportFolder, buttonImportFolder, textfieldExportFolder, textfieldExtractEnd, textfieldExtractStart, textfieldImportFolder});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonImportFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImportFolderActionPerformed
        // TODO add your handling code here:
        if (!filePathChooser(FILEPATH_OPTION_IMPORT)) {
            complete = false;
        }
    }//GEN-LAST:event_buttonImportFolderActionPerformed

    private void textfieldImportFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldImportFolderMouseClicked
        // TODO add your handling code here:
        if (!filePathChooser(FILEPATH_OPTION_IMPORT)) {
            complete = false;
        }
    }//GEN-LAST:event_textfieldImportFolderMouseClicked

    private void buttonExportFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportFolderActionPerformed
        // TODO add your handling code here:
        if (!filePathChooser(FILEPATH_OPTION_EXPORT)) {
            complete = false;
        }
    }//GEN-LAST:event_buttonExportFolderActionPerformed

    private void textfieldExportFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldExportFolderMouseClicked
        // TODO add your handling code here:
        if (!filePathChooser(FILEPATH_OPTION_EXPORT)) {
            complete = false;
        }
    }//GEN-LAST:event_textfieldExportFolderMouseClicked

    private void buttonExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExecuteActionPerformed
        // TODO add your handling code here:
        if (extractStart != null && extractEnd != null && !filepathImport.isEmpty() && !filepathExport.isEmpty()) {
            TaxInvoiceAutomationDAO dao = new TaxInvoiceAutomationDAO(extractStart, extractEnd, filepathImport, filepathExport);
            dao.addPropertyChangeListener(new MyPropertyChangeListener());
            Timer timer = new Timer();
            timer.schedule(dao, new Date());
        } else {
            textareaResult.append("Please complete all parameters!\n");
            JOptionPane.showMessageDialog(this, "Please complete all parameters!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExecuteActionPerformed

    private void textfieldExtractStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldExtractStartMouseClicked
        // TODO add your handling code here:
        if (!COMPONENT_CLICKED_EXTRACT_START.equals(componentClicked)) {
            setComponentClicked(COMPONENT_CLICKED_EXTRACT_START);
        }
    }//GEN-LAST:event_textfieldExtractStartMouseClicked

    private void textfieldExtractEndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldExtractEndMouseClicked
        // TODO add your handling code here:
        if (!COMPONENT_CLICKED_EXTRACT_END.equals(componentClicked)) {
            setComponentClicked(COMPONENT_CLICKED_EXTRACT_END);
        }
    }//GEN-LAST:event_textfieldExtractEndMouseClicked

    private void calendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarPropertyChange
        // TODO add your handling code here:
        setComponentClicked(COMPONENT_CLICKED_CALENDAR);
    }//GEN-LAST:event_calendarPropertyChange

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void showLabelIcon(JLabel label, String labelIcon) {
        label.setIcon(new ImageIcon(((ImageIcon) UIManager.getIcon(labelIcon)).
                getImage().getScaledInstance(label.getHeight(), label.getHeight(), Image.SCALE_SMOOTH)));
    }

    private void hideLabelIcon(JLabel label) {
        label.setIcon(null);
    }

    private void showTextFieldFilepathToolTip(JTextField textfield, String text) {
        if (text == null || text.trim().isEmpty()) {
            textfield.setToolTipText("");
        } else {
            textfield.setToolTipText(text);
        }
    }

    private boolean filePathChooser(int filepathOption) {
        boolean complete = true;

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = chooser.showDialog(this, "Select Folder");

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            if (filepathOption == FILEPATH_OPTION_IMPORT) {
                filepathImport = "";
                textareaResult.append("Selecting import folder...\n");
                textfieldImportFolder.setText(chooser.getSelectedFile().getAbsolutePath());

                for (String[] filepathImportConstraints : FILEPATH_IMPORT_CONSTRAINTS) {
                    File file = new File(chooser.getSelectedFile().getAbsolutePath() + "\\" + filepathImportConstraints[1]);

                    if (!file.exists()) {
                        textareaResult.append("File " + filepathImportConstraints[1] + " is missing\n");
                        complete = false;
                    }
                }
                if (!complete) {
                    showLabelIcon(labelImportIcon, LABEL_ICON_ERROR);
                    showTextFieldFilepathToolTip(textfieldImportFolder, "One or more files are missing");
                } else {
                    filepathImport = chooser.getSelectedFile().getAbsolutePath();
                    textareaResult.append("Import folder selected\n");
                    hideLabelIcon(labelImportIcon);
                    showTextFieldFilepathToolTip(textfieldImportFolder, filepathImport);
                }
            } else if (filepathOption == FILEPATH_OPTION_EXPORT) {
                textareaResult.append("Selecting export folder...\n");
                textfieldExportFolder.setText(chooser.getSelectedFile().getAbsolutePath());
                filepathExport = chooser.getSelectedFile().getAbsolutePath();
                textareaResult.append("Export folder selected\n");
                showTextFieldFilepathToolTip(textfieldExportFolder, filepathExport);
            }
        }
        return complete;
    }

    private void setComponentClicked(String componentName) {
        switch (componentName) {
            case COMPONENT_CLICKED_EXTRACT_START:
                componentClicked = COMPONENT_CLICKED_EXTRACT_START;
                textfieldExtractStart.setBackground(Color.white);
                textfieldExtractEnd.setBackground(bg);
                break;
            case COMPONENT_CLICKED_EXTRACT_END:
                componentClicked = COMPONENT_CLICKED_EXTRACT_END;
                textfieldExtractEnd.setBackground(Color.WHITE);
                textfieldExtractStart.setBackground(bg);
                break;
            case COMPONENT_CLICKED_SCHEDULE:
                componentClicked = COMPONENT_CLICKED_SCHEDULE;
                textfieldExtractStart.setBackground(bg);
                textfieldExtractEnd.setBackground(bg);
                break;
            case COMPONENT_CLICKED_CALENDAR:
                DateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

                if (componentClicked == null) {
                    componentClicked = COMPONENT_CLICKED_SCHEDULE;
                }

                switch (componentClicked) {
                    case COMPONENT_CLICKED_EXTRACT_START:
                        extractStart = calendar.getDate();
                        textfieldExtractStart.setText(dateFormat.format(extractStart));
                        textareaResult.append("Extract start selected: "
                                + dateFormat.format(extractStart) + "\n");
                        break;
                    case COMPONENT_CLICKED_EXTRACT_END:
                        extractEnd = calendar.getDate();
                        textfieldExtractEnd.setText(dateFormat.format(extractEnd));
                        textareaResult.append("Extract end (D+1) selected: "
                                + dateFormat.format(extractEnd) + "\n");
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

    class MyPropertyChangeListener implements PropertyChangeListener {

        @Override
        public void propertyChange(PropertyChangeEvent pce) {
            switch (pce.getPropertyName()) {
                case TaxInvoiceAutomationDAO.PROPERTY_STATUS:
                    switch ((int) pce.getNewValue()) {
                        case TaxInvoiceAutomationDAO.STAT_START:
                            textfieldExtractStart.setEnabled(false);
                            textfieldExtractEnd.setEnabled(false);
                            textfieldExportFolder.setEnabled(false);
                            textfieldImportFolder.setEnabled(false);
                            buttonExecute.setEnabled(false);
                            break;
                        case TaxInvoiceAutomationDAO.STAT_END:
                            textfieldExtractStart.setEnabled(true);
                            textfieldExtractEnd.setEnabled(true);
                            textfieldExportFolder.setEnabled(true);
                            textfieldImportFolder.setEnabled(true);
                            buttonExecute.setEnabled(true);
                            break;
                    }
                    break;
                case TaxInvoiceAutomationDAO.PROPERTY_MESSAGE:
                    textareaResult.append(pce.getNewValue().toString() + "\n");
                    break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExecute;
    private javax.swing.JButton buttonExportFolder;
    private javax.swing.JButton buttonImportFolder;
    private taxinvoiceautomationsystem.JCalendar calendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelExportFolder;
    private javax.swing.JLabel labelImportFolder;
    private javax.swing.JLabel labelImportIcon;
    private javax.swing.JTextArea textareaResult;
    private javax.swing.JTextField textfieldExportFolder;
    private javax.swing.JTextField textfieldExtractEnd;
    private javax.swing.JTextField textfieldExtractStart;
    private javax.swing.JTextField textfieldImportFolder;
    // End of variables declaration//GEN-END:variables
    private final int FILEPATH_OPTION_IMPORT = 1;
    private final int FILEPATH_OPTION_EXPORT = 2;

    private final String[][] FILEPATH_IMPORT_CONSTRAINTS = {
        {"Adjustments", "adjustments.csv"},
        {"Seller Details", "seller_details.csv"}
    };

    private final String COMPONENT_CLICKED_EXTRACT_START = "EXTRACT_START";
    private final String COMPONENT_CLICKED_EXTRACT_END = "EXTRACT_END";
    private final String COMPONENT_CLICKED_SCHEDULE = "SCHEDULE";
    private final String COMPONENT_CLICKED_CALENDAR = "CALENDAR";
    private final String LABEL_ICON_WARNING = "OptionPane.warningIcon";
    private final String LABEL_ICON_ERROR = "OptionPane.errorIcon";

    private String filepathImport = "";
    private String filepathExport = "";
    private String componentClicked = "";
    Date extractStart;
    Date extractEnd;
    private Color bg;

    private boolean complete = true;
}
