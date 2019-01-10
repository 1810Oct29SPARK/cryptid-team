package com.revature.beans;

public class FlashcardWithConstructor extends Flashcard{

	public FlashcardWithConstructor() {
	}

	public FlashcardWithConstructor(Author author) {
		this();
		this.author = author;
	}

	private Author author;
	
	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "FlashcardWithConstructor [author=" + author + ", question=" + question + ", answer=" + answer + ", topic="
				+ topic + "]";
	}

	@Override
	public void methodInFlashcard() {
		System.out.println(this);
	}

}
