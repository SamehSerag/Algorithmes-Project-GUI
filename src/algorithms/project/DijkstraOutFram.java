package algorithms.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static algorithms.project.EdgeInputFram.frame;
import static algorithms.project.EdgeInputFram.vs;
//import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import edu.uci.ics.jung.graph.SparseGraph;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.collections15.Transformer;

/**
 *
 * @author Home
 */
public class DijkstraOutFram extends javax.swing.JFrame {

    /**
     * Creates new form OutPutFram
     */
    DefaultTableModel model;
    public DijkstraOutFram() {
        initComponents();
        setLocationRelativeTo(null);
        visitedArr = new Vector();
        visitedArrBlue = new Vector();
        visitedArrGray = new Vector();
        vistedBool = false;
        count = 0 ;

        model = new DefaultTableModel();
        tableData.setModel(model);
        model.addColumn("Vertex Name");
        
        model.addColumn("Shortest Path From "+ ChooseFram.src);
        jLabel1.setText("The Shortest Path From "+ ChooseFram.src+ " to All Verteces");
        
        
//        for (int i = 0; i <ShortestPath.vertexNames.size() ; i++) {
            model.addRow(new Object[]{
                ShortestPath.vertexNames.get(0),
                ShortestPath.distance[0]
        
            });
//        }
        


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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        closeBt = new javax.swing.JButton();
        backBt = new javax.swing.JButton();
        stepBystepBt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stepBystepBt1 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 0));

        tableData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Vertex Name", "Shortest Path From Source"
            }
        ));
        jScrollPane1.setViewportView(tableData);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 0));
        jLabel1.setText("The Shortest Path From Source to All Verteces");

        closeBt.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        closeBt.setText("Exit");
        closeBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtActionPerformed(evt);
            }
        });

        backBt.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        backBt.setText("Back");
        backBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtActionPerformed(evt);
            }
        });

        stepBystepBt.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        stepBystepBt.setForeground(new java.awt.Color(0, 0, 255));
        stepBystepBt.setText("Next Step");
        stepBystepBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepBystepBtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("To See Result step by step press Next Step One by One");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("To See The Whole Result press Result");

        stepBystepBt1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        stepBystepBt1.setForeground(new java.awt.Color(0, 0, 255));
        stepBystepBt1.setText("Result");
        stepBystepBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepBystepBt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stepBystepBt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stepBystepBt1)
                        .addGap(16, 16, 16)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeBt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stepBystepBt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(stepBystepBt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBt)
                    .addComponent(backBt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtActionPerformed
        // TODO add your handling code here:
        System.exit(0);        
    }//GEN-LAST:event_closeBtActionPerformed

    private void backBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtActionPerformed
        // TODO add your handling code here:
        super.setVisible(false);
        ChooseFram chosF = new ChooseFram();
        chosF.setVisible(true);
        EdgeInputFram.frame.setVisible(false);
        EdgeInputFram.displayGraph();
    }//GEN-LAST:event_backBtActionPerformed

    private void stepBystepBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepBystepBtActionPerformed
        // TODO add your handling code here:
        if(count == 0){
            clearTable();
            model.addRow(new Object[]{
                ShortestPath.vertexNames.get(0),
                ShortestPath.distance[0]
        
            });
        }
        vistedBool = false;
        if(count < ShortestPath.map.size()){
            model.addRow(new Object[]{
                ShortestPath.vertexNames.get(count+1),
                ShortestPath.distance[count+1]
        
            });
            displayStepByStep();
            count++;
            
        }
        else{
            stepBystepBt.setText("Finished");
            stepBystepBt.setForeground(new Color(0,100,0));
            stepBystepBt.setEnabled(false);
        }

    }//GEN-LAST:event_stepBystepBtActionPerformed
    public void clearTable(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged(); // notifies the JTable that the model has changed
        
        visitedArr  = new Vector<>();
        visitedArrBlue  = new Vector<>();
        visitedArrGray  = new Vector<>();
        count = 0 ;
        vistedBool = false;
        
        stepBystepBt.setText("Next Step");
        stepBystepBt.setForeground(Color.BLUE);
        stepBystepBt.setEnabled(true);
    }
    private void stepBystepBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepBystepBt1ActionPerformed
        // TODO add your handling code here:
        ChooseFram.displayDijkatra();
        
        clearTable();
        for (int i = 0; i <ShortestPath.vertexNames.size() ; i++) {
            model.addRow(new Object[]{
                ShortestPath.vertexNames.get(i),
                ShortestPath.distance[i]
        
            });
       }
    }//GEN-LAST:event_stepBystepBt1ActionPerformed
    public static void displayStepByStep(){
        Transformer<String, Paint> edgePaint = new Transformer<String, Paint>() {    
                    @Override
                    public Paint transform(String s) {    // s represents the edge
                            //String weight = s.replace("*", "");
                            //System.out.println(weight);
                            System.out.println("Map = "+EdgeInputFram.map.get(s));
                            System.out.println(ShortestPath.map.containsValue(EdgeInputFram.map.get(s)));
                            if(!visitedArr.contains(s) && !vistedBool){
                                visitedArr.add(s);
                                
                                if (ShortestPath.map.containsValue(EdgeInputFram.map.get(s))){
                                    visitedArrBlue.add(s);
                                    System.out.println("In Blue");
                                    vistedBool = true;
                                    //count++;
                                    return Color.BLUE;
                                }
                                else {
                                    //count++;
                                    visitedArrGray.add(s);
                                    System.out.println("In Gray");
                                    return Color.LIGHT_GRAY;
                                }
                            }
                            else if (visitedArrBlue.contains(s))
                                return Color.BLUE;
                            else if (visitedArrGray.contains(s))
                                return Color.LIGHT_GRAY;
                            else
                                return Color.LIGHT_GRAY;
                           
                        }
                    };
                    //vistedBool = false;
                        ///Change Edge Font 
                    vs.getRenderContext().setLabelOffset(20);
                    vs.getRenderContext().setEdgeStrokeTransformer(new Transformer<String,Stroke>(){
                       @Override
                       public Stroke transform(String s) {
                           return new BasicStroke(5);
                       }
                   });
                   vs.getRenderContext().setEdgeArrowStrokeTransformer(new Transformer<String,Stroke>(){
                       @Override
                       public Stroke transform(String s) {
                           return new BasicStroke(5);
                       }
                   });


                    EdgeInputFram.vs.getRenderContext().setEdgeDrawPaintTransformer(edgePaint);
                    //EdgeInputFram.vs.getRenderContext().setEdgeFontTransformer();

                    EdgeInputFram.frame.getContentPane().add(vs);
                    //frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                    frame.setSize(500,400);
                    frame.setTitle("Shortest Path");
    }
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
            java.util.logging.Logger.getLogger(DijkstraOutFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DijkstraOutFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DijkstraOutFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DijkstraOutFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DijkstraOutFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBt;
    private javax.swing.JButton closeBt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton stepBystepBt;
    private javax.swing.JButton stepBystepBt1;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
    public static Vector<String> visitedArr ;
    public static Vector<String> visitedArrBlue ;
    public static Vector<String> visitedArrGray ;
    public int count ;
    public static Boolean vistedBool;
}
