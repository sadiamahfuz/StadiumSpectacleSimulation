/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import java.beans.PropertyChangeListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;        // For JPanel, etc.
import java.awt.*;           // For Graphics, etc.
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 * Class for the main GUI
 * @author syedasm
 */
public class GUIPanel extends JPanel implements Runnable{

    private String eventName = "notSet";
    private String mode = "Event Mode";

    private JButton config;
    private JButton random;
    private JButton pcbloom;
    private JButton fireworks;
    private JLabel patterns;
    private JButton simulate;
    private JButton bloom;
    private Thread t;
   // private Thread t1;
    private JButton synchFlash;
    private SpectacleObject spec;

    private JPanel imagePanel;

    private volatile boolean allDone;
    private Pattern currentPattern;

    private ArrayList<ArrayList<Badge>> badgesInRandomTrace;
    private ArrayList<ArrayList<Badge>> badgesInBloom;

    private ArrayList<ArrayList<Badge>> badgesInFireworks;
    private ArrayList<Badge> badgesInSynchFlash;
    private ArrayList<Badge> badgesInPlainFlash;
    private ArrayList<ArrayList<Badge>> badgesInBloomPC;

    private JPanel buttonPanel;

        public static JTextArea area;

            private ImageIcon grass_icon;
            private ImageIcon cmd_icon;

            private BufferedImage grass;

        private Color[] availColours = {Color.green, Color.blue, Color.yellow, Color.red, Color.white, Color.cyan, Color.magenta};

        private int flashDuration;
        private Color currentColour;

        private PatternDialogue pd;
        private SynchDialogue sd;
        private int numHops;

        /**
         * Construtor - sets up the different Panels
         */
        public GUIPanel(){


         ClassLoader cldr = this.getClass().getClassLoader();

                java.net.URL grassURL   = cldr.getResource("stadiumspectacle/Images/grass4.jpg");
                grass_icon = new ImageIcon(grassURL);
                java.net.URL cmdURL   = cldr.getResource("stadiumspectacle/Images/purple.jpg");
                cmd_icon = new ImageIcon(cmdURL);

        imagePanel = new JPanel()
		{
            @Override
			protected void paintComponent(Graphics g)
			{
				//  Dispaly image at full size
                           	super.paintComponent(g);
                            Graphics2D g2d = (Graphics2D)g;
				g2d.drawImage(grass_icon.getImage(), 0, 0, null);
			}
		};


        //t = new Thread(this);


        try {
            //skyColour = ImageIO.read(imageURL);
            grass = ImageIO.read(grassURL);
        } catch (IOException ex) {
            Logger.getLogger(SpectacleObject.class.getName()).log(Level.SEVERE, null, ex);
        }

        Color darkGreen = new Color(160, 200,100);

         buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        //buttonPanel.setBackgroundImage(grass);

        patterns = new JLabel("Available Light Patterns:");
        config = new JButton("Configure for Event");
        random = new JButton("Random Trace");
        pcbloom = new JButton("PC Bloom");
        simulate = new JButton ("Enter Simulation Parameters");
        synchFlash = new JButton("Synchronous Flash");
       fireworks = new JButton("Fireworks");
       bloom = new JButton("Bloom");

       patterns.setForeground(Color.WHITE);
      // buttonPanel.add(simulate);
        buttonPanel.add(config);
        buttonPanel.add(patterns);
        buttonPanel.add(random);
        buttonPanel.add(pcbloom);
        buttonPanel.add(synchFlash);
        buttonPanel.add(bloom);
        //buttonPanel.add(fireworks);

        buttonPanel.setOpaque(false);
        synchFlash.addActionListener(new SynchListener());
      // fireworks.addActionListener(new FireListener());
        random.addActionListener(new TraceListener());
        config.addActionListener(new ConfigureListener());
        pcbloom.addActionListener(new PCBloomListener());
        bloom.addActionListener(new BloomListener());

        imagePanel.add(buttonPanel);
        
        JPanel commandPanel = new JPanel(){



            @Override
            public void paintComponent (Graphics g)
            {

                            super.paintComponent(g);

                Graphics2D g2d = (Graphics2D)g;

                g.drawImage(cmd_icon.getImage(), 0, 0, null);


            }


        };
        JLabel label = new JLabel("Command Line Output");


         area = new JTextArea(10,24);
       

                commandPanel.setOpaque(false);
                area.setOpaque(false);
                label.setForeground(Color.WHITE);
                area.setForeground(Color.WHITE);




        commandPanel.add(label);
        commandPanel.add(area);

        commandPanel.setLayout(new BoxLayout(commandPanel, BoxLayout.Y_AXIS));

        JPanel stadiumPanel = new JPanel();
        stadiumPanel.setLayout(new FlowLayout());

                this.spec = new SpectacleObject();


        stadiumPanel.add(spec);


        this.setLayout(new BorderLayout());
        this.add(spec, BorderLayout.CENTER);

        this.add(commandPanel, BorderLayout.EAST);

        this.add(imagePanel, BorderLayout.SOUTH);

        area.setLineWrap(true);

        allDone=false;

    }

