package com.revature.beans;

public class FlashcardWithAutoByType extends Flashcard {

	private Author author;

	public Author getAuthor() {
		return author;
	}

	// method must take a parameter of the same type as the desired dependency
	public void setAuthorOrSomethingOfThatType(Author onlyTheTypeMatters) {
		this.author = onlyTheTypeMatters;
	}

	@Override
	public String toString() {
		return "FlashcardWithAutoByType [author=" + author + ", question=" + question + ", answer=" + answer
				+ ", topic=" + topic + "]";
	}

	@Override
	public void methodInFlashcard() {
	}

}
