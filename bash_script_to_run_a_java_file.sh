# To run java files eg. to run 00-HelloWorld.java use `runj 00-HelloWorld.java`
# To run java file in package tmp, use `runj tmp/00-HelloWorld.java`
# The class name must be same as fileName without first 3 characters, here `HelloWorld`
# Tip: Use `runj 00-HelloWorld.java < input` to provide input via System Stream, here input is a file named `input`
# Copy this in ~/.zshrc and source it 
runj () { javac -d classes $1 && java -cp classes $(javaClassPath $1) }

function javaClassPath() { 
    CLASSNAME=$(basename $1 ".java" | cut -c 4-) 
    CLASSPATH=$(dirname $1 | tr / .)

    if [[ $CLASSPATH != "." ]]
    then 
        echo $CLASSPATH.$CLASSNAME
    else 
        echo $CLASSNAME
    fi
}