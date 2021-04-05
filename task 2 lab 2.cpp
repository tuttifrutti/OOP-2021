#include <iostream>
#include <string>
using namespace std;
class Time
{
public:
int hours;
int minutes;
int seconds;
	void sethours(int h)
	{
		hours=h;
	}
	void setminutes(int m)
	{
		minutes=m;
	}
	void setseconds(int s)
	{
		seconds=s;
	}
	int gethours()
	{
		return hours;
	}
	int getminutes()
	{
		return minutes;
	}
	int getseconds()
	{
		return seconds;
	}
	void add(Time t1,Time t2)
	{
		hours=t1.hours+t2.hours;
		minutes=t1.minutes+t2.minutes;
		if(minutes>=60)
		{
			hours++;
			minutes=minutes-60;
		}
		seconds=t1.seconds+t2.seconds;
	if (seconds>=60)
	{
		minutes++;
		seconds=seconds-60;
	}
	}
	void display()
	{
		cout<<"New time is "<<hours<<":"<<minutes<<":"<<seconds<<endl;
	}
};
int main()
{
	int h;
	int m;
	int s;
	Time t1;
	t1.sethours(h);
	t1.setminutes(m);
	t1.setseconds(s);
	t1.gethours();
	t1.getminutes();
	t1.getseconds();
	cout<<"enter time in hours minutes and seconds"<<endl;
	cin>>t1.hours;
	cin>>t1.minutes;
	cin>>t1.seconds;
	Time t2;
		t2.sethours(h);
	t2.setminutes(m);
	t2.setseconds(s);
	t2.gethours();
	t2.getminutes();
	t2.getseconds();
	cout<<" enter time 2 in hours minutes and seconds"<<endl;
	cin>>t2.hours;
	cin>>t2.minutes;
	cin>>t2.seconds;
	Time t;
	t.add(t1,  t2);
	t.display();
	return 0;
}
