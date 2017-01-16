package neha_practice;
import java.io.*;
import java.util.*;

class WordNode{
	    String word;
	    int numSteps;
	 
	    public WordNode(String word, int numSteps){
	        this.word = word;
	        this.numSteps = numSteps;
	    }
	}
	 
public class WordLadder {
		
		public static void main(String[] args)
		{
			String BEGINWORD="hit";
			String ENDWORD="cog";
			Set<String> WORDDICT= new HashSet<String>();
			WORDDICT.add("hot");
			WORDDICT.add("dot");
			WORDDICT.add("dog");
			WORDDICT.add("lot");
			WORDDICT.add("log");
		int counbt=ladderLength(BEGINWORD, ENDWORD, WORDDICT);
		System.out.println(counbt);
		}
	    public static int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
	        LinkedList<WordNode> queue = new LinkedList<WordNode>();
	        queue.add(new WordNode(beginWord, 1));
	 
	        wordDict.add(endWord);
	 
	        while(!queue.isEmpty()){
	            WordNode top = queue.remove();
	            String word = top.word;
	            System.out.println("word is: "+word);
	 
	            if(word.equals(endWord)){
	                return top.numSteps; 
	            }
	 
	            char[] arr = word.toCharArray();
	            for(int i=0; i<arr.length; i++){
	                for(char c='a'; c<='z'; c++){
	                    char temp = arr[i];
	                    if(arr[i]!=c){
	                        arr[i]=c;
	                    }
	 
	                    String newWord = new String(arr);
	                    if(wordDict.contains(newWord)){
	                        queue.add(new WordNode(newWord, top.numSteps+1));
	                        wordDict.remove(newWord);
	                    }
	 
	                    arr[i]=temp;
	                }
	            }
	        }
	 
	        return 0;
	    }
	}
	

