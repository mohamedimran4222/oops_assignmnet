package oops;
import java.util.Scanner;
public class CandidateEligibilty {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter candidate's date of birth (in the format MM/YYYY): ");
        String dob = input.nextLine();
        if (!isEligibleDOB(dob)) {
            System.out.println("Candidate is not eligible based on date of birth.");
            return;
        }
        
        System.out.print("Enter candidate's HSC exam cutoff marks in Physics, Chemistry, and Mathematics/Biology: ");
        double hscMarks = input.nextDouble();
        if (!isEligibleHSCMarks(hscMarks)) {
            System.out.println("Candidate is not eligible based on HSC exam marks.");
            return;
        }
        
        System.out.print("Enter candidate's average marks in PCM or PCB subjects: ");
        double pcmOrPcbMarks = input.nextDouble();
        System.out.print("Is the candidate from SC or ST category? (Y/N): ");
        String category = input.next();
        if (!isEligiblePCMorPCBMarks(pcmOrPcbMarks, category)) {
            System.out.println("Candidate is not eligible based on PCM or PCB marks.");
            return;
        }
        
        System.out.print("Enter candidate's CGPA in UG exam: ");
        double ugCgpa = input.nextDouble();
        if (!isEligibleUGCgpa(ugCgpa)) {
            System.out.println("Candidate is not eligible based on UG CGPA.");
            return;
        }
        
        System.out.print("Enter candidate's CGPA in PG exam: ");
        double pgCgpa = input.nextDouble();
        if (!isEligiblePGCgpa(pgCgpa)) {
            System.out.println("Candidate is not eligible based on PG CGPA.");
            return;
        }
        
        System.out.print("Enter the number of projects candidate has completed: ");
        int projectsCompleted = input.nextInt();
        if (!isEligibleProjects(projectsCompleted)) {
            System.out.println("Candidate is not eligible based on projects completed.");
            return;
        }
        
        System.out.print("Is the candidate a full-time student? (Y/N): ");
        String fullTime = input.next();
        if (!isEligibleFullTime(fullTime)) {
            System.out.println("Candidate is not eligible based on full-time study.");
            return;
        }
        
        System.out.print("Enter candidate's interview selection score: ");
        int interviewScore = input.nextInt();
        if (!isEligibleInterviewScore(interviewScore)) {
            System.out.println("Candidate is not eligible based on interview score.");
            return;
        }
        
        System.out.print("Is the candidate an Indian citizen? (Y/N): ");
        String indianCitizen = input.next();
        if (!isEligibleIndianCitizen(indianCitizen)) {
            System.out.println("Candidate is not eligible based on citizenship.");
            return;
        }
        
        System.out.println("Candidate is eligible for the recruitment process.");
    }
    
    private static boolean isEligibleDOB(String dob) {
        String[] dobArr = dob.split("/");
        int month = Integer.parseInt(dobArr[0]);
        int year = Integer.parseInt(dobArr[1]);
        return year > 1999 || (year == 1999 && month >= 7);
    }
    
    private static boolean isEligibleHSCMarks(double marks) {
        return marks >= 60;
    }
    private static boolean isEligiblePCMorPCBMarks(double marks, String category) {
        if (category.equalsIgnoreCase("Y")) {
            return marks >= 50;
        } else {
            return marks >= 60;
        }
    }

    private static boolean isEligibleUGCgpa(double cgpa) {
        return cgpa >= 8;
    }

    private static boolean isEligiblePGCgpa(double cgpa) {
        return cgpa >= 8;
    }

    private static boolean isEligibleProjects(int projectsCompleted) {
        return projectsCompleted >= 2;
    }

    private static boolean isEligibleFullTime(String fullTime) {
        return fullTime.equalsIgnoreCase("Y");
    }

    private static boolean isEligibleInterviewScore(int score) {
        return score >= 35;
    }

    private static boolean isEligibleIndianCitizen(String indianCitizen) {
        return indianCitizen.equalsIgnoreCase("Y");
    }

}
