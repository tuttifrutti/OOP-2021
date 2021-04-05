#include<iostream>
using namespace std;

void multiply(float a[], int n, float b[])
{

	for (int i = 0; i < n; i++)
	{
		a[i] = a[i] * b[i];
	}

}

int main()
{
	float a[8];
	float b[8];

	int n;

	cout << "Enter 8 values of A";
	for (int i = 0; i < 8; i++)
	{
		cin >> a[i];
	}

	cout << "Enter 6 values of B";
	for (int i = 0; i < 6; i++)
	{
		cin >> b[i];
	}

	cout << "Enter value of N";
	cin >> n;

	multiply(a, n, b);

	cout << "After multilpying n elements new array A is" << endl;

	for (int i = 0; i < 8; i++)
	{
		cout << a[i]<<" ";
	}

	return 0;
}
