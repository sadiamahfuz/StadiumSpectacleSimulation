/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

/**
 *
 * @author syedasm
 */

import antInterface.ChannelType;
import antInterface.Data;
import antInterface.PowerLevel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*; // For JPanel, etc.
import java.awt.*; // For Graphics, Color etc.
import java.awt.geom.*; // For Rectangle2D, etc.
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;


/**
 *
 * @author syedasm
 */
public class SpectacleObject extends JPanel {

    /**
     *
     */
    public Badge[][] b = new Badge[100][100];
    private RFActivity activity;

    private Graphics2D g2d;
    private Rectangle2D.Double nightSky;
    private Color darkBlue;
    private Rectangle2D.Double stand;
    private Color standColour;
    private char[] data=new char[17];
    private String title;
    private String mem1;
    private String mem2;
    private Font font_title;
    private Font font_mem;
    private Color lightColor;

    private AutoSharedSlave theConnectedSlaves;
        private AutoSharedSlave theConnectedSlaves2;
        private BroadcastNetwork theNetwork;

        private PCBadge pc;


    private boolean synch = false;

    private Color[] availColours = {Color.green, Color.blue, Color.yellow};

    private int height;
    private int length;

    private ArrayList<Badge> badgesInRandomTrace = new ArrayList<Badge>();
    private ArrayList<ArrayList<Badge>> badgesInFireworks = new ArrayList<ArrayList<Badge>>();
    private ArrayList<Badge> badgesInSynchFlash = new ArrayList<Badge>();
    private ArrayList<ArrayList<Badge>> badgesInBloomPC = new ArrayList<ArrayList<Badge>>();
    private ArrayList<ArrayList<Badge>> badgesInRandom = new ArrayList<ArrayList<Badge>>();

        private ArrayList<ArrayList<Badge>> badgesInBloom = new ArrayList<ArrayList<Badge>>();

   /* private String dir = System.getProperty("user.dir");
  private String imageFile1 = dir + "/pictures/stars.jpg";
  private TexturePaint imagePaint1;

  BufferedImage image = ImageUtilities.getBufferedImage(imageFile1, this);*/

private BufferedImage skyColour;
private ImageIcon grass;

private JPanel panelToPaint;

/**
 *
 */
public SpectacleObject(){


    nightSky = new Rectangle2D.Double(0,0,1365,135);

       // imagePaint1 =  new TexturePaint(image, nightSky);
    darkBlue = new Color(160, 160,250);

    stand = new Rectangle2D.Double(0,135,1110,519);
    standColour = Color.darkGray;
    lightColor = Color.gray;

    font_title= new Font("Serif", Font.BOLD, 31);
    font_mem= new Font("Serif", Font.ITALIC, 21);
    title = "STADIUM   SPECTACLE   SIMULATION";
    mem1 = "Group Members: Syeda Sadia Mahfuz and Ying Ying Tiong";
    mem2="Project Supervisors: Dr. Braden Philips and Assoc. Prof Michael Liebelt";

    badgesInRandomTrace= new ArrayList<Badge>();

    ClassLoader cldr = this.getClass().getClassLoader();

java.net.URL imageURL   = cldr.getResource("stadiumspectacle/Images/starsx.jpg");
java.net.URL grassURL   = cldr.getResource("stadiumspectacle/Images/grass4.jpg");

        try {
            skyColour = ImageIO.read(imageURL);
            //grass = ImageIO.read(grassURL);
        } catch (IOException ex) {
            Logger.getLogger(SpectacleObject.class.getName()).log(Level.SEVERE, null, ex);
        }

grass = new ImageIcon(grassURL);
  // createBadges();
   // initialiseRFActivity();

    }

