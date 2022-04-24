package algorithms.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Paint;
import java.awt.Toolkit;
import java.lang.reflect.Array;
import javax.swing.JFrame;
import org.apache.commons.collections15.Transformer;
import java.util.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author Home
 */
public class EdgeInputFram extends javax.swing.JFrame {

    /** Creates new form EdgeInput */
    public EdgeInputFram() {
        initComponents();
        setLocationRelativeTo(null);
        finishBt.setEnabled(false);
        greenTx.setVisible(false);
        
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

//        Vector<String> vertices = new Vector<>();
//        vertices.add("s");
//        vertices.add("t");
//        vertices.add("1");
//        vertices.add("2");
//        
//        VertexNameInputFram.g = new Graph(vertices);
//        VertexNameInputFram.g.vertexNum = 4;
//        VertexNameInputFram.g.setDirected(false);
//        
//        
//        VertexNameInputFram.g.addEdge("s", "1", 3);
//        VertexNameInputFram.g.addEdge("s", "2", 2);
//        VertexNameInputFram.g.addEdge("1", "2", 5);
//        VertexNameInputFram.g.addEdge("1", "t", 3);
//        VertexNameInputFram.g.addEdge("2", "t", 3);
//        
//        EdgeInputFram.directedGraph.addEdge("3","s","1");
//        EdgeInputFram.directedGraph.addEdge("2","s","2");
//        EdgeInputFram.directedGraph.addEdge("5","1","2");
//        EdgeInputFram.directedGraph.addEdge("*3","1","t");
//        EdgeInputFram.directedGraph.addEdge("**3","2","t");
//        
//        EdgeInputFram.unDirectedGraph.addEdge("3","s","1");
//        EdgeInputFram.unDirectedGraph.addEdge("2","s","2");
//        EdgeInputFram.unDirectedGraph.addEdge("5","1","2");
//        EdgeInputFram.unDirectedGraph.addEdge("*3","1","t");
//        EdgeInputFram.unDirectedGraph.addEdge("**3","2","t");
//        
//        EdgeInputFram.map.put("3", "s 1");
//        EdgeInputFram.map.put("2", "s 2");
//        EdgeInputFram.map.put("5", "1 2");
//        EdgeInputFram.map.put("*3", "1 t");
//        EdgeInputFram.map.put("**3", "2 t");


  /*      Vector<String> vertices = new Vector<>();
        vertices.add("a");
        vertices.add("b");
        vertices.add("c");
        vertices.add("d");
        //vertices.add("e");

        
        VertexNameInputFram.g = new Graph(vertices);
        VertexNameInputFram.g.vertexNum = 4;
        
        
        VertexNameInputFram.g.addEdge("a", "b", 3);
        VertexNameInputFram.g.addEdge("a", "c", 1);
        VertexNameInputFram.g.addEdge("c", "b", 7);
        VertexNameInputFram.g.addEdge("c", "d", 2);
        VertexNameInputFram.g.addEdge("b", "d", 5);
        
        EdgeInputFram.directedGraph.addEdge("3","a","b");
        EdgeInputFram.directedGraph.addEdge("1","a","c");
        EdgeInputFram.directedGraph.addEdge("7","c","b");
        EdgeInputFram.directedGraph.addEdge("2","c","d");
        EdgeInputFram.directedGraph.addEdge("5","b","d");

        
        EdgeInputFram.map.put("3", "a b");
        EdgeInputFram.map.put("1", "a c");
        EdgeInputFram.map.put("7", "c b");
        EdgeInputFram.map.put("2", "c d");
        EdgeInputFram.map.put("5", "b d");
*/

/*
        Vector<String> vertices = new Vector<>();
        vertices.add("s");
        vertices.add("a");
        vertices.add("c");
        vertices.add("b");
        vertices.add("d");
        vertices.add("e");

        
        VertexNameInputFram.g = new Graph(vertices);
        VertexNameInputFram.g.vertexNum = 6;
        
        
        VertexNameInputFram.g.addEdge("s", "a", 1);
        VertexNameInputFram.g.addEdge("s", "c", 2);
        VertexNameInputFram.g.addEdge("c", "a", 4);
        VertexNameInputFram.g.addEdge("c", "d", 3);
        VertexNameInputFram.g.addEdge("a", "b", 6);
        VertexNameInputFram.g.addEdge("b", "e", 2);
        VertexNameInputFram.g.addEdge("b", "d", 1);
        VertexNameInputFram.g.addEdge("d", "e", 1);

        
        EdgeInputFram.directedGraph.addEdge("1","s", "a");
        EdgeInputFram.directedGraph.addEdge("2","s", "c");
        EdgeInputFram.directedGraph.addEdge("4","c", "a");
        EdgeInputFram.directedGraph.addEdge("3","c", "d");
        EdgeInputFram.directedGraph.addEdge("6","a", "b");
        EdgeInputFram.directedGraph.addEdge("*2","b", "e");
        EdgeInputFram.directedGraph.addEdge("*1","b", "d");
        EdgeInputFram.directedGraph.addEdge("**1","d", "e");

        
        
        EdgeInputFram.map.put("1", "s a");
        EdgeInputFram.map.put("2", "s c");
        EdgeInputFram.map.put("4", "c a");
        EdgeInputFram.map.put("3", "c d");
        EdgeInputFram.map.put("6", "a b");
        EdgeInputFram.map.put("*2", "b e");
        EdgeInputFram.map.put("*1", "b d");
        EdgeInputFram.map.put("**1", "d e");


*/

        
        //sheel el comment
        
        Vector<String> vertices = new Vector<>();
        vertices = VertexNameInputFram.g.getVertices();
        
        if(VertexNameInputFram.g.directed == true){
            for (int i = 0; i < vertices.size(); i++) {
                directedGraph.addVertex(vertices.get(i));
            }
        }
        else{
            for (int i = 0; i < vertices.size(); i++) {
                unDirectedGraph.addVertex(vertices.get(i));
            }
        }
        
       // System.out.println(g.getVertices());



    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        finishBt = new javax.swing.JButton();
        enterInitialLab = new javax.swing.JLabel();
        enterTerminalLab = new javax.swing.JLabel();
        initialVertex = new javax.swing.JTextField();
        terminalVertex = new javax.swing.JTextField();
        enterEdgeBt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        greenTx = new javax.swing.JLabel();
        bluTx2 = new javax.swing.JLabel();
        enterTerminalLab1 = new javax.swing.JLabel();
        weightTx = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Here to Enter Edges");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        finishBt.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        finishBt.setForeground(new java.awt.Color(200, 0, 0));
        finishBt.setText("Finish");
        finishBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishBtActionPerformed(evt);
            }
        });
        getContentPane().add(finishBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 133, -1));

        enterInitialLab.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        enterInitialLab.setText("Initial Vertex ");
        getContentPane().add(enterInitialLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, -1, -1));

        enterTerminalLab.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        enterTerminalLab.setText("Terminal Vertex");
        getContentPane().add(enterTerminalLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        initialVertex.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        initialVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialVertexActionPerformed(evt);
            }
        });
        getContentPane().add(initialVertex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, 140, -1));

        terminalVertex.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        terminalVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminalVertexActionPerformed(evt);
            }
        });
        getContentPane().add(terminalVertex, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 162, -1));

        enterEdgeBt.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        enterEdgeBt.setText("Add Edge ");
        enterEdgeBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEdgeBtActionPerformed(evt);
            }
        });
        getContentPane().add(enterEdgeBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 225, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 0, 0));
        jLabel3.setText("After Add All Edges Press Finish");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 368, -1));

        greenTx.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        greenTx.setForeground(new java.awt.Color(0, 0, 153));
        greenTx.setText("Edge 1 Added Successfully,You Can Add More");
        getContentPane().add(greenTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 31));

        bluTx2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        bluTx2.setForeground(new java.awt.Color(0, 0, 153));
        bluTx2.setText("Enter Edge 1");
        getContentPane().add(bluTx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        enterTerminalLab1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        enterTerminalLab1.setText("Edge Weight");
        getContentPane().add(enterTerminalLab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        weightTx.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        weightTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTxActionPerformed(evt);
            }
        });
        getContentPane().add(weightTx, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 121, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algorithms/project/source/abstract-geometric-shape-connection-with-3d-cubes-background_42705-105.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initialVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialVertexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initialVertexActionPerformed

    private void terminalVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminalVertexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terminalVertexActionPerformed

    private void finishBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishBtActionPerformed
        // TODO add your handling code here:

            int counter = 1;
            edges = VertexNameInputFram.g.getEdges();
            System.out.println("Edges Size = " + edges.size());
            for (int i = 0; i < edges.size(); i++) {
               
                String src = String.valueOf(edges.get(i).initial);
                String dest = String.valueOf(edges.get(i).terminate);
                String weight = String.valueOf(edges.get(i).weight);
                

                while(edgeNamesArr.contains(weight)){weight+="*" ;}
                edgeNamesArr.add(weight);
                System.out.println("edges = " + edges.get(i).initial +" " +edges.get(i).terminate
                       +" "+edges.get(i).weight );
                //sheet el comment
                if(VertexNameInputFram.g.directed == true)
                    directedGraph.addEdge(weight,src,dest);
                else
                    unDirectedGraph.addEdge(weight,src,dest);
                
                String mapValue = edges.get(i).initial + " " + edges.get(i).terminate;
                String mapValue2 = edges.get(i).terminate + " " + edges.get(i).initial;
                map.put(weight, mapValue);
                map2.put(weight, mapValue2);
                
                counter++;
                
            }
            displayGraph();
                        
            
            
            super.setVisible(false);
            ChooseFram chooseFram = new ChooseFram();
            chooseFram.setVisible(true);                

            

           // }           
            
            
     //   }
    }//GEN-LAST:event_finishBtActionPerformed
    public static void displayGraph(){
        if(VertexNameInputFram.g.directed == true){
            vs =
                   new VisualizationImageServer<String, String>(new CircleLayout<String, String>(EdgeInputFram.directedGraph), 
                           new Dimension(200, 200));
        }
        else{
            vs =
                   new VisualizationImageServer<String, String>(new CircleLayout<String, String>(EdgeInputFram.unDirectedGraph), 
                           new Dimension(200, 200));
        }
           
            
            Transformer<String, String> transformer2 = new Transformer<String, String>() {

                @Override
                public String transform(String arg0) {
                    return arg0;
                }

            };



            Transformer<String, String> transformer1 = new Transformer<String, String>() {

                @Override
                public String transform(String arg0){
                    return arg0;
                }
            };
            
       
            

         // vv is the VirtualizationViewer
            vs.getRenderContext().setLabelOffset(20);
            vs.getRenderContext().setEdgeLabelTransformer(transformer1);
            vs.getRenderContext().setVertexLabelTransformer(transformer2);

            
            
            
            frame = new JFrame();
            frame.getContentPane().add(vs);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setSize(500,400);
            frame.setTitle("The Graph Input");

            //frame.setLocationRelativeTo(null);
            //int lebar = this.getWidth()/2;
            //int tinggi = this.getHeight()/2;
            int x = (Toolkit.getDefaultToolkit().getScreenSize().width/3)-500;
            int y = (Toolkit.getDefaultToolkit().getScreenSize().height/2)-220;
            frame.setLocation(x, y);


    }
    private void enterEdgeBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterEdgeBtActionPerformed
        // TODO add your handling code here:
                

        boolean numeric = false;
        int weight = 0 , dest = 0; 
        try {
            weight = Integer.parseInt(weightTx.getText());
            //dest = Integer.parseInt(terminalVertex.getText());
        } catch (NumberFormatException e) {
            numeric = true;
        }

    
        if(Objects.equals(initialVertex.getText(), "") || Objects.equals(terminalVertex.getText(), "") ){
            JOptionPane.showMessageDialog(this, "Please fill requirements ",  
                       "WARNING", JOptionPane.WARNING_MESSAGE); 
        }
        else if(!VertexNameInputFram.g.vertices.contains(initialVertex.getText()) || 
                !VertexNameInputFram.g.vertices.contains(terminalVertex.getText())
                ){
            JOptionPane.showMessageDialog(this, "You must enter one of the vertices name\n "+ VertexNameInputFram.g.vertices,  
           "ERROR", JOptionPane.ERROR_MESSAGE); 

        }
        else if(numeric){
            JOptionPane.showMessageDialog(this, "You must Enter Integer ",  
           "ERROR", JOptionPane.ERROR_MESSAGE); 

        }
        else{
            
           VertexNameInputFram.g.addEdge(initialVertex.getText(),terminalVertex.getText(),Integer.parseInt(weightTx.getText()));
           //directedGraph.addEdge( weightTx.getText(),initialVertex.getText(), terminalVertex.getText());
           

//            enterInitialLab.setVisible(false);
//            enterTerminalLab.setVisible(false);
//            initialVertex.setVisible(false);
//            terminalVertex.setVisible(false);
//            enterEdgeBt.setVisible(false);
            greenTx.setVisible(false);
            greenTx.setText("Edge "+ counter +" Added Successfully,You Can Add More");
            greenTx.setVisible(true);
            finishBt.setEnabled(true);

            initialVertex.setText("");
            terminalVertex.setText("");
            weightTx.setText("");
         
            counter++;
            bluTx2.setText("Enter Edge "+ counter);

            
        }

    }//GEN-LAST:event_enterEdgeBtActionPerformed

    private void weightTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTxActionPerformed

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
            java.util.logging.Logger.getLogger(EdgeInputFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdgeInputFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdgeInputFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdgeInputFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new EdgeInputFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bluTx2;
    private javax.swing.JButton enterEdgeBt;
    private javax.swing.JLabel enterInitialLab;
    private javax.swing.JLabel enterTerminalLab;
    private javax.swing.JLabel enterTerminalLab1;
    private javax.swing.JButton finishBt;
    private javax.swing.JLabel greenTx;
    private javax.swing.JTextField initialVertex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField terminalVertex;
    private javax.swing.JTextField weightTx;
    // End of variables declaration//GEN-END:variables
    public static DirectedSparseGraph<String, String> directedGraph = new DirectedSparseGraph<String, String>();
    public static SparseGraph<String, String> unDirectedGraph = new SparseGraph<String, String>();
    public int counter = 1 ;
    public ArrayList<String> edgeNamesArr = new ArrayList();
    public Vector <Edge> edges = new Vector<>();
    public static Map map = new HashMap();
    public static Map map2 = new HashMap();
    public static VisualizationImageServer<String, String> vs;
    public static JFrame frame ;



}
