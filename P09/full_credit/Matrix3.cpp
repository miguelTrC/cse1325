
#define Matrix3_h

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
		
		int get(int x, int y){
			try{
				if(x || y < 0){
					throw std::runtime_error("Invalid matrix coordinates");
				}
				if(x || y > 2){
					throw std::runtime_error("Invalid matrix coordinates");
				}
				 
				return data[x][y];
				
			}
			catch(std::runtime_error& e){
				std::cout << e.what() << std::endl;
				}
		}
		
		std::ostream& operator<<(std::ostream&){
			for(int row = 0; row < data.size(); row++){
				for(int colum = 0; colum < data[row].size(); colum++){
					std::cout << data[row][colum] << " ";
				}
				std::cout << std::endl;
			}
			std::cout << std::endl;
		}
		
		
				
		
		
		
	private: 
		std::vector <std::vector<int>> data;
		
	
}; 

