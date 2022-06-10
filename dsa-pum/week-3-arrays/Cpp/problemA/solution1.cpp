#include<iostream>
#include<map>
#include<vector>
using namespace std;

int main(){
    int testcases;
    cin>>testcases;
    while(testcases--){
        int n, k;
        cin>>n>>k;
        
        int arr[n];
        for(int i=0; i<n; i++) cin>>arr[i];

        map<int, int> freq;
        vector<int> res;
        int j=0; 
        for(int i=0; i<n and j<n;){
            if(j < k-1){//create initial window of size k
                freq[arr[j]]++;
                j++;
            }
            else{//increment the window by one
                freq[arr[j++]]++;
                res.push_back(freq.size());
                //for(auto i: freq) cout<<i.first<<" ";cout<<endl;
                freq[arr[i]]--;
                if(freq[arr[i]] == 0) freq.erase(arr[i]);
                i++;
            }
        }

        for(auto i: res) cout<<i<<" ";
        cout<<endl;
    }
    return 0;
}
