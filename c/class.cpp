#include<iostream>
using namespace std;
class add
{
    private:
    int a,b;
    public:
    void sum()
    {
        cout<<"sum="<<a+b<<endl;
    }
    void set_a(int x)
    {
        a=x;
    }
    void set_b(int y)
    {
        b=y;
    }
};
int main()
{
    add A;   
    // A.a=7;
    // A.b=8;
    A.set_a(5);
    A.set_b(10);
    A.sum();
    return 0;
}