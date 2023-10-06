package DZ;

public class program2 {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
	    String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(answer(QUERY, PARAMS));
    }


   
    static String answer(String QUERY, String PARAMS){
        PARAMS = PARAMS.replace(":", "='");
        PARAMS = PARAMS.replace(",", "' AND");
        StringBuilder stringBuilder = new StringBuilder();
        char[] ch_line = PARAMS.toCharArray();
        stringBuilder= stringBuilder.append(QUERY);
        
        for (int i = 1; i < ch_line.length-1; i++){
            if ( ch_line[i] != '\"'){
                stringBuilder.append(ch_line[i]);
             }
            
        }
        stringBuilder.delete(stringBuilder.length()-14, stringBuilder.length());
        return stringBuilder.toString();
    }
}
