
class Patient {

    String patientName;
    int age;
    int daysAdmitted;
    double dailyCharge;

    Patient(String patientName, int age, int daysAdmitted, double dailyCharge) {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    double calculateTotalBill() {
        double totalBill = daysAdmitted * dailyCharge;

        if (daysAdmitted > 7) {
            totalBill = totalBill - (totalBill * 0.10);
        }

        return totalBill;
    }
    
    void displayDetails() {
        System.out.println("Patient Name  : " + patientName);
        System.out.println("Age           : " + age);
        System.out.println("Days Admitted : " + daysAdmitted);
        System.out.println("Daily Charge  : Rs. " + dailyCharge);
        System.out.println("Total Bill    : Rs. " + calculateTotalBill());
        if (daysAdmitted > 7) {
            System.out.println("(10% discount applied because days admitted > 7)");
        }
        System.out.println("-------------------------------");
    }
}

public class HospitalTest {

    public static void main(String[] args) {

        Patient patient1 = new Patient("Ram Sharma", 35, 5, 1500.0);

        Patient patient2 = new Patient("Sita Thapa", 60, 10, 2000.0);

        System.out.println("========== Patient 1 ==========");
        patient1.displayDetails();

        System.out.println("========== Patient 2 ==========");
        patient2.displayDetails();
    }
}