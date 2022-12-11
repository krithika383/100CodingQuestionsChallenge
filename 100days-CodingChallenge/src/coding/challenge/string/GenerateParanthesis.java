package coding.challenge.string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
public List<String> generateParan(int n){
	List<String> list = new ArrayList<String>();
	backtrack(list,new StringBuilder(),0,0,n);
	return list;
}
public void backtrack(List<String> list, StringBuilder sb, int open, int close, int n) {
	if(sb.length()==n*2) {
		list.add(sb.toString());
		return;
	}
	if(open<close) {
		sb.append("(");
		backtrack(list,sb,open+1,close,n);
		sb.deleteCharAt(sb.length()-1);
	}
	if(close<open) {
		sb.append(")");
		backtrack(list,sb,open,close+1,n);
		sb.deleteCharAt(sb.length()-1);
	}
}
}
