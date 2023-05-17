public class Student {

  private String Name;
  private int Age;
  private String Secondname;
  private String DataUrodzenia;
  public Student(String name,String secondname,String dataUrodzenia, int age) {
    Name = name;
    Age = age;
    Secondname = secondname;
    DataUrodzenia = dataUrodzenia;
 
  }

  public String GetName() {return Name;}
 public String GetSecondname() {return Secondname;} 
  public int GetAge() {return Age;}
  public String GetDataUrodzenia(){return DataUrodzenia;}

  public String ToString() {
    return Name + " " + Secondname + " " +  DataUrodzenia + " " +Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", "sss","ssa", -1);
    return new Student(data[0],data[1], data[2], Integer.parseInt(data[3]));
  }
}