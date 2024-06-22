

public class Char {
    public static void main(String args[]){

        String s = "aaabbbb";


        int[] holder_n = new int[1];
        holder_n[0]=0;
        char[] holder_c =  new char[1];

        for(int b = 0; b<s.length(); b++ )
        {
            int in_cnt=1;
            for(int i =1; i<s.length(); i++)
            {
                if(s.charAt(b) == s.charAt(i)) {

                    if(in_cnt>holder_n[0]){
                        holder_n[0]=in_cnt;
                        holder_c[0]=s.charAt(b);
                    }
                    in_cnt++;

                } else if (s.charAt(b) != s.charAt(i)) {



                    in_cnt=1;

                }

            }

        }
        if (holder_n[0] >1){
            System.out.print(holder_c[0]+ " repeated ");

            System.out.println(holder_n[0] + " times in a row. ");
        }else  {
            System.out.println("There is no repeating char in a row.");

        }

    }
}


