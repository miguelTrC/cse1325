/*
./a.out textFile.txt 

push the values in the text file onto a vector<string>, 

after all values are in the vector, use the sort function from 
algorithm, (name.begiin(), name.end() )

Leaving comments since I am still learning file operations in c++, 
will use as a refrence in future project

*/

#include <iostream> 
#include <vector> 
#include <algorithm>
#include <fstream> //read txt file (file operator)
#include <sstream> //stream string to copy contents to string 

int main(int argc, char *args[] ) {
	
	std::ifstream file; 
	// opens the file for reading
	file.open(args[1]);
	
	std::vector<std::string> text_Data;
	std::string line; 
	
	
	//if the file was able to open 
	if(file.is_open()){
	
	// Gets a line from the text doc and copies it onto the vector
		while(getline(file, line)){ 
			text_Data.push_back(line);
		} 
	}
	
	std::sort( text_Data.begin(), text_Data.end() );
	
	for (int counter = 0; counter < text_Data.size(); counter++){
		std::cout << text_Data[counter] << std::endl; 
	}
	
	std:file.close(); 
	
	return EXIT_SUCCESS;
}
