public class Main {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей 10";
        String[] line = new String[4];
        char[] arr = text.toCharArray();
        int counter = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            while (Character.isDigit(arr[i])){
                if(line[counter] == null){
                    line[counter] = "";
                }
//
                line[counter] = line[counter] + (String.valueOf(arr[i]));
                i++;
                if(!Character.isDigit(arr[i])){
                    counter ++;
                }
            }
        }
        System.out.println(text);
        for(int i = 0; i < line.length; i++){
            if(line[i] != null){
                sum += Integer.parseInt(line[i]);
            }
        }
        System.out.println(sum);
        System.out.println(arr.length);
        
    }
}
