import java.util.Scanner;

class HarryEx1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the Student : ");
        String str = sc.nextLine();

        System.out.print("Mathematics Marks : ");
        byte m = sc.nextByte();
        
        System.out.print("English Marks : ");
        byte e = sc.nextByte();
        
        System.out.print("Physics Marks : ");
        byte p = sc.nextByte();
        
        System.out.print("Chemistry Marks : ");
        byte c = sc.nextByte();
        
        System.out.print("Computer Marks : ");
        byte cpp = sc.nextByte();

        int sum = (m + e + p + c + cpp);

        float percentage = (0.2f * (sum));

        System.out.print("Percentage of " + str + " is " + percentage);


        
        

    }

}