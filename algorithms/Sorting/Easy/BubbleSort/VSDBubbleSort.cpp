
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

void swap(int array[], int i, int j)
{
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

void bubbleSort(int array[], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n - i - 1; j++)
        {
            if (array[j] > array[j + 1])
            {
                swap(array, j, j + 1);
            }
        }
    }
    for (int k = 0; k < n; k++)
    {
        cout << array[k] << " ";
    }
}
int main()
{
    int array[] = {1, 2, 53, 12, 45, 11, 56};
    bubbleSort(array, 7);
    return 0;
}
