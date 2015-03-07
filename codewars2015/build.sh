#!/bin/bash
DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )
cd "$DIR"
cp manifest manifest.out
perl -pi -e "chomp if eof" manifest.out
echo "$1" >> manifest.out
cd bin
jar cmf ../manifest.out "$1.jar" *.class
cd ..
mv "bin/$1.jar" "$1.jar"
echo -n "Compile complete!"
if [[ "$2" == "show" ]]; then
	echo " Testing..."
	java -jar "$1.jar"
else
	echo ""
fi
mv "$1.jar" "jar/$1.jar"
