class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int nse[]=nse(arr);
        int pse[] = pse(arr);
        int area=Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            arr[i] = arr[i]*(nse[i]-pse[i]-1);
            area = Math.max(arr[i],area);
        }
        return area;
    }
    public static int [] nse(int [] arr){
        int n = arr.length;
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        nse[n-1] = n;
        for(int i = n-2; i>=0; i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        for(int ele : nse){
            System.out.print(ele+" ");
        }
        System.out.println();
        return nse;
    }
    public static int [] pse(int [] arr){
        int n = arr.length;
        int pse[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        pse[0] = -1;
        for(int i = 1; i<arr.length; i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0) pse[i] = -1;
            else pse[i]=st.peek();
            st.push(i);
        }
        for(int ele : pse){
            System.out.print(ele + " ");
        }
        return pse;
    }
}