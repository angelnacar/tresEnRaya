
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class maquina extends javax.swing.JFrame {
        static Color color;
    /**
     * Creates new form tablero
     */
    public maquina() {
        initComponents();
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
        casilla1 = new javax.swing.JButton();
        casilla2 = new javax.swing.JButton();
        casilla3 = new javax.swing.JButton();
        casilla4 = new javax.swing.JButton();
        casilla5 = new javax.swing.JButton();
        casilla6 = new javax.swing.JButton();
        casilla7 = new javax.swing.JButton();
        casilla8 = new javax.swing.JButton();
        casilla9 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        casilla1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        casilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla1);

        casilla2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        casilla2.setActionCommand("");
        casilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla2);

        casilla3.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        casilla3.setActionCommand("");
        casilla3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla3);

        casilla4.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        casilla4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla4);

        casilla5.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        casilla5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla5);

        casilla6.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        casilla6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla6);

        casilla7.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        casilla7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla7);

        casilla8.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        casilla8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla8);

        casilla9.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        casilla9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9ActionPerformed(evt);
            }
        });
        getContentPane().add(casilla9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1ActionPerformed
        if(casilla1.getText().isEmpty())
        {
            
            casilla1.setText("X");
            maquina();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya esta marcada esa casilla","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void casilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2ActionPerformed
        if(casilla2.getText().isEmpty())
        {
            casilla2.setText("X");
            maquina();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya esta marcada esa casilla","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void casilla3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3ActionPerformed
       if(casilla3.getText().isEmpty())
        {
            casilla3.setText("X");
            maquina();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya esta marcada esa casilla","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void casilla4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4ActionPerformed
       if(casilla4.getText().isEmpty())
        {
            casilla4.setText("X");
            maquina();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya esta marcada esa casilla","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void casilla5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5ActionPerformed
        if(casilla5.getText().isEmpty())
        {
            casilla5.setText("X");
            maquina();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya esta marcada esa casilla","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void casilla6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6ActionPerformed
        if(casilla6.getText().isEmpty())
        {
            casilla6.setText("X");
            maquina();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya esta marcada esa casilla","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void casilla7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7ActionPerformed
        if(casilla7.getText().isEmpty())
        {
            casilla7.setText("X");
            maquina();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya esta marcada esa casilla","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void casilla8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8ActionPerformed
        if(casilla8.getText().isEmpty())
        {
            casilla8.setText("X");
            maquina();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya esta marcada esa casilla","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }

    private void casilla9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9ActionPerformed
         if(casilla9.getText().isEmpty())
        {
            casilla9.setText("X");
            maquina();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ya esta marcada esa casilla","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     * Controla las partidas de la máquina
     */
    public static void maquina()
    {
        Random aleatorio = new Random();
        boolean sigue = true;
        int opcion = -1;
        
        do
        {
            opcion = aleatorio.nextInt(9); //genera números aleatorios del 0 al 8
            
            if(comprobarEstado() == 1)
            {
                JOptionPane.showMessageDialog(null, "GANA EL JUGADOR !!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            if(comprobarEstado() == 2)
            {
                JOptionPane.showMessageDialog(null, "GANA LA MÁQUINA !!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            if(comprobarEstado() == 3)
            {
                JOptionPane.showMessageDialog(null, "EMPATE !!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            
            else
            {
            
            switch(opcion) //
            {
                case 0:
                    if(casilla1.getText().isEmpty()) //si la casilla 1 está vacia, marca casilla 1 y así con todas las demás
                    {
                        casilla1.setForeground(color.RED);
                        casilla1.setText("O");
                        sigue = false;
                        break;
                        
                    }
                    else
                    {
                        break;
                    }
                case 1:
                    if(casilla2.getText().isEmpty())
                    {
                        casilla2.setForeground(color.RED);
                        casilla2.setText("O");
                        sigue = false;
                        break;
                        
                    }
                    else
                    {
                        break;
                    }
                case 2:
                    if(casilla3.getText().isEmpty())
                    {
                        casilla3.setForeground(color.RED);
                        casilla3.setText("O");
                        sigue = false;
                        break;
                        
                    }
                    else
                    {
                        break;
                    }
                case 3:
                    if(casilla4.getText().isEmpty())
                    {
                        casilla4.setForeground(color.RED);
                        casilla4.setText("O");
                        sigue = false;
                        break;
                        
                    }
                    else
                    {
                        break;
                    }
                case 4:
                    if(casilla5.getText().isEmpty())
                    {
                        casilla5.setForeground(color.RED);
                        casilla5.setText("O");
                        sigue = false;
                        break;
                        
                    }
                    else
                    {
                        break;
                    }
                case 5:
                    if(casilla6.getText().isEmpty())
                    {
                        casilla6.setForeground(color.RED);
                        casilla6.setText("O");
                        sigue = false;
                        break;
                        
                    }
                    else
                    {
                        break;
                    }
                case 6:
                    if(casilla7.getText().isEmpty())
                    {
                        casilla7.setForeground(color.RED);
                        casilla7.setText("O");
                        sigue = false;
                        break;
                        
                    }
                    else
                    {
                        break;
                    }
                case 7:
                    if(casilla8.getText().isEmpty())
                    {
                        casilla8.setForeground(color.RED);
                        casilla8.setText("O");
                        sigue = false;
                        break;
                        
                    }
                    else
                    {
                        break;
                    }
                case 8:
                    if(casilla9.getText().isEmpty())
                    {
                        casilla9.setForeground(color.RED);
                        casilla9.setText("O");
                        sigue = false;
                        break;
                        
                    }
                    else
                    {
                        break;
                    }
            }
            }
        }while(sigue && comprobarEstado() == 0 || comprobarEstado() == 1 || comprobarEstado() == 2 || comprobarEstado() == 3); //iteraciona mientras se cumpla alguna de las condiciones siguientes: maquina no ha encontrado casilla vacia, no hay ganadores o empate
    }
    public static int comprobarEstado() {
        
        if(casilla1.getText().equals("X") && casilla2.getText().equals("X") && casilla3.getText().equals("X") ||
           casilla4.getText().equals("X") && casilla5.getText().equals("X") && casilla6.getText().equals("X") ||
           casilla7.getText().equals("X") && casilla8.getText().equals("X") && casilla9.getText().equals("X") ||
           casilla1.getText().equals("X") && casilla4.getText().equals("X") && casilla7.getText().equals("X") ||
           casilla2.getText().equals("X") && casilla5.getText().equals("X") && casilla8.getText().equals("X") ||     
           casilla3.getText().equals("X") && casilla6.getText().equals("X") && casilla9.getText().equals("X") ||
           casilla1.getText().equals("X") && casilla5.getText().equals("X") && casilla9.getText().equals("X") ||     
           casilla3.getText().equals("X") && casilla5.getText().equals("X") && casilla7.getText().equals("X"))
            return 1;
        
        else if(casilla1.getText().equals("O") && casilla2.getText().equals("O") && casilla3.getText().equals("O") ||
                casilla4.getText().equals("O") && casilla5.getText().equals("O") && casilla6.getText().equals("O") ||
                casilla7.getText().equals("O") && casilla8.getText().equals("O") && casilla9.getText().equals("O") ||
                casilla1.getText().equals("O") && casilla4.getText().equals("O") && casilla7.getText().equals("O") ||
                casilla2.getText().equals("O") && casilla5.getText().equals("O") && casilla8.getText().equals("O") ||     
                casilla3.getText().equals("O") && casilla6.getText().equals("O") && casilla9.getText().equals("O") ||
                casilla1.getText().equals("O") && casilla5.getText().equals("O") && casilla9.getText().equals("O") ||     
                casilla3.getText().equals("O") && casilla5.getText().equals("O") && casilla7.getText().equals("O"))
            return 2;
        
        if (casilla1.getText().isEmpty() || casilla2.getText().isEmpty() || casilla3.getText().isEmpty() ||
            casilla4.getText().isEmpty() || casilla5.getText().isEmpty() || casilla6.getText().isEmpty() ||
            casilla7.getText().isEmpty() || casilla8.getText().isEmpty() || casilla9.getText().isEmpty())
            return 0;
        
        return 3;
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton casilla1;
    public static javax.swing.JButton casilla2;
    public static javax.swing.JButton casilla3;
    public static javax.swing.JButton casilla4;
    public static javax.swing.JButton casilla5;
    public static javax.swing.JButton casilla6;
    public static javax.swing.JButton casilla7;
    public static javax.swing.JButton casilla8;
    public static javax.swing.JButton casilla9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