    @Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g2d = (Graphics2D)g;
   // g2d.draw(nightSky);
    //grass.paintIcon(panelToPaint, g2d, 1365, 50);
    //g2d.setColor(darkBlue);
    //g2d.fill(nightSky);
    g2d.drawImage(skyColour,0,0,1110,140,0, 0,skyColour.getWidth(null),skyColour.getHeight(null),null);
   // g2d.drawImage(grass,0,970,1365,500,0, 0,grass.getWidth(null),grass.getHeight(null),null);

    g2d.setColor(Color.black);
    g2d.setFont(font_title);
    g2d.setColor(Color.white);
    g2d.drawString(title, 285, 55);
    g2d.setFont(font_mem);
    g2d.drawString(mem1, 300, 95);
    g2d.drawString(mem2, 275, 119);
    g2d.draw(stand);
    g2d.setColor(standColour);
    g2d.fill(stand);

    if(b[0][0]!=null){
    for(int q=0; q<29; q ++){
        for(int w =0; w<55; w++){

  Ellipse2D.Double l = b[q][w].getLight();
  Color badgeColor = b[q][w].getLightColour();
   g2d.setColor(badgeColor);
    g2d.draw(l);
    g2d.fill(l);
        }
       

        }
    }
     
    }

    /**
     *
     */
    public void turnAllLightsOff(){
        g2d.setColor(Color.black);
        repaint();
    }

    //Ellipse2D.Double light1 = b1.getLight();
   


    /**
     *
     * @param colour
     */
    public void setLightColour(Color colour){
    lightColor = colour;
}

    /**
     *
     */
    public void allFlash(){
     repaint();
    
     /**lightColor = Color.black;
     repaint();*/

 }

 /**
  *
  * @param a
  * @return
  */
 public ArrayList<Badge> randomTrace(JTextArea a){
     //let b[0][0] be the PC node
     int loops =0;
    Badge master=b[0][0];
     while(loops<90){

     int number = master.openAuto(4);
     System.out.println("Creating auto");

     try{
     theConnectedSlaves = activity.createAuto(master, number,a);
     
     //boolean test = theConnectedSlaves.isEmpty();
     //System.out.println(test);
     }catch(NullPointerException e){
         System.out.println("NOOOOOOOOOOOOOO");

     }
     //System.out.println("Created Auto");
     //Random rnd = new Random(System.currentTimeMillis());
     int numSlaves = theConnectedSlaves.getAllSlaves().size();
     Random rnd = new Random();
     int chooseOne = Math.abs(rnd.nextInt(numSlaves));
     if(chooseOne==0)
            chooseOne =1;
     System.out.println(chooseOne);



//     System.out.println("Size is: "+ theConnectedSlaves.getAllSlaves().size());
     /*if(chooseOne==0){
         chooseOne=1;
     }*/
     System.out.println("Number of Slaves:" + theConnectedSlaves.numberSlaves());
     Badge nextMaster = theConnectedSlaves.getSlave(chooseOne);
     //System.out.println(nextMaster.toString());
     //nextMaster.setLightColour(Color.green);

    // boolean alreadyIncluded = false;
    /* for(int q=0; q<badgesInRandomTrace.size();q++){
            if(badgesInRandomTrace.get(q)==nextMaster){
                alreadyIncluded = true;
                break;
            }
     }
     if(alreadyIncluded){
         loops--;
     }
     else{*/
     badgesInRandomTrace.add(nextMaster);
     master=nextMaster;

     //}

     loops++;
     //alreadyIncluded = false;

     }

     return badgesInRandomTrace;

 }

 /**
  *
  * @param a
  * @return
  */
 public ArrayList<ArrayList<Badge>> fireworks(JTextArea a){

         int loops =0;
    Badge master=b[0][0];
     while(loops<90){

     int number = master.openAuto(75);
     System.out.println("Creating auto");

     try{
     theConnectedSlaves = activity.createAuto(master, number,a);

     //boolean test = theConnectedSlaves.isEmpty();
     //System.out.println(test);
     }catch(NullPointerException e){
         System.out.println("NOOOOOOOOOOOOOO");

     }
  
     try{
         System.out.println(theConnectedSlaves.isEmpty());
     badgesInFireworks.add(theConnectedSlaves.getAllSlaves());
     }catch(NullPointerException e){
         System.out.println("Problem adding list of slaves");
     }

     Random rnd = new Random();
     int chooseOne = Math.abs(rnd.nextInt(number));
          Badge nextMaster = theConnectedSlaves.getSlave(chooseOne);
     master=nextMaster;

     loops++;

 }
    return badgesInFireworks;
 }

 /**
  *
  * @param a
  * @param colour
  * @param durationOfFlash
  * @param numOfHops
  * @return
  */
 public ArrayList<ArrayList<Badge>> bloomPC(JTextArea a, Color colour, int durationOfFlash, int numOfHops){
     badgesInBloomPC.clear();

     int num = 0;
     while(num<7){
         PowerLevel level = PowerLevel.NEGTWENTY;
         switch(num){
             case 0: level = PowerLevel.NEGTWENTY; break;
             case 1: level = PowerLevel.NEGTEN; break;
             case 2: level = PowerLevel.NEGFIVE; break;
             case 3: level = PowerLevel.ZERO; break;
             case 4: level = PowerLevel.NEGFIVE; break;
             case 5: level = PowerLevel.NEGTEN; break;
             case 6: level = PowerLevel.NEGTWENTY; break;
             default: level = PowerLevel.NEGTWENTY;

         }

     activity.configurePC(null, level);
     System.out.println("Configured PC");
     ArrayList<Badge> currentBadges;
     //  ArrayList<Badge> nextSetOfBadges=new ArrayList<Badge>();

    Data message = pc.constructMessage(colour, durationOfFlash, 100, true, 0, pc.getLevel(), 0,numOfHops);
    theNetwork = activity.BroadcastPC(message);
    currentBadges = theNetwork.getNetworkOfSlaves();
    badgesInBloomPC.add(currentBadges);

    /*for(int i =0; i<currentBadges.size(); i++){
                   currentBadges.get(i).setAlreadyFlashed(true);

    }

   int hops = 0;
   System.out.println(message.getNoOfHopsLeft());
   while (hops<message.getNoOfHopsLeft()-1){
       System.out.println("Hop number: "+ hops);
       for(int i=0; i<currentBadges.size();i++){
           currentBadges.get(i).sendBroadcastData(message);
           currentBadges.get(i).setChannelTxPower(message.getPowerLevel());

          theNetwork =  activity.createBroadcastNetwork(currentBadges.get(i));
          ArrayList<Badge> currentSet = theNetwork.getNetworkOfSlaves();
          if(!currentSet.get(i).flashed())
              nextSetOfBadges.add(currentSet.get(i));
              }

          
       


badgesInBloomPC.add(nextSetOfBadges);
currentBadges = nextSetOfBadges;
nextSetOfBadges.clear();

       hops++;*/
num++;
     }
System.out.println(badgesInBloomPC.toString());
    return badgesInBloomPC;

 }

 /**
  *
  * @param a
  * @param colour
  * @param durationOfFlash
  * @param numOfHops
  * @return
  */
 public ArrayList<Badge> synchronousFlash(JTextArea a, Color colour, int durationOfFlash, int numOfHops){

     activity.configurePC(null, PowerLevel.ZERO);
     System.out.println("Configured PC");

     a.append("PC Node: Constructing message for Synchronous Flash\n");
    Data message = pc.constructMessage(colour, durationOfFlash, 0, true, 0, pc.getLevel(), numOfHops, 0);
 //   a.append("Message Parameters: \n durationOfFlash: " + durationOfFlash + "Retransmit Probability: " + 0 + "\nFlastFirst: " + true + "\nPower Level: 0dB \n Number of hops: " 0 );
    theNetwork = activity.BroadcastPC(message);

//    int size = theNetwork.sizeOfNetwork();
  //  System.out.println(size);
    badgesInSynchFlash = theNetwork.getNetworkOfSlaves();

    

     return badgesInSynchFlash;

 }
 /*public void setSynch(boolean b){
     this.synch=b;
 }*/

 /**
  *
  * @param a
  */
 public void createBadges(JTextArea a
         ){

     int i=0;
     int j=0;
     a.append ("Configuring PC node:\n");
      pc = new PCBadge();
      a.append("Assign Transmit Channel to the PC\n");
      pc.AssignChannel1(0, ChannelType.TRANSMIT);
      a.append("Set channel ID for the PC transmit channel\n");
      pc.setChannelID1(1, 0, 0, 0);
      a.append("Assign Transmit channel to PC\n");
      pc.openChannel(0);
      a.append("Open Transmit Channel of PC node\n");

     a.append("Configuring Badges nodes\n");
    //create the badges
    int x=15;
    int y=150;
    for(i=0; i<29; i ++){
        for(j =0; j<55; j++){
            this.b[i][j]= new Badge(x, y);
            b[i][j].AssignChannel1(0, ChannelType.TRANSMIT);
            b[i][j].AssignChannel2(1, ChannelType.RECEIVE);
            b[i][j].setChannelID1(0,0,0,0);
            b[i][j].setChannelID2(1,0,0,0);
            b[i][j].openChannel(1);

            x=x+12+5;
        }
         x=15;
        y=y+12+5;
    }

    //how many bagdes across and down - need to pass into RF activity
    this.length = i;
    this.height = j;
    int total=i*j;
    a.append("Assign Transmit channel to Badge nodes\n");
    a.append("Assign Receive Channel to Badge nodes\n");
    a.append("Opening Badge node Receive channels.....\n");
    a.append("Configuration Completed\n");
    a.append("Total of"+ total +" nodes in the network");
   repaint();


 }

 /**
  *
  */
 public void initialiseRFActivity(){
     this.activity = new RFActivity(pc, b,length,height);
 }



 /**
  *
  * @param area
  * @param currentColour
  * @param flashDuration
  * @param numHops
  * @return
  */
 public  ArrayList<ArrayList<Badge>> random_trace(JTextArea area, Color currentColour, int flashDuration, int numHops){
badgesInRandom.clear();
     //configure PC node to transmit at the lowest power level
     activity.configurePC(null, PowerLevel.NEGTWENTY);
     System.out.println("Configured PC" + pc.toString());

     System.out.println("Creating two arraylists of badges current and next");
     ArrayList<Badge> currentBadges;
     ArrayList<Badge> nextSetOfBadges=new ArrayList<Badge>();
    // ArrayList<Badge> badgesToPassOn = new ArrayList<Badge>();

    //construct the message for random trace
     area.append("PC constructing message\n");
    Data message = pc.constructMessage(currentColour, flashDuration, 15, true, 0, pc.getLevel(), 0,numHops);
    area.append("Current TaskID: " + message.getTaskID() +"\n");
    System.out.println("PC broadcasts the message and corresponding network stored as first set of badges");
    area.append("PC Broadcasting message\n");
    theNetwork = activity.BroadcastPC(message);
    //get the first set of badges from the pc node and add the set to badgesInRandom
    currentBadges = theNetwork.getNetworkOfSlaves();
    badgesInRandom.add(currentBadges);
boolean check =currentBadges == badgesInRandom.get(0);
    System.out.println("Check: Is first set of Badges added Correctly: " + check);
    System.out.println("PC Network Size: " + currentBadges.size());

    int temp=0;

    while(temp<numHops){
        area.append("Hop number: " + temp +"\n");
        System.out.println("Hop number: "+ temp +"\n");
                System.out.println("size current before for loop: "+ currentBadges.size());
      // nextSetOfBadges.clear();
ArrayList<Badge> tempList = new ArrayList<Badge>();
    //now generate random number in each badge and determine which badges should pass message on
        area.append("Badges to transmit message: \n");

for(int i=0; i<currentBadges.size(); i++){
        if(currentBadges.get(i).generateRandom() < message.getRetransmitProbability()){
            area.append(currentBadges.get(i).toString() +"\n");
                currentBadges.get(i).setChannelTxPower(message.getPowerLevel());
                currentBadges.get(i).openChannel(0);
                currentBadges.get(i).sendBroadcastData(message);
                theNetwork = activity.createBroadcastNetwork(currentBadges.get(i));
                tempList.addAll(theNetwork.getNetworkOfSlaves());

        }
    }
nextSetOfBadges= tempList;
        System.out.println("Size of next Set: " + nextSetOfBadges.size());
        if(nextSetOfBadges.size()==0)
            break;
        
        badgesInRandom.add(nextSetOfBadges);
       // currentBadges.clear();
        currentBadges = nextSetOfBadges;
                System.out.println("Size of new current Set: " + currentBadges.size());

        
temp++;

 }

    System.out.println(badgesInRandom.size());

        return badgesInRandom;

 }




 /**
  *
  * @param area
  * @param currentColour
  * @param flashDuration
  * @param numHops
  * @return
  */
 public  ArrayList<ArrayList<Badge>> bloom(JTextArea area, Color currentColour, int flashDuration, int numHops){
badgesInBloom.clear();
     //configure PC node to transmit at the lowest power level
     activity.configurePC(null, PowerLevel.NEGTWENTY);
     System.out.println("Configured PC" + pc.toString());

     System.out.println("Creating two arraylists of badges current and next");
     ArrayList<Badge> currentBadges;
     ArrayList<Badge> nextSetOfBadges=new ArrayList<Badge>();
    // ArrayList<Badge> badgesToPassOn = new ArrayList<Badge>();

    //construct the message for random trace
          area.append("PC constructing message\n");

    Data message = pc.constructMessage(currentColour, flashDuration, 100, true, 0, pc.getLevel(), 0,numHops);
    area.append("Current TaskID: " + message.getTaskID() +"\n");
    System.out.println("PC broadcasts the message and corresponding network stored as first set of badges");
    area.append("PC Broadcasting message\n");
    theNetwork = activity.BroadcastPC(message);
    //get the first set of badges from the pc node and add the set to badgesInRandom
    currentBadges = theNetwork.getNetworkOfSlaves();
    badgesInBloom.add(currentBadges);
boolean check =currentBadges == badgesInBloom.get(0);
    System.out.println("Check: Is first set of Badges added Correctly: " + check);
    System.out.println("PC Network Size: " + currentBadges.size());

    int temp=0;
    while(temp<numHops){
                area.append("Hop number: " + temp +"\n");

        System.out.println("Hop number: "+ temp);
                System.out.println("size current before for loop: "+ currentBadges.size());
      // nextSetOfBadges.clear();
ArrayList<Badge> tempList = new ArrayList<Badge>();
    //now generate random number in each badge and determine which badges should pass message on
    for(int i=0; i<currentBadges.size(); i++){
        if(currentBadges.get(i).generateRandom() < message.getRetransmitProbability()){
                currentBadges.get(i).setChannelTxPower(message.getPowerLevel());
                currentBadges.get(i).sendBroadcastData(message);
                theNetwork = activity.createBroadcastNetwork(currentBadges.get(i));
                tempList.addAll(theNetwork.getNetworkOfSlaves());

        }
    }
nextSetOfBadges= tempList;
        System.out.println("Size of next Set: " + nextSetOfBadges.size());
        if(nextSetOfBadges.size()==0)
            break;

        badgesInBloom.add(nextSetOfBadges);
       // currentBadges.clear();
        currentBadges = nextSetOfBadges;
                System.out.println("Size of new current Set: " + currentBadges.size());


temp++;

 }

   
System.out.println(badgesInBloom.size());

        return badgesInBloom;

    }

}


