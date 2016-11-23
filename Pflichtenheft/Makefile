.PHONY: clean watch %.pdf.watch

all: Makefile Pflichtenheft.pdf

Pflichtenheft.pdf: Pflichtenheft.tex *.tex
	latexmk -pdf -dvi- -ps- -silent Pflichtenheft.tex &>/dev/null

watch:
	latexmk -pdf -dvi- -ps- -silent -pvc Pflichtenheft.tex &>/dev/null

# generic build
%.pdf: %.tex
	latexmk -pdf -dvi- -ps- -silent $< &>/dev/null

# generic watch
%.pdf.watch: %.tex
	latexmk -pdf -dvi- -ps- -silent -pvc $< &>/dev/null

clean:
	latexmk -C -silent
