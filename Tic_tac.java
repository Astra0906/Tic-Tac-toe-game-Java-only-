import java.util.*;

public class Tic_tac {
    
   public static void view(char arr[][])
{  System.out.println("\f");
   for(int i=0;i<3;i++)
   {
       for(int j=0;j<3;j++)
       {
           System.out.print(arr[i][j]+" ");
       }
       System.out.print("\n");
   } 
   System.out.println("\n");
}

public static int logic(int arr[][],int count)
{
 int res=0,rtn=0;
 if(count%2==0){res=12;}
 else{res=3;}
 for(int i=0;i<3;i++)
 {      if((arr[0][0]+arr[1][1]+arr[2][2])==res){rtn=1;break;}
      if((arr[0][2]+arr[1][1]+arr[2][0])==res){rtn=1;break;}
     if((arr[i][0]+arr[i][1]+arr[i][2])==res){rtn=1;break;}
      if((arr[0][i]+arr[1][i]+arr[2][i])==res){rtn=1;break;}
    
 }
 if(rtn==1 && (count%2)==0){
     rtn=2; } 
     else if(count==8 && rtn==0)
     {rtn=-1;
     res=2;
        for(int i=0;i<3;i++)
 {      if((arr[0][0]+arr[1][1]+arr[2][2])==res){rtn=0;break;}
      if((arr[0][2]+arr[1][1]+arr[2][0])==res){rtn=0;break;}
     if((arr[i][0]+arr[i][1]+arr[i][2])==res){rtn=0;break;}
      if((arr[0][i]+arr[1][i]+arr[2][i])==res){rtn=0;break;}
    
 } 
         
     }
else if( count==9 && rtn==0){rtn=-1;
      }  
 return rtn;  
  }  
  
  public static void tic_tac(String u_1,String u_2){
       Scanner sc=new Scanner(System.in);
System.out.println(":::::::::::::::GAME STARTS HERE, ENJOY !:::::::::::::::::::::");
char arr[][]=new char[3][3];
int game[][]=new int[3][3];
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        arr[i][j]='_';
        game[i][j]=0;
        
    }
   
    
}
view(arr);

int c=1,x,y;
for(int i=1;;i++){
    int inpt=i%2;
    x=sc.nextInt();
    y=sc.nextInt();
    
   if(inpt==1){
       arr[x-1][y-1]='X';
       game[x-1][y-1]=1;
       System.out.print("\n");
   }
    else{
       arr[x-1][y-1]='O';
       game[x-1][y-1]=4; 
    }
  
   view(arr);
   System.out.print("\n");
   int pass=logic(game,i);
   if(pass==1){
       System.out.println(u_1+" wins..");
       break;}
   else if(pass==2){
       System.out.println(u_2+"wins..");
       break;}
       if(pass==-1){
       System.out.println("It's a Funckin Draw....!");
       break;}

 }


  }

    public static void main(String[] args) {
      Scanner sc1=new Scanner(System.in);
      System.out.println(":::::::::::WELCOME TO TIC-TAC-TOE GAME::::::::::::::::::::::");
      System.out.print("\n");
      System.out.println("####  RULES  #####");
      System.out.println("--First user gets  X sign .");
      System.out.println("--you have to give your input in as 3x3 matrix coordinate.");
      System.out.println("--REMEMBER THE NAME ASRAFUL !");
      System.out.print("\n");
      System.out.print("User 1 name: ");
      String u_1=sc1.next();
      System.out.print("User 2 name: ");
      String u_2=sc1.next();

    tic_tac(u_1,u_2);

while(1==1){
System.out.println("Do You Want to Play again?(y/n)");
char c =sc1.next().charAt(0);
if(c=='y'){tic_tac(u_1,u_2);}
else{break;}

}

}

}