public class Main {

    public static void main(String[] args) {
        // Метод количество символов в строке
        String string = "hillel";
        char ch = 'l';
        System.out.println(findSymbolOccurrence(string, ch));

        //Метод является ли подстрока частью строки
        String source = "sometimes";
        String target = "time";
        System.out.println(findWordPosition(source, target));

        //Метод реверс строки
        String string1 = "programming";
        System.out.println(stringReverse(string1));

        //Метод полиндром
        String string2 = "level";
        System.out.println(isPalindrome(string2));
    }

    public static int findSymbolOccurrence(String string, char ch) {
        int charCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                charCount++;
            }
        } return charCount;
    }

        public static int findWordPosition (String source, String target){
            if (source.contains(target)) {
                char c = target.charAt(0);
                return source.indexOf(c);
            }
            return -1;
        }

        public static StringBuilder stringReverse (String string){
            return new StringBuilder(string).reverse();
        }

        public static boolean isPalindrome (String string){
            StringBuilder newString = new StringBuilder(string).reverse();
            return string.equalsIgnoreCase(String.valueOf(newString));
        }
    }