
/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int wybor;
    System.out.println("1-wprowadz nowego studenta");
    wybor = scan.nextInt();
    switch (wybor) {
      case 1:
  
        System.out.println("Podaj imię: ");
        String name = scan.next();
        System.out.println("Podaj wiek: ");
        int age = scan.nextInt();
        try {
          Service s = new Service();
          s.addStudent(new Student(name, age));

          var students = s.getStudents();
          for (Student current : students) {
            System.out.println(current.ToString());
          }
        } catch (IOException e) {

        }
    }
  }
}