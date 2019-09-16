#include<iostream>
#include "disjoint.h"
using namespace std;
int main() {
	int T = 0;
	cin >> T;
	cout << T << endl;//�׽�Ʈ ���̽�
	//������ ��� ����� ��, ���θ� �˰� �ִ� ����� �����
	for (int testCase = 1; testCase <= T; testCase++)
	{
		int N = 0;
		int M(N);
		cin >> N;
		cin >> M;

		Disjoint* dis = new Disjoint(N);
		for (int i = 0; i < M; i++)
		{
			int first;
			int second;
			cin >> first;
			cin >> second;
			dis->union_set(first, second);
			int *p = new int[N];
			for (int i = 1; i <= N; i++)
			{
				p[i] = dis->find_set(i);
			}
		}
		int count = dis->counting();
		cout << "#" << testCase << " " << count << endl;
	}
	return 0;
}