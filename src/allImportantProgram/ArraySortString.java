package allImportantProgram;

public class ArraySortString {

	public static void main(String[] args) {
        String str = "bAcD";
        System.out.println(sortIgnoreCase(str));
        
    }
    public static  char[] sortIgnoreCase(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Character.toLowerCase(arr[i]) > Character.toLowerCase(arr[j])) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //it will return array
        return arr;
    }
}
