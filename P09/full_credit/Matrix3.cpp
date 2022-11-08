/*
Creating a 3x3 matrix and with input, output, and addition operators
named Data


idea: 
Make a 2d int array to store the parameters in, and then push the array 
into the vector



*/

//mxy parameters where x = row, y = colum, 3x3 array

#include <iostream> 
#include <vector>

class Matrix3{ 
	
	public: 
		Matrix3(int m00, int m01, int m02,
				int m10, int m11, int m12,
				int m20, int m21, int m22): 
				/* stuck here */ 
				{
					std::vector <int> temp;
					
					std::cout << "working" << std::endl; 
				}
				
				
		
		
		
	private: 
		std::vector <std::vector<int>> data;
		
	
}; 

// Constructor that accepts 9 values and adds it to the vector


/*
functions:  

get(int x, int y){
	returns the int at specified index coordinates. 
	if x or y are less than 0 or greater than 2, 
	
	throw std::runtime_error exeption
}

*/
