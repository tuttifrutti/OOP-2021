#include <iostream>
#include <string>
using namespace std;
class tollbooth {
	private:
		int noofcars;
		double tmoney;
	public:
		void payingcar() {
			noofcars++;
			tmoney=tmoney+0.5;
		}
		void nopaycar() {
			tmoney=tmoney+0;
			noofcars++;
		}
		void display() {
			cout<<" the total number of cars passed are "<<noofcars<<endl;
			cout<<" the  total money paid is "<<tmoney<<endl;
		}
		void setcars(int c)
		 {
			noofcars=c;
		}
		void setmoney(int m) 
		{
			tmoney=m;
		}
		int getcars() {
			return noofcars;
		}
		int getmoney() {
			return tmoney;
		}

};
int main() {
	int c=0;
	int m=0;
	int choice;
	tollbooth t1;
	t1.setcars(c);
	t1.setmoney(m);
	t1.getcars();
	t1.getmoney();
	do{
		cout<<"enter choice 1 for paying and 2 for nonpaying car 3 for exit"<<endl;
	cin>>choice;
	if(choice==1){
	t1.payingcar();
	t1.display();
}
	else if(choice==2){
	t1.nopaycar();
	t1.display();
}
else
exit(0);
	}while(choice!=3);
	
	

	return 0;
}
