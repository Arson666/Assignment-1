//Class: CMSC203 CRN 24307
//Program: Assignment #1
//Instructor: Ping-Wei Tsai
//Summary of Description: this progrm will step through some possible problems to restore internet connectivity
//Due Date: 09/12/2021
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.

import java.util.Scanner;

public class WiFiDiagnosis 
{
	public static void main(String[] args)
	{
		String answer;
		Scanner sc = new Scanner(System.in);	
			
		System.out.print("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\r\n");
		System.out.print("First step: reboot your computer\r\n"
				+ "Are you able to connect with the internet? (yes or no)\n");
		answer = sc.nextLine();
		
		if(answer.contains("yes"))
		{
			System.out.print("Rebooting your computer seemed to work\r\n");
		}
		else
		{
			System.out.print("Second step: reboot your router\r\n"
					+ "Now are you able to connect with the internet? (yes or no)\r\n");
			answer = sc.nextLine();
			
			if(answer.contains("yes"))
			{
				System.out.print("Rebooting your router seemed to work\r\n");
			}
			else
			{
				System.out.print("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\r\n"
						+ "Now are you able to connect with the internet? (yes or no)\r\n");
				answer = sc.nextLine();
				
				if(answer.contains("yes"))
				{
					System.out.print("Checking the router's cables seemed to work\r\n");
				}
				else
				{
					System.out.print("Fourth step: move your computer closer to your router\r\n"
							+ "Now are you able to connect with the internet? (yes or no)\r\n");
					answer = sc.nextLine();
					
					if(answer.contains("yes"))
					{
						System.out.print("Moving your computer closer to the router seemed to work\r\n");
					}
					else
					{
						System.out.print("Fifth step: contact your ISP\r\n"
								+ "Make sure your ISP is hooked up to your router.");
					}
				}
			}
		}
	}
}
