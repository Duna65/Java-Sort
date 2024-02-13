public class Test8 {
    public static void main(String[] args) {
        //Made by Dallin Lyman
        //sorts an array and counts the amount of swaps made
        int [] n = {4,3,6,8,3,2,5,67,8,23,2,3,16,5,1,79};
        boolean sort = false;
        int sorts = 0;
        System.out.print("unsorted: ");
        //This prints the unsorted array
        for(int i3 = 0;;i3++){
            if (i3 == n.length){
                break;
            }
            System.out.print(n[i3]);
            System.out.print(",");
        }
        //this sorts the array and counts up the swaps made
        while (sort == false){
            sort = true;
            for (int i = 0;i < n.length - 1;i++){
                if (n[i]>n[i+1]){
                    int i2 = n[i];
                    n[i]=n [i+1];
                    n[i+1]= i2;
                    sorts++;
                    sort = false;
                }
            }
        }
        //This prints the amount of swaps made
        System.out.println();
        System.out.print("sorts: ");
        System.out.println(sorts);
        System.out.print("sorted: ");
        //this prints the array that is sorted
        for (int i4 = 0;sort == true;i4++){ 
            if (i4 == n.length){
                break;
            }
            System.out.print(n[i4]);
            System.out.print(",");
        }
    }
    }


