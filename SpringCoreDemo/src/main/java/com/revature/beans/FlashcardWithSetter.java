package com.revature.beans;

public class FlashcardWithSetter extends Flashcard {

	public FlashcardWithSetter() {
	}

	public FlashcardWithSetter(String question, String answer, FlashcardTopics topic) {
		super(question, answer, topic);
	}

	private Author author;
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "FlashcardWithSetter [author=" + author + ", question=" + question + ", answer=" + answer + ", topic="
				+ topic + "]";
	}

	@Override
	public void methodInFlashcard() {
		System.out.println(this);
	}
	
	

}
