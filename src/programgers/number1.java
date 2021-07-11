//package programgers;
//
//public class number1 {
//    public int solution(int[] d, int m) {
//        int box=1;
//        int cnt=0;
//        int ans=0;
//        boolean check=true;
//        for (int i=0; i<d.length;i++){
//            if (box<=d[i]){
//                ans+=box;
//                box*=2;
//            }else{
//                box=1;
//            }
//            cnt++;
//            if (ans>=m){
//                check=false;
//                break;
//            }
//        }
//        if(check){
//            return -1;
//        }else{
//            return cnt;
//        }
//    }
//
//
//    public static void main (String[]args){ solution1([1, 3, 2, 5, 4],6);
//    }
//}
