#include <iostream>
#include <vector>

using namespace std;

int fibo(int n)
{
	if (n==0)
	{
		return 0;
	}
	else if (n==1)
	{
		return 1;
	}
	else
	{
		return fibo(n-1)+fibo(n-2);
	}
}


int main()
{
	
	vector<int> n = {0,1,2,3,4,5,6,7};

	for (int i=0; i<8; i++)
	{
		cout << fibo(n[i]) << endl;
	}
	
	return 0;
}
