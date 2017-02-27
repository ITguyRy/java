#!/../bin/bash
echo " Creating directory, what would you like to call it?"
read directory
mkdir $directory
cd $directory
cat ../template > file

mv * "$directory.java" 

sed -i -e 's/$directory/'$directory'/g' *.java


echo -e "javac $directory.java \njava $directory" >> 'start.sh'

chmod 755 'start.sh'

echo "atom '$directory.java'" >> atom.sh

chmod 755 atom.sh

echo "cat $directory.java" > cat.sh
chmod 755 cat.sh

