#include <iostream>
#include <iomanip>
using namespace std;

int main() {
	int x;
	float y;
	
	std::cin >> x>> y;
	if(x%5==0 && y>=(x+.5)){
	    y-=(x+.5);
	}
	std::cout << fixed <<setprecision(2)<< y <<std::endl;
	return 0;
}
