package switchcaselecture;

import java.util.Scanner;

public class TypeOfWebsiteUsingSwitch {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the URL");
		String url= sc.nextLine();
		String protocol= url.substring(0, url.indexOf(":"));
        // https://www.google.com

        String temp = url.substring(url.indexOf("www.") + 4);
        String domain = temp.substring(0, temp.indexOf("."));
        String extension = temp.substring(temp.indexOf(".") + 1);
       
        switch (protocol) {
            case "http": System.out.println("Protocol : Hyper Text Transfer Protocol");
                break;
            case "https":System.out.println("Protocol : Hyper Text Transfer Protocol Secure");
                break;
            case "ftp":System.out.println("Protocol : File Transfer Protocol");
                break;
            default:System.out.println("Unknown Protocol");
        }
        
        switch (domain) {
            case "google":System.out.println("Domain   : Search Engine");
                break;
            case "amazon":System.out.println("Domain   : Shopping Website");
                break;
            case "youtube":System.out.println("Domain   : Video Platform");
                break;
            default:System.out.println("Unknown Domain");
        }

           switch (extension) {
            case "com":System.out.println("Extension: Commercial");
                break;
            case "org":System.out.println("Extension: Organization");
                break;
            case "in":System.out.println("Extension: India");
                break;
            default:System.out.println("Unknown Extension");
        }		
	}
}
