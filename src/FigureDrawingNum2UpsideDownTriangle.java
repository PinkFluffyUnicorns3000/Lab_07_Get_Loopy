public class FigureDrawingNum2UpsideDownTriangle {
    public static void main(String[] args){
        for(int columns = 5; columns >= 0; columns--){
            System.out.println(" ");
            for(int rows = 0; rows <= columns; rows++){
                System.out.print("*");
            }
        }
    }
}
