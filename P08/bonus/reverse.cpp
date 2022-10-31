#include <iostream> 
//#include <string.h>
#include <algorithm> // std::reverse
#include <vector> 

int main(int argc, char *args[]) {
	
	//std::vector<std::string> input;
	
	for (int count = 1; count < argc; count++){ 
	
		std::string input(args[count]);
		std::reverse( input.begin(), input.end() );
		std::cout << input << std::endl; 
	}
	
	
	
	return EXIT_SUCCESS; 
}
