.PHONY: indi clean watch

all: Makefile Pflichtenheft.pdf

Pflichtenheft.pdf: Pflichtenheft.tex *.tex
	latexmk -pdf -dvi- -ps- -silent Pflichtenheft.tex &>/dev/null

indi: ${FILE}
	latexmk -pdf -dvi- -ps- -silent ${FILE} &>/dev/null

clean:
	latexmk -C -silent

watch:
	latexmk -pdf -dvi- -ps- -silent -pvc Pflichtenheft.tex &>/dev/null
