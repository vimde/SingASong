package com.rhyme.nursery;

public class Song {

    public static void main(String[] args) {

        String song = oldLadySwallowedA("fly")+endsWithAPeriod() +
                whySheSwallowedA("fly") +endsWithNewLine() +
                oldLadySwallowedA("spider")+endsWithASemiColon() +
                wriggledAndTickled()+endsWithAPeriod() +
                swallowedOneToCatchAnother("spider", "fly")+endsWithASemiColon() +
                whySheSwallowedA("fly") +endsWithNewLine() +
                oldLadySwallowedA("bird")+endsWithASemiColon() +
                absurdToSwallowA("bird")+endsWithAPeriod() +
                swallowedOneToCatchAnother("bird", "spider")+endsWithAComma() +
                swallowedOneToCatchAnother("spider", "fly")+endsWithASemiColon() +
                whySheSwallowedA("fly") +endsWithNewLine() +
                oldLadySwallowedA("cat")+endsWithASemiColon() +
                fancyToSwallowA("cat")+endsWithABang() +
                swallowedOneToCatchAnother("cat", "bird")+endsWithAComma() +
                swallowedOneToCatchAnother("bird", "spider")+endsWithAComma() +
                swallowedOneToCatchAnother("spider", "fly")+endsWithASemiColon() +
                whySheSwallowedA("fly") +endsWithNewLine() +
                oldLadySwallowedA("dog")+endsWithASemiColon() +
                whatAToSwallowA("hog", "dog")+endsWithABang() +
                swallowedOneToCatchAnother("dog", "cat")+endsWithAComma() +
                swallowedOneToCatchAnother("cat", "bird")+endsWithAComma() +
                swallowedOneToCatchAnother("bird", "spider")+endsWithAComma() +
                swallowedOneToCatchAnother("spider", "fly")+endsWithASemiColon() +
                whySheSwallowedA("fly") +endsWithNewLine() +
                oldLadySwallowedA("cow")+endsWithASemiColon() +
                howSheSwallowedA("cow")+endsWithABang() +
                swallowedOneToCatchAnother("cow", "dog")+endsWithAComma() +
                swallowedOneToCatchAnother("dog", "cat")+endsWithAComma() +
                swallowedOneToCatchAnother("cat", "bird")+endsWithAComma() +
                swallowedOneToCatchAnother("bird", "spider")+endsWithAComma() +
                swallowedOneToCatchAnother("spider", "fly")+endsWithASemiColon() +
                whySheSwallowedA("fly") +endsWithNewLine() +
                oldLadySwallowedA("horse")+endsWithEllipsis() +
                ladyIsDead();

        System.out.println(song);
    }

	private static String whatAToSwallowA(final String animal, final String otherAnimal) {
		return String.format("What a %s, to swallow a %s", animal, otherAnimal);
	}

	private static String absurdToSwallowA(final String animal) {
		return String.format("How absurd to swallow a %s", animal);
	}

	private static String wriggledAndTickled() {
		return "That wriggled and wiggled and tickled inside her";
	}

	private static String fancyToSwallowA(final String animal) {
		return String.format("Fancy that to swallow a %s", animal);
	}

	private static String howSheSwallowedA(final String animal) {
		return String.format("I don't know how she swallowed a %s", animal);
	}

	private static String endsWithABang() {
		return "!\n";
	}

	private static String endsWithNewLine() {
		return "\n";
	}

	private static String endsWithEllipsis() {
		return "...\n";
	}

	private static String endsWithAComma() {
		return ",\n";
	}

	private static String endsWithASemiColon() {
		return ";\n";
	}

	private static String endsWithAPeriod() {
		return ".\n";
	}

	private static String ladyIsDead() {
		return "...She's dead, of course!";
	}

	private static String swallowedOneToCatchAnother(final String animal, final String otherAnimal) {
		return String.format("She swallowed the %s to catch the %s", animal, otherAnimal);
	}

	private static String oldLadySwallowedA(final String animal) {
		return String.format("There was an old lady who swallowed a %s", animal);
	}

	private static String whySheSwallowedA(final String fly) {
		return String.format("I don't know why she swallowed a %s - perhaps she'll die!\n", fly);
	}
}
