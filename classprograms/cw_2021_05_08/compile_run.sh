# $? gives the exit status of the previous process

source_file=$1

output_file=`echo "$1" | cut -f 1 -d "."`

javac $source_file

if [ $? -eq 0 ]
then
    java $output_file
else
    echo "Compilation Failed!"
fi