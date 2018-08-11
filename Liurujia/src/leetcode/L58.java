package leetcode;

/*
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

思路：
	首先去掉字符串的首位空格，然后对它以空格进行切片
 */
public class L58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] ch = s.split(" ");
        return ch[ch.length-1].length();
    }
    
    public static void main(String[] args) {
		System.out.println(new L58().lengthOfLastWord("hello   world "));
	}
}