        /*
         * The run methods is called when a button asking a light pattern to be done is clicked
         */
    @SuppressWarnings({"static-access", "static-access", "static-access", "static-access", "static-access", "static-access", "static-access"})
    public void run() {

           try{
               if(currentPattern.getPattern()==0){
                                   area.append("PC constructing message....\n");
                                   Thread.sleep(1000);

                int numtimesFlash=0;
                numHops = sd.getHops();
                  while(numtimesFlash<numHops){
                      area.append("PC broadcast message...\n");
                    for(int i=0; i<badgesInSynchFlash.size(); i++){
                   
                           if (sd.getColour().equals("Random")){
                               Random rnd = new Random();
                               int chooseColour = rnd.nextInt(7);
                               badgesInSynchFlash.get(i).setLightColour(availColours[chooseColour]);
                           }
                           else{
                           badgesInSynchFlash.get(i).setLightColour(currentColour);
                           }
         
                   }

                    spec.allFlash();
                    Thread.sleep(flashDuration);
                    numtimesFlash++;

                    for(int i=0; i<badgesInSynchFlash.size(); i++){
                       badgesInSynchFlash.get(i).setLightColour(Color.black);
                      // spec.allFlash();

                 }
                                       spec.allFlash();
                                       Thread.sleep(300);
                  }

                for(int i=0; i<badgesInSynchFlash.size(); i++){
                       badgesInSynchFlash.get(i).setLightColour(Color.black);
                      // spec.allFlash();

                 }
                                       spec.allFlash();


                                        area.append("Pattern Completed");

               }
               

                    else if(currentPattern.getPattern()==4){
                int goAround=0;
                  while(goAround<15){
                      Random rnd = new Random(System.currentTimeMillis());

                        int c = Math.abs(rnd.nextInt() % 7);

                    for(int i=0; i<badgesInPlainFlash.size(); i++){
                        //System.out.println(badgesInSynchFlash.size());
                     

                           badgesInPlainFlash.get(i).setLightColour(availColours[c]);


                   }

                   spec.allFlash();
                   Thread.sleep(300);

                           
                  goAround++;
                   }
                      

                 for(int i=0; i<badgesInPlainFlash.size(); i++){
                       badgesInPlainFlash.get(i).setLightColour(Color.black);
                      // spec.allFlash();

                 }
                                       spec.allFlash();



               }


               else if(currentPattern.getPattern()==1){
                    int numtimesFlash=0;
                numHops = pd.getHops();
                 // while(numtimesFlash<numHops){
                    for(int i=0; i<badgesInRandomTrace.size(); i++){
                       for(int j=0; j<badgesInRandomTrace.get(i).size(); j++){

                         /*  if (pd.getColour().equals("Random")){
                               Random rnd = new Random();
                               int chooseColour = rnd.nextInt(7);
                               badgesInRandomTrace.get(i).get(j).setLightColour(availColours[chooseColour]);
                           }*/
                      // Random rnd = new Random(System.currentTimeMillis());

                       //int c = Math.abs(rnd.nextInt() % 7);
                           //else{
                       badgesInRandomTrace.get(i).get(j).setLightColour(currentColour);
                          // }
                       }
                                spec.allFlash();
                                Thread.sleep(flashDuration);
                for(int k=0; k<badgesInRandomTrace.get(i).size(); k++){

                badgesInRandomTrace.get(i).get(k).setLightColour(Color.black);

                   }
                   spec.allFlash();

                    }
 
               }

               else if(currentPattern.getPattern()==2){
      
                   for(int i=0; i<badgesInBloomPC.size(); i++){
                    for(int j=0; j<badgesInBloomPC.get(i).size(); j++){

                           badgesInBloomPC.get(i).get(j).setLightColour(currentColour);

                    }


                    spec.allFlash();
                    Thread.sleep(500);

                    for(int j=0; j<badgesInBloomPC.get(i).size(); j++){

                           badgesInBloomPC.get(i).get(j).setLightColour(Color.black);

                    }

                     spec.allFlash();
  
                   }

                   spec.turnAllLightsOff();



                 }

               else if(currentPattern.getPattern()==5){

                numHops = pd.getHops();

                    for(int i=0; i<badgesInBloom.size(); i++){
                       for(int j=0; j<badgesInBloom.get(i).size(); j++){

                       badgesInBloom.get(i).get(j).setLightColour(currentColour);
                       }
                                spec.allFlash();
                                Thread.sleep(flashDuration);
                for(int k=0; k<badgesInBloom.get(i).size(); k++){

                badgesInBloom.get(i).get(k).setLightColour(Color.black);

                   }
                   spec.allFlash();

                    }

               }

                }catch(InterruptedException e){
                    System.out.println(e);
                }
           
           end();
    }

