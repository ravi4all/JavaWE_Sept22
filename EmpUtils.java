public class EmpUtils {
    String formatName(String name) {
        String nameArr[] = name.split(" ");
        //["ram","kumar","sharma"]
        String fullName = "";
        for(String n : nameArr) {
            char firstChar = n.charAt(0);
            String firstCharUpper = String.valueOf(firstChar).toUpperCase();
            String remainingString = n.substring(1).toLowerCase();
            fullName = fullName + firstCharUpper + remainingString + " ";
            
        }
        return fullName;
    }
}
