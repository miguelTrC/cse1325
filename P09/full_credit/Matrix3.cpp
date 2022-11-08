/*
Creating a 3x3 matrix and with input, output, and addition operators
named Data

*/

//mxy parameters where x = row, y = colum, 3x3 array

#include <iostream> 
#include <vector>

class Matrix3{ 
	
	public: 
		Matrix3(int m00, int m01, int m02,
				int m10, int m11, int m12,
				int m20, int m21, int m22): 
				data{ {(m00), (m01), (m02)},
					  {(m10), (m11), (m12)}, 
					  {(m20), (m21), (m22)} 
					}{
					
					std::cout << "working" << std::endl; 
				}
		
		get(int x, int y){
			try{
				if(x || y < 0){
					throw std::runtime_error("Invalid matrix coordinates");
				}
				if(x || y > 2){
					throw std::runtime_error("Invalid matrix coordinates");
				}
				
				std::cout << data[x][y] << std::endl; 
				
			}
			catch(std::runtime_error& e){
				std::cout << e.what() << std::endl;
				}
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


Operations: 

should be a loop where it gets data[x][y] + data[xx][yy]
something like that




*/
