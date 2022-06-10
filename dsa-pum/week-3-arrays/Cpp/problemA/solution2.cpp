//Problem A : Count Distinct Elements in Every K Size Window

#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

//Sliding window => Slide the window and keep storing distinct elements for that window
vector<int> countDistinct(int arr[], int n, int k) {    
    unordered_map<int, int> mp;        
    vector<int>ans;                   
    int i = 0, j = 0;                  
    while (j < n) {
        mp[arr[j]]++;                  //store freq of current element
        if (j - i + 1 < k)             //reach the window (window size = end-start+1)
            j++;
        else if (j - i + 1 == k) {     //if window reached
            ans.push_back(mp.size());  //ans => distincts for that window i.e. size of map
            
            if (mp[arr[i]] == 1)       //removing last from window...
                mp.erase(arr[i]);      //decrement count (or erase entry if last element) 
            else
                mp[arr[i]]--;
            i++;                       //slide the window
            j++;
        }
    }
    return ans;
}

int main() {
    int t, n, k;
    cin >> t;
    while (t--) {
        cin >> n >> k;
        int arr[n];
        for (int i = 0; i < n; i++) 
            cin >> arr[i];
        vector<int> ans = countDistinct(arr, n, k);
        for (int elem : ans)
            cout << elem << " ";
        cout << endl;
        ans.clear();
    }
    return 0;
}
