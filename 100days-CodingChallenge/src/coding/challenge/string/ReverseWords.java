package coding.challenge.string;

public class ReverseWords {
public String revWords(String s) {
	String[] str = s.trim().split(" ");
	String ans = "";
	for(int i=str.length-1;i>0;i--) {
		ans+=str[i]+" ";
	}
	return ans+str[0];
}
}
