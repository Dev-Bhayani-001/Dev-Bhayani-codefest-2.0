import java.util.*;
//Dev Bhayani
public class European_Townships{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int tc = sc.nextInt();
while(tc>0){
    int house=sc.nextInt();
    int house_details[][]=new int[house][4];
    for(int i=0;i<house;i++)
    {
        
            /* house_details[i][j]=sc.nextInt(); */
            String a=sc.next();
            String arr[]=a.split(",");
            house_details[i][0]=Integer.parseInt(arr[0]);
            house_details[i][1]=Integer.parseInt(arr[1]);
            house_details[i][2]=Integer.parseInt(arr[2]);
            house_details[i][3]=Integer.parseInt(arr[3]);
            
    }
    double hourToPaintAccent=2.5;
    double hourToPaintRegular=3.25;
    double TotalHoursToPaintTownship=0;
    double TotalAccentQty=0;
    double TotalRegularQty=0;
    double totalWallsInHouse=0;
    for(int i=0;i<house;i++)
    {
        totalWallsInHouse=0;
        totalWallsInHouse+=house_details[i][1]*3;
        totalWallsInHouse+=house_details[i][2]*4;
        totalWallsInHouse+=house_details[i][3]*6;
        
        TotalHoursToPaintTownship=TotalHoursToPaintTownship+(totalWallsInHouse*1/3*2.5)+(totalWallsInHouse*2/3*3.25);
        TotalAccentQty+=(((totalWallsInHouse)*1/3*1.5));
        TotalRegularQty+=(((totalWallsInHouse)*2/3*2.25));
    }
    // System.out.println(totalWallsInHouse);
    // System.out.printf(TotalHoursToPaintTownship+","+" "+TotalAccentQty+","+" "+TotalRegularQty);
    System.out.print(String.format("%.2f",TotalHoursToPaintTownship )+", ");
    System.out.print(String.format("%.2f",TotalAccentQty )+", ");  
    System.out.print(String.format("%.2f",TotalRegularQty )); 
    System.out.println(); 

tc--;
}
sc.close();
}
}