public class B_UpdateArrayVal {
    public static void main(String[] args) {
        int[] marks = {80, 75, 66};

        update(marks); // 

        // print updated marks
        for(int i=0; i< marks.length; i++){
            System.out.println(marks[i]);
        }
    }
    public static void update(int[] marks){
        for(int i =0; i< marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
}
