package com.wcram.intro_to_java;
import java.util.ArrayList;
import java.util.Scanner;


 public class Main
 {public static void main (String[] args)
{
Player p1 = new Player("Stinky Peterson", 69);
Player p2 = new Player("Whoflung DeDung", 77);
Player p3 = new Player("Tronald Dump", 45);
Player p4 = new Player("Yomamma",  34);
Player p5 = new Player("Elon Musk", 56);

ArrayList <Player>Players = new ArrayList();
{
Players.add(p1);
Players.add(p2);
Players.add(p3);
Players.add(p4);
Players.add(p5);
}
System.out.println(Players);
Displayall();
System.out.println("Players with odd numbers");
DisplayOdd();
Scanner uletter = new Scanner(System.in);
String userletter = uletter.nextline();
System.out.println("Please enter a letter");
FindLetter();
Scanner newPlayer = new Scanner(System.in);

System.out.println("Please enter a name and a number");
Scanner Playname = new Scanner(System.in);
String pname = Playname.nextLine();
int pnumber = Playname.nextLine();
AddPlayer(pname, pnumber);

}




public static void Displayall(){ 
for (int i = 0; i< Players.size(); i++)
{System.out.println(Players.get(i));}
}


public static void DisplayOdd()
{
for(int n : Playlist)
{ if (Players.number % 2 == 0)
  {System.out.println(Players.get(Players.name, Players.Number));}
 
}
}
public string FindLetter(char userletter)

 {
   p = players.Name;
     for (String p : Players)
    {p.ToCharArray;}
      for (char l : p)
        {if (l = userletter)
         System.out.println(p + "Starts with " + userletter);
        }
    }

     public string AddPlayer (string pname, int pnumber)
     {  
       Player newPlayer = new Player();
       newPlayer.name = pname;
       newPlayer.number = pnumber;
       Players.add(newPlayer);

     }

}

