#include <iostream>
using namespace std;

// 普通指针的引用
void fooBar( int * & arr) {
	for (int i = 0; i < 3; ++i) {
		cout << arr[i] << endl;
	}
}

// void fooZoo(const int * (const & arr))
// 以上声明会被认为是函数指针,所以类型名中不能使用括号来进行优先级结合

// const 指针的 const 引用, 因为首先数组是一个const指针,所以需要一个const指针
// 其次,不能够使引用修改该指针的值,所以需要从const引用.
void fooZoo( const int * const &arr) {
	for (int i = 0; i < 3; ++i) {
		cout << arr[i] << endl;
	}
}

int main() {
	int * a = new int[3] { 1, 2, 3 };
	int b[3] = { 4, 5, 6 };
	fooBar(a);
	fooZoo(b);
	return 0;
}