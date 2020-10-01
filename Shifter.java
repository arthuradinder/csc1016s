
public class Shifter{
int key;
public Shifter(int initialKey){
this.key = initialKey;
}
public char encode(char ch){
 int encode_index = 0;
 char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

 for(int i=0; i<alphabet.length;i++){
     if(alphabet[i] == (ch)){
         encode_index=  (i+key)%26;
         key = (key+1)%26;
         break;
     }
 }
 return alphabet[encode_index];
}
public String encode(String target){
 char[] str=target.toCharArray();
 String encoded="";
 for(char s : str){
     char zz = encode(s);
     String ss = Character.toString(zz);
     encoded+=ss;
 }
 return encoded;
}

}