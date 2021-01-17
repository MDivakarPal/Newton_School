import twodarray.TwoDArray;
class Test
{
    public static void main(String[] args) {
        int arr[][]=TwoDArray.input2DArray("Enter size of  your first matrix","Enter your first matrix ");
        int arr1[][]=TwoDArray.input2DArray("Enter size of your Second matrix","Enter your second Matrix");
        TwoDArray.traverseTwoD(arr,"Your first matrix is");
        TwoDArray.traverseTwoD(arr1,"Your second matrix is");
    }
}