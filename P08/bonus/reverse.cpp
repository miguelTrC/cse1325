#include <iostream> 
#include <algorithm> // std::reverse

int main(int argc, char *args[]) {
	
	for (int count = 1; count < argc; count++){ 
	
		std::string input(args[count]);
		std::reverse( input.begin(), input.end() );
		std::cout << input << std::endl; 
	}
	
	
	
	return EXIT_SUCCESS; 
}
