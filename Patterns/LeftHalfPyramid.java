public class LeftHalfPyramid {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 4; j>i; j--){
                System.out.print("  ");
            }
            for(int k = 0; k <= i; k++){
            System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n \t* \n \t \b\b\b* * \n    * * * \n  * * * * \n* * * * *"); 
        


}
}
