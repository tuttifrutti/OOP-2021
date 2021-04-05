#include <iostream>
#include <string>
using namespace std;
void menu()
{
	cout<<" /t**********select your choice*************/t "<<endl;
	cout<<"a: add new member "<<endl;
	cout<<"b: display general information about fitness centre and its charges "<<endl;
	cout<<"c: show money made "<<endl;
	cout<<"e: Press e to exit "<<endl;
	
}
void information()
{
	cout<<" THE FITNESS FREAK is the best gym in the town which provide the fantastic experiences equiped with good quality working machines and every facility"<<endl;
	cout<<"      CHARGE RATE:  "<<endl;
	cout<<"		 2500 per month/n /n discounts availaible on membership/nthank you"<<endl;
}
struct member
{
	string name;
	int age;
	int membership_type;
	int fee;
	int total_money;
	
	
int gettotalmoney()
	{
		return total_money;
	}
	
};

member addNewMember()
	{
		int cost=0;
		int discount=0;
		string n;
		int a;
		int membership_type;
		cout<<"please enter your details "<<endl;
		cout<<"enter name"<<endl;
		cin>>n;
		cout<<"enter age"<<endl;
		cin>>a;
		member m;
		m.age=a;
		m.name=n;
		
		cout<<"enter membership_type you want to avail/n  "<<endl;
		cout<<" enter 1 for senior citizen membership(only for 50+ aged people"<<endl;
		cout<<" enter 2 for young"<<endl;
		cout<<" enter 3 for adult membership"<<endl;
		cin>>membership_type;
		if(membership_type==1)
		{
			discount=0.03*2500;
				cout<<" you got discount "<<discount<<endl;
			cost =2500-discount;
			m.fee=cost;
			cout<<" your cost is "<<cost<<endl;
			cout<<" THANK YOU YOU GOT OUR MEMBERSHIP..."<<endl;
		m.total_money=m.total_money+cost;
		}
		else if(membership_type==2)
		{
			discount=0.15*2500;
			cout<<" you got discount "<<discount<<endl;
			cost=2500-discount;
				m.fee=cost;
			cout<<" your cost is "<<cost<<endl;
			cout<<" THANK YOU YOU GOT OUR MEMBERSHIP..."<<endl;
			m.total_money=m.total_money+cost;
			
		}
		else if(membership_type==3)
		{
			discount=0.20*2500;
				cout<<" you got discount "<<discount<<endl;
				cost=2500-discount;
					m.fee=cost;
			cout<<" your cost is "<<cost<<endl;
			cout<<" THANK YOU YOU GOT OUR MEMBERSHIP..."<<endl;
			m.total_money=m.total_money+cost;
		}
		else
		{
			cout<<" wrong choice! please enter again"<<endl;
		}
		//this->total_money=this->total_money+cost;
		return m;
	}
int main()
{
	member newm[50];int total=0;
	int i=0;char choice;
	do
	{
	menu();
	member m;
	cin>>choice;
	switch(choice)
	{
		
	
	case'a':
		m=addNewMember();
		newm[i]=m;
		i++;
		
			cout<<"Member added\n";
	break;
	case 'b':

		information();
		cout<<"Members information: "<<endl;
		for(int j=0;j<i;j++){
		cout<<"Member name: "<<newm[j].name<<endl;
		cout<<"Member age: "<<newm[j].age<<endl;
		cout<<"Member Fee is: "<<newm[j].fee<<endl;
			cout<<"******************************************"<<endl;
		
	  }
		break;
	
	case 'c':

	  for(int j=0;j<i;j++){
	  	
		  total=total+=newm[j].fee;
		
	  }
		cout<<"total money is: "<<total;
		break;
	default:
		cout<<"entered wrong choice\n";
	}
	
}while(choice!='e');
return 0;
}
