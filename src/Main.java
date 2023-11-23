public class Main {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] line = new String[text.length()];
        char[] arr = text.toCharArray();
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            while (Character.isDigit(arr[i])){
//
                line[counter] = String.valueOf(arr[i]);
                i++;
                if(!Character.isDigit(arr[i])){
                    counter ++;
                }
            }


        }
        System.out.println(text);
        for(int i = 0; i < arr.length; i++){
            System.out.println(line[i]);
        }
        
    }
}
