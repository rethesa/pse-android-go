.PHONY: clean watch indi indi-watch

all: Makefile Pflichtenheft.pdf

Pflichtenheft.pdf: Pflichtenheft.tex *.tex
	latexmk -pdf -dvi- -ps- -silent Pflichtenheft.tex &>/dev/null

clean:
	latexmk -C -silent

watch:
	latexmk -pdf -dvi- -ps- -silent -pvc Pflichtenheft.tex &>/dev/null

indi: ${FILE}
	latexmk -pdf -dvi- -ps- -silent ${FILE} &>/dev/null

indi-watch: ${FILE}
	latexmk -pdf -dvi- -ps- -silent -pvc ${FILE} &>/dev/null
