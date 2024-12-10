import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
    
    /*Instantiate a DataScene object to play in the Theater */
   String[] namesArray = FileReader.toStringArray("names.txt");
   int[] stadiumCapArray = FileReader.toIntArray("stadiumCap.txt");

    /* instantiation */
   DataScene scene = new DataScene(namesArray, stadiumCapArray);
    
    /* Call any methods to diplay */
    scene.drawScene();
    
    // Play the DataScene in the theater
    Theater.playScenes(scene);
    
  }
}