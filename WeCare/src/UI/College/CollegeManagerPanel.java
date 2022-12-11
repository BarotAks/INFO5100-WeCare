/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.College;

import UI.FoodService.AddViewFood;
import model.Data;
import model.Person;

/**
 *
 * @author anupamaditya
 */
public class CollegeManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form CollegeManagerPanel
     */
    Data d;
    Person p;
    public CollegeManagerPanel(Data d,Person p) {
        initComponents();
        this.d = d;
        this.p = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPaneCollege = new javax.swing.JSplitPane();
        controlPanelCollegeManager = new javax.swing.JPanel();
        btnAddFood = new javax.swing.JButton();
        btnAddClothes = new javax.swing.JButton();
        btnAddVolunteer = new javax.swing.JButton();
        btnAddHousing = new javax.swing.JButton();
        workAreaCollegeManager = new javax.swing.JPanel();

        splitPaneCollege.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanelCollegeManager.setBackground(new java.awt.Color(204, 204, 255));

        btnAddFood.setBackground(new java.awt.Color(204, 255, 204));
        btnAddFood.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddFood.setForeground(new java.awt.Color(0, 0, 102));
        btnAddFood.setText("Add Food");
        btnAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodActionPerformed(evt);
            }
        });

        btnAddClothes.setBackground(new java.awt.Color(204, 255, 204));
        btnAddClothes.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddClothes.setForeground(new java.awt.Color(0, 0, 102));
        btnAddClothes.setText("Add Clothes");

        btnAddVolunteer.setBackground(new java.awt.Color(204, 255, 204));
        btnAddVolunteer.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddVolunteer.setForeground(new java.awt.Color(0, 0, 102));
        btnAddVolunteer.setText("Add Volunteer");

        btnAddHousing.setBackground(new java.awt.Color(204, 255, 204));
        btnAddHousing.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnAddHousing.setForeground(new java.awt.Color(0, 0, 102));
        btnAddHousing.setText("Add Housing");

        javax.swing.GroupLayout controlPanelCollegeManagerLayout = new javax.swing.GroupLayout(controlPanelCollegeManager);
        controlPanelCollegeManager.setLayout(controlPanelCollegeManagerLayout);
        controlPanelCollegeManagerLayout.setHorizontalGroup(
            controlPanelCollegeManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelCollegeManagerLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnAddFood)
                .addGap(56, 56, 56)
                .addComponent(btnAddClothes)
                .addGap(55, 55, 55)
                .addComponent(btnAddVolunteer)
                .addGap(57, 57, 57)
                .addComponent(btnAddHousing)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        controlPanelCollegeManagerLayout.setVerticalGroup(
            controlPanelCollegeManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelCollegeManagerLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(controlPanelCollegeManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFood)
                    .addComponent(btnAddClothes)
                    .addComponent(btnAddVolunteer)
                    .addComponent(btnAddHousing))
                .addGap(37, 37, 37))
        );

        splitPaneCollege.setTopComponent(controlPanelCollegeManager);

        workAreaCollegeManager.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout workAreaCollegeManagerLayout = new javax.swing.GroupLayout(workAreaCollegeManager);
        workAreaCollegeManager.setLayout(workAreaCollegeManagerLayout);
        workAreaCollegeManagerLayout.setHorizontalGroup(
            workAreaCollegeManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        workAreaCollegeManagerLayout.setVerticalGroup(
            workAreaCollegeManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        splitPaneCollege.setRightComponent(workAreaCollegeManager);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneCollege)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneCollege)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodActionPerformed
        // TODO add your handling code here:
        AddViewFood addViewFood = new AddViewFood(d, p);
        splitPaneCollege.setRightComponent(addViewFood);
        
    }//GEN-LAST:event_btnAddFoodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClothes;
    private javax.swing.JButton btnAddFood;
    private javax.swing.JButton btnAddHousing;
    private javax.swing.JButton btnAddVolunteer;
    private javax.swing.JPanel controlPanelCollegeManager;
    private javax.swing.JSplitPane splitPaneCollege;
    private javax.swing.JPanel workAreaCollegeManager;
    // End of variables declaration//GEN-END:variables
}
