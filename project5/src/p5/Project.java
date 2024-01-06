package p5;

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner t=new Scanner(System.in);
		System.out.println("Introduceti o fraza: ");
		String sir1=t.nextLine();
		StringBuilder sn1 = new StringBuilder();
		sn1.append(Character.toUpperCase(sir1.charAt(0)));
		for(int i=1;i<sir1.length()-1;i++)
		{
			char c1=sir1.charAt(i);
			char c2=sir1.charAt(i+1);
			if(c1==' ')
			{
				sn1.append(c1);
				c2 = Character.toUpperCase(c2);
				sn1.append(c2);
				i++;
			}
			else
				sn1.append(c1);
		}
		sn1.append(sir1.charAt(sir1.length()-1));
		System.out.println(sn1);
		
		System.out.print("Grupurile de 2 litere identice sunt: ");
		for(int i=0;i<sir1.length()-1;i++)
		{
			char c1=sir1.charAt(i);
			char c2=sir1.charAt(i+1);
			if(c1==c2)
			{
				System.out.print(c1);
				System.out.print(c2+";");
			}
		}

		StringBuilder sn2 = new StringBuilder();
		for(int i=0;i<sn1.length();i++)
		{
			char cc=sn1.charAt(i);
			if(cc!='a' && cc!='e' && cc!='i' && cc!='o' && cc!='u' && cc!='A' && cc!='E' && cc!='I' && cc!='O' && cc!='U'  && cc!=' ')
				cc=':';
			sn2.append(cc);
		}
		System.out.println("\n"+sn2);	
	}
	
	
	}

