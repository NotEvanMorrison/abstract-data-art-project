/*
 * Represents a NFL team with a name and stadium capacity
 */
public class NFL {

  private String names;     /* name of the NFL team */
  private int stadiumCap;         /* how many seats the arena holds for attendees */

  /** Constructor */
  public NFL(String names, int stadiumCap) {
    this.names = names;
    this.stadiumCap = stadiumCap;
  }

  /* Accessor Method for names */
  public String getNames() {
    return names;
  }
  
  /* Accessor Method for the Stadium Capacity */
  public int getStadiumCap() {
    return stadiumCap;
  }
  
  /** toString Method override */
  public String toString() {
    return names + " (" + stadiumCap + " max occupants)";
  }
  
}