import java.util.*;

//Dev Bhayani op in the chat 
public class a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]website=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                website[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(website[i][0]>website[j][0])
                {
                    int temp=website[i][0];
                    website[i][0]=website[j][0];
                    website[j][0]=temp;
                    temp=website[i][1];
                    website[i][1]=website[j][1];
                    website[j][1]=temp;
                    temp=website[i][2];
                    website[i][2]=website[j][2];
                    website[j][2]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(website[i][0]==website[j][0]&&website[i][1]>website[j][1])
                {
                    int temp=website[i][0];
                    website[i][0]=website[j][0];
                    website[j][0]=temp;
                    temp=website[i][1];
                    website[i][1]=website[j][1];
                    website[j][1]=temp;
                    temp=website[i][2];
                    website[i][2]=website[j][2];
                    website[j][2]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(website[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}