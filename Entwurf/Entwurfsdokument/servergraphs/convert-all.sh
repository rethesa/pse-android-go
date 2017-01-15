#!\bin\sh
echo "Remove all watermarks ..."
python2 watermark.py svg-files
echo "Convert SVG to PDF"
for i in svg-files/*
do
     sh svg2pdf.sh $i
done
echo "Done."
