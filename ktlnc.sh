filename=$1
extension=${filename#*.}
name=${filename%.*}

if [[ $extension == "kt" ]]
then
    echo "Compile ${filename}"
    kotlinc ${filename} -include-runtime -d ${name}.jar
    java -jar ${name}.jar
fi
