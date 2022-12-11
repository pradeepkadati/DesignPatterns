package io.javabytes.designprinciples.srp;

/***
 * At first glance, this class might look correctly written. 
 * However, it contradicts the single responsibility principle, in that it has multiple reasons to change: 
 * we have two methods which change the text itself, and one which prints the text for the user. 
 * If any of these methods is called, the class will change. 
 * This is also not good because it mixes the logic of the class with the presentation.
 *
 *
 */
public class ProblemText {
	String text;
	String author;
	int length;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	/* methods that change the text */
	void allLettersToUpperCase() {
	}

	void findSubTextAndDelete(String s) {
	}

	/* method for formatting output */
	void printText() {
	}
}
