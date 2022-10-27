/*
Take user input and print 'Hello "UserInput" x3 '
*/

#include <iostream> 

int main() { 
	
	std::string name;
	std::cout << "TEST " << std::endl; 
	
	
	
	for(int count = 0; count < 3; count++) { 
		std::cout << "What is your name? " << std::endl; 
		std::cin >> name; 
		
		std::cout << "Hello " 
				  << name << std::endl
				  << std::endl; 
			  }
			   
	
	
	
	
	return EXIT_SUCCESS;	
}
