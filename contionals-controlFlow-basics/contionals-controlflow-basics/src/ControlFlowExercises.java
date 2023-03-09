public class ControlFlowExercises {
  public static void main(String[] args) {
    int month = 11;
    String weekDay = "Tuesday";
    int value = 129192;
    getMonth(month);
    getWeekDay(weekDay);
    getMessage(value);
  }

  public static void getMonth (int month) {
    boolean isVacationTime = month == 0 || month == 6 || month == 11;

    if (month == 1) {
      System.out.println("February");
      return;
    }

    if (month == 2) {
      System.out.println("March");
      return;
    }

    if (month == 3) {
      System.out.println("April");
      return;
    }

    if (month == 4) {
      System.out.println("May");
      return;
    }

    if (month == 5) {
      System.out.println("Jun");
      return;
    }

    if (month == 7) {
      System.out.println("August");
      return;
    }

    if (month == 8) {
      System.out.println("September");
      return;
    }

    if (month == 9) {
      System.out.println("October");
      return;
    }

    if (month == 10) {
      System.out.println("November");
      return;
    }

    if (isVacationTime) {
      System.out.println("Vacation!");
      return; 
    }
  }

  public static void getWeekDay (String weekDay) {
    switch (weekDay) {
      case "Sunday":
        System.out.println(1);
        break;
      case "Monday":
        System.out.println(2);
        break;
      case "Tuesday":
        System.out.println(3);
        break;
      case "Wednesday":
        System.out.println(4);
        break;
      case "Thursday":
        System.out.println(5);
        break;
      case "Friday":
        System.out.println(6);
        break;
      case "Saturday":
        System.out.println(7);
        break;
    }
  }

  public static void getMessage (int value) {
    switch (value) {
      case 1:
      case 2:
      case 3:
        System.out.println("Correct.");
        break;
      case 4:
        System.out.println("Wrong.");
        break;
      case 5:
        System.out.println("Perhaps.");
        break;
      default:
        System.out.println("Undefined value.");
    }
  }
}