    /**
     *
     * @param colourName
     * @return
     */
    public Color getColor(String colourName){
        Color colour =null;
        if(colourName =="Red")
            colour = Color.RED;

        else if(colourName=="Green")
            colour = Color.GREEN;

        else if (colourName=="Blue")
            colour = Color.BLUE;

        else if (colourName=="Cyan")
            colour = Color.CYAN;

        else if (colourName=="Magenta")
            colour = Color.MAGENTA;

        else if (colourName=="Yellow")
            colour = Color.YELLOW;

        else if (colourName == "White")
            colour = Color.WHITE;

       return colour;
    }

    /**
     * Creating a thread
     */
    public void createThread(){
        t= new Thread(this);
    }

    /**
     * Method is stop thread running after the pattern in finisged
     */
    public void end(){
                    allDone=true;
                    t.interrupt();
                    t = null;


    }

 

    private  class SynchListener implements ActionListener{
      JFrame f = new JFrame();
            public void actionPerformed(ActionEvent action) {
                 sd = new SynchDialogue(f, "Select Parameters");
  sd.setVisible(true);
                allDone=false;
                flashDuration = sd.getDuration();
                
                currentColour = getColor(sd.getColour());
                
               
                createThread();
                currentPattern=Pattern.SYCHRONOUS_FLASH;
                //allDone=false;

                area.setText(" ");
                area.append("Synchronous Flash\n");

                badgesInSynchFlash = spec.synchronousFlash(area,currentColour,flashDuration, numHops);
                t.start();

    }

    }

        private  class PCBloomListener implements ActionListener{
      JFrame f = new JFrame();
            public void actionPerformed(ActionEvent action) {
                pd = new PatternDialogue(f, "Select Parameters");
 pd.setVisible(true);
                allDone=false;
                flashDuration = pd.getDuration();
                numHops = pd.getHops();
                if(pd.getColour()!="Random"){
                currentColour = getColor(pd.getColour());
                }
                else {
                      Random rnd = new Random();

                        int c = Math.abs(rnd.nextInt(7));
                    currentColour = availColours[c];
                }
                createThread();
                currentPattern=Pattern.PCBLOOM;

                badgesInBloomPC = spec.bloomPC(area,currentColour,flashDuration, numHops);
                t.start();


    }

        }

    private class TraceListener implements ActionListener{

           JFrame f = new JFrame();
            public void actionPerformed(ActionEvent action) {
                 pd = new PatternDialogue(f, "Select Parameters");
  pd.setVisible(true);
                allDone=false;
                flashDuration = pd.getDuration();
                numHops = pd.getHops();
                currentColour = getColor(pd.getColour());
              
                createThread();
                currentPattern=Pattern.RANDOM_TRACE;
                            area.setText(" ");
                            area.append("Lets do a Random Trace\n");
                            area.append("Flash Duration: " + pd.getDuration() +"milliseconds\n");
                            area.append("Number of Hops: " +pd.getHops()+"\n");
                badgesInRandomTrace = spec.random_trace(area,currentColour,flashDuration, numHops);

               t.start();
    }

    }

    private class BloomListener implements ActionListener{
           JFrame f = new JFrame();
            public void actionPerformed(ActionEvent action) {
                 pd = new PatternDialogue(f, "Select Parameters");
  pd.setVisible(true);
                allDone=false;
                flashDuration = pd.getDuration();
                numHops = pd.getHops();
                currentColour = getColor(pd.getColour());

                createThread();
                currentPattern=Pattern.BLOOM;

                            area.setText(" ");
                            area.append("Lets do a Bloom\n");
                            area.append("Flash Duration: " + pd.getDuration() +"\n");
                            area.append("Number of Hops: " +pd.getHops()+"\n");

                badgesInBloom = spec.bloom(area,currentColour,flashDuration, numHops);

               t.start();
    }


    }

     private class FireListener implements ActionListener{

            public void actionPerformed(ActionEvent e) {
                allDone=false;
                createThread();
                currentPattern=Pattern.FIREWORKS;
                badgesInFireworks = spec.fireworks(area);
                System.out.println("Lets have some fireworks");
                t.start();
            }



    }
    
      private class ConfigureListener implements ActionListener{

          public void actionPerformed(ActionEvent e){
            JFrame f = new JFrame();
            area.setText(" ");

              ConfigureDialogue sd = new ConfigureDialogue(f, "Configure Badges");
   sd.setVisible(true);
   eventName = sd.getEvent();
   mode = sd.getMode();
   System.out.println("Event: " + eventName);
   
   System.out.println("Mode: " + mode);
   area.append("Event: " + eventName + "\nSelected Mode: "+ mode +"\n");
  // spec.repaint();
try {
Thread.sleep(1000);
} catch (InterruptedException ex) {
           
            }
   area.append("Configuring badges........\n");
            
    spec.createBadges(area);
   spec.initialiseRFActivity();
          }

      }


        }

