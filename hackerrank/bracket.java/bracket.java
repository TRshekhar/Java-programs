import java.util.*;
class bracket{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            int x=0;
            String arr[] = new String[input.length()];
            for(int i=0; i<input.length(); i++){
                arr[i] = String.valueOf(input.charAt(i));
            }
            int l = input.length();

            for (int i = 0; i<(input.length()/2); i++) {
                switch (arr[i]) {
                    case "{" -> {
                        if (arr[l-i].equals("}")) {
                            break;
                        } else {
                            x++;
                        }
                    }
                    case "(" -> {
                        if (arr[l-i].equals(")")) {
                            break;
                        } else {
                            x++;
                        }
                    }
                    case "[" -> {
                        if (arr[l-i].equals("]")) {
                            break;
                        } else {
                            x++;
                        }
                    }
                    default -> {
                    }
                }
            }
            if(x==0){
                System.out.println("true");
            }
        }
        
    }
}
