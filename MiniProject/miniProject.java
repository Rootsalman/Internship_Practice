
//  The management system should have the following features: - 
// Add a patient’s details to the system whenever there is a new patient admitted. 
// The patient details should include his/her Name, age, Gender, Aadhar Card number, contact number, city, address, date of admission, guardian's Name, guardian’s address, guardian’s contact number. Assign a unique id to each patient admitted. 
// Note: Validate user entered data. Such as 
// Number of digits in age is 1 or 2 digits. 
// Aadhar card number should contains 12 digits. 
// Contact number should contain 10 digits only. 
// The system can show the list of patients at any point of time. Basically, the system should be dynamic and a real time system. In other words, it can provide results at any point of time without any delays. Display proper error message if patients list is empty. 
// Given the unique id assigned to a patient, provide all the details of that patient. 
// In other words, the system should provide details about a patient using his/her unique id or Name. 
// The system can provide the list of all the patients from a particular city or a state. Also provide the list of patients belonging to a particular age group. For example, you can be asked to give the list of patients in the age group 50-60. Handle NullPointerException if user entered values are empty.  
// Mark the patient recovered when he starts working fine. 
// The system should be able to delete the information of a patient when asked to.  Handle NullPointerException if user entered patient id is not present in list. 
// Implement these features using efficient data structures, collections  and OOP concepts learnt in the Java Foundation course. Write clean and organized codes using proper objects and methods.
import java.util.Scanner;

public class miniProject {
  String patientName;
  int age;
  String gender;
  String addhar;
  String contact;
  String city;
  String address;
  String dateOfAdmission;
  String guardianName;
  String guardianAddress;
  String guardianContact;
  int id;
  boolean recovered;

  private static int totalPatients = 0;
  private static int numPatients = 0;
  private static int newPatients = 0;
  private static int patientCount = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    miniProject[] patients = new miniProject[100];

