package studentgrades;

import java.util.Scanner;
// This class asks the user for their classes and the amount of minutes they spend in each course a week.
// It then also asks the user for their scores on homework,quizzes, and final exam score.
// It will then output the weighted average for each score along with the course name and average time spent.  
public class grades 
{
	String course1,class1,course2,class2,course3,class3,course4,class4,course5,class5;
	static Scanner allinput = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first course: ");
		String class1 = allinput.nextLine();
		
		System.out.print("How many minutes do you spend on this course a week?");
		int course1 = input.nextInt();
		
		System.out.print("Enter course: ");
		String class2 = allinput.nextLine();
		
		System.out.print("How many minutes do you spend on this course a week?");
		int course2 = input.nextInt();
		
		System.out.print("Enter course: ");
		String class3 = allinput.nextLine();
		
		System.out.print("How many minutes do you spend on this course a week?");
		int course3 = input.nextInt();
		
		System.out.print("Enter course: ");
		String class4 = allinput.nextLine();
		
		System.out.print("How many minutes do you spend on this course a week?");
		int course4 = input.nextInt();
		
		System.out.print("Enter course: ");
		String class5 = allinput.nextLine();
		
		System.out.print("How many minutes do you spend on this course a week?");
		int course5 = input.nextInt();
		
		System.out.print("What is your score on your 1st homework?");
		int Hw1 = input.nextInt();
		
		System.out.print("What is your score on your 2nd homework?");
		int Hw2 = input.nextInt();
		
		System.out.print("What is your score on your 3rd homework?");
		int Hw3 = input.nextInt();
		
		System.out.print("What is your score on your 4th homework?");
		int Hw4 = input.nextInt();
		
		System.out.print("What is your score on your 1st quiz?");
		int quiz1 = input.nextInt();
		
		System.out.print("What is your score on your 2nd quiz?");
		int quiz2 = input.nextInt();
		
		System.out.print("What is your score on your final exam?");
		int exam = input.nextInt();
		
		double sum = (Hw1 + Hw2 + Hw3 + Hw4) / 4;
		System.out.println("Your homework average is: " + sum );
		
		double sumq = (quiz1 + quiz2) / 2;
		System.out.println("Your quiz average is: " + sumq );
		
		System.out.println("Your final exam average is: " + exam );
		
		double average = (sum + sumq + exam) / 3;
		
		System.out.println("You take " + class1 + " for " + course1 + " minutes a week " );
		System.out.println("You take " + class2 + " for " + course2 + " minutes a week " );
		System.out.println("You take " + class3 + " for " + course3 + " minutes a week " );
		System.out.println("You take " + class4 + " for " + course4 + " minutes a week " );
		System.out.println("You take " + class5 + " for " + course5 + " minutes a week " );
		System.out.println("Your final score average is: " + average);
		System.out.println("Your overall grade  is: " + exam );
		
	
	}

}
