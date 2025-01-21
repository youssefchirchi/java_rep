import java.util.Scanner;

public class ZooManagement
{

    int nbrCages=20 ;
    String zooName= "my zoo";

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();


        System.out.println("my "+ zoo.zooName+" has "+zoo.nbrCages+" cages");

        System.out.println("donner le nom");
        String zooName1 = scanner.nextLine();

        do{
        System.out.println("donner le nombre");
        zoo.nbrCages = scanner.nextInt();
        }while(zoo.nbrCages<0);

        while(!scanner.hasNextInt()){
            System.out.println("donner le nombre");
            zoo.nbrCages = scanner.nextInt();
        }
        System.out.println("my "+ zooName1+" has "+zoo.nbrCages+" cages");
        scanner.close();
    }
}
