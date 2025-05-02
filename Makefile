build:
	cd bin && jar cfe hangman.jar App App.class

run:
	cd bin && java -jar hangman.jar