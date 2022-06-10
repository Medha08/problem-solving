//[Saqlain] Week-3-B: Max Consecutive Ones by replacing at-most K zeroes by ones
#include <iostream>
#include<vector>
using namespace std;

//Sliding window => Slide the window and maintain a window with zero count <= k
int longestOnes(int arr[], int n, int k) {
    int ans = 0;
    int i = 0, j = 0;

    int zeros = 0;
    while (j < n) {
        if (arr[j] == 0)                  //count zero until you reach window i.e. zeros<=k
            zeros++;
        if (zeros <= k) {                 //window reached, ans => window size
            ans = max(ans, j - i + 1);    //we only need max window size
            j++;
        }
        else if (zeros > k) {             //out of window
            while (zeros > k) {           //remove prev zeros until window is reached again
                if (arr[i] == 0)
                    zeros--;
                i++;
            }
            j++;                          //slide the window
        }
    }
    return ans;
}

int main() {
    int t, n, k;
    cin >> t;
    while (t--) {
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++)
            cin >> arr[i];
        cin >> k;
        int ans = longestOnes(arr, n, k);
        cout << ans << endl;
    }
    return 0;
}
