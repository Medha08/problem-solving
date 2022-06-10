#include<iostream>
using namespace std;

int main(){
    int tc;
    cin>>tc;
    while(tc--){
        int n;
        cin>>n;
        int arr[n];
        for(int i=0; i<n; i++) cin>>arr[i];
        int k;
        cin>>k;

        int i=0, j=0;
        int max_till_now = 0;
        while(j < n){
            if(arr[j] == 0 and k == 0){
                while(arr[i] != 0 and i <= j) i++;
                i++;
            }
            else if(arr[j] == 0) k--;
            max_till_now = max(j-i+1, max_till_now);
            j++;
        }
        cout<<max_till_now<<endl;
    }
    return 0;
}