import org.code.theater.*;
import org.code.media.*;

/*
 * Represents a Scene to be played in the Theater using data from data set
 */
public class DataScene extends Scene {

  private NFL[] teams;      /*1D array of NFL objects*/

  /* Constructor*/
  public DataScene(String[] names, int[] stadiumCap) {
    teams = createNFL(names, stadiumCap);
  }

  /* Returns a 1D array of NFL objects using the txt files in this project */
  public NFL[] createNFL(String[] names, int[] stadiumCaps) {
    NFL[] teamsArray = new NFL[names.length];
    for (int i = 0; i < teamsArray.length; i++) {
      teamsArray[i] = new NFL(names[i],stadiumCaps[i]);
    }
    return teamsArray;
  }

  /* Top-level method to draw the animation */
  public void drawScene() {
    for(int i = 0; i<teams.length; i++){
      clear("white");    
      NFL n = teams[i];
  /* Draw Background method which displays image of team logo */
    drawBackground(n.getNames());
    setTextStyle(Font.MONO,FontStyle.BOLD);
      /*Name and the stadium cap from my data set*/ 
    drawText("Team Name: "+n.getNames(),10,250);
    drawText("Max Stadium Occupancy: "+n.getStadiumCap()+"",10,300);
      /*Next info snap sound*/ 
      playSound("snap.wav");
      pause(1.0);
    }
  }

  
  /* Draw Background method which displays image of team logo */
  public void drawBackground(String name){
  /* Cycles between logo */
    if (name.equals("Buffalo Bills")) {
      drawImage("bills.png", 10, 50, 200);
    }  else if (name.equals("Miami Dolphins")) {
      drawImage("dolphins.png", 10, 50, 200);
    }   else if (name.equals("New England Patriots")) {
      drawImage("patriots.png", 10, 50, 200);   
    }  else if (name.equals("New York Jets")) {
      drawImage("jets.png", 10, 50, 200);
    }   else if (name.equals("Baltimore Ravens")) {
      drawImage("ravens.png", 10, 50, 200);   
    }  else if (name.equals("Cincinnati Bengals")) {
      drawImage("bengals.png", 10, 50, 200);
    }   else if (name.equals("Cleveland Browns")) {
      drawImage("browns.png", 10, 50, 200);   
    }  else if (name.equals("Pittsburgh Steelers")) {
      drawImage("steelers.png", 10, 50, 200);
    }   else if (name.equals("Houston Texans")) {
      drawImage("texans.png", 10, 50, 200);    
    }  else if (name.equals("Indianapolis Colts")) {
      drawImage("colts.png", 10, 50, 200);
    }   else if (name.equals("Jacksonville Jaguars")) {
      drawImage("jaguars.png", 10, 50, 200);   
    }  else if (name.equals("Tennessee Titans")) {
      drawImage("titans.png", 10, 50, 200);
    }   else if (name.equals("Denver Broncos")) {
      drawImage("broncos.png", 10, 50, 200);   
    }  else if (name.equals("Kansas City Chiefs")) {
      drawImage("chiefs.png", 10, 50, 200);
    }   else if (name.equals("Las Vegas Raiders")) {
      drawImage("raiders.png", 10, 50, 200);   
    }  else if (name.equals("Los Angeles Chargers")) {
      drawImage("chargers.png", 10, 50, 200);
    }   else if (name.equals("Dallas Cowboys")) {
      drawImage("cowboys.png", 10, 50, 200);    
    }  else if (name.equals("New York Giants")) {
      drawImage("giants.png", 10, 50, 200);
    }   else if (name.equals("Philadelphia Eagles")) {
      drawImage("eagles.png", 10, 50, 200);   
    }  else if (name.equals("Washington Commanders")) {
      drawImage("commanders.png", 10, 50, 200);
    }   else if (name.equals("Chicago Bears")) {
      drawImage("bears.png", 10, 50, 200);   
    }  else if (name.equals("Detroit Lions")) {
      drawImage("lions.png", 10, 50, 200);
    }   else if (name.equals("Green Bay Packers")) {
      drawImage("packers.png", 10, 50, 200);   
    }  else if (name.equals("Minnesota Vikings")) {
      drawImage("vikings.png", 10, 50, 200);
    }   else if (name.equals("Atlanta Falcons")) {
      drawImage("falcons.png", 10, 50, 200);    
    }  else if (name.equals("Carolina Panthers")) {
      drawImage("panthers.png", 10, 50, 200);
    }   else if (name.equals("New Orleans Saints")) {
      drawImage("saints.png", 10, 50, 200);   
    }  else if (name.equals("Tampa Bay Buccaneers")) {
      drawImage("buccaneers.png", 10, 50, 200);
    }   else if (name.equals("Arizona Cardinals")) {
      drawImage("cardinals.png", 10, 50, 200);   
    }  else if (name.equals("Los Angeles Rams")) {
      drawImage("rams.png", 10, 50, 200);
    }   else if (name.equals("San Francisco 49ers")) {
      drawImage("49ers.png", 10, 50, 200);   
    }  else if (name.equals("Seattle Seahawks")) {
      drawImage("seahawks.png", 10, 50, 200);
    } 
}

}