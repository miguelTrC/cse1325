#include <iostream> 

int main() { 
	
	std::string name;
	
	// Loops 4 times 
	for(int count = 0; count < 4; count++) { 
		std::cout << "What is your name? " << std::endl; 
		std::cin >> name; 
		
		std::cout << "Hello " 
				  << name << std::endl
				  << std::endl; 
			  }
			   
	
	
	
	
	return EXIT_SUCCESS;	
}
