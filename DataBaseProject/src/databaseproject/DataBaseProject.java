/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.util.*;
import java.lang.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Jakub Zarebski / M00507447
 */
public class DataBaseProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Scanner //
        Scanner input = new Scanner(System.in);
        //Array List implemtetion   //
         ArrayList<HeroCard> tab = new ArrayList<HeroCard>();
         try { File file = new File ("HeroCardFile.xml");
         DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            
            NodeList herolist = doc.getElementsByTagName("HeroCard");
            int totalHeroList = herolist.getLength();
            
            for (int x = 0 ; x <totalHeroList ; x++)
            {
                Node herocard1 = herolist.item(x) ;
               if(herocard1.getNodeType() == Node.ELEMENT_NODE)
               {        Element herocard1Element = (Element)herocard1 ;
                        NodeList TitleList = herocard1Element.getElementsByTagName("Title");
                        Element heroTitleElement = (Element)TitleList.item(0);
                        NodeList textTitleList = heroTitleElement.getChildNodes();
                        
                        NodeList NameList = herocard1Element.getElementsByTagName("Name");
                        Element heroNameElement = (Element)NameList.item(0);
                        NodeList textNameList = heroNameElement.getChildNodes();
                       
                        NodeList HeightList = herocard1Element.getElementsByTagName("Height");
                        Element heroHeightElement = (Element)HeightList.item(0);
                        NodeList textHeightList = heroHeightElement.getChildNodes();
                       
                        NodeList IntList = herocard1Element.getElementsByTagName("Intelligence");
                        Element heroIntElement = (Element)IntList.item(0);
                        NodeList textIntList = heroIntElement.getChildNodes();
                        
                        NodeList StrList = herocard1Element.getElementsByTagName("Strength");
                        Element heroStrElement = (Element)StrList.item(0);
                        NodeList textStrList = heroStrElement.getChildNodes();
                        
                        NodeList SpeedList = herocard1Element.getElementsByTagName("Speed");
                        Element heroSpeedElement = (Element)SpeedList.item(0);
                        NodeList textSpeedList = heroSpeedElement.getChildNodes();
                        
                        NodeList AgiList = herocard1Element.getElementsByTagName("Agility");
                        Element heroAgiElement = (Element)AgiList.item(0);
                        NodeList textAgiList = heroAgiElement.getChildNodes();
                        
                        NodeList SkillList = herocard1Element.getElementsByTagName("Skill");
                        Element heroSkillElement = (Element)SkillList.item(0);
                        NodeList textSkillList = heroSkillElement.getChildNodes();
                        
                        NodeList BackStoryList = herocard1Element.getElementsByTagName("BackStory");
                        Element heroBackStoryElement = (Element)BackStoryList.item(0);
                        NodeList textBackStoryList = heroBackStoryElement.getChildNodes();
                        
                        
                        int IntXML = Integer.parseInt(((Node)textIntList.item(0)).getNodeValue().trim());
                        int HeightXML = Integer.parseInt(((Node)textHeightList.item(0)).getNodeValue().trim());
                        int StrXML = Integer.parseInt(((Node)textStrList.item(0)).getNodeValue().trim());
                        int SpeedXML = Integer.parseInt(((Node)textSpeedList.item(0)).getNodeValue().trim());
                        int AgiXML = Integer.parseInt(((Node)textAgiList.item(0)).getNodeValue().trim());
                        int SkillXML = Integer.parseInt(((Node)textSkillList.item(0)).getNodeValue().trim());
                        
                        
                        tab.add(new HeroCard(((Node)textTitleList.item(0)).getNodeValue().trim() ,  ((Node)textNameList.item(0)).getNodeValue().trim() , 
                                 HeightXML , IntXML , StrXML ,SpeedXML , AgiXML ,SkillXML , 11 , ((Node)textBackStoryList.item(0)).getNodeValue().trim() ));
                        
                       
                   
                         
               }
            }
            


//   tab.add(new HeroCard(nodelist)) ;
           } catch (Exception e) {
            e.printStackTrace();
        }
      
        


         // Array filling //
        // tab.add (new HeroCard ("Title" , "Real Name" , Height (cm) , intelligence , Strenght , Speed , Agility , Fighting Skill , INDEX , "BackStory");
        tab.add(new HeroCard("Twoja Stara", "Twoja Stara", 0, 20, 9999, 9999, 9999, 90, 1, " "));
        tab.add(new HeroCard("Maciej Sweter", "Maciej Slowinski", 180, 10, 1, 1, 1, 10, 2, " "));
        tab.add(new HeroCard("Apocalypse", "En Sabah Nur", 213, 7, 7, 6, 6, 7, 3, " "));
        tab.add(new HeroCard("Black Panther", "T'Challa", 182, 5, 4, 4, 3, 6, 4, " "));
        tab.add(new HeroCard("Venom", "Eddie Brock", 190, 4, 5, 3, 5, 4, 5, " "));
        tab.add(new HeroCard("Thor", "Thor Odinson", 198, 2, 7, 6, 7, 6, 6, " "));
        tab.add(new HeroCard("Captain America", "Steve Rogers", 192, 4, 3, 3, 3, 6, 7, " "));
        tab.add(new HeroCard("Green Goblin", " Norman Osborn", 180, 6, 6, 5, 6, 3, 8, " "));
        tab.add(new HeroCard("Iron Man", " Anthony Stark ", 185, 6, 6, 5, 6, 3, 9, " "));
        tab.add(new HeroCard("Hulk", "Bruce Banner", 175, 6, 7, 6, 7, 5, 10, " "));
        
        
        

        /*  for (HeroCard HeroCard : tab)
         {
         System.out.println(HeroCard);
         }
         */
        int j = 0;
        int user = 0;
        int max = tab.size();
        //   System.out.println("- - - - - - - - - - - - - -");
        do {
            
            System.out.println("- - - - - - - - - - - - - -");
            System.out.println(tab.get(j));
            System.out.println("- - - - - - - - - - - - - -");
            System.out.println("Select number ");
            System.out.println("1 - Next Card ");
            System.out.println("2 - Previous Card ");
            System.out.println("3 - Search / Disable ");
            System.out.println("4 - Sort options ");
            System.out.println("5 - Last Card");
            System.out.println("6 - First Card");
            System.out.println("0 - Exit ");
            System.out.println("- - - - - - - - - - - - - -");
          //  System.out.println(max);

            user = input.nextInt();

            switch (user) {
                case 1: {
                    if (j == (max - 1)) {
                        System.out.println("There is no more Card");
                    } else {
                        j = j + 1;
                    }
                }

                break;

                case 2: {
                    if (j == 0) {
                        System.out.println("There is no more Card");
                    } else {
                        j = j - 1;
                    }
                }
                break;

                case 3: {
                    System.out.println(" Enter Number of Card you want to display. From 1 to " + max);
                    int user3 = input.nextInt() ;
                       
                    if (user3 > max || user3 < 0) {
                        System.out.println(" You enter number which is out of range. Try again ; D ");
                    } 
                    else{   
                        j = (user3 - 1);
                    }
                }
                break;

                case 4: { 
                    System.out.println(" 1 - By Title ");
                    System.out.println(" 2 - By Real Name ");
                    System.out.println(" 3 - By Height ");
                    System.out.println(" 4 - By Intelligence ");
                    System.out.println(" 5 - By Strength ");
                    System.out.println(" 6 - By Speed ");
                    System.out.println(" 7 - By Agility ");
                    System.out.println(" 8 - Fighting skills ");
                    System.out.println("0 - Exit ");
                    int user2 = input.nextInt();
                    switch (user2) {
                        case 1: {
                            Collections.sort(tab, new ComparatorTitle());
                        }
                        break;

                        case 2: {
                            Collections.sort(tab, new ComparatorName());
                        }
                        break;

                        case 3: {
                            Collections.sort(tab, new ComparatorHeight());

                        }
                        break;

                        case 4: {
                            Collections.sort(tab, new ComparatorInt());
                        }
                        break;

                        case 5: {
                            Collections.sort(tab, new ComparatorStrength());
                        }
                        break;

                        case 6: {

                            Collections.sort(tab, new ComparatorSpeed());

                        }
                        break;

                        case 7: {
                            Collections.sort(tab, new ComparatorAgility());
                        }
                        break;

                        case 8: {
                            Collections.sort(tab, new ComparatorSkill());
                        }
                        break;
                        
                        case 0 :  { System.out.println(" Goodbay World ; < ");
                        user = 0 ; 
                        }
                        break ; 
                            
                        default:
                            System.out.println(" Sorry, try diffrent number ");
                            
                       
                         
                    }
                }
                break;
                case 5: {
                    j = (max - 1);
                    // System.out.println("System.out.println(tab.get(j))");
                }
                break;

                case 6: {
                    j = 0;
                    //    System.out.println("System.out.println(tab.get(j))");
                }
                break;
                
                case 0 : { System.out.println(" Goodbay World ; < "); }
                break ; 
                    
                default:
                            System.out.println(" Sorry, try diffrent number ");

            }
        } while (user != 0);

    }
  
    static class HeroCard {

        String Name;
        String Title;
        int Height;
        int Skill;
        int Speed;
        int Intelligence;
        int Strength;
        int Agility;
        int Index;
        String BackStory;

        public HeroCard(String Title, String Name, int Height, int Intelligence, int Strength, int Speed, int Agility, int Skill, int Index, String BackStory) {
            this.Title = Title;
            this.Name = Name;
            this.Height = Height; 
            this.Intelligence = Intelligence;
            this.Strength = Strength;
            this.Speed = Speed;
            this.Agility = Agility;
            this.Skill = Skill;
            this.Index = Index;
            this.BackStory = BackStory;
        }

        @Override
        public String toString() {
            
            if (Height == 0 )
                {return "Title " + Title + "\n" + "Real Name " + Name + "\n" + "Height " + " n/a " + "\n" + "Intelligence " + Intelligence + "\n" + "Strength " + Strength + "\n"
                    + "Speed " + Speed + "\n" + "Agility " + Agility + "\n" + "Fighting Skill " + Skill + "\n" + "Back Story " + BackStory + "\n"; }
            
            return "Title " + Title + "\n" + "Real Name " + Name + "\n" + "Height " + Height + "\n" + "Intelligence " + Intelligence + "\n" + "Strength " + Strength + "\n"
                    + "Speed " + Speed + "\n" + "Agility " + Agility + "\n" + "Fighting Skill " + Skill + "\n" + "Back Story " + BackStory + "\n";

        }

        public String getTitle() {
            return Title;

        }

        public String getName() {
            return Name;

        }

        public int getInt() {
            return Intelligence;

        }

        public int getStrength() {
            return Strength;

        }

        public int getSpeed() {
            return Speed;

        }

        public int getAgility() {
            return Agility;

        }

        public int getSkill() {
            return Skill;

        }

        public int getHeight() {
            return Height;

        }

    }

    static class ComparatorHeight implements Comparator<HeroCard> {

        @Override

        public int compare(HeroCard h1, HeroCard h2) {
            if (h1.getHeight() < h2.getHeight()) {
                return 1;
            } else if (h1.getHeight() > h2.getHeight()) {
                return -1;
            }
            return 0;

        }

    }

    static class ComparatorInt implements Comparator<HeroCard> {

        @Override

        public int compare(HeroCard h1, HeroCard h2) {
            if (h1.getInt() < h2.getInt()) {
                return 1;
            } else if (h1.getInt() > h2.getInt()) {
                return -1;
            }
            return 0;

        }

    }

    static class ComparatorStrength implements Comparator<HeroCard> {

        @Override

        public int compare(HeroCard h1, HeroCard h2) {
            if (h1.getStrength() < h2.getStrength()) {
                return 1;
            } else if (h1.getStrength() > h2.getStrength()) {
                return -1;
            }
            return 0;

        }

    }

    static class ComparatorSpeed implements Comparator<HeroCard> {

        @Override
        public int compare(HeroCard h1, HeroCard h2) {
            if (h1.getSpeed() < h2.getSpeed()) {
                return 1;
            } else if (h1.getSpeed() > h2.getSpeed()) {
                return -1;
            }
            return 0;

        }

    }

    static class ComparatorAgility implements Comparator<HeroCard> {

        @Override

        public int compare(HeroCard h1, HeroCard h2) {
            if (h1.getAgility() < h2.getAgility()) {
                return 1;
            } else if (h1.getAgility() > h2.getAgility()) {
                return -1;
            }
            return 0;

        }

    }

    static class ComparatorSkill implements Comparator<HeroCard> {

        @Override

        public int compare(HeroCard h1, HeroCard h2) {
            if (h1.getSkill() < h2.getSkill()) {
                return 1;
            } else if (h1.getSkill() > h2.getSkill()) {
                return -1;
            }
            return 0;

        }

    }

    static class ComparatorTitle implements Comparator<HeroCard> {

        @Override
        public int compare(HeroCard h1, HeroCard h2) {
            return h2.getTitle().compareTo(h1.getTitle());

        }

    }

    static class ComparatorName implements Comparator<HeroCard> {

        @Override
        public int compare(HeroCard h1, HeroCard h2) {
            return h2.getName().compareTo(h1.getName());

        }

    }

}
