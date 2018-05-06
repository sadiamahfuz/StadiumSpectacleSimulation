/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stadiumspectacle;

import antInterface.*;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author syedasm
 */
public class RFActivity {
    
    //list of badges that are in the stadium
    private Badge[][] badges;
    int length;
    int height;
    ArrayList<Badge> slaves;
    AutoSharedSlave slavesInChannel;
    PCBadge pc;


    Data currentMessage;
    PowerLevel level;
   // JTextArea text;

    Data currentData;


    /**
     *
     * @param pc
     * @param badges
     * @param length
     * @param height
     */
    public RFActivity(PCBadge pc , Badge[][] badges, int length, int height){
        this.badges = badges;
        this.length=length;
        this.height=height;
        this.pc=pc;
       // this.text=text;
        //slaves =null;
        //slavesInChannel=null;

    }


    /**
     *
     * @param b
     * @param x
     * @param a
     * @return
     */
    public AutoSharedSlave createAuto(Badge b, int x, JTextArea a){

       // a.append("Wow entered method");
        slavesInChannel=new AutoSharedSlave(b);
        int[] start_node = b.getLocation();
      // a.append("Starting at x = " +start_node[0] +" and y = " + start_node[1]+"and let's seee what happens if i keep going and going");
        int max_dist = (int)Math.sqrt(x);
        System.out.println("max_dist: " + max_dist);

        //Badge[][] badgeForChannel=new Badge[max_dist][max_dist];

        int starting_x =start_node[0];
        if(start_node[0]-max_dist/2<=0){
            starting_x=0;
        }
        else if(start_node[0]+max_dist/2>=height)
            starting_x = start_node[0]-max_dist;
        else
           starting_x=start_node[0]-(max_dist/2);

        int starting_y =0;
        System.out.println(start_node[1]+max_dist/2);
        if(start_node[1]-max_dist/2<=0){
            starting_y=0;
        }
        else if(start_node[1]+max_dist/2>=length){

            starting_y = start_node[1]-max_dist;
        System.out.println("Using second y case");
        }
        else{
            starting_y=start_node[1]-(max_dist/2);
                    System.out.println("Using third y case");

        }

        if(starting_x<0)
            starting_x=0;
        if(starting_y<0)
            starting_y=0;

         System.out.println("Starting x: " + starting_x);
            System.out.println("Starting y: " + starting_y);

        int ending_x=0;
        int ending_y=0;

        if(max_dist+starting_y>28){
            ending_y=28;
        System.out.println("Ending y "+ ending_y);

        }
        else
            ending_y = max_dist+starting_y;

         if(max_dist+starting_x>54)
            ending_x=54;
        else
            ending_x = max_dist+starting_x;

        System.out.println("Ending_x: " +ending_x);

       boolean doLoop = max_dist>22;
       System.out.println("doLoop "+ doLoop);
        while(doLoop){
            System.out.println("Into loop ");
            if(ending_x<height-1){
                ending_x++;
            System.out.print(ending_x+"\t");
            }
            if(ending_x==height-1)
                doLoop=false;

                        System.out.print(ending_x+"\t");

        }

        System.out.println("Ending_x: " +ending_x);
        System.out.println("Ending_y: " +ending_y);


            //int q=0;
            //int w=0;
           // int address =1;
            int count=0;

           

        for(int i=starting_y; i<=ending_y;i++){
            for(int j=starting_x; j<=ending_x; j++){

                //System.out.println("Going to add now");
                try{
                   // System.out.println(badges[i][j].toString());

                slavesInChannel.addSlave(badges[i][j]);
                System.out.println("Added: ["+i+"] ["+j+"]");
                count++;
                }catch(NullPointerException e){
                   System.out.println("Problem here");
                }
             
            }

        }

           return slavesInChannel;


    }

