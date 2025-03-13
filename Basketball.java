import java.util.ArrayList;
import java.util.Scanner;

public class Basketball {

  // Instance Variables
  private ArrayList<String> pointGuard;
  private ArrayList<String> shootingGuard;
  private ArrayList<String> smallForward;
  private ArrayList<String> powerForward;
  private ArrayList<String> center;

  // Constructor
  public Basketball() {
    createAnswersList();
  }

  public void createAnswersList() {
    ArrayList<String> lines = FileReader.toStringList("answers.txt");

    for (int i = 0; i < lines.size(); i++) {
      String line = lines.get(i);
      String[] arr = line.split(", ");

      ArrayList<String> list = new ArrayList<String>();

      for (int j = 0; j < arr.length; j++) {
        list.add(arr[j]);
      }

      if (i == 0) {
        pointGuard = list;
      } else if (i == 1) {
        shootingGuard = list;
      } else if (i == 2) {
        smallForward = list;
      } else if (i == 3) {
        powerForward = list;
      } else if (i == 4) {
        center = list;
      }

    }
  }

  public boolean isInList(String userInput, ArrayList<String> list) {
    // 1. Traverse the ArrayList called list
for (int i = 0; i < list.size(); i++) {
  String currentElement = list.get(i);
  if (currentElement.equals(userInput)){
    return true;
  }
}
return false;
  }


  public void prompt(){
    Scanner input = new Scanner(System.in);

    System.out.println("Who is your favorite basketball player?");
    String userInput = input.nextLine();

    if (isInList(userInput, pointGuard)) {
     System.out.println("You seem like the person to play: " + pointGuard.get(0));
    } else if (isInList(userInput, shootingGuard)) {
        System.out.println("You seem like the person to play: " + shootingGuard.get(0));
    }
    else if (isInList(userInput, smallForward)){
        System.out.println("You seem like the person to play: " + smallForward.get(0));
    }
    else if (isInList(userInput, powerForward)){
        System.out.println("You seem like the person to play: " + powerForward.get(0));
    }
    else if (isInList(userInput, center)){
        System.out.println("You seem like the person to play: " + center.get(0));
    }
    
    input.close();
  }

  // Test Method
  public void test() {
    System.out.println(center);
  }
  
}