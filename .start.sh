clear
echo "###################################"
echo "# BubbleSort Run-Time Comparisons #"
echo "###################################"
echo " "
echo "C++ :"
./src/main/c++/a.out
echo "---------------------------------------------"
echo " "
echo "Java :"
java src/main/java/BubbleSort.java
echo "---------------------------------------------"
echo " "
echo "Rust :"
cd src/main/rust && cargo run 2>/dev/null
cd ..
cd ..
cd ..
echo "---------------------------------------------"
echo " "
echo "Python :"
python3 src/main/python/BubbleSort.py
echo "---------------------------------------------"
