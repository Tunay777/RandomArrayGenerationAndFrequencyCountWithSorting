public class Main {
    public static void main(String[] args) {
        int [] randomArray=new int[15];
        for (int i=0;i<randomArray.length;i++){
            randomArray[i]=(int)(Math.random()*10);
        }
        System.out.print("Random Array: [");
        for(int i=0;i<randomArray.length;i++){
            System.out.print(randomArray[i]);
            if (i==14)
                break;
            System.out.print(", ");
        }
        System.out.println("]");
        int [] count=new int[10];
        for (int i=0;i<10;i++){
            for(int j=0;j< randomArray.length;j++){
                if(i==randomArray[j])
                    count[i]++;
            }
        }
        for (int i=0;i<count.length;i++){
            System.out.print("Count for "+i+": ");
            System.out.println(count[i]);
        }
        System.out.print("Sorted Array: [");
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                System.out.print(i);
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}