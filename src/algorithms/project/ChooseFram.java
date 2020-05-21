/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.project;

import static algorithms.project.EdgeInputFram.directedGraph;
import static algorithms.project.EdgeInputFram.frame;
import static algorithms.project.EdgeInputFram.map;
import static algorithms.project.EdgeInputFram.vs;
import static algorithms.project.Main.input;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.collections15.Transformer;

/**
 *
 * @author Home
 */
public class ChooseFram extends javax.swing.JFrame {

    /**
     * Creates new form ChooseFram
     */
    public ChooseFram() {
        initComponents();
         addBt.setVisible(false);
         sourceLab.setVisible(false);
         sourceTx.setVisible(false);
         destLab.setVisible(false);
         destTx.setVisible(false);
         jLabel2.setVisible(false);
    
        
        setLocationRelativeTo(null);
//        Vector<String> vertices = new Vector<>();
//        vertices.add("a");
//        vertices.add("b");
//        vertices.add("c");
//        
//        VertexNameInputFram.g = new Graph(vertices);
//        VertexNameInputFram.g.vertexNum = 3;
//        
//        
//        VertexNameInputFram.g.addEdge("a", "b", 1);
//        VertexNameInputFram.g.addEdge("a", "c", 10);
//        VertexNameInputFram.g.addEdge("b", "c", 2);
//        
//        EdgeInputFram.directedGraph.addEdge("1","a","b");
//        EdgeInputFram.directedGraph.addEdge("10","a","c");
//        EdgeInputFram.directedGraph.addEdge("2","b","c");
//        
//        EdgeInputFram.map.put("1", "a b");
//        EdgeInputFram.map.put("10", "a c");
//        EdgeInputFram.map.put("2", "b c");








    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        destLab = new javax.swing.JLabel();
        sourceTx = new javax.swing.JTextField();
        sourceLab = new javax.swing.JLabel();
        destTx = new javax.swing.JTextField();
        addBt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setText("Please Choose Which Algorithm You Want To Apply ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Dijkstra's Algorithm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 82, -1, -1));

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Maximum Flow");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 82, 199, -1));

        destLab.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        destLab.setForeground(new java.awt.Color(0, 0, 153));
        destLab.setText("Please Enter Destination Name");
        getContentPane().add(destLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 197, -1, 31));

        sourceTx.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        sourceTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTxActionPerformed(evt);
            }
        });
        getContentPane().add(sourceTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 143, 95, -1));

        sourceLab.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        sourceLab.setForeground(new java.awt.Color(0, 0, 153));
        sourceLab.setText("Please Enter Source Name");
        getContentPane().add(sourceLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 143, -1, 31));

        destTx.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        destTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destTxActionPerformed(evt);
            }
        });
        getContentPane().add(destTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 197, 95, -1));

        addBt.setFont(new java.awt.Font("Lucida Calligraphy", 1, 15)); // NOI18N
        addBt.setText("Add");
        addBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtActionPerformed(evt);
            }
        });
        getContentPane().add(addBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 258, 108, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 197, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algorithms/project/source/abstract-geometric-shape-connection-with-3d-cubes-background_42705-105.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        destLab.setVisible(false);
        destTx.setVisible(false);
        jLabel2.setVisible(false);
        sourceLab.setVisible(true);
        sourceTx.setVisible(true);
        addBt.setVisible(true);
        dijkstaBool = true ;
        
      //  ShortestPath shortPath = new ShortestPath(VertexNameInputFram.g.vertexNum,VertexNameInputFram.g.vertices);
       // shortPath.dijkstra(VertexNameInputFram.g.mat,0);
        //super.setVisible(false);
//        VisualizationImageServer<String, String> vs;
//            vs =
//               new VisualizationImageServer<String, String>(new CircleLayout<String, String>(EdgeInputFram.directedGraph), 
//                       new Dimension(200, 200));
//
//           
//            
//            Transformer<String, String> transformer2 = new Transformer<String, String>() {
//
//                @Override
//                public String transform(String arg0) {
//                    return arg0;
//                }
//
//            };
//
//
//
//            Transformer<String, String> transformer1 = new Transformer<String, String>() {
//
//                @Override
//                public String transform(String arg0){
//                    return arg0;
//                }
//            };
//            
//       
//            
//
//         // vv is the VirtualizationViewer
//            vs.getRenderContext().setEdgeLabelTransformer(transformer1);
//            vs.getRenderContext().setVertexLabelTransformer(transformer2);
//
//            Transformer<String, Paint> edgePaint = new Transformer<String, Paint>() {    
//            @Override
//            public Paint transform(String s) {    // s represents the edge
//                    //String weight = s.replace("*", "");
//                    //System.out.println(weight);
//                    System.out.println("Map = "+EdgeInputFram.map.get(s));
//                    System.out.println(ShortestPath.map.containsValue(EdgeInputFram.map.get(s)));
//                
//                     if (ShortestPath.map.containsValue(EdgeInputFram.map.get(s))){   
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(ChooseFram.class.getName()).log(Level.SEVERE, null, ex);
//                        }                        
//                         return Color.BLUE;
//                     }
//                     else {
//                         return Color.BLACK;
//                     }
//                }
//            };
//            vs.getRenderContext().setEdgeDrawPaintTransformer(edgePaint);
//
//            
//            
//            
//            JFrame frame = new JFrame();
//            frame.getContentPane().add(vs);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.pack();
//            frame.setVisible(true);
//            frame.setSize(500,400);
//            frame.setTitle("The Graph Input");
//
//            //frame.setLocationRelativeTo(null);
//            int lebar = this.getWidth()/2;
//            int tinggi = this.getHeight()/2;
//            int x = (Toolkit.getDefaultToolkit().getScreenSize().width/3)-lebar;
//            int y = (Toolkit.getDefaultToolkit().getScreenSize().height/2)-tinggi;
//            frame.setLocation(x, y);

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         addBt.setVisible(true);
         sourceLab.setVisible(true);
         sourceTx.setVisible(true);
         destLab.setVisible(true);
         destTx.setVisible(true);
         jLabel2.setVisible(false);

         maximumBool= true;
         dijkstaBool = false;
         boothBool = false;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sourceTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTxActionPerformed

    private void destTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destTxActionPerformed

    private void addBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtActionPerformed
        // TODO add your handling code here:
        src = sourceTx.getText();
        
        //else{
            if (dijkstaBool){
                if(!VertexNameInputFram.g.vertices.contains(sourceTx.getText())){
                    JOptionPane.showMessageDialog(this, "You must enter one of the vertices name\n "+ VertexNameInputFram.g.vertices,  
                   "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
                else{
                    ShortestPath shortPath = new ShortestPath(VertexNameInputFram.g.vertexNum,VertexNameInputFram.g.vertices);
                    shortPath.dijkstra(VertexNameInputFram.g.mat,
                          VertexNameInputFram.g.vertices.indexOf(sourceTx.getText()) );
                    
                    //displayDijkatra();
                   
                    DijkstraOutFram diOut = new DijkstraOutFram();
                    diOut.setVisible(true);
                    super.setVisible(false);

                }
                
            }
            else if (maximumBool){
                if(!VertexNameInputFram.g.vertices.contains(sourceTx.getText())
                    || !VertexNameInputFram.g.vertices.contains(destTx.getText())){
                    JOptionPane.showMessageDialog(this, "You must enter one of the vertices name\n "+ VertexNameInputFram.g.vertices,  
                   "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
                else{
                    maximumFlow = new MaximumFlow(VertexNameInputFram.g);
                    maximumFlow.fordFulkerson(sourceTx.getText(),destTx.getText());
                    maximumflowNum = maximumFlow.res;
                    
                    
                    MaximumOutFram maxOutFram = new MaximumOutFram();
                    maxOutFram.setVisible(true);
                    super.setVisible(false);
                    //System.out.println(maximumFlow.fordFulkerson(sourceTx.getText(),destTx.getText()));
                }
                   
            }
            else{
                
            }
                
        
        
    }//GEN-LAST:event_addBtActionPerformed
    public static void displayDijkatra(){
            Transformer<String, Paint> edgePaint = new Transformer<String, Paint>() {    
                    @Override
                    public Paint transform(String s) {    // s represents the edge
                            //String weight = s.replace("*", "");
                            //System.out.println(weight);
                            System.out.println("Map = "+EdgeInputFram.map.get(s));
                            System.out.println(ShortestPath.map.containsValue(EdgeInputFram.map.get(s)));

                             if (ShortestPath.map.containsValue(EdgeInputFram.map.get(s))){   
     
                                 return Color.BLUE;
                             }
                             else {
                                 return Color.LIGHT_GRAY;
                             }
                        }
                    };

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
            java.util.logging.Logger.getLogger(ChooseFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBt;
    public javax.swing.JLabel destLab;
    public javax.swing.JTextField destTx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel sourceLab;
    public javax.swing.JTextField sourceTx;
    // End of variables declaration//GEN-END:variables
    public static Boolean dijkstaBool ;
    public static Boolean maximumBool ;
    public static Boolean boothBool ;
    public static String src;
    public static int maximumflowNum ;
    public static MaximumFlow maximumFlow;


}
