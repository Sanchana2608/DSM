package departmentstore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class AddProduct extends javax.swing.JFrame {
    public AddProduct() {
        initComponents();
        try
        { 
        Class.forName("oracle.jdbc.OracleDriver");   
        Connection con3=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root123");
        PreparedStatement ps1 = con3.prepareStatement("select pro_id,pro_name,pro_price,pro_type,sup_id from product");
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next())
            {
                String pro_name=rs1.getString("pro_name");
                String pro_idt=rs1.getString("pro_id");
                String cost=rs1.getString("pro_price"); 
                String type =rs1.getString("pro_type");
                String sup_id =rs1.getString("sup_id");
            String tbData[]={pro_idt,pro_name,cost,type,sup_id};
            DefaultTableModel tblModel =(DefaultTableModel)protable.getModel();
            tblModel.addRow(tbData);
            }
        }
        catch(Exception e){ System.out.println(e);} 
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pro_nametextfield = new javax.swing.JTextField();
        costtextfield = new javax.swing.JTextField();
        typetextfield = new javax.swing.JTextField();
        pro_name = new javax.swing.JLabel();
        sup_idtextfield = new javax.swing.JTextField();
        cost = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        sup_id = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        protable = new javax.swing.JTable();
        cancelbutton = new javax.swing.JButton();
        sup_id1 = new javax.swing.JLabel();
        pro_idtextfield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        addbuttonn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        pro_name.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        pro_name.setText("PRODUCT NAME");

        cost.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        cost.setText("COST PER UNIT");

        type.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        type.setText("PRODUCT TYPE");

        sup_id.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        sup_id.setText("SUPPLIER ID");

        protable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRO_ID", "NAME", "PRICE", "TYPE", "SUP_ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(protable);

        cancelbutton.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        cancelbutton.setText("CANCEL");
        cancelbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        sup_id1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        sup_id1.setText("PRODUCT ID");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        addbuttonn.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        addbuttonn.setText("ADD PRODUCT");
        addbuttonn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addbuttonn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pro_name, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sup_id, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sup_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pro_nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sup_idtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro_idtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbuttonn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sup_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_idtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbuttonn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(costtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sup_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sup_idtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void clearField()
    {
        pro_idtextfield.setText(null);
        pro_nametextfield.setText(null);
        costtextfield.setText(null);
        typetextfield.setText(null);
        sup_idtextfield.setText(null);
    }
    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        dispose();
        MainPage obj=new MainPage() ;
        obj.setVisible(true);
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void addbuttonnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonnActionPerformed
        try
        {  
            DefaultTableModel model = (DefaultTableModel) protable.getModel();
            model.setRowCount(0);
            Class.forName("oracle.jdbc.OracleDriver");   
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root123");  
            String pro_namev=pro_idtextfield.getText();
            String pro_idv=pro_nametextfield.getText();
            String costv= costtextfield.getText();
            String typev =typetextfield.getText();
            String sup_idv =sup_idtextfield.getText();
            PreparedStatement Pstatement=con.prepareStatement("insert into product (pro_id,pro_name,pro_price,pro_type,sup_id) values(?,?,?,?,?)");
            Pstatement.setString(1,pro_idtextfield.getText());
            Pstatement.setString(2,pro_nametextfield.getText());
            Pstatement.setString(3,costtextfield.getText());
            Pstatement.setString(4,typetextfield.getText());
            Pstatement.setString(5,sup_idtextfield.getText());
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root123");  
            PreparedStatement ps1 = conn.prepareStatement("select * from product where pro_id=? ");
            ps1.setString(1,pro_idtextfield.getText());
            ResultSet rs1 = ps1.executeQuery();
            if(rs1.next())      
            {
                    JOptionPane.showMessageDialog(null,"THIS PRODUCT ID IS REGISTERED"+"\nCANT BE ADDED ");
                    pro_idtextfield.setText(null);
            }
            else
            {
                if(!(pro_namev.isEmpty()||pro_idv.isEmpty()||costv.isEmpty()||typev.isEmpty()||sup_idv.isEmpty()))
                {
                
                        Pstatement.executeUpdate();
                        JOptionPane.showMessageDialog(null,"PRODUCT ADDED SUCCESSFULL");
                        clearField();
                }
           
                else
                {
                         JOptionPane.showMessageDialog(null,"ONE OR MORE FIELD IS EMPTY","Failed",JOptionPane.ERROR_MESSAGE);
                }
            }
            PreparedStatement ps11 = con.prepareStatement("select pro_id,pro_name,pro_price,pro_type,sup_id from product");
            ResultSet rs11 = ps11.executeQuery();
            
            while(rs11.next())
            {
                String pro_name=rs11.getString("pro_name");
                String pro_idt=rs11.getString("pro_id");
                String cost=rs11.getString("pro_price"); 
                String type =rs11.getString("pro_type");
                String sup_id =rs11.getString("sup_id");
            String tbData[]={pro_idt,pro_name,cost,type,sup_id};
            DefaultTableModel tblModel =(DefaultTableModel)protable.getModel();
            tblModel.addRow(tbData);
            }
        
            
        }
        catch(Exception e){ System.out.println(e);}  
    }//GEN-LAST:event_addbuttonnActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {new AddProduct().setVisible(true);}
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbuttonn;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JLabel cost;
    private javax.swing.JTextField costtextfield;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pro_idtextfield;
    private javax.swing.JLabel pro_name;
    private javax.swing.JTextField pro_nametextfield;
    private javax.swing.JTable protable;
    private javax.swing.JLabel sup_id;
    private javax.swing.JLabel sup_id1;
    private javax.swing.JTextField sup_idtextfield;
    private javax.swing.JLabel type;
    private javax.swing.JTextField typetextfield;
    // End of variables declaration//GEN-END:variables
}
