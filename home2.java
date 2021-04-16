package home2;

public class home2 {
    public static void main (String [] args) {
        String[][] spt = new String[][]
                {{"1", "2", "3", "4"},
                        {"2", "2", "2", "2"},
                        {"3", "3", "3", "3"},
                        {"4", "4", "4", "4"}
                };
        try {
            try {
                int result = method(spt);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива привышен!");
            }
        } catch (MyArrayDataExceprion e) {
            System.out.println("Не верное значение массива!");
            System.out.println("Ошибка в :");
        }
    }

    private static int method(String[][] spt) throws MyArrayDataExceprion, MyArraySizeException {
        int count = 0;
        if (spt.length!=4) {
            throw new MyArraySizeException();
    }
        for (int i=0; i< spt.length; i++){
            if (spt[i].length!=4){
                throw new MyArraySizeException();
            }
for (int j=0; j< spt.length; j++){
    try {
        count = count + Integer.parseInt(spt[i][j]);
    }
    catch (NumberFormatException e){
        throw new MyArrayDataExceprion( i, j);

    }
}

}
        return count;
    }


}