    /**
     *
     * @param b
     * @return
     */
    public BroadcastNetwork createBroadcastNetwork(Badge b){
        System.out.println("Creating Broadcast Network for : " + b.toString());
        //set radius of broadcast range by power Level

        //clear the current Network
       //network.clearNetwork();
        int radius =0;
        BroadcastNetwork badgeNetwork = new BroadcastNetwork();
        PowerLevel level = b.getLevel();

        switch(level.powerLevel()){

            case 0: radius =3; break;
            case 1:radius = 5; break;
            case 2: radius = 15; break;
            case 3: radius = 30; break;
            default: radius =0;

        }


        int[] masterPosition = b.getLocation();

       int starting_x = masterPosition[0]-radius;
       int starting_y = masterPosition[1]-radius;
       int ending_x = masterPosition[0]+radius;
       int ending_y = masterPosition[1]+radius;

        if(ending_x>54){
            ending_x = 54;
        }

        if(ending_y>28){
            ending_y = 28;
        }

        if(starting_x<0){
           // int temp1 = Math.abs(starting_x);
            starting_x=0;
         //  ending_x = ending_x+(radius-temp1);
        }

       if (starting_y<0){
          // int temp2 = Math.abs(starting_y);
            starting_y=0;
          //  ending_y = ending_y+(radius-temp2);
       }

       System.out.println("Starting at x=" + starting_x + " and y="+ starting_y);
       System.out.println("ending at x=" + ending_x + " and y="+ ending_y);
int count=0;
          for(int i=starting_y; i<=ending_y;i++){
            for(int j=starting_x; j<=ending_x; j++){

               // System.out.println("Let's try adding");
                //System.out.println("Going to add now");
                try{
                   // System.out.println(badges[i][j].toString());

                                // System.out.println("Trying to Add: ["+i+"] ["+j+"]");



                                // System.out.println(badges[i][j].toString());
                    int x_dist = Math.abs(i-masterPosition[1]);
                    int y_dist = Math.abs(j-masterPosition[0]);
                    int dist = (int)Math.sqrt(Math.pow(x_dist,2)+Math.pow(y_dist, 2));

                   if(dist<=radius){
                       if(badges[i][j].getTaskID()!=b.getTaskID()){
                badgeNetwork.addSlave(badges[i][j]);
                badges[i][j].setTaskID(b.getTaskID());
                                count++;
                                              System.out.println("Added: ["+i+"] ["+j+"]");
                       //}


                  }
                             // System.out.println(badgeNetwork.getNetworkOfSlaves().toString());


                }

                }catch(NullPointerException e){
//                            System.out.println(network.isEmpty());

                  //  System.out.println("Problem here");
                }

            }

        }
        System.out.println("Size should be " + count);
        return badgeNetwork;
    }

    /**
     *
     * @param data
     * @return
     */
    public BroadcastNetwork BroadcastPC(Data data){
//clearID();
            BroadcastNetwork network = new BroadcastNetwork();

        //System.out.println("Entered method");
        currentData = data;
           int radius =0;

        PowerLevel level = currentData.getPowerLevel();
        int position_x = 27;
        int position_y = 13;

        switch(level.powerLevel()){

            case 0: radius =3; break;
            case 1:radius = 5; break;
            case 2: radius = 15; break;
            case 3: radius = 30; break;
            default: radius =0;

        }

        System.out.println("Radius: " + radius);

       int  starting_x=position_x - radius ;
        int starting_y=position_y - radius;

        if(starting_x<0)
            starting_x =0;

        if(starting_y <0)
            starting_y=0;

        int ending_x = position_x +radius;
        if(ending_x>54){
            ending_x = 54;
        }
System.out.println("ending_x" + ending_x);
        int ending_y=position_y + radius;
        if(ending_y>28){
            ending_y = 28;
        }

        System.out.println("ending_y" + ending_y);

         for(int i=starting_y; i<=ending_y;i++){
            for(int j=starting_x; j<=ending_x; j++){

               // System.out.println("Let's try adding");
                //System.out.println("Going to add now");
                try{
                   // System.out.println(badges[i][j].toString());

                                //System.out.println("Trying to Add: ["+i+"] ["+j+"]");



                                // System.out.println(badges[i][j].toString());

                  //  if(dist<=radius){
                    if(radius==30){
                network.addSlave(badges[i][j]);
                       badges[i][j].setTaskID(data.getTaskID());
                    }

                   else{

                    int dist = (int)Math.sqrt(Math.pow(i-position_y,2)+Math.pow(j-position_x, 2));

                   if(dist<=radius){
                network.addSlave(badges[i][j]);
                       badges[i][j].setTaskID(data.getTaskID());


                    }
                    }
                   // }
               // System.out.println("Added: ["+i+"] ["+j+"]");
                //count++;
                }catch(NullPointerException e){
//                            System.out.println(network.isEmpty());

                  //  System.out.println("Problem here");
                }

            }

        }

        System.out.println(network.toString());

        return network;

    }

    /**
     *
     * @param data
     * @param level
     */
    public void configurePC(Data data, PowerLevel level){
        pc.setChannelTxPower(level);
        pc.setData(data);
    }

    private void clearID(){
        for(int i =0; i<badges.length; i++){
            for(int j=0; j<badges[i].length; j++){
                badges[i][j].setTaskID(0);
            }
        }
    }



}
