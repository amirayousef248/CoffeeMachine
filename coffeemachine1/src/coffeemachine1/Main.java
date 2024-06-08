package coffeemachine1;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.activity.ActivityRequiredException;

public class Main{

    static int minwatercapacity,minbeanscapacity,mincupscapacity,singleespressowater,doubleespressowater,singleamericanowater,doubleamericanowater,singlecoffe, doublecoffe,maxwtcapacity;
    public static void main(String[] args) throws IOException {
       
//        File logfile = new File("log.txt");
//        FileWriter fileWriter= null;
        
        //System.out.println(fileWriter.toString());
      
        File file1 = new File("coffemachine.txt");
        //String[] logger = new String[200];
            try{
                Scanner read = new Scanner(file1);
                String str1 = read.nextLine();
                String[] str2 = str1.split(",");
                minwatercapacity = Integer.valueOf(str2[0]);
                minbeanscapacity = Integer.valueOf(str2[1]);
                mincupscapacity = Integer.valueOf(str2[2]);
                singleespressowater = Integer.valueOf(str2[3]);
                doubleespressowater = Integer.valueOf(str2[4]);
                singleamericanowater = Integer.valueOf(str2[5]);
                doubleamericanowater = Integer.valueOf(str2[6]);
                singlecoffe = Integer.valueOf(str2[7]);
                doublecoffe = Integer.valueOf(str2[8]);
                maxwtcapacity = Integer.valueOf(str2[9]);
            }catch(Exception ex){
                System.out.println("File does not exist");
                return;
            }
        
        
        coffeeMachine cm1 = new coffeeMachine();
        wastTray wt1 = new wastTray();
        wt1.setCapacity(0);
        cm1.setWtray(wt1);
        beansContener bean = new beansContener();
        cm1.setBeans(bean);
        Scanner scan = new Scanner(System.in);
        int p,beans,grind,wtconf;
        double calories, caffiene;
        int i = 0;
       while(true){
            if(cm1.getwatercapacity() >= minwatercapacity)
              if(cm1.getBeans().getCapacity() >= minbeanscapacity)
                  if(cm1.getCups() >= mincupscapacity){
                      File logfile = new File("log.txt");
                      FileWriter fileWriter= null;
                   try{
            fileWriter= new FileWriter("log.txt",true);
        }
        catch(IOException EX){
            System.out.println("File does not exist");
        }
                   System.out.println("Welcome to our coffee machine, Please select the preferred beans type \n1 Arabica\n2 Robusta\n");
                   beans = scan.nextInt();
                   while(beans != 1 && beans != 2){
                     System.out.println("Wrong choice, Please select the preferred beans type \n1 Arabica\n2 Robusta\n");
                      beans = scan.nextInt();
                   } 
                   System.out.println("How do you like your coffe grind? \n1 Soft \n2 Hard\n");
                     grind = scan.nextInt();
                     while(grind != 1 && grind != 2){
                         System.out.println("Wrong choice, please select \n1 Soft\n2 Hard");
                         grind = scan.nextInt();
                     }
                   System.out.println("Please select \n1 for Espresso \n2 for Americano\n0 to Exit\n");
                   p = scan.nextInt();
                   while(p != 1 && p != 2 && p != 0){
                       //throw new Exception("wrong chiose");}
                      System.out.println("Wrong choice, Please select \n1 for Espresso \n2 for Americano\n0 to Exit");
                      p = scan.nextInt();
                   }
                switch(p) {
                  case 1:
                      int singordoub;
                      System.out.println("How would you like your coffe? \n1 Single\n2 Double\n");
                      singordoub = scan.nextInt();
                      while(singordoub != 1 && singordoub != 2){
                          System.out.println("Wrnog choice, \nplease select \n1 Single\n2 Double\n");
                          singordoub = scan.nextInt();
                      }
                
                     if(singordoub == 1){
                         //Single espresso
                         cm1.setwatercapacity(cm1.getwatercapacity()-singleespressowater);
                         cm1.setbeanscap(cm1.getbeanscap()-singlecoffe);
                         cm1.setCups(cm1.getCups()-1);
                         cm1.getWtray().setCapacity(cm1.getWtray().getCapacity()+1);
                         if(cm1.getWtray().getCapacity() >= maxwtcapacity){
                             System.out.println("Your wast tray is full please confirm cleaning it by clicking on any number\n");
                             wtconf = scan.nextInt();
                         }
                         calories = 100;
                         caffiene = 200;
                         fileWriter.write("New single espresso has been served\n");
                         fileWriter.close();
                         //logger[i] = "New single espresso has been served";
                         //i++;
                     }else{
                         //double espresso
                         cm1.setwatercapacity(cm1.getwatercapacity()-doubleespressowater);
                         cm1.setbeanscap(cm1.getbeanscap()-doublecoffe);
                         cm1.setCups(cm1.getCups()-1);
                         cm1.getWtray().setCapacity(cm1.getWtray().getCapacity()+1);
                         if(cm1.getWtray().getCapacity() >= maxwtcapacity){
                             System.out.println("Your wast tray is full please confirm cleaning it by clicking on any number\n");
                             wtconf = scan.nextInt();
                         }
                         calories = 100;
                         caffiene = 200;
                         fileWriter.write("New double espresso has been served\n");
                         fileWriter.close();
                         //logger[i] = "New double espresso has been served";
                         //i++;
                     }
                    System.out.printf("Your Espresso containing %.2f calories & %.2f caffiene is in process, Please wait :) \n",caffiene,calories);
                    System.out.printf("Remaining water is %d ml\nRemaining beans is %d g\n",cm1.getwatercapacity(),cm1.getBeans().getCapacity());
                  break;
                  case 2:
                      int singordoubl;
                      System.out.println("How would you like your coffe? \n1 Single\n2 Double\n");
                      singordoubl = scan.nextInt();
                      while(singordoubl != 1 && singordoubl != 2){
                          
                         // System.out.println("Wrnog choice, \nplease select \n1 Single\n2 Double\n");
                          singordoubl = scan.nextInt();
                      }
          
                   if(singordoubl == 1){
                         //Single espresso
                         cm1.setwatercapacity(cm1.getwatercapacity()-singleamericanowater);
                         cm1.setbeanscap(cm1.getbeanscap()-singlecoffe);
                         cm1.setCups(cm1.getCups()-1);
                         cm1.getWtray().setCapacity(cm1.getWtray().getCapacity()+1);
                         if(cm1.getWtray().getCapacity() >= maxwtcapacity){
                             System.out.println("Your wast tray is full please confirm cleaning it by clicking on any number\n");
                             wtconf = scan.nextInt();
                         }
                         calories = 100;
                         caffiene = 200;
                         fileWriter.write("New single americano has been served\n");
                         fileWriter.close();
                        // logger[i] = "New single americano has been served";
                         //i++;
                     }else{
                         //double espresso
                         cm1.setwatercapacity(cm1.getwatercapacity()-doubleamericanowater);
                         cm1.setbeanscap(cm1.getbeanscap()-doublecoffe);
                         cm1.setCups(cm1.getCups()-1);
                         cm1.getWtray().setCapacity(cm1.getWtray().getCapacity()+1);
                         if(cm1.getWtray().getCapacity() >= maxwtcapacity){
                             System.out.println("Your wast tray is full please confirm cleaning it by clicking on any number\n");
                             wtconf = scan.nextInt();
                             cm1.getWtray().setCapacity(0);
                             System.out.println(cm1.getWtray().getCapacity());
                         }
                         calories = 100;
                         caffiene = 200;
                          fileWriter.write("New double americano has been served\n");
                         fileWriter.close();
                         //logger[i] = "New double americano has been served";
                         //i++;
                     }
                   System.out.printf("Your Americano containing %.2f calories & %.2f caffiene is in process, Please wait :) \n",caffiene,calories);
                   System.out.printf("Remaining water is %d ml\nRemaining beans is %d g\n",cm1.getwatercapacity(),cm1.getBeans().getCapacity());
                  break;
                   
                 case 0: return ;
                }
            }else{
                      //throw new ActivityRequiredException("There are no cups added, please refill the cups\n");
                     System.out.println("There are no cups added, please refill the cups\n");
                    break;
                  }
                  else{
                   throw new ActivityRequiredException("There are no beans added, please refill the machine with beans\n");
                         // System.out.println("There are no beans added, please refill the machine with beans\n");
                          //break;
              }
            else{
                 throw new ActivityRequiredException("There are no water added, please refill the machine with water\n");
               // System.out.println("There are no water added, please refill the machine with water\n");
               // break;
            }
//            int f = 0;
//            while(logger[f]!= null){
//                 System.out.println(logger[f]);
//                 f++;
//            }
//            System.out.println("\n");
}
    }}
    