    while (true) {
      System.out.println("WELCOME TO AROGYA KENDRA");
      System.out.println("***************");
      System.out.println("Please choose the below option:");
      System.out.println("***************");
      System.out.println("1. Add patient");
      System.out.println("2. Show all patients");
      System.out.println("3. Show patient details by ID");
      System.out.println("4. Show patients by city");
      System.out.println("5. Show patients by age group");
      System.out.println("6. Mark patient as recovered");
      System.out.println("7. Exit");
      System.out.println("******************");
      System.out.println("Enter your choice");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter number of patients:");
          int numPatients = sc.nextInt();

          for (int i = 0; i < numPatients; i++) {
            patients[totalPatients] = new miniProject();
            patients[totalPatients].addPatient();
            totalPatients++;
          }

          System.out.println(numPatients + " patients added successfully.");
          break;

        case 2:
          System.out.println("Patient Details:");
          for (int i = 0; i < totalPatients; i++) {
            patients[i].displayPatient();
          }
          break;

        case 3:
          System.out.println("Patient Details are:");
          for (int i = 0; i < totalPatients; i++) {
            patients[i].ShowDetailsById();
          }
          break;
        case 4:
          System.out.println("Enter the city name:");
          for(int i=0; i< totalPatients;i++){
            patients[i].ShowDetailsByCity();
          }
          break;
        case 5:
          System.out.println("Enter the age group:");
          for(int i=0; i< totalPatients;i++){
            patients[i].ShowDetailsByageGroup();
          }
          break;
        case 6:
          System.out.println("Enter patient id to re recovered");
          for(int i=0; i< totalPatients;i++){
            patients[i].ShowRecoveredDetails();
          }
          break;
        case 7:
           System.out.println("Exiting program...");
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
        }
      }
    }
  

  public void addPatient() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter patient details:");
    System.out.print("Name: ");
    this.patientName = sc.nextLine();

    System.out.print("age: ");
    this.age = sc.nextInt();
        if (age < 1 || age > 99) {
          throw new IllegalArgumentException("Age should be between 1 and 99");
        }


    System.out.print("Gender: ");
    sc.nextLine();
    this.gender = sc.nextLine();

    System.out.print("Aadhar number: ");
    this.addhar = sc.nextLine();
    if (isValidAdhar(addhar)) {
      System.out.println("valid adhar number");
    } else {
      System.out.println("Invalid Addhar Number!!Enter the patient details again");
      return;
    }

    System.out.print("Contact number: ");
    this.contact = sc.nextLine();
    if (isValidMobile(contact)) {
      System.out.println("Valid mobile number");
    }else{
       System.out.println("Invalid Mobile Please Give correct mobile.Cannot add this user");
      return;
    }
    System.out.print("City: ");
    this.city = sc.nextLine();

    System.out.print("Address: ");
    this.address = sc.nextLine();

    System.out.print("Date of admission: ");
    this.dateOfAdmission = sc.nextLine();

    System.out.print("Guardian name: ");
    this.guardianName = sc.nextLine();

    System.out.print("Guardian address: ");
    this.guardianAddress = sc.nextLine();

    System.out.print("Guardian contact number: ");
    this.guardianContact = sc.nextLine();
     if (isValidMobile(contact)) {
      System.out.println("Valid mobile number");
    }else{
       System.out.println("Invalid Mobile Please Give correct mobile.Cannot add this user");
      return;
    }

    System.out.println("Random Patient Id");
    this.id = generateId();
    System.out.println("\n******next patient*****\n");
    this.recovered = false;
  }

  public void displayPatient() {
    System.out.println("----Patient Detail---");
    System.out.println("Patient ID: " + this.id);
    System.out.println("Name: " + this.patientName);
    System.out.println("age: " + this.age);
    System.out.println("Gender: " + this.gender);
    System.out.println("Aadhar number: " + this.addhar);
    System.out.println("Contact number: " + this.contact);
    System.out.println("City: " + this.city);
    System.out.println("Address: " + this.address);
    System.out.println("Date of admission: " + this.dateOfAdmission);
    System.out.println("Guardian name: " + this.guardianName);
    System.out.println("Guardian address:" + this.guardianAddress);
    System.out.println("Guardian Contact:" + this.guardianContact);

  }

  public void ShowDetailsById() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the patient ID :");
    int Id = sc.nextInt();
    if (id == Id) {
      System.out.println("The Patient details are:");
      System.out.println("****************");
      System.out.println("Patient ID: " + this.id);
      System.out.println("Name: " + this.patientName);
      System.out.println("age: " + this.age);
      System.out.println("Gender: " + this.gender);
      System.out.println("Aadhar number: " + this.addhar);
      System.out.println("Contact number: " + this.contact);
      System.out.println("City: " + this.city);
      System.out.println("Address: " + this.address);
      System.out.println("Date of admission: " + this.dateOfAdmission);
      System.out.println("Guardian name: " + this.guardianName);
      System.out.println("Guardian address:" + this.guardianAddress);
      System.out.println("Guardian Contact:" + this.guardianContact);
    } else {
      System.out.println("Data Not Found:");
    }
  }

   public void ShowDetailsByCity() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the patient CITY :");
    String City = sc.next();
    if (city.equals(City)) {
      System.out.println("The Patient details are:");
      System.out.println("****************");
      System.out.println("Patient ID: " + this.id);
      System.out.println("Name: " + this.patientName);
      System.out.println("age: " + this.age);
      System.out.println("Gender: " + this.gender);
      System.out.println("Aadhar number: " + this.addhar);
      System.out.println("Contact number: " + this.contact);
      System.out.println("City: " + this.city);
      System.out.println("Address: " + this.address);
      System.out.println("Date of admission: " + this.dateOfAdmission);
      System.out.println("Guardian name: " + this.guardianName);
      System.out.println("Guardian address:" + this.guardianAddress);
      System.out.println("Guardian Contact:" + this.guardianContact);
    } else {
      System.out.println("Data Not Found:");
    }
  }

  public void ShowDetailsByageGroup() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the start age :");
    int Age1 = sc.nextInt();
    System.out.println("Enter the End age :");
    int Age2 = sc.nextInt();
    if(age>=Age1 && age<=Age2) {
      System.out.println("The Patient details are:");
      System.out.println("****************");
      System.out.println("Patient ID: " + this.id);
      System.out.println("Name: " + this.patientName);
      System.out.println("age: " + this.age);
      System.out.println("Gender: " + this.gender);
      System.out.println("Aadhar number: " + this.addhar);
      System.out.println("Contact number: " + this.contact);
      System.out.println("City: " + this.city);
      System.out.println("Address: " + this.address);
      System.out.println("Date of admission: " + this.dateOfAdmission);
      System.out.println("Guardian name: " + this.guardianName);
      System.out.println("Guardian address:" + this.guardianAddress);
      System.out.println("Guardian Contact:" + this.guardianContact);
    } else {
      System.out.println("Data Not Found:");
      return;
    }
  }

  public void ShowRecoveredDetails() {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the patient id to recover:");
    int id1 = sc.nextInt();
     int index = -1;
        for (int i = 0; i < patientCount; i++) {
            if (id == id1) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Patient with ID " + id1 + " not found! Cannot delete.");
            return;
        }
      
      System.out.println("The Patient details are:");
      System.out.println("****************");
      System.out.println("Patient ID: " + this.id);
      System.out.println("Name: " + this.patientName);
      System.out.println("age: " + this.age);
      System.out.println("Gender: " + this.gender);
      // System.out.println("Aadhar number: " + this.addhar);
      // System.out.println("Contact number: " + this.contact);
      System.out.println("City: " + this.city);
      // System.out.println("Address: " + this.address);
      // System.out.println("Date of admission: " + this.dateOfAdmission);
      // System.out.println("Guardian name: " + this.guardianName);
      // System.out.println("Guardian address:" + this.guardianAddress);
      // System.out.println("Guardian Contact:" + this.guardianContact);
    } 

  public static boolean isValidAdhar(String addhar) {
    if (addhar.length() != 12) {
      return false;
    }
    for (int i = 0; i < addhar.length(); i++) {
      if (!Character.isDigit(addhar.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public static boolean isValidMobile(String contact) {
    if (contact.length() != 10) {
      return false;
    }
    for (int i = 0; i < contact.length(); i++) {
      if (!Character.isDigit(contact.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  private static int generateId() {
    return (int) (Math.random() * 10000);
  }

}