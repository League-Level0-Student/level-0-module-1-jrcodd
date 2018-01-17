import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("Brothers and sisters I have none but this man's father is my father's son." 
		+ "Who is the man?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equalsIgnoreCase("my son")){
	JOptionPane.showMessageDialog(null, "correct!");
	score+= 1;
}

		// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Wrong!");	

}
		// 6. Add some more riddles
String answer1 = JOptionPane.showInputDialog("What is greater than God,more evil than the devil,the poor have it,the rich need it,and if you eat it, you'll die?");
if(answer1.equalsIgnoreCase("nothing")){
	JOptionPane.showMessageDialog(null, "correct!");
	score+= 1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong!");
}

// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"Your score was " + score + "/2");
	}

}
