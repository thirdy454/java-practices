package group3;
import java.io.*;

public class thirdy
{
public static void main(String args[]) throws Exception
{
String Record[][] ={{"001","Richard","Pasig","25"},
 {"002","Meanne","Malabon","30"},
 {"003","Arlene","Manda","20"},
 {"004","Noli","Pasig","50"},
 {"005","Val","Makati","40"}};
int i,j;
String sChoice;
char cChoice;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("MENU\n");
System.out.println("V - view record");
System.out.println("S - search record");
System.out.print("\nEnter your choice: ");
sChoice = br.readLine();
cChoice = sChoice.charAt(0);
switch(cChoice)
{
case 'V':

case 'v':
System.out.println("\nID\tName\tAddress\tAge");
for(j=0; j<Record.length; j++)
{
for(i=0; i<4; i++)
{
System.out.print(Record[j][i] + "\t");
}
System.out.println();
}break;
case 'S':
case 's':
System.out.print("Enter id #: ");
sChoice = br.readLine();
for(i=0; i<Record.length; i++)
{
if(Record[i][0].equals(sChoice))
{
System.out.println("\nID\tName\tAddress\tAge");
for(j=0; j<4; j++)
{
System.out.print(Record[i][j] + "\t");
}
System.out.println();
System.exit(0);
}
}
System.out.println("id not found...");break;
default: System.out.println("Invalid input");
}
System.out.println();
}
}
