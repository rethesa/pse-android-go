#!\bin\sh
filename=$1
filename="${filename%.*}"
echo "Converting file: " $filename
rsvg-convert -f pdf -o $filename.pdf $1
