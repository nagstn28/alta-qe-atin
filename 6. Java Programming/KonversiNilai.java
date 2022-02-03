package Data;

public class KonversiNilai {
    public static void main(String[] args) {
        int studentScore = 80;

        if (studentScore >= 80 && studentScore <=100){
            System.out.println("Grade A");
        }
        else if (studentScore >= 65 && studentScore < 80){
            System.out.println("Grade B+");
        }
        else if (studentScore >= 50 && studentScore < 65){
            System.out.println("Grade B");
        }
        else if (studentScore >= 35 && studentScore < 50){
            System.out.println("Grade C");
        }
        else if (studentScore >= 0 && studentScore < 35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("SALAH");
        }
    }
}